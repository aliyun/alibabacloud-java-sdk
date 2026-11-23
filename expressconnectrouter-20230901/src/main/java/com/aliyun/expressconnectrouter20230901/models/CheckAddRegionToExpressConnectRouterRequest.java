// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class CheckAddRegionToExpressConnectRouterRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate the parameter value on your client and ensure that the value is unique across different requests. The ClientToken parameter only supports ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-00****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run on this request. Valid values:</p>
     * <ul>
     * <li><p>true: sends a check request and does not modify EPS resources.</p>
     * </li>
     * <li><p>false: sends a normal request. This is the default value.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The instance ID of the Express Connect Router (ECR).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecr-fu8rszhgv7623c****</p>
     */
    @NameInMap("EcrId")
    public String ecrId;

    /**
     * <p>The region for which you want to check whether the Cloud Data Transfer (CDT) service is enabled for the Express Connect Router (ECR) feature.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("FreshRegionId")
    public String freshRegionId;

    @NameInMap("Version")
    public String version;

    public static CheckAddRegionToExpressConnectRouterRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAddRegionToExpressConnectRouterRequest self = new CheckAddRegionToExpressConnectRouterRequest();
        return TeaModel.build(map, self);
    }

    public CheckAddRegionToExpressConnectRouterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CheckAddRegionToExpressConnectRouterRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CheckAddRegionToExpressConnectRouterRequest setEcrId(String ecrId) {
        this.ecrId = ecrId;
        return this;
    }
    public String getEcrId() {
        return this.ecrId;
    }

    public CheckAddRegionToExpressConnectRouterRequest setFreshRegionId(String freshRegionId) {
        this.freshRegionId = freshRegionId;
        return this;
    }
    public String getFreshRegionId() {
        return this.freshRegionId;
    }

    public CheckAddRegionToExpressConnectRouterRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
