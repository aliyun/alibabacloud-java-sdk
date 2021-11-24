// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayOptionRequest extends TeaModel {
    @NameInMap("GatewayId")
    public Long gatewayId;

    @NameInMap("GatewayOption")
    public GatewayOption gatewayOption;

    public static UpdateGatewayOptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayOptionRequest self = new UpdateGatewayOptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayOptionRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdateGatewayOptionRequest setGatewayOption(GatewayOption gatewayOption) {
        this.gatewayOption = gatewayOption;
        return this;
    }
    public GatewayOption getGatewayOption() {
        return this.gatewayOption;
    }

}
