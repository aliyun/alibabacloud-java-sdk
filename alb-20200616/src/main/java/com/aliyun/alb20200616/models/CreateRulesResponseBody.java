// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateRulesResponseBody extends TeaModel {
    // 异步任务Id
    @NameInMap("JobId")
    public String jobId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 转发规则标识列表
    @NameInMap("RuleIds")
    public java.util.List<CreateRulesResponseBodyRuleIds> ruleIds;

    public static CreateRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRulesResponseBody self = new CreateRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRulesResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CreateRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRulesResponseBody setRuleIds(java.util.List<CreateRulesResponseBodyRuleIds> ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }
    public java.util.List<CreateRulesResponseBodyRuleIds> getRuleIds() {
        return this.ruleIds;
    }

    public static class CreateRulesResponseBodyRuleIds extends TeaModel {
        // 转发规则标识
        @NameInMap("RuleId")
        public String ruleId;

        public static CreateRulesResponseBodyRuleIds build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesResponseBodyRuleIds self = new CreateRulesResponseBodyRuleIds();
            return TeaModel.build(map, self);
        }

        public CreateRulesResponseBodyRuleIds setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

}
