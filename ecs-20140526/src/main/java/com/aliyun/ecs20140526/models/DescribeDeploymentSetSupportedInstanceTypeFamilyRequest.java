// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDeploymentSetSupportedInstanceTypeFamilyRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static DescribeDeploymentSetSupportedInstanceTypeFamilyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeploymentSetSupportedInstanceTypeFamilyRequest self = new DescribeDeploymentSetSupportedInstanceTypeFamilyRequest();
        return TeaModel.build(map, self);
    }

}
