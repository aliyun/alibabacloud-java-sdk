// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunCustomHotTopicAnalysisResponseBody extends TeaModel {
    @NameInMap("Header")
    public RunCustomHotTopicAnalysisResponseBodyHeader header;

    @NameInMap("Payload")
    public RunCustomHotTopicAnalysisResponseBodyPayload payload;

    /**
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunCustomHotTopicAnalysisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunCustomHotTopicAnalysisResponseBody self = new RunCustomHotTopicAnalysisResponseBody();
        return TeaModel.build(map, self);
    }

    public RunCustomHotTopicAnalysisResponseBody setHeader(RunCustomHotTopicAnalysisResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunCustomHotTopicAnalysisResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunCustomHotTopicAnalysisResponseBody setPayload(RunCustomHotTopicAnalysisResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunCustomHotTopicAnalysisResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunCustomHotTopicAnalysisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunCustomHotTopicAnalysisResponseBodyHeader extends TeaModel {
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

        public static RunCustomHotTopicAnalysisResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunCustomHotTopicAnalysisResponseBodyHeader self = new RunCustomHotTopicAnalysisResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunCustomHotTopicAnalysisResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunCustomHotTopicAnalysisResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunCustomHotTopicAnalysisResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunCustomHotTopicAnalysisResponseBodyHeader setOriginSessionId(String originSessionId) {
            this.originSessionId = originSessionId;
            return this;
        }
        public String getOriginSessionId() {
            return this.originSessionId;
        }

        public RunCustomHotTopicAnalysisResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunCustomHotTopicAnalysisResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunCustomHotTopicAnalysisResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunCustomHotTopicAnalysisResponseBodyPayloadOutputArticles extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>作者</p>
         */
        @NameInMap("Author")
        public String author;

        /**
         * <strong>example:</strong>
         * <p>文章内容</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>文档-自定义的唯一ID</p>
         */
        @NameInMap("DocId")
        public String docId;

        /**
         * <strong>example:</strong>
         * <p>a2103fcfbd5441f1991c72f8834833e3</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        /**
         * <strong>example:</strong>
         * <p>2024-08-27 14:50:47</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        /**
         * <strong>example:</strong>
         * <p>央视网</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>文章摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <strong>example:</strong>
         * <p>文章标签</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <strong>example:</strong>
         * <p>文章标题</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p><a href="https://www.example.com/aaa.docx">https://www.example.com/aaa.docx</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static RunCustomHotTopicAnalysisResponseBodyPayloadOutputArticles build(java.util.Map<String, ?> map) throws Exception {
            RunCustomHotTopicAnalysisResponseBodyPayloadOutputArticles self = new RunCustomHotTopicAnalysisResponseBodyPayloadOutputArticles();
            return TeaModel.build(map, self);
        }

        public RunCustomHotTopicAnalysisResponseBodyPayloadOutputArticles setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public RunCustomHotTopicAnalysisResponseBodyPayloadOutputArticles setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RunCustomHotTopicAnalysisResponseBodyPayloadOutputArticles setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public RunCustomHotTopicAnalysisResponseBodyPayloadOutputArticles setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public RunCustomHotTopicAnalysisResponseBodyPayloadOutputArticles setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public RunCustomHotTopicAnalysisResponseBodyPayloadOutputArticles setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public RunCustomHotTopicAnalysisResponseBodyPayloadOutputArticles setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public RunCustomHotTopicAnalysisResponseBodyPayloadOutputArticles setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public RunCustomHotTopicAnalysisResponseBodyPayloadOutputArticles setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RunCustomHotTopicAnalysisResponseBodyPayloadOutputArticles setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunCustomHotTopicAnalysisResponseBodyPayloadOutput extends TeaModel {
        @NameInMap("Articles")
        public java.util.List<RunCustomHotTopicAnalysisResponseBodyPayloadOutputArticles> articles;

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
         * <p>自定义选题视角</p>
         */
        @NameInMap("Attitude")
        public String attitude;

        /**
         * <strong>example:</strong>
         * <p>大模型改变世界</p>
         */
        @NameInMap("SearchQuery")
        public String searchQuery;

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

        public static RunCustomHotTopicAnalysisResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunCustomHotTopicAnalysisResponseBodyPayloadOutput self = new RunCustomHotTopicAnalysisResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunCustomHotTopicAnalysisResponseBodyPayloadOutput setArticles(java.util.List<RunCustomHotTopicAnalysisResponseBodyPayloadOutputArticles> articles) {
            this.articles = articles;
            return this;
        }
        public java.util.List<RunCustomHotTopicAnalysisResponseBodyPayloadOutputArticles> getArticles() {
            return this.articles;
        }

        public RunCustomHotTopicAnalysisResponseBodyPayloadOutput setAskUser(java.util.List<String> askUser) {
            this.askUser = askUser;
            return this;
        }
        public java.util.List<String> getAskUser() {
            return this.askUser;
        }

        public RunCustomHotTopicAnalysisResponseBodyPayloadOutput setAsyncTaskId(String asyncTaskId) {
            this.asyncTaskId = asyncTaskId;
            return this;
        }
        public String getAsyncTaskId() {
            return this.asyncTaskId;
        }

        public RunCustomHotTopicAnalysisResponseBodyPayloadOutput setAttitude(String attitude) {
            this.attitude = attitude;
            return this;
        }
        public String getAttitude() {
            return this.attitude;
        }

        public RunCustomHotTopicAnalysisResponseBodyPayloadOutput setSearchQuery(String searchQuery) {
            this.searchQuery = searchQuery;
            return this;
        }
        public String getSearchQuery() {
            return this.searchQuery;
        }

        public RunCustomHotTopicAnalysisResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public RunCustomHotTopicAnalysisResponseBodyPayloadOutput setTopicId(String topicId) {
            this.topicId = topicId;
            return this;
        }
        public String getTopicId() {
            return this.topicId;
        }

    }

    public static class RunCustomHotTopicAnalysisResponseBodyPayloadUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("InputTokens")
        public Long inputTokens;

        /**
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("OutputTokens")
        public Long outputTokens;

        /**
         * <strong>example:</strong>
         * <p>73</p>
         */
        @NameInMap("TotalTokens")
        public Long totalTokens;

        public static RunCustomHotTopicAnalysisResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunCustomHotTopicAnalysisResponseBodyPayloadUsage self = new RunCustomHotTopicAnalysisResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunCustomHotTopicAnalysisResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunCustomHotTopicAnalysisResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunCustomHotTopicAnalysisResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunCustomHotTopicAnalysisResponseBodyPayload extends TeaModel {
        @NameInMap("Output")
        public RunCustomHotTopicAnalysisResponseBodyPayloadOutput output;

        @NameInMap("Usage")
        public RunCustomHotTopicAnalysisResponseBodyPayloadUsage usage;

        public static RunCustomHotTopicAnalysisResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunCustomHotTopicAnalysisResponseBodyPayload self = new RunCustomHotTopicAnalysisResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunCustomHotTopicAnalysisResponseBodyPayload setOutput(RunCustomHotTopicAnalysisResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunCustomHotTopicAnalysisResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunCustomHotTopicAnalysisResponseBodyPayload setUsage(RunCustomHotTopicAnalysisResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunCustomHotTopicAnalysisResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
