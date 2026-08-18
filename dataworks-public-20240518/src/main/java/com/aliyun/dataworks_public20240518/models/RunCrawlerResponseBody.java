// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RunCrawlerResponseBody extends TeaModel {
    /**
     * <p>The ID of the metadata crawler.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The request ID. Used for locating logs and troubleshooting issues.</p>
     * 
     * <strong>example:</strong>
     * <p>9252F32F-D855-549E-8898-61CF5A733050</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the run request was accepted. A value of true indicates that the request was accepted, but does not indicate that the collection task is complete.</p>
     */
    @NameInMap("RunAccepted")
    public Boolean runAccepted;

    /**
     * <p>The initial run status after submission. The value is WAITING when the run request is successfully accepted. To query the final status, call ListCrawlerRuns.</p>
     * 
     * <strong>example:</strong>
     * <p>WAITING</p>
     */
    @NameInMap("RunStatus")
    public String runStatus;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The associated DataWorks task instance ID. This field may be empty. To query the final run record, call ListCrawlerRuns.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("TaskInstanceId")
    public Long taskInstanceId;

    public static RunCrawlerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunCrawlerResponseBody self = new RunCrawlerResponseBody();
        return TeaModel.build(map, self);
    }

    public RunCrawlerResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public RunCrawlerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunCrawlerResponseBody setRunAccepted(Boolean runAccepted) {
        this.runAccepted = runAccepted;
        return this;
    }
    public Boolean getRunAccepted() {
        return this.runAccepted;
    }

    public RunCrawlerResponseBody setRunStatus(String runStatus) {
        this.runStatus = runStatus;
        return this;
    }
    public String getRunStatus() {
        return this.runStatus;
    }

    public RunCrawlerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RunCrawlerResponseBody setTaskInstanceId(Long taskInstanceId) {
        this.taskInstanceId = taskInstanceId;
        return this;
    }
    public Long getTaskInstanceId() {
        return this.taskInstanceId;
    }

}
