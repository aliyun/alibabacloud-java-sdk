// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteNatGatewayRequest extends TeaModel {
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    public static DeleteNatGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNatGatewayRequest self = new DeleteNatGatewayRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNatGatewayRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

}
