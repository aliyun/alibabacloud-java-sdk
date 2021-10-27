// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class StopDataExportTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TaskManageResult")
    public StopDataExportTaskResponseBodyTaskManageResult taskManageResult;

    public static StopDataExportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopDataExportTaskResponseBody self = new StopDataExportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public StopDataExportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopDataExportTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public StopDataExportTaskResponseBody setTaskManageResult(StopDataExportTaskResponseBodyTaskManageResult taskManageResult) {
        this.taskManageResult = taskManageResult;
        return this;
    }
    public StopDataExportTaskResponseBodyTaskManageResult getTaskManageResult() {
        return this.taskManageResult;
    }

    public static class StopDataExportTaskResponseBodyTaskManageResult extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static StopDataExportTaskResponseBodyTaskManageResult build(java.util.Map<String, ?> map) throws Exception {
            StopDataExportTaskResponseBodyTaskManageResult self = new StopDataExportTaskResponseBodyTaskManageResult();
            return TeaModel.build(map, self);
        }

        public StopDataExportTaskResponseBodyTaskManageResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public StopDataExportTaskResponseBodyTaskManageResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
