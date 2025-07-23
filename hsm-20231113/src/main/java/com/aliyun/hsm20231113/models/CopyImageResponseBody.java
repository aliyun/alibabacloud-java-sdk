// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class CopyImageResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the task is complete.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Completed")
    public Boolean completed;

    /**
     * <p>The time when the task is created. The value is accurate to the millisecond. The value is a UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1724379766191</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The error message returned if the task fails.</p>
     * 
     * <strong>example:</strong>
     * <p>OperationTimeout</p>
     */
    @NameInMap("Error")
    public String error;

    /**
     * <p>The ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>job-202401250936hze747fd7e0007005</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The progress of the task. Unit: percent (%).</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Progress")
    public Integer progress;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-447D-87BC-AC049166F216</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The response returned after the task succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Response")
    public String response;

    /**
     * <p>The task status.</p>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The operation type. Valid values:</p>
     * <ul>
     * <li>create</li>
     * <li>cancel</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>create</p>
     */
    @NameInMap("Type")
    public String type;

    public static CopyImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CopyImageResponseBody self = new CopyImageResponseBody();
        return TeaModel.build(map, self);
    }

    public CopyImageResponseBody setCompleted(Boolean completed) {
        this.completed = completed;
        return this;
    }
    public Boolean getCompleted() {
        return this.completed;
    }

    public CopyImageResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public CopyImageResponseBody setError(String error) {
        this.error = error;
        return this;
    }
    public String getError() {
        return this.error;
    }

    public CopyImageResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CopyImageResponseBody setProgress(Integer progress) {
        this.progress = progress;
        return this;
    }
    public Integer getProgress() {
        return this.progress;
    }

    public CopyImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CopyImageResponseBody setResponse(String response) {
        this.response = response;
        return this;
    }
    public String getResponse() {
        return this.response;
    }

    public CopyImageResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CopyImageResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
