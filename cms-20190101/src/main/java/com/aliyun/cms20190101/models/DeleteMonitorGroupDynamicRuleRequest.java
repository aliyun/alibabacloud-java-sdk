// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMonitorGroupDynamicRuleRequest extends TeaModel {
    /**
     * <p>The service to which the rule applies. Valid values: ecs, rds, and slb.</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The ID of the application group.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteMonitorGroupDynamicRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMonitorGroupDynamicRuleRequest self = new DeleteMonitorGroupDynamicRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMonitorGroupDynamicRuleRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DeleteMonitorGroupDynamicRuleRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DeleteMonitorGroupDynamicRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
