// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class SetDBInstancePlanStatusResponseBody extends TeaModel {
    /**
     * <p>The error message returned.</p>
     * <p>This parameter is returned only when the operation fails.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the plan.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("PlanId")
    public String planId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>34b32a0a-08ef-4a87-b6be-cdd988888888</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The state of the operation.</p>
     * <p>If the operation is successful, <strong>success</strong> is returned. If the operation fails, this parameter is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    public static SetDBInstancePlanStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDBInstancePlanStatusResponseBody self = new SetDBInstancePlanStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDBInstancePlanStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SetDBInstancePlanStatusResponseBody setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public SetDBInstancePlanStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetDBInstancePlanStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
