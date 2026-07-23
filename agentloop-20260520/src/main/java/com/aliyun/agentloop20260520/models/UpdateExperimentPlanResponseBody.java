// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class UpdateExperimentPlanResponseBody extends TeaModel {
    /**
     * <p>The prompt message.</p>
     * 
     * <strong>example:</strong>
     * <p>Experiment plan updated successfully.</p>
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
     * <p>The update result. The value is updated if successful.</p>
     * 
     * <strong>example:</strong>
     * <p>updated</p>
     */
    @NameInMap("status")
    public String status;

    public static UpdateExperimentPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentPlanResponseBody self = new UpdateExperimentPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentPlanResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateExperimentPlanResponseBody setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public UpdateExperimentPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateExperimentPlanResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
