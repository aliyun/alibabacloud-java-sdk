// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupDynamicRulesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("GroupId")
    public Long groupId;

    public static DescribeMonitorGroupDynamicRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorGroupDynamicRulesRequest self = new DescribeMonitorGroupDynamicRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorGroupDynamicRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMonitorGroupDynamicRulesRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

}
