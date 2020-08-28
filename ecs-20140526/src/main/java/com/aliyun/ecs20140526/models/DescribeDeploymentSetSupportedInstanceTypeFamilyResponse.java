// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDeploymentSetSupportedInstanceTypeFamilyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceTypeFamilies")
    @Validation(required = true)
    public String instanceTypeFamilies;

    public static DescribeDeploymentSetSupportedInstanceTypeFamilyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeploymentSetSupportedInstanceTypeFamilyResponse self = new DescribeDeploymentSetSupportedInstanceTypeFamilyResponse();
        return TeaModel.build(map, self);
    }

}
