// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RemoveDataImportTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("TaskManageResult")
    @Validation(required = true)
    public RemoveDataImportTaskResponseTaskManageResult taskManageResult;

    public static RemoveDataImportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveDataImportTaskResponse self = new RemoveDataImportTaskResponse();
        return TeaModel.build(map, self);
    }

    public RemoveDataImportTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveDataImportTaskResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RemoveDataImportTaskResponse setTaskManageResult(RemoveDataImportTaskResponseTaskManageResult taskManageResult) {
        this.taskManageResult = taskManageResult;
        return this;
    }
    public RemoveDataImportTaskResponseTaskManageResult getTaskManageResult() {
        return this.taskManageResult;
    }

    public static class RemoveDataImportTaskResponseTaskManageResult extends TeaModel {
        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static RemoveDataImportTaskResponseTaskManageResult build(java.util.Map<String, ?> map) throws Exception {
            RemoveDataImportTaskResponseTaskManageResult self = new RemoveDataImportTaskResponseTaskManageResult();
            return TeaModel.build(map, self);
        }

        public RemoveDataImportTaskResponseTaskManageResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public RemoveDataImportTaskResponseTaskManageResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
