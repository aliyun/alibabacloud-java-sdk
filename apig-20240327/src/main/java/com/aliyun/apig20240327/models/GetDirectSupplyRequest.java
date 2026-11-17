// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetDirectSupplyRequest extends TeaModel {
    /**
     * <p>The ID of the gateway instance for which you want to query direct-supply models.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-xxxxxxxx</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    public static GetDirectSupplyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDirectSupplyRequest self = new GetDirectSupplyRequest();
        return TeaModel.build(map, self);
    }

    public GetDirectSupplyRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

}
