// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class CancelPipelineRunResponseBody extends TeaModel {
    /**
     * <p>The time when the cancellation was completed, in ISO 8601 UTC format.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01T00:00:05.000Z</p>
     */
    @NameInMap("finishTime")
    public String finishTime;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The ID of the canceled run.</p>
     * 
     * <strong>example:</strong>
     * <p>run-20260101-0001</p>
     */
    @NameInMap("runId")
    public String runId;

    /**
     * <p>The status of the run after cancellation. The value is fixed to Cancelled.</p>
     * 
     * <strong>example:</strong>
     * <p>Cancelled</p>
     */
    @NameInMap("status")
    public String status;

    public static CancelPipelineRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelPipelineRunResponseBody self = new CancelPipelineRunResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelPipelineRunResponseBody setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public String getFinishTime() {
        return this.finishTime;
    }

    public CancelPipelineRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelPipelineRunResponseBody setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public CancelPipelineRunResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
