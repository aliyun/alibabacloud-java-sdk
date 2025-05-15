// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetInterveneImportTaskInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetInterveneImportTaskInfoResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Msg")
        public String msg;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Percentage")
        public Integer percentage;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>41405255</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>ft-task-20190101m8rnK</p>
         */
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
        @NameInMap("Code")
        public Integer code;

        @NameInMap("Status")
        public GetInterveneImportTaskInfoResponseBodyDataStatus status;

        public static GetInterveneImportTaskInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInterveneImportTaskInfoResponseBodyData self = new GetInterveneImportTaskInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInterveneImportTaskInfoResponseBodyData setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
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
