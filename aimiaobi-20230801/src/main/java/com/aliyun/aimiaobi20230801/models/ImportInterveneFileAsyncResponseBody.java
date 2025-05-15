// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ImportInterveneFileAsyncResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ImportInterveneFileAsyncResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>94512A33-8EC1-5452-A793-5C91F18ED2F0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ImportInterveneFileAsyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportInterveneFileAsyncResponseBody self = new ImportInterveneFileAsyncResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportInterveneFileAsyncResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImportInterveneFileAsyncResponseBody setData(ImportInterveneFileAsyncResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImportInterveneFileAsyncResponseBodyData getData() {
        return this.data;
    }

    public ImportInterveneFileAsyncResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ImportInterveneFileAsyncResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImportInterveneFileAsyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportInterveneFileAsyncResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ImportInterveneFileAsyncResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        @NameInMap("FailIdList")
        public java.util.List<String> failIdList;

        /**
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static ImportInterveneFileAsyncResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImportInterveneFileAsyncResponseBodyData self = new ImportInterveneFileAsyncResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImportInterveneFileAsyncResponseBodyData setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public ImportInterveneFileAsyncResponseBodyData setFailIdList(java.util.List<String> failIdList) {
            this.failIdList = failIdList;
            return this;
        }
        public java.util.List<String> getFailIdList() {
            return this.failIdList;
        }

        public ImportInterveneFileAsyncResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
