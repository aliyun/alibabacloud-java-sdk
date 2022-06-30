// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateSchedulerRuleResponseBody extends TeaModel {
    @NameInMap("Cname")
    public String cname;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleName")
    public String ruleName;

    public static CreateSchedulerRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSchedulerRuleResponseBody self = new CreateSchedulerRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSchedulerRuleResponseBody setCname(String cname) {
        this.cname = cname;
        return this;
    }
    public String getCname() {
        return this.cname;
    }

    public CreateSchedulerRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSchedulerRuleResponseBody setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
