// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteDBInstancePlanResponseBody extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp12ga6v69h86****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

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

    public static DeleteDBInstancePlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBInstancePlanResponseBody self = new DeleteDBInstancePlanResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDBInstancePlanResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DeleteDBInstancePlanResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteDBInstancePlanResponseBody setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public DeleteDBInstancePlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDBInstancePlanResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
