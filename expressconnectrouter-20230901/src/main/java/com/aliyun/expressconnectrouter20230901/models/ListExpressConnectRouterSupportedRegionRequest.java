// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class ListExpressConnectRouterSupportedRegionRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

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

}
