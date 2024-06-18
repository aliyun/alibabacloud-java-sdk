// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateRuleResponseBody extends TeaModel {
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
     * <p>365F4154-92F6-4AE4-92F8-7FF34B540750</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The forwarding rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rule-a3x3pg1yohq3lq****</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    public static CreateRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRuleResponseBody self = new CreateRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRuleResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CreateRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRuleResponseBody setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
