// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupReferencesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("SecurityGroupId")
    @Validation(required = true)
    public java.util.List<String> securityGroupId;

    public static DescribeSecurityGroupReferencesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityGroupReferencesRequest self = new DescribeSecurityGroupReferencesRequest();
        return TeaModel.build(map, self);
    }

}
