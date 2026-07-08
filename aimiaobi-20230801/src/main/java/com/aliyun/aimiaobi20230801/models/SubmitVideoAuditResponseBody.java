// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitVideoAuditResponseBody extends TeaModel {
    /**
     * <p>Business status code</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Submitted task result data</p>
     */
    @NameInMap("Data")
    public SubmitVideoAuditResponseBodyData data;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Return message</p>
     * 
     * <strong>example:</strong>
     * <p>任务提交成功</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Is successful</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SubmitVideoAuditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoAuditResponseBody self = new SubmitVideoAuditResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitVideoAuditResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitVideoAuditResponseBody setData(SubmitVideoAuditResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitVideoAuditResponseBodyData getData() {
        return this.data;
    }

    public SubmitVideoAuditResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SubmitVideoAuditResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitVideoAuditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitVideoAuditResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitVideoAuditResponseBodyData extends TeaModel {
        /**
         * <p>Task ID</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static SubmitVideoAuditResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitVideoAuditResponseBodyData self = new SubmitVideoAuditResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitVideoAuditResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
