// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dg20190327.models;

import com.aliyun.tea.*;

public class FindUserGatewayByIdRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    public static FindUserGatewayByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        FindUserGatewayByIdRequest self = new FindUserGatewayByIdRequest();
        return TeaModel.build(map, self);
    }

    public FindUserGatewayByIdRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

}
