// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAutoProvisioningGroupInstancesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("AutoProvisioningGroupId")
    @Validation(required = true)
    public String autoProvisioningGroupId;

    public static DescribeAutoProvisioningGroupInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoProvisioningGroupInstancesRequest self = new DescribeAutoProvisioningGroupInstancesRequest();
        return TeaModel.build(map, self);
    }

}
