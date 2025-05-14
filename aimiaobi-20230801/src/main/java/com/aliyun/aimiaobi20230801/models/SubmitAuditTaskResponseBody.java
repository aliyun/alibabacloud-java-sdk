// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitAuditTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitAuditTaskResponseBodyData data;

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

    public static SubmitAuditTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitAuditTaskResponseBody self = new SubmitAuditTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitAuditTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitAuditTaskResponseBody setData(SubmitAuditTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitAuditTaskResponseBodyData getData() {
        return this.data;
    }

    public SubmitAuditTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SubmitAuditTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitAuditTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitAuditTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitAuditTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static SubmitAuditTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitAuditTaskResponseBodyData self = new SubmitAuditTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitAuditTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
