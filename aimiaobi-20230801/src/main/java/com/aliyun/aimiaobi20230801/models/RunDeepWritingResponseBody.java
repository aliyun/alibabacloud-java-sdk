// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunDeepWritingResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Header")
    public RunDeepWritingResponseBodyHeader header;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Payload")
    public RunDeepWritingResponseBodyPayload payload;

    /**
     * <strong>example:</strong>
     * <p>31AC01F1-88FB-5C4D-B6F5-E8BB136CD5A3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RunDeepWritingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunDeepWritingResponseBody self = new RunDeepWritingResponseBody();
        return TeaModel.build(map, self);
    }

    public RunDeepWritingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RunDeepWritingResponseBody setHeader(RunDeepWritingResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunDeepWritingResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunDeepWritingResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public RunDeepWritingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RunDeepWritingResponseBody setPayload(RunDeepWritingResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunDeepWritingResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunDeepWritingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunDeepWritingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RunDeepWritingResponseBodyHeader extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>403</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>response.output_item.done</p>
         */
        @NameInMap("Event")
        public String event;

        /**
         * <strong>example:</strong>
         * <p>c2e2e991-f96a-4fcc-9ff7-d0df46c6d232</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("StatusCode")
        public Integer statusCode;

        /**
         * <strong>example:</strong>
         * <p>b84d31a5-44b2-4a35-9c6d-878d459c93d0</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>FAB10D42-F081-557B-8DCB-D6FB7AAF100B</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static RunDeepWritingResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunDeepWritingResponseBodyHeader self = new RunDeepWritingResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunDeepWritingResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunDeepWritingResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunDeepWritingResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunDeepWritingResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunDeepWritingResponseBodyHeader setStatusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public Integer getStatusCode() {
            return this.statusCode;
        }

        public RunDeepWritingResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunDeepWritingResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunDeepWritingResponseBodyPayloadOutputItemContent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <TASK_DONE>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <strong>example:</strong>
         * <p>output_text</p>
         */
        @NameInMap("Type")
        public String type;

        public static RunDeepWritingResponseBodyPayloadOutputItemContent build(java.util.Map<String, ?> map) throws Exception {
            RunDeepWritingResponseBodyPayloadOutputItemContent self = new RunDeepWritingResponseBodyPayloadOutputItemContent();
            return TeaModel.build(map, self);
        }

        public RunDeepWritingResponseBodyPayloadOutputItemContent setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public RunDeepWritingResponseBodyPayloadOutputItemContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class RunDeepWritingResponseBodyPayloadOutputItem extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ProjectManager</p>
         */
        @NameInMap("Agent")
        public String agent;

        @NameInMap("Arguments")
        public String arguments;

        @NameInMap("Content")
        public java.util.List<RunDeepWritingResponseBodyPayloadOutputItemContent> content;

        /**
         * <strong>example:</strong>
         * <p>88f6ed9e85c4f9377378da23e6a370d1</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Result")
        public String result;

        /**
         * <strong>example:</strong>
         * <p>completed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>function_call</p>
         */
        @NameInMap("Type")
        public String type;

        public static RunDeepWritingResponseBodyPayloadOutputItem build(java.util.Map<String, ?> map) throws Exception {
            RunDeepWritingResponseBodyPayloadOutputItem self = new RunDeepWritingResponseBodyPayloadOutputItem();
            return TeaModel.build(map, self);
        }

        public RunDeepWritingResponseBodyPayloadOutputItem setAgent(String agent) {
            this.agent = agent;
            return this;
        }
        public String getAgent() {
            return this.agent;
        }

        public RunDeepWritingResponseBodyPayloadOutputItem setArguments(String arguments) {
            this.arguments = arguments;
            return this;
        }
        public String getArguments() {
            return this.arguments;
        }

        public RunDeepWritingResponseBodyPayloadOutputItem setContent(java.util.List<RunDeepWritingResponseBodyPayloadOutputItemContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<RunDeepWritingResponseBodyPayloadOutputItemContent> getContent() {
            return this.content;
        }

        public RunDeepWritingResponseBodyPayloadOutputItem setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public RunDeepWritingResponseBodyPayloadOutputItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RunDeepWritingResponseBodyPayloadOutputItem setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public RunDeepWritingResponseBodyPayloadOutputItem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public RunDeepWritingResponseBodyPayloadOutputItem setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class RunDeepWritingResponseBodyPayloadOutputResponse extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>b2dc224b38694e0b668020159a7c5732</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>in_progress</p>
         */
        @NameInMap("Status")
        public String status;

        public static RunDeepWritingResponseBodyPayloadOutputResponse build(java.util.Map<String, ?> map) throws Exception {
            RunDeepWritingResponseBodyPayloadOutputResponse self = new RunDeepWritingResponseBodyPayloadOutputResponse();
            return TeaModel.build(map, self);
        }

        public RunDeepWritingResponseBodyPayloadOutputResponse setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public RunDeepWritingResponseBodyPayloadOutputResponse setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class RunDeepWritingResponseBodyPayloadOutput extends TeaModel {
        @NameInMap("Item")
        public RunDeepWritingResponseBodyPayloadOutputItem item;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OutputIndex")
        public Integer outputIndex;

        @NameInMap("Response")
        public RunDeepWritingResponseBodyPayloadOutputResponse response;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SequenceNumber")
        public String sequenceNumber;

        @NameInMap("Type")
        public String type;

        public static RunDeepWritingResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunDeepWritingResponseBodyPayloadOutput self = new RunDeepWritingResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunDeepWritingResponseBodyPayloadOutput setItem(RunDeepWritingResponseBodyPayloadOutputItem item) {
            this.item = item;
            return this;
        }
        public RunDeepWritingResponseBodyPayloadOutputItem getItem() {
            return this.item;
        }

        public RunDeepWritingResponseBodyPayloadOutput setOutputIndex(Integer outputIndex) {
            this.outputIndex = outputIndex;
            return this;
        }
        public Integer getOutputIndex() {
            return this.outputIndex;
        }

        public RunDeepWritingResponseBodyPayloadOutput setResponse(RunDeepWritingResponseBodyPayloadOutputResponse response) {
            this.response = response;
            return this;
        }
        public RunDeepWritingResponseBodyPayloadOutputResponse getResponse() {
            return this.response;
        }

        public RunDeepWritingResponseBodyPayloadOutput setSequenceNumber(String sequenceNumber) {
            this.sequenceNumber = sequenceNumber;
            return this;
        }
        public String getSequenceNumber() {
            return this.sequenceNumber;
        }

        public RunDeepWritingResponseBodyPayloadOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class RunDeepWritingResponseBodyPayload extends TeaModel {
        @NameInMap("Output")
        public RunDeepWritingResponseBodyPayloadOutput output;

        public static RunDeepWritingResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunDeepWritingResponseBodyPayload self = new RunDeepWritingResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunDeepWritingResponseBodyPayload setOutput(RunDeepWritingResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunDeepWritingResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

    }

}
