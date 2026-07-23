// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class DeleteExperimentPlanResponseBody extends TeaModel {
    /**
     * <p>The experiment plan ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exp-plan-aa1a66b074bc42aa8696c73c7dc9b718</p>
     */
    @NameInMap("planId")
    public String planId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3FE4CD1E-FF41-56BE-B590-7A021D9C1524</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The deletion result. The value is deleted if the operation is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>deleted</p>
     */
    @NameInMap("status")
    public String status;

    public static DeleteExperimentPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteExperimentPlanResponseBody self = new DeleteExperimentPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteExperimentPlanResponseBody setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public DeleteExperimentPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteExperimentPlanResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
