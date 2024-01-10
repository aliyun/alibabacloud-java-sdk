// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dg20190327.models;

import com.aliyun.tea.*;

public class StopGatewayRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("GatewayInstanceId")
    public String gatewayInstanceId;

    public static StopGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        StopGatewayRequest self = new StopGatewayRequest();
        return TeaModel.build(map, self);
    }

    public StopGatewayRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public StopGatewayRequest setGatewayInstanceId(String gatewayInstanceId) {
        this.gatewayInstanceId = gatewayInstanceId;
        return this;
    }
    public String getGatewayInstanceId() {
        return this.gatewayInstanceId;
    }

}
