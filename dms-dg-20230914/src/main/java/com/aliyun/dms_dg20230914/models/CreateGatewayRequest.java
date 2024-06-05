// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_dg20230914.models;

import com.aliyun.tea.*;

public class CreateGatewayRequest extends TeaModel {
    @NameInMap("GatewayDesc")
    public String gatewayDesc;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GatewayName")
    public String gatewayName;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayRequest self = new CreateGatewayRequest();
        return TeaModel.build(map, self);
    }

    public CreateGatewayRequest setGatewayDesc(String gatewayDesc) {
        this.gatewayDesc = gatewayDesc;
        return this;
    }
    public String getGatewayDesc() {
        return this.gatewayDesc;
    }

    public CreateGatewayRequest setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
        return this;
    }
    public String getGatewayName() {
        return this.gatewayName;
    }

    public CreateGatewayRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
