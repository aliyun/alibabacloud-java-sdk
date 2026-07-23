// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class CreateExperimentRunResponseBody extends TeaModel {
    /**
     * <p>The message.</p>
     * 
     * <strong>example:</strong>
     * <p>Experiment created, execution started.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The experiment record ID. For online experiments, the format is typically exp-run-{uuid32}. For offline experiments, the format may also be a standard UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>exp-run-f6d419b0ed3d43a7b585948a55efc07b</p>
     */
    @NameInMap("recordId")
    public String recordId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019F89B5-1B07-3BB3-A32E-F5B007029E9C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The experiment record status. After creation, the status is typically pending.</p>
     * 
     * <strong>example:</strong>
     * <p>pending</p>
     */
    @NameInMap("status")
    public String status;

    public static CreateExperimentRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateExperimentRunResponseBody self = new CreateExperimentRunResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateExperimentRunResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateExperimentRunResponseBody setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public CreateExperimentRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateExperimentRunResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
