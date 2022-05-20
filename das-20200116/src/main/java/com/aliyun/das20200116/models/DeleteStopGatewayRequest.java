// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DeleteStopGatewayRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    public static DeleteStopGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStopGatewayRequest self = new DeleteStopGatewayRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStopGatewayRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

}
