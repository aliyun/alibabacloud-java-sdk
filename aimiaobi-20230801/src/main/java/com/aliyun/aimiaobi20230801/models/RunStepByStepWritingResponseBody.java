// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunStepByStepWritingResponseBody extends TeaModel {
    @NameInMap("Header")
    public RunStepByStepWritingResponseBodyHeader header;

    @NameInMap("Payload")
    public RunStepByStepWritingResponseBodyPayload payload;

    /**
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunStepByStepWritingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunStepByStepWritingResponseBody self = new RunStepByStepWritingResponseBody();
        return TeaModel.build(map, self);
    }

    public RunStepByStepWritingResponseBody setHeader(RunStepByStepWritingResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunStepByStepWritingResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunStepByStepWritingResponseBody setPayload(RunStepByStepWritingResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunStepByStepWritingResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunStepByStepWritingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunStepByStepWritingResponseBodyHeader extends TeaModel {
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

        public static RunStepByStepWritingResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunStepByStepWritingResponseBodyHeader self = new RunStepByStepWritingResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunStepByStepWritingResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunStepByStepWritingResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunStepByStepWritingResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunStepByStepWritingResponseBodyHeader setOriginSessionId(String originSessionId) {
            this.originSessionId = originSessionId;
            return this;
        }
        public String getOriginSessionId() {
            return this.originSessionId;
        }

        public RunStepByStepWritingResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunStepByStepWritingResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunStepByStepWritingResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunStepByStepWritingResponseBodyPayloadOutputArticles extends TeaModel {
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
         * <p>f1da53894e784759946d22e2cb2b522a</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">http://www.example.com</a></p>
         */
        @NameInMap("MediaUrl")
        public String mediaUrl;

        /**
         * <strong>example:</strong>
         * <p>2024-09-10 14:17:53</p>
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

        public static RunStepByStepWritingResponseBodyPayloadOutputArticles build(java.util.Map<String, ?> map) throws Exception {
            RunStepByStepWritingResponseBodyPayloadOutputArticles self = new RunStepByStepWritingResponseBodyPayloadOutputArticles();
            return TeaModel.build(map, self);
        }

        public RunStepByStepWritingResponseBodyPayloadOutputArticles setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public RunStepByStepWritingResponseBodyPayloadOutputArticles setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RunStepByStepWritingResponseBodyPayloadOutputArticles setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public RunStepByStepWritingResponseBodyPayloadOutputArticles setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public RunStepByStepWritingResponseBodyPayloadOutputArticles setMediaUrl(String mediaUrl) {
            this.mediaUrl = mediaUrl;
            return this;
        }
        public String getMediaUrl() {
            return this.mediaUrl;
        }

        public RunStepByStepWritingResponseBodyPayloadOutputArticles setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public RunStepByStepWritingResponseBodyPayloadOutputArticles setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public RunStepByStepWritingResponseBodyPayloadOutputArticles setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public RunStepByStepWritingResponseBodyPayloadOutputArticles setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public RunStepByStepWritingResponseBodyPayloadOutputArticles setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RunStepByStepWritingResponseBodyPayloadOutputArticles setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunStepByStepWritingResponseBodyPayloadOutputExtraOutput extends TeaModel {
        @NameInMap("summarization")
        public java.util.List<String> summarization;

        public static RunStepByStepWritingResponseBodyPayloadOutputExtraOutput build(java.util.Map<String, ?> map) throws Exception {
            RunStepByStepWritingResponseBodyPayloadOutputExtraOutput self = new RunStepByStepWritingResponseBodyPayloadOutputExtraOutput();
            return TeaModel.build(map, self);
        }

        public RunStepByStepWritingResponseBodyPayloadOutputExtraOutput setSummarization(java.util.List<String> summarization) {
            this.summarization = summarization;
            return this;
        }
        public java.util.List<String> getSummarization() {
            return this.summarization;
        }

    }

    public static class RunStepByStepWritingResponseBodyPayloadOutput extends TeaModel {
        @NameInMap("Articles")
        public java.util.List<RunStepByStepWritingResponseBodyPayloadOutputArticles> articles;

        @NameInMap("ExtraOutput")
        public RunStepByStepWritingResponseBodyPayloadOutputExtraOutput extraOutput;

        /**
         * <strong>example:</strong>
         * <p>文章精排之后的片段</p>
         */
        @NameInMap("MiniDoc")
        public java.util.List<String> miniDoc;

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

        public static RunStepByStepWritingResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunStepByStepWritingResponseBodyPayloadOutput self = new RunStepByStepWritingResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunStepByStepWritingResponseBodyPayloadOutput setArticles(java.util.List<RunStepByStepWritingResponseBodyPayloadOutputArticles> articles) {
            this.articles = articles;
            return this;
        }
        public java.util.List<RunStepByStepWritingResponseBodyPayloadOutputArticles> getArticles() {
            return this.articles;
        }

        public RunStepByStepWritingResponseBodyPayloadOutput setExtraOutput(RunStepByStepWritingResponseBodyPayloadOutputExtraOutput extraOutput) {
            this.extraOutput = extraOutput;
            return this;
        }
        public RunStepByStepWritingResponseBodyPayloadOutputExtraOutput getExtraOutput() {
            return this.extraOutput;
        }

        public RunStepByStepWritingResponseBodyPayloadOutput setMiniDoc(java.util.List<String> miniDoc) {
            this.miniDoc = miniDoc;
            return this;
        }
        public java.util.List<String> getMiniDoc() {
            return this.miniDoc;
        }

        public RunStepByStepWritingResponseBodyPayloadOutput setSearchQuery(String searchQuery) {
            this.searchQuery = searchQuery;
            return this;
        }
        public String getSearchQuery() {
            return this.searchQuery;
        }

        public RunStepByStepWritingResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunStepByStepWritingResponseBodyPayloadUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>65</p>
         */
        @NameInMap("InputTokens")
        public Long inputTokens;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("OutputTokens")
        public Long outputTokens;

        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("TotalTokens")
        public Long totalTokens;

        public static RunStepByStepWritingResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunStepByStepWritingResponseBodyPayloadUsage self = new RunStepByStepWritingResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunStepByStepWritingResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunStepByStepWritingResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunStepByStepWritingResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunStepByStepWritingResponseBodyPayload extends TeaModel {
        @NameInMap("Output")
        public RunStepByStepWritingResponseBodyPayloadOutput output;

        @NameInMap("Usage")
        public RunStepByStepWritingResponseBodyPayloadUsage usage;

        public static RunStepByStepWritingResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunStepByStepWritingResponseBodyPayload self = new RunStepByStepWritingResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunStepByStepWritingResponseBodyPayload setOutput(RunStepByStepWritingResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunStepByStepWritingResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunStepByStepWritingResponseBodyPayload setUsage(RunStepByStepWritingResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunStepByStepWritingResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
