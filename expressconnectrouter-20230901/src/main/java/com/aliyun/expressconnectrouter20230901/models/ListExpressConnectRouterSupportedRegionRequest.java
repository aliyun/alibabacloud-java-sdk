// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class ListExpressConnectRouterSupportedRegionRequest extends TeaModel {
    /**
     * <p>A client token to ensure the idempotence of the request.</p>
     * <p>Generate a value that is unique across different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> as the <strong>ClientToken</strong>. Each request has a unique <strong>RequestId</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-00****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The type of network instance. Valid values:</p>
     * <ul>
     * <li><p><strong>TR</strong>: transit router instance.</p>
     * </li>
     * <li><p><strong>VBR</strong>: virtual border router instance.</p>
     * </li>
     * <li><p><strong>VPC</strong>: virtual private cloud instance.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VBR</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    @NameInMap("Version")
    public String version;

    public static ListExpressConnectRouterSupportedRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExpressConnectRouterSupportedRegionRequest self = new ListExpressConnectRouterSupportedRegionRequest();
        return TeaModel.build(map, self);
    }

    public ListExpressConnectRouterSupportedRegionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListExpressConnectRouterSupportedRegionRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public ListExpressConnectRouterSupportedRegionRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
