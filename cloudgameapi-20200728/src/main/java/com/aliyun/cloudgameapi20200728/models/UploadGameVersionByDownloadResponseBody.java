// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class UploadGameVersionByDownloadResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 任务id
    @NameInMap("TaskId")
    public String taskId;

    public static UploadGameVersionByDownloadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadGameVersionByDownloadResponseBody self = new UploadGameVersionByDownloadResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadGameVersionByDownloadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadGameVersionByDownloadResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
