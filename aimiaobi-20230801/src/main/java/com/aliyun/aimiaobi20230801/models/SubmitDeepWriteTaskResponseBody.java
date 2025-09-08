// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitDeepWriteTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitDeepWriteTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>错误消息</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SubmitDeepWriteTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitDeepWriteTaskResponseBody self = new SubmitDeepWriteTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitDeepWriteTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitDeepWriteTaskResponseBody setData(SubmitDeepWriteTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitDeepWriteTaskResponseBodyData getData() {
        return this.data;
    }

    public SubmitDeepWriteTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SubmitDeepWriteTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitDeepWriteTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitDeepWriteTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitDeepWriteTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>queued</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>xbabac91-fdad-44d6-95ce-******</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static SubmitDeepWriteTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitDeepWriteTaskResponseBodyData self = new SubmitDeepWriteTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitDeepWriteTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SubmitDeepWriteTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
