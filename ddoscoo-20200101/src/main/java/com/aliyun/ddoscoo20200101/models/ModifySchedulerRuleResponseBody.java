// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifySchedulerRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Cname")
    public String cname;

    @NameInMap("RuleName")
    public String ruleName;

    public static ModifySchedulerRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySchedulerRuleResponseBody self = new ModifySchedulerRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySchedulerRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySchedulerRuleResponseBody setCname(String cname) {
        this.cname = cname;
        return this;
    }
    public String getCname() {
        return this.cname;
    }

    public ModifySchedulerRuleResponseBody setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
