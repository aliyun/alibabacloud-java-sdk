// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateCustomDataExportPreCheckTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("TaskId")
    @Validation(required = true)
    public Long taskId;

    public static CreateCustomDataExportPreCheckTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomDataExportPreCheckTaskResponse self = new CreateCustomDataExportPreCheckTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomDataExportPreCheckTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCustomDataExportPreCheckTaskResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateCustomDataExportPreCheckTaskResponse setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
