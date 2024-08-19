// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateDownloadTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E7F333E0-7B70-54DA-A307-4B2B49DEE923</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the task. Valid values:</p>
     * <p>finish: The task finished. You can query the task to obtain the download link of the file.</p>
     * <p>start: The task start.</p>
     * <p>error: An error occurred.</p>
     * <p>expire: The task file is invalid and cannot be downloaded.</p>
     * 
     * <strong>example:</strong>
     * <p>start</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The unique ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>132</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>The name of the file download task.</p>
     * 
     * <strong>example:</strong>
     * <p>Internet Boundary Firewall Assets - IPv4</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static CreateDownloadTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDownloadTaskResponseBody self = new CreateDownloadTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDownloadTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDownloadTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateDownloadTaskResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public CreateDownloadTaskResponseBody setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
