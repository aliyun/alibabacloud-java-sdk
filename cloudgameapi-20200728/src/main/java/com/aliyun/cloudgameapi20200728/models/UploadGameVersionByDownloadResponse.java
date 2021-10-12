// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class UploadGameVersionByDownloadResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    public static UploadGameVersionByDownloadResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadGameVersionByDownloadResponse self = new UploadGameVersionByDownloadResponse();
        return TeaModel.build(map, self);
    }

    public UploadGameVersionByDownloadResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadGameVersionByDownloadResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
