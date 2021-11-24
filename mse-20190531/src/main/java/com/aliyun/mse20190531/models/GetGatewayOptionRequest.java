// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGatewayOptionRequest extends TeaModel {
    @NameInMap("GatewayId")
    public Long gatewayId;

    public static GetGatewayOptionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayOptionRequest self = new GetGatewayOptionRequest();
        return TeaModel.build(map, self);
    }

    public GetGatewayOptionRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

}
