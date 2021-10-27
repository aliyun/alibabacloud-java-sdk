// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class StopDataImportTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TaskManageResult")
    public StopDataImportTaskResponseBodyTaskManageResult taskManageResult;

    public static StopDataImportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopDataImportTaskResponseBody self = new StopDataImportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public StopDataImportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopDataImportTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public StopDataImportTaskResponseBody setTaskManageResult(StopDataImportTaskResponseBodyTaskManageResult taskManageResult) {
        this.taskManageResult = taskManageResult;
        return this;
    }
    public StopDataImportTaskResponseBodyTaskManageResult getTaskManageResult() {
        return this.taskManageResult;
    }

    public static class StopDataImportTaskResponseBodyTaskManageResult extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static StopDataImportTaskResponseBodyTaskManageResult build(java.util.Map<String, ?> map) throws Exception {
            StopDataImportTaskResponseBodyTaskManageResult self = new StopDataImportTaskResponseBodyTaskManageResult();
            return TeaModel.build(map, self);
        }

        public StopDataImportTaskResponseBodyTaskManageResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public StopDataImportTaskResponseBodyTaskManageResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
