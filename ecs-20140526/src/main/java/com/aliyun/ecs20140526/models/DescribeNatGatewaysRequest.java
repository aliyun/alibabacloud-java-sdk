// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeNatGatewaysRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("NatGatewayId")
    public String natGatewayId;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeNatGatewaysRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatGatewaysRequest self = new DescribeNatGatewaysRequest();
        return TeaModel.build(map, self);
    }

}
