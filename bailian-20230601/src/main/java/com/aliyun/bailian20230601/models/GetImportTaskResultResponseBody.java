// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class GetImportTaskResultResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetImportTaskResultResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetImportTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImportTaskResultResponseBody self = new GetImportTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImportTaskResultResponseBody setData(GetImportTaskResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetImportTaskResultResponseBodyData getData() {
        return this.data;
    }

    public GetImportTaskResultResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetImportTaskResultResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetImportTaskResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetImportTaskResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetImportTaskResultResponseBodyDataDetails extends TeaModel {
        @NameInMap("DataId")
        public String dataId;

        @NameInMap("DataName")
        public String dataName;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("Success")
        public Boolean success;

        public static GetImportTaskResultResponseBodyDataDetails build(java.util.Map<String, ?> map) throws Exception {
            GetImportTaskResultResponseBodyDataDetails self = new GetImportTaskResultResponseBodyDataDetails();
            return TeaModel.build(map, self);
        }

        public GetImportTaskResultResponseBodyDataDetails setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public GetImportTaskResultResponseBodyDataDetails setDataName(String dataName) {
            this.dataName = dataName;
            return this;
        }
        public String getDataName() {
            return this.dataName;
        }

        public GetImportTaskResultResponseBodyDataDetails setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public GetImportTaskResultResponseBodyDataDetails setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class GetImportTaskResultResponseBodyData extends TeaModel {
        @NameInMap("Details")
        public java.util.List<GetImportTaskResultResponseBodyDataDetails> details;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskStatus")
        public Integer taskStatus;

        @NameInMap("TaskStatusText")
        public String taskStatusText;

        public static GetImportTaskResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetImportTaskResultResponseBodyData self = new GetImportTaskResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetImportTaskResultResponseBodyData setDetails(java.util.List<GetImportTaskResultResponseBodyDataDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<GetImportTaskResultResponseBodyDataDetails> getDetails() {
            return this.details;
        }

        public GetImportTaskResultResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetImportTaskResultResponseBodyData setTaskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        public GetImportTaskResultResponseBodyData setTaskStatusText(String taskStatusText) {
            this.taskStatusText = taskStatusText;
            return this;
        }
        public String getTaskStatusText() {
            return this.taskStatusText;
        }

    }

}
