// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class DescribeInstanceStatsInfoRequest extends TeaModel {
    @NameInMap("DistrictIds")
    public java.util.List<String> districtIds;

    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    @NameInMap("ProjectIds")
    public java.util.List<String> projectIds;

    public static DescribeInstanceStatsInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceStatsInfoRequest self = new DescribeInstanceStatsInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceStatsInfoRequest setDistrictIds(java.util.List<String> districtIds) {
        this.districtIds = districtIds;
        return this;
    }
    public java.util.List<String> getDistrictIds() {
        return this.districtIds;
    }

    public DescribeInstanceStatsInfoRequest setInstanceTypes(java.util.List<String> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public java.util.List<String> getInstanceTypes() {
        return this.instanceTypes;
    }

    public DescribeInstanceStatsInfoRequest setProjectIds(java.util.List<String> projectIds) {
        this.projectIds = projectIds;
        return this;
    }
    public java.util.List<String> getProjectIds() {
        return this.projectIds;
    }

}
