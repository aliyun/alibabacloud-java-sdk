// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupCategoriesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("GroupId")
    public Long groupId;

    public static DescribeMonitorGroupCategoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorGroupCategoriesRequest self = new DescribeMonitorGroupCategoriesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorGroupCategoriesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMonitorGroupCategoriesRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

}
