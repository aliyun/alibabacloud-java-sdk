// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateRulesResponseBody extends TeaModel {
    /**
     * <p>The ID of the asynchronous task.</p>
     * 
     * <strong>example:</strong>
     * <p>72dcd26b-f12d-4c27-b3af-18f6aed5****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The priority of the forwarding rule. Valid values: <strong>1 to 10000</strong>. A lower value specifies a higher priority.</p>
     * <blockquote>
     * <p>The priorities of the forwarding rules created for the same listener is unique.</p>
     * </blockquote>
     */
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
        /**
         * <p>The priority of the forwarding rule. Valid values: <strong>1 to 10000</strong>. A smaller value indicates a higher priority.</p>
         * <blockquote>
         * <p>The priorities of the forwarding rules created for the same listener must be unique.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The forwarding rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rule-a3x3pg1yohq3lq****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        public static CreateRulesResponseBodyRuleIds build(java.util.Map<String, ?> map) throws Exception {
            CreateRulesResponseBodyRuleIds self = new CreateRulesResponseBodyRuleIds();
            return TeaModel.build(map, self);
        }

        public CreateRulesResponseBodyRuleIds setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
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
