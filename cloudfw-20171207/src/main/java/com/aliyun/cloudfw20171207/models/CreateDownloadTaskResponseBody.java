// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateDownloadTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("TaskId")
    public Long taskId;

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
