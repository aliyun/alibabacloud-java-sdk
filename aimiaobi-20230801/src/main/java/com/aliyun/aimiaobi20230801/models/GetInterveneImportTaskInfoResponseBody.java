// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetInterveneImportTaskInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetInterveneImportTaskInfoResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetInterveneImportTaskInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInterveneImportTaskInfoResponseBody self = new GetInterveneImportTaskInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInterveneImportTaskInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInterveneImportTaskInfoResponseBody setData(GetInterveneImportTaskInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInterveneImportTaskInfoResponseBodyData getData() {
        return this.data;
    }

    public GetInterveneImportTaskInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetInterveneImportTaskInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInterveneImportTaskInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInterveneImportTaskInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInterveneImportTaskInfoResponseBodyDataStatus extends TeaModel {
        @NameInMap("Msg")
        public String msg;

        @NameInMap("Percentage")
        public Integer percentage;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskName")
        public String taskName;

        public static GetInterveneImportTaskInfoResponseBodyDataStatus build(java.util.Map<String, ?> map) throws Exception {
            GetInterveneImportTaskInfoResponseBodyDataStatus self = new GetInterveneImportTaskInfoResponseBodyDataStatus();
            return TeaModel.build(map, self);
        }

        public GetInterveneImportTaskInfoResponseBodyDataStatus setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public GetInterveneImportTaskInfoResponseBodyDataStatus setPercentage(Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public Integer getPercentage() {
            return this.percentage;
        }

        public GetInterveneImportTaskInfoResponseBodyDataStatus setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetInterveneImportTaskInfoResponseBodyDataStatus setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetInterveneImportTaskInfoResponseBodyDataStatus setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

    public static class GetInterveneImportTaskInfoResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public GetInterveneImportTaskInfoResponseBodyDataStatus status;

        public static GetInterveneImportTaskInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInterveneImportTaskInfoResponseBodyData self = new GetInterveneImportTaskInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInterveneImportTaskInfoResponseBodyData setStatus(GetInterveneImportTaskInfoResponseBodyDataStatus status) {
            this.status = status;
            return this;
        }
        public GetInterveneImportTaskInfoResponseBodyDataStatus getStatus() {
            return this.status;
        }

    }

}
