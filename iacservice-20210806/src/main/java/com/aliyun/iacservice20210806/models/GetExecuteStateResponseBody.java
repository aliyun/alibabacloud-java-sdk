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
     * <p>The execution log.</p>
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
     * <p>The content of the state file.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;version&quot;: 4, &quot;terraform_version&quot;: &quot;1.5.7&quot;, &quot;serial&quot;: 3, &quot;lineage&quot;: &quot;cb71b0b2-1ec2-6483-d409-8cae23186ec6&quot;,  &quot;outputs&quot;: {}, &quot;resources&quot;: [], &quot;check_results&quot;: null}</p>
     */
    @NameInMap("state")
    public String state;

    /**
     * <p>The status. Valid values:</p>
     * <ul>
     * <li>Pending: The task is ready.</li>
     * <li>PlanQueued: The plan task is queued and waiting for an available workflow.</li>
     * <li>ApplyQueued: The apply task is queued and waiting for an available workflow.</li>
     * <li>Planning: The plan phase is being executed.</li>
     * <li>Planned: The plan execution is completed.</li>
     * <li>Confirmed: The execution is confirmed after the plan phase.</li>
     * <li>PlannedAndFinished: No differences are found after the plan execution is completed, and the job enters the final state.</li>
     * <li>Applying: The apply phase is being executed.</li>
     * <li>Applied: The apply execution is completed.</li>
     * <li>Discarded: The execution task is discarded and enters the final state.</li>
     * <li>Errored: An error occurs during the execution, and the job enters the final state.</li>
     * <li>Canceled: The execution is canceled and enters the final state.</li>
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
