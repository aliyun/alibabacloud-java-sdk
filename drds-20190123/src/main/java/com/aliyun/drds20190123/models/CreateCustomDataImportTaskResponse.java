// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateCustomDataImportTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("TaskId")
    @Validation(required = true)
    public Long taskId;

    public static CreateCustomDataImportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomDataImportTaskResponse self = new CreateCustomDataImportTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomDataImportTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCustomDataImportTaskResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateCustomDataImportTaskResponse setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
