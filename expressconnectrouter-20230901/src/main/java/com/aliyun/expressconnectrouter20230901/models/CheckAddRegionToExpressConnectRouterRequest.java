// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class CheckAddRegionToExpressConnectRouterRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-00****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecr-fu8rszhgv7623c****</p>
     */
    @NameInMap("EcrId")
    public String ecrId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("FreshRegionId")
    public String freshRegionId;

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

}
