// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_dg20230914.models;

import com.aliyun.tea.*;

public class GetUserGatewayInstancesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GatewayId")
    public String gatewayId;

    public static GetUserGatewayInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserGatewayInstancesRequest self = new GetUserGatewayInstancesRequest();
        return TeaModel.build(map, self);
    }

    public GetUserGatewayInstancesRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

}
