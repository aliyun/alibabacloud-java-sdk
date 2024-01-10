// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dg20190327.models;

import com.aliyun.tea.*;

public class CreateGatewayVerifyCodeRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    public static CreateGatewayVerifyCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayVerifyCodeRequest self = new CreateGatewayVerifyCodeRequest();
        return TeaModel.build(map, self);
    }

    public CreateGatewayVerifyCodeRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

}
