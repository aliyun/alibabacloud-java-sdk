// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dg20190327.models;

import com.aliyun.tea.*;

public class ModifyGatewayRequest extends TeaModel {
    @NameInMap("GatewayDesc")
    public String gatewayDesc;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("GatewayName")
    public String gatewayName;

    public static ModifyGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyGatewayRequest self = new ModifyGatewayRequest();
        return TeaModel.build(map, self);
    }

    public ModifyGatewayRequest setGatewayDesc(String gatewayDesc) {
        this.gatewayDesc = gatewayDesc;
        return this;
    }
    public String getGatewayDesc() {
        return this.gatewayDesc;
    }

    public ModifyGatewayRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ModifyGatewayRequest setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
        return this;
    }
    public String getGatewayName() {
        return this.gatewayName;
    }

}
