// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceMaintenanceAttributesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    public static DescribeInstanceMaintenanceAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceMaintenanceAttributesRequest self = new DescribeInstanceMaintenanceAttributesRequest();
        return TeaModel.build(map, self);
    }

}
