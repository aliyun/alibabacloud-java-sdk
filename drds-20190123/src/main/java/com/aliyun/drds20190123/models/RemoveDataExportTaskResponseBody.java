// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RemoveDataExportTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TaskManageResult")
    public RemoveDataExportTaskResponseBodyTaskManageResult taskManageResult;

    public static RemoveDataExportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveDataExportTaskResponseBody self = new RemoveDataExportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveDataExportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveDataExportTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RemoveDataExportTaskResponseBody setTaskManageResult(RemoveDataExportTaskResponseBodyTaskManageResult taskManageResult) {
        this.taskManageResult = taskManageResult;
        return this;
    }
    public RemoveDataExportTaskResponseBodyTaskManageResult getTaskManageResult() {
        return this.taskManageResult;
    }

    public static class RemoveDataExportTaskResponseBodyTaskManageResult extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static RemoveDataExportTaskResponseBodyTaskManageResult build(java.util.Map<String, ?> map) throws Exception {
            RemoveDataExportTaskResponseBodyTaskManageResult self = new RemoveDataExportTaskResponseBodyTaskManageResult();
            return TeaModel.build(map, self);
        }

        public RemoveDataExportTaskResponseBodyTaskManageResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RemoveDataExportTaskResponseBodyTaskManageResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
