// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAutoProvisioningGroupsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("AutoProvisioningGroupName")
    public String autoProvisioningGroupName;

    @NameInMap("AutoProvisioningGroupId")
    public java.util.List<String> autoProvisioningGroupId;

    @NameInMap("AutoProvisioningGroupStatus")
    public java.util.List<String> autoProvisioningGroupStatus;

    public static DescribeAutoProvisioningGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoProvisioningGroupsRequest self = new DescribeAutoProvisioningGroupsRequest();
        return TeaModel.build(map, self);
    }

}
