// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetExecuteStateResponseBody extends TeaModel {
    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Your account does not have enough balance to order postpaid product.</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The run log.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;tf-plan.run.log&quot;:&quot;xxx&quot;}</p>
     */
    @NameInMap("logFile")
    public java.util.Map<String, ?> logFile;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B4672AE3-C313-5B7A-BB24-45345570D398</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The state file content.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;version&quot;: 4, &quot;terraform_version&quot;: &quot;1.5.7&quot;, &quot;serial&quot;: 3, &quot;lineage&quot;: &quot;cb71b0b2-1ec2-6483-d409-8cae23186ec6&quot;,  &quot;outputs&quot;: {}, &quot;resources&quot;: [], &quot;check_results&quot;: null}</p>
     */
    @NameInMap("state")
    public String state;

    /**
     * <p>The status. Valid values:</p>
     * <ul>
     * <li>Pending: ready to start.</li>
     * <li>PlanQueued: the plan task has been created but is waiting in the queue because no workflow is available.</li>
     * <li>ApplyQueued: the apply task has been created but is waiting in the queue because no workflow is available.</li>
     * <li>Planning: the plan phase is being executed.</li>
     * <li>Planned: the plan execution is complete.</li>
     * <li>Confirmed: the plan has been confirmed after execution.</li>
     * <li>PlannedAndFinished: the plan execution is complete and no diff was found. The job is in a terminal state.</li>
     * <li>Applying: the apply phase is being executed.</li>
     * <li>Applied: the apply execution is complete.</li>
     * <li>Discarded: the task has been discarded. This is a terminal state.</li>
     * <li>Errored: the execution encountered an error. This is a terminal state.</li>
     * <li>Canceled: the execution has been canceled. This is a terminal state.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Pending</p>
     */
    @NameInMap("status")
    public String status;

    public static GetExecuteStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExecuteStateResponseBody self = new GetExecuteStateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExecuteStateResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetExecuteStateResponseBody setLogFile(java.util.Map<String, ?> logFile) {
        this.logFile = logFile;
        return this;
    }
    public java.util.Map<String, ?> getLogFile() {
        return this.logFile;
    }

    public GetExecuteStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetExecuteStateResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public GetExecuteStateResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
