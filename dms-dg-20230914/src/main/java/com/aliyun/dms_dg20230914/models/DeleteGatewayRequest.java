// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_dg20230914.models;

import com.aliyun.tea.*;

public class DeleteGatewayRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GatewayId")
    public String gatewayId;

    public static DeleteGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayRequest self = new DeleteGatewayRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

}
