// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class StopDataImportTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("TaskManageResult")
    @Validation(required = true)
    public StopDataImportTaskResponseTaskManageResult taskManageResult;

    public static StopDataImportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDataImportTaskResponse self = new StopDataImportTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopDataImportTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopDataImportTaskResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public StopDataImportTaskResponse setTaskManageResult(StopDataImportTaskResponseTaskManageResult taskManageResult) {
        this.taskManageResult = taskManageResult;
        return this;
    }
    public StopDataImportTaskResponseTaskManageResult getTaskManageResult() {
        return this.taskManageResult;
    }

    public static class StopDataImportTaskResponseTaskManageResult extends TeaModel {
        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static StopDataImportTaskResponseTaskManageResult build(java.util.Map<String, ?> map) throws Exception {
            StopDataImportTaskResponseTaskManageResult self = new StopDataImportTaskResponseTaskManageResult();
            return TeaModel.build(map, self);
        }

        public StopDataImportTaskResponseTaskManageResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public StopDataImportTaskResponseTaskManageResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
