// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_dg20230914.models;

import com.aliyun.tea.*;

public class FindUserGatewayByIdRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
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
