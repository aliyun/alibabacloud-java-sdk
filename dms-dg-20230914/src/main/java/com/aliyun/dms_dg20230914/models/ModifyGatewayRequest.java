// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_dg20230914.models;

import com.aliyun.tea.*;

public class ModifyGatewayRequest extends TeaModel {
    @NameInMap("GatewayDesc")
    public String gatewayDesc;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GatewayId")
    public String gatewayId;

    /**
     * <p>This parameter is required.</p>
     */
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
