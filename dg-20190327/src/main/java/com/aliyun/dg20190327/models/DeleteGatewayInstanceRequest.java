// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dg20190327.models;

import com.aliyun.tea.*;

public class DeleteGatewayInstanceRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("GatewayInstanceId")
    public String gatewayInstanceId;

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
