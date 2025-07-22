// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteNatGatewayRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

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

    public DeleteNatGatewayRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
