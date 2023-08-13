// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DeleteStopGatewayRequest extends TeaModel {
    /**
     * <p>The ID that can uniquely identify the DBGateway. You can obtain the DBGateway ID by calling the [DescribeCloudbenchTask](~~230669~~) operation. The DBGateway ID is the value of the **ClientGatewayId** field in the response.</p>
     */
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
