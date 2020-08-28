// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteNatGatewayRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("NatGatewayId")
    @Validation(required = true)
    public String natGatewayId;

    public static DeleteNatGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNatGatewayRequest self = new DeleteNatGatewayRequest();
        return TeaModel.build(map, self);
    }

}
