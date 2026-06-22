// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateDownloadTaskResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E7F333E0-7B70-54DA-A307-4B2B49DEE923</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li><p>finish: The task is complete. You can query the task to obtain the download URL of the task file.</p>
     * </li>
     * <li><p>start: The task has started.</p>
     * </li>
     * <li><p>error: The task failed.</p>
     * </li>
     * <li><p>expire: The task has expired. The task file is no longer valid and cannot be downloaded.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>start</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The task ID, which uniquely identifies the task.</p>
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
     * <p>test-IPv4</p>
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
