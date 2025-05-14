// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunCustomHotTopicViewPointAnalysisResponseBody extends TeaModel {
    @NameInMap("Header")
    public RunCustomHotTopicViewPointAnalysisResponseBodyHeader header;

    @NameInMap("Payload")
    public RunCustomHotTopicViewPointAnalysisResponseBodyPayload payload;

    /**
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunCustomHotTopicViewPointAnalysisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunCustomHotTopicViewPointAnalysisResponseBody self = new RunCustomHotTopicViewPointAnalysisResponseBody();
        return TeaModel.build(map, self);
    }

    public RunCustomHotTopicViewPointAnalysisResponseBody setHeader(RunCustomHotTopicViewPointAnalysisResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunCustomHotTopicViewPointAnalysisResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunCustomHotTopicViewPointAnalysisResponseBody setPayload(RunCustomHotTopicViewPointAnalysisResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunCustomHotTopicViewPointAnalysisResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunCustomHotTopicViewPointAnalysisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunCustomHotTopicViewPointAnalysisResponseBodyHeader extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>错误码</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>错误信息</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>task-started</p>
         */
        @NameInMap("Event")
        public String event;

        /**
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("OriginSessionId")
        public String originSessionId;

        /**
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>全链路ID</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static RunCustomHotTopicViewPointAnalysisResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunCustomHotTopicViewPointAnalysisResponseBodyHeader self = new RunCustomHotTopicViewPointAnalysisResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunCustomHotTopicViewPointAnalysisResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunCustomHotTopicViewPointAnalysisResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunCustomHotTopicViewPointAnalysisResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunCustomHotTopicViewPointAnalysisResponseBodyHeader setOriginSessionId(String originSessionId) {
            this.originSessionId = originSessionId;
            return this;
        }
        public String getOriginSessionId() {
            return this.originSessionId;
        }

        public RunCustomHotTopicViewPointAnalysisResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunCustomHotTopicViewPointAnalysisResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunCustomHotTopicViewPointAnalysisResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunCustomHotTopicViewPointAnalysisResponseBodyPayloadOutputArticles extends TeaModel {
        @NameInMap("Author")
        public String author;

        @NameInMap("Content")
        public String content;

        @NameInMap("PubTime")
        public String pubTime;

        @NameInMap("Source")
        public String source;

        @NameInMap("Summary")
        public String summary;

        @NameInMap("Title")
        public String title;

        @NameInMap("Url")
        public String url;

        public static RunCustomHotTopicViewPointAnalysisResponseBodyPayloadOutputArticles build(java.util.Map<String, ?> map) throws Exception {
            RunCustomHotTopicViewPointAnalysisResponseBodyPayloadOutputArticles self = new RunCustomHotTopicViewPointAnalysisResponseBodyPayloadOutputArticles();
            return TeaModel.build(map, self);
        }

        public RunCustomHotTopicViewPointAnalysisResponseBodyPayloadOutputArticles setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public RunCustomHotTopicViewPointAnalysisResponseBodyPayloadOutputArticles setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RunCustomHotTopicViewPointAnalysisResponseBodyPayloadOutputArticles setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public RunCustomHotTopicViewPointAnalysisResponseBodyPayloadOutputArticles setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public RunCustomHotTopicViewPointAnalysisResponseBodyPayloadOutputArticles setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public RunCustomHotTopicViewPointAnalysisResponseBodyPayloadOutputArticles setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RunCustomHotTopicViewPointAnalysisResponseBodyPayloadOutputArticles setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunCustomHotTopicViewPointAnalysisResponseBodyPayloadOutput extends TeaModel {
        @NameInMap("Articles")
        public java.util.List<RunCustomHotTopicViewPointAnalysisResponseBodyPayloadOutputArticles> articles;

        @NameInMap("AskUser")
        public java.util.List<String> askUser;

        /**
         * <strong>example:</strong>
         * <p>异步任务ID</p>
         */
        @NameInMap("AsyncTaskId")
        public String asyncTaskId;

        /**
         * <strong>example:</strong>
         * <p>模型生成的自定义选题视角的观点</p>
         */
        @NameInMap("Attitude")
        public String attitude;

        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("CustomViewPointId")
        public String customViewPointId;

        /**
         * <strong>example:</strong>
         * <p>文本生成结果</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <strong>example:</strong>
         * <p>话题ID</p>
         */
        @NameInMap("TopicId")
        public String topicId;

        public static RunCustomHotTopicViewPointAnalysisResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunCustomHotTopicViewPointAnalysisResponseBodyPayloadOutput self = new RunCustomHotTopicViewPointAnalysisResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunCustomHotTopicViewPointAnalysisResponseBodyPayloadOutput setArticles(java.util.List<RunCustomHotTopicViewPointAnalysisResponseBodyPayloadOutputArticles> articles) {
            this.articles = articles;
            return this;
        }
        public java.util.List<RunCustomHotTopicViewPointAnalysisResponseBodyPayloadOutputArticles> getArticles() {
            return this.articles;
        }

        public RunCustomHotTopicViewPointAnalysisResponseBodyPayloadOutput setAskUser(java.util.List<String> askUser) {
            this.askUser = askUser;
            return this;
        }
        public java.util.List<String> getAskUser() {
            return this.askUser;
        }

        public RunCustomHotTopicViewPointAnalysisResponseBodyPayloadOutput setAsyncTaskId(String asyncTaskId) {
            this.asyncTaskId = asyncTaskId;
            return this;
        }
        public String getAsyncTaskId() {
            return this.asyncTaskId;
        }

        public RunCustomHotTopicViewPointAnalysisResponseBodyPayloadOutput setAttitude(String attitude) {
            this.attitude = attitude;
            return this;
        }
        public String getAttitude() {
            return this.attitude;
        }

        public RunCustomHotTopicViewPointAnalysisResponseBodyPayloadOutput setCustomViewPointId(String customViewPointId) {
            this.customViewPointId = customViewPointId;
            return this;
        }
        public String getCustomViewPointId() {
            return this.customViewPointId;
        }

        public RunCustomHotTopicViewPointAnalysisResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public RunCustomHotTopicViewPointAnalysisResponseBodyPayloadOutput setTopicId(String topicId) {
            this.topicId = topicId;
            return this;
        }
        public String getTopicId() {
            return this.topicId;
        }

    }

    public static class RunCustomHotTopicViewPointAnalysisResponseBodyPayloadUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>51</p>
         */
        @NameInMap("InputTokens")
        public Long inputTokens;

        /**
         * <strong>example:</strong>
         * <p>79</p>
         */
        @NameInMap("OutputTokens")
        public Long outputTokens;

        /**
         * <strong>example:</strong>
         * <p>130</p>
         */
        @NameInMap("TotalTokens")
        public Long totalTokens;

        public static RunCustomHotTopicViewPointAnalysisResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunCustomHotTopicViewPointAnalysisResponseBodyPayloadUsage self = new RunCustomHotTopicViewPointAnalysisResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunCustomHotTopicViewPointAnalysisResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunCustomHotTopicViewPointAnalysisResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunCustomHotTopicViewPointAnalysisResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunCustomHotTopicViewPointAnalysisResponseBodyPayload extends TeaModel {
        @NameInMap("Output")
        public RunCustomHotTopicViewPointAnalysisResponseBodyPayloadOutput output;

        @NameInMap("Usage")
        public RunCustomHotTopicViewPointAnalysisResponseBodyPayloadUsage usage;

        public static RunCustomHotTopicViewPointAnalysisResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunCustomHotTopicViewPointAnalysisResponseBodyPayload self = new RunCustomHotTopicViewPointAnalysisResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunCustomHotTopicViewPointAnalysisResponseBodyPayload setOutput(RunCustomHotTopicViewPointAnalysisResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunCustomHotTopicViewPointAnalysisResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunCustomHotTopicViewPointAnalysisResponseBodyPayload setUsage(RunCustomHotTopicViewPointAnalysisResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunCustomHotTopicViewPointAnalysisResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
