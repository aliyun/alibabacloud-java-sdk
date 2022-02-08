// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class GetDISyncAlarmRuleRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("RuleId")
    public Long ruleId;

    public static GetDISyncAlarmRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDISyncAlarmRuleRequest self = new GetDISyncAlarmRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetDISyncAlarmRuleRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetDISyncAlarmRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
