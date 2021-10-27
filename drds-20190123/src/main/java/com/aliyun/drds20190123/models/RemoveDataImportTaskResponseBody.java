// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RemoveDataImportTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TaskManageResult")
    public RemoveDataImportTaskResponseBodyTaskManageResult taskManageResult;

    public static RemoveDataImportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveDataImportTaskResponseBody self = new RemoveDataImportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveDataImportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveDataImportTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RemoveDataImportTaskResponseBody setTaskManageResult(RemoveDataImportTaskResponseBodyTaskManageResult taskManageResult) {
        this.taskManageResult = taskManageResult;
        return this;
    }
    public RemoveDataImportTaskResponseBodyTaskManageResult getTaskManageResult() {
        return this.taskManageResult;
    }

    public static class RemoveDataImportTaskResponseBodyTaskManageResult extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static RemoveDataImportTaskResponseBodyTaskManageResult build(java.util.Map<String, ?> map) throws Exception {
            RemoveDataImportTaskResponseBodyTaskManageResult self = new RemoveDataImportTaskResponseBodyTaskManageResult();
            return TeaModel.build(map, self);
        }

        public RemoveDataImportTaskResponseBodyTaskManageResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RemoveDataImportTaskResponseBodyTaskManageResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
