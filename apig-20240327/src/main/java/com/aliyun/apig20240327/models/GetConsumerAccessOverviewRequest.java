// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetConsumerAccessOverviewRequest extends TeaModel {
    /**
     * <p>The target AI gateway instance ID. Quotas and resources are isolated by instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-123456</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>Specifies whether to also query the model TPM limits. Default value: false. If set to true, modelTpmLimits is returned for dedicated instances.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("includeModelTpm")
    public Boolean includeModelTpm;

    public static GetConsumerAccessOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConsumerAccessOverviewRequest self = new GetConsumerAccessOverviewRequest();
        return TeaModel.build(map, self);
    }

    public GetConsumerAccessOverviewRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public GetConsumerAccessOverviewRequest setIncludeModelTpm(Boolean includeModelTpm) {
        this.includeModelTpm = includeModelTpm;
        return this;
    }
    public Boolean getIncludeModelTpm() {
        return this.includeModelTpm;
    }

}
