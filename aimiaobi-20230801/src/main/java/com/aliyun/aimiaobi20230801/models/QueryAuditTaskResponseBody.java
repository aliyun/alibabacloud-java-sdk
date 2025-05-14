// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class QueryAuditTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryAuditTaskResponseBodyData data;

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

    public static QueryAuditTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAuditTaskResponseBody self = new QueryAuditTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAuditTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAuditTaskResponseBody setData(QueryAuditTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAuditTaskResponseBodyData getData() {
        return this.data;
    }

    public QueryAuditTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryAuditTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAuditTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAuditTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAuditTaskResponseBodyDataResponseHeader extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>DataNotExists</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>数据不存在</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>task-failed</p>
         */
        @NameInMap("Event")
        public String event;

        /**
         * <strong>example:</strong>
         * <p>49eab783-9172-487a-b9df-c6372c47392c</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>896b733535274d28b1a61c78bc145217</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static QueryAuditTaskResponseBodyDataResponseHeader build(java.util.Map<String, ?> map) throws Exception {
            QueryAuditTaskResponseBodyDataResponseHeader self = new QueryAuditTaskResponseBodyDataResponseHeader();
            return TeaModel.build(map, self);
        }

        public QueryAuditTaskResponseBodyDataResponseHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public QueryAuditTaskResponseBodyDataResponseHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QueryAuditTaskResponseBodyDataResponseHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public QueryAuditTaskResponseBodyDataResponseHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public QueryAuditTaskResponseBodyDataResponseHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class QueryAuditTaskResponseBodyDataResponsePayloadOutput extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>x\&quot;x\&quot;x</p>
         */
        @NameInMap("Text")
        public String text;

        public static QueryAuditTaskResponseBodyDataResponsePayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            QueryAuditTaskResponseBodyDataResponsePayloadOutput self = new QueryAuditTaskResponseBodyDataResponsePayloadOutput();
            return TeaModel.build(map, self);
        }

        public QueryAuditTaskResponseBodyDataResponsePayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class QueryAuditTaskResponseBodyDataResponsePayloadUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("InputTokens")
        public Integer inputTokens;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("OutputTokens")
        public Integer outputTokens;

        /**
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("TotalTokens")
        public Integer totalTokens;

        public static QueryAuditTaskResponseBodyDataResponsePayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            QueryAuditTaskResponseBodyDataResponsePayloadUsage self = new QueryAuditTaskResponseBodyDataResponsePayloadUsage();
            return TeaModel.build(map, self);
        }

        public QueryAuditTaskResponseBodyDataResponsePayloadUsage setInputTokens(Integer inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Integer getInputTokens() {
            return this.inputTokens;
        }

        public QueryAuditTaskResponseBodyDataResponsePayloadUsage setOutputTokens(Integer outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Integer getOutputTokens() {
            return this.outputTokens;
        }

        public QueryAuditTaskResponseBodyDataResponsePayloadUsage setTotalTokens(Integer totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Integer getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class QueryAuditTaskResponseBodyDataResponsePayload extends TeaModel {
        @NameInMap("Output")
        public QueryAuditTaskResponseBodyDataResponsePayloadOutput output;

        @NameInMap("Usage")
        public QueryAuditTaskResponseBodyDataResponsePayloadUsage usage;

        public static QueryAuditTaskResponseBodyDataResponsePayload build(java.util.Map<String, ?> map) throws Exception {
            QueryAuditTaskResponseBodyDataResponsePayload self = new QueryAuditTaskResponseBodyDataResponsePayload();
            return TeaModel.build(map, self);
        }

        public QueryAuditTaskResponseBodyDataResponsePayload setOutput(QueryAuditTaskResponseBodyDataResponsePayloadOutput output) {
            this.output = output;
            return this;
        }
        public QueryAuditTaskResponseBodyDataResponsePayloadOutput getOutput() {
            return this.output;
        }

        public QueryAuditTaskResponseBodyDataResponsePayload setUsage(QueryAuditTaskResponseBodyDataResponsePayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public QueryAuditTaskResponseBodyDataResponsePayloadUsage getUsage() {
            return this.usage;
        }

    }

    public static class QueryAuditTaskResponseBodyDataResponse extends TeaModel {
        @NameInMap("Header")
        public QueryAuditTaskResponseBodyDataResponseHeader header;

        @NameInMap("Payload")
        public QueryAuditTaskResponseBodyDataResponsePayload payload;

        public static QueryAuditTaskResponseBodyDataResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryAuditTaskResponseBodyDataResponse self = new QueryAuditTaskResponseBodyDataResponse();
            return TeaModel.build(map, self);
        }

        public QueryAuditTaskResponseBodyDataResponse setHeader(QueryAuditTaskResponseBodyDataResponseHeader header) {
            this.header = header;
            return this;
        }
        public QueryAuditTaskResponseBodyDataResponseHeader getHeader() {
            return this.header;
        }

        public QueryAuditTaskResponseBodyDataResponse setPayload(QueryAuditTaskResponseBodyDataResponsePayload payload) {
            this.payload = payload;
            return this;
        }
        public QueryAuditTaskResponseBodyDataResponsePayload getPayload() {
            return this.payload;
        }

    }

    public static class QueryAuditTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-05-13 12:12:12</p>
         */
        @NameInMap("AuditTime")
        public String auditTime;

        /**
         * <strong>example:</strong>
         * <p>审核时的原文</p>
         */
        @NameInMap("Content")
        public String content;

        @NameInMap("Response")
        public QueryAuditTaskResponseBodyDataResponse response;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskStatus")
        public Integer taskStatus;

        public static QueryAuditTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAuditTaskResponseBodyData self = new QueryAuditTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAuditTaskResponseBodyData setAuditTime(String auditTime) {
            this.auditTime = auditTime;
            return this;
        }
        public String getAuditTime() {
            return this.auditTime;
        }

        public QueryAuditTaskResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public QueryAuditTaskResponseBodyData setResponse(QueryAuditTaskResponseBodyDataResponse response) {
            this.response = response;
            return this;
        }
        public QueryAuditTaskResponseBodyDataResponse getResponse() {
            return this.response;
        }

        public QueryAuditTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryAuditTaskResponseBodyData setTaskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

    }

}
