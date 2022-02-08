// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class DeleteDISyncAlarmRuleRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("RuleId")
    public Long ruleId;

    public static DeleteDISyncAlarmRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDISyncAlarmRuleRequest self = new DeleteDISyncAlarmRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDISyncAlarmRuleRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public DeleteDISyncAlarmRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
