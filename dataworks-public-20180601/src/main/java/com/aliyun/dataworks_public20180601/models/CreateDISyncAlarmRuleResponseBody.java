// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class CreateDISyncAlarmRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleId")
    public Long ruleId;

    public static CreateDISyncAlarmRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDISyncAlarmRuleResponseBody self = new CreateDISyncAlarmRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDISyncAlarmRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDISyncAlarmRuleResponseBody setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
