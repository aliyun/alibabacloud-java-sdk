// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_dg20230914.models;

import com.aliyun.tea.*;

public class DeleteGatewayInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GatewayId")
    public String gatewayId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GatewayInstanceId")
    public String gatewayInstanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteGatewayInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayInstanceRequest self = new DeleteGatewayInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayInstanceRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public DeleteGatewayInstanceRequest setGatewayInstanceId(String gatewayInstanceId) {
        this.gatewayInstanceId = gatewayInstanceId;
        return this;
    }
    public String getGatewayInstanceId() {
        return this.gatewayInstanceId;
    }

    public DeleteGatewayInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
