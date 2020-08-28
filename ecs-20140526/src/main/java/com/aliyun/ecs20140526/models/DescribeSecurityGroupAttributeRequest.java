// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupAttributeRequest extends TeaModel {
    @NameInMap("SecurityGroupId")
    @Validation(required = true)
    public String securityGroupId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("NicType")
    public String nicType;

    @NameInMap("Direction")
    public String direction;

    public static DescribeSecurityGroupAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityGroupAttributeRequest self = new DescribeSecurityGroupAttributeRequest();
        return TeaModel.build(map, self);
    }

}
