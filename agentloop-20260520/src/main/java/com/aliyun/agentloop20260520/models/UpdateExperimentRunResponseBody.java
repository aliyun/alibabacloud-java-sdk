// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class UpdateExperimentRunResponseBody extends TeaModel {
    /**
     * <p>The prompt message.</p>
     * 
     * <strong>example:</strong>
     * <p>Experiment record updated successfully.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The experiment record ID.</p>
     * 
     * <strong>example:</strong>
     * <p>a5397261-6e6d-4e45-bf52-feb8686f7524</p>
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
     * <p>The status after the update (the persisted value).</p>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("status")
    public String status;

    public static UpdateExperimentRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentRunResponseBody self = new UpdateExperimentRunResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentRunResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateExperimentRunResponseBody setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public UpdateExperimentRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateExperimentRunResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
