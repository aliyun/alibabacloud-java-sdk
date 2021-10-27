// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateCustomDataImportPreCheckTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TaskId")
    public Long taskId;

    public static CreateCustomDataImportPreCheckTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomDataImportPreCheckTaskResponseBody self = new CreateCustomDataImportPreCheckTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomDataImportPreCheckTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCustomDataImportPreCheckTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateCustomDataImportPreCheckTaskResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
