// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunDocIntroductionResponseBody extends TeaModel {
    @NameInMap("Header")
    public RunDocIntroductionResponseBodyHeader header;

    @NameInMap("Payload")
    public RunDocIntroductionResponseBodyPayload payload;

    /**
     * <strong>example:</strong>
     * <p>C9B5BEA6-E8C4-5861-BE37-D906D516510E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunDocIntroductionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunDocIntroductionResponseBody self = new RunDocIntroductionResponseBody();
        return TeaModel.build(map, self);
    }

    public RunDocIntroductionResponseBody setHeader(RunDocIntroductionResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunDocIntroductionResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunDocIntroductionResponseBody setPayload(RunDocIntroductionResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunDocIntroductionResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunDocIntroductionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunDocIntroductionResponseBodyHeader extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>task-started</p>
         */
        @NameInMap("Event")
        public String event;

        @NameInMap("EventInfo")
        public String eventInfo;

        /**
         * <strong>example:</strong>
         * <p>20247a52-23e2-46fb-943d-309cdee2bc6d</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>8a9cecb7-6d20-32db-8823-5882c217b647</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>0bd58ea2-dc38-45da-ac02-17f05cb9040b</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static RunDocIntroductionResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunDocIntroductionResponseBodyHeader self = new RunDocIntroductionResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunDocIntroductionResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunDocIntroductionResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunDocIntroductionResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunDocIntroductionResponseBodyHeader setEventInfo(String eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public String getEventInfo() {
            return this.eventInfo;
        }

        public RunDocIntroductionResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunDocIntroductionResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunDocIntroductionResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunDocIntroductionResponseBodyPayloadOutputIntroductionsBlocks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BeginTime")
        public Long beginTime;

        /**
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageId")
        public Integer pageId;

        /**
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("Width")
        public Integer width;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("X")
        public Integer x;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Y")
        public Integer y;

        public static RunDocIntroductionResponseBodyPayloadOutputIntroductionsBlocks build(java.util.Map<String, ?> map) throws Exception {
            RunDocIntroductionResponseBodyPayloadOutputIntroductionsBlocks self = new RunDocIntroductionResponseBodyPayloadOutputIntroductionsBlocks();
            return TeaModel.build(map, self);
        }

        public RunDocIntroductionResponseBodyPayloadOutputIntroductionsBlocks setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public RunDocIntroductionResponseBodyPayloadOutputIntroductionsBlocks setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public RunDocIntroductionResponseBodyPayloadOutputIntroductionsBlocks setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RunDocIntroductionResponseBodyPayloadOutputIntroductionsBlocks setPageId(Integer pageId) {
            this.pageId = pageId;
            return this;
        }
        public Integer getPageId() {
            return this.pageId;
        }

        public RunDocIntroductionResponseBodyPayloadOutputIntroductionsBlocks setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public RunDocIntroductionResponseBodyPayloadOutputIntroductionsBlocks setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public RunDocIntroductionResponseBodyPayloadOutputIntroductionsBlocks setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class RunDocIntroductionResponseBodyPayloadOutputIntroductions extends TeaModel {
        @NameInMap("Blocks")
        public java.util.List<RunDocIntroductionResponseBodyPayloadOutputIntroductionsBlocks> blocks;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("StartPageId")
        public Integer startPageId;

        @NameInMap("Summary")
        public String summary;

        @NameInMap("Title")
        public String title;

        public static RunDocIntroductionResponseBodyPayloadOutputIntroductions build(java.util.Map<String, ?> map) throws Exception {
            RunDocIntroductionResponseBodyPayloadOutputIntroductions self = new RunDocIntroductionResponseBodyPayloadOutputIntroductions();
            return TeaModel.build(map, self);
        }

        public RunDocIntroductionResponseBodyPayloadOutputIntroductions setBlocks(java.util.List<RunDocIntroductionResponseBodyPayloadOutputIntroductionsBlocks> blocks) {
            this.blocks = blocks;
            return this;
        }
        public java.util.List<RunDocIntroductionResponseBodyPayloadOutputIntroductionsBlocks> getBlocks() {
            return this.blocks;
        }

        public RunDocIntroductionResponseBodyPayloadOutputIntroductions setStartPageId(Integer startPageId) {
            this.startPageId = startPageId;
            return this;
        }
        public Integer getStartPageId() {
            return this.startPageId;
        }

        public RunDocIntroductionResponseBodyPayloadOutputIntroductions setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public RunDocIntroductionResponseBodyPayloadOutputIntroductions setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class RunDocIntroductionResponseBodyPayloadOutput extends TeaModel {
        @NameInMap("Introductions")
        public java.util.List<RunDocIntroductionResponseBodyPayloadOutputIntroductions> introductions;

        @NameInMap("KeyPoint")
        public String keyPoint;

        @NameInMap("Summary")
        public String summary;

        public static RunDocIntroductionResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunDocIntroductionResponseBodyPayloadOutput self = new RunDocIntroductionResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunDocIntroductionResponseBodyPayloadOutput setIntroductions(java.util.List<RunDocIntroductionResponseBodyPayloadOutputIntroductions> introductions) {
            this.introductions = introductions;
            return this;
        }
        public java.util.List<RunDocIntroductionResponseBodyPayloadOutputIntroductions> getIntroductions() {
            return this.introductions;
        }

        public RunDocIntroductionResponseBodyPayloadOutput setKeyPoint(String keyPoint) {
            this.keyPoint = keyPoint;
            return this;
        }
        public String getKeyPoint() {
            return this.keyPoint;
        }

        public RunDocIntroductionResponseBodyPayloadOutput setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

    public static class RunDocIntroductionResponseBodyPayloadUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("InputTokens")
        public Long inputTokens;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("OutputTokens")
        public Long outputTokens;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("TotalTokens")
        public Long totalTokens;

        public static RunDocIntroductionResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunDocIntroductionResponseBodyPayloadUsage self = new RunDocIntroductionResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunDocIntroductionResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunDocIntroductionResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunDocIntroductionResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunDocIntroductionResponseBodyPayload extends TeaModel {
        @NameInMap("Output")
        public RunDocIntroductionResponseBodyPayloadOutput output;

        @NameInMap("Usage")
        public RunDocIntroductionResponseBodyPayloadUsage usage;

        public static RunDocIntroductionResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunDocIntroductionResponseBodyPayload self = new RunDocIntroductionResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunDocIntroductionResponseBodyPayload setOutput(RunDocIntroductionResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunDocIntroductionResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunDocIntroductionResponseBodyPayload setUsage(RunDocIntroductionResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunDocIntroductionResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
