// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RemoveDataExportTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("TaskManageResult")
    @Validation(required = true)
    public RemoveDataExportTaskResponseTaskManageResult taskManageResult;

    public static RemoveDataExportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveDataExportTaskResponse self = new RemoveDataExportTaskResponse();
        return TeaModel.build(map, self);
    }

    public RemoveDataExportTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveDataExportTaskResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RemoveDataExportTaskResponse setTaskManageResult(RemoveDataExportTaskResponseTaskManageResult taskManageResult) {
        this.taskManageResult = taskManageResult;
        return this;
    }
    public RemoveDataExportTaskResponseTaskManageResult getTaskManageResult() {
        return this.taskManageResult;
    }

    public static class RemoveDataExportTaskResponseTaskManageResult extends TeaModel {
        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static RemoveDataExportTaskResponseTaskManageResult build(java.util.Map<String, ?> map) throws Exception {
            RemoveDataExportTaskResponseTaskManageResult self = new RemoveDataExportTaskResponseTaskManageResult();
            return TeaModel.build(map, self);
        }

        public RemoveDataExportTaskResponseTaskManageResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public RemoveDataExportTaskResponseTaskManageResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
