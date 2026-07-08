// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitSmartAuditResponseBody extends TeaModel {
    /**
     * <p>Error code</p>
     * 
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Task response object</p>
     */
    @NameInMap("Data")
    public SubmitSmartAuditResponseBodyData data;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Error message</p>
     * 
     * <strong>example:</strong>
     * <p>错误消息</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SubmitSmartAuditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitSmartAuditResponseBody self = new SubmitSmartAuditResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitSmartAuditResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitSmartAuditResponseBody setData(SubmitSmartAuditResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitSmartAuditResponseBodyData getData() {
        return this.data;
    }

    public SubmitSmartAuditResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SubmitSmartAuditResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitSmartAuditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitSmartAuditResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitSmartAuditResponseBodyData extends TeaModel {
        /**
         * <p>Task ID</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static SubmitSmartAuditResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitSmartAuditResponseBodyData self = new SubmitSmartAuditResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitSmartAuditResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
