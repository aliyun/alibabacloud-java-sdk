// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class StopDataExportTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("TaskManageResult")
    @Validation(required = true)
    public StopDataExportTaskResponseTaskManageResult taskManageResult;

    public static StopDataExportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDataExportTaskResponse self = new StopDataExportTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopDataExportTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopDataExportTaskResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public StopDataExportTaskResponse setTaskManageResult(StopDataExportTaskResponseTaskManageResult taskManageResult) {
        this.taskManageResult = taskManageResult;
        return this;
    }
    public StopDataExportTaskResponseTaskManageResult getTaskManageResult() {
        return this.taskManageResult;
    }

    public static class StopDataExportTaskResponseTaskManageResult extends TeaModel {
        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static StopDataExportTaskResponseTaskManageResult build(java.util.Map<String, ?> map) throws Exception {
            StopDataExportTaskResponseTaskManageResult self = new StopDataExportTaskResponseTaskManageResult();
            return TeaModel.build(map, self);
        }

        public StopDataExportTaskResponseTaskManageResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public StopDataExportTaskResponseTaskManageResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
