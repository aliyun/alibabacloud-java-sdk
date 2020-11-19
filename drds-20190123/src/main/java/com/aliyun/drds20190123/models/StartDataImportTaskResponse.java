// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class StartDataImportTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("TaskManageResult")
    @Validation(required = true)
    public StartDataImportTaskResponseTaskManageResult taskManageResult;

    public static StartDataImportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDataImportTaskResponse self = new StartDataImportTaskResponse();
        return TeaModel.build(map, self);
    }

    public StartDataImportTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartDataImportTaskResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public StartDataImportTaskResponse setTaskManageResult(StartDataImportTaskResponseTaskManageResult taskManageResult) {
        this.taskManageResult = taskManageResult;
        return this;
    }
    public StartDataImportTaskResponseTaskManageResult getTaskManageResult() {
        return this.taskManageResult;
    }

    public static class StartDataImportTaskResponseTaskManageResult extends TeaModel {
        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static StartDataImportTaskResponseTaskManageResult build(java.util.Map<String, ?> map) throws Exception {
            StartDataImportTaskResponseTaskManageResult self = new StartDataImportTaskResponseTaskManageResult();
            return TeaModel.build(map, self);
        }

        public StartDataImportTaskResponseTaskManageResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public StartDataImportTaskResponseTaskManageResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
