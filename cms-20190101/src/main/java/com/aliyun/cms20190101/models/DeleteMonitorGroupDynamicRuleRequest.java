// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMonitorGroupDynamicRuleRequest extends TeaModel {
    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("Category")
    public String category;

    public static DeleteMonitorGroupDynamicRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMonitorGroupDynamicRuleRequest self = new DeleteMonitorGroupDynamicRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMonitorGroupDynamicRuleRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DeleteMonitorGroupDynamicRuleRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

}
