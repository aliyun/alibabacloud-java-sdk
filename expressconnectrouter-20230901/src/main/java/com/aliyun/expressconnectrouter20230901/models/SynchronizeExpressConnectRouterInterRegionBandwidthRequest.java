// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class SynchronizeExpressConnectRouterInterRegionBandwidthRequest extends TeaModel {
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

    public static SynchronizeExpressConnectRouterInterRegionBandwidthRequest build(java.util.Map<String, ?> map) throws Exception {
        SynchronizeExpressConnectRouterInterRegionBandwidthRequest self = new SynchronizeExpressConnectRouterInterRegionBandwidthRequest();
        return TeaModel.build(map, self);
    }

    public SynchronizeExpressConnectRouterInterRegionBandwidthRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SynchronizeExpressConnectRouterInterRegionBandwidthRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public SynchronizeExpressConnectRouterInterRegionBandwidthRequest setEcrId(String ecrId) {
        this.ecrId = ecrId;
        return this;
    }
    public String getEcrId() {
        return this.ecrId;
    }

}
