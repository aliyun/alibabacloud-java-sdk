// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class CreateExperimentPlanResponseBody extends TeaModel {
    /**
     * <p>The message.</p>
     * 
     * <strong>example:</strong>
     * <p>Experiment plan created successfully.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The experiment plan ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exp-plan-e95bff54685a4ae29ff3a834c1008a71</p>
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
     * <p>The creation result. The value is <code>created</code> if the operation is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>created</p>
     */
    @NameInMap("status")
    public String status;

    public static CreateExperimentPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateExperimentPlanResponseBody self = new CreateExperimentPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateExperimentPlanResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateExperimentPlanResponseBody setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public CreateExperimentPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateExperimentPlanResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
