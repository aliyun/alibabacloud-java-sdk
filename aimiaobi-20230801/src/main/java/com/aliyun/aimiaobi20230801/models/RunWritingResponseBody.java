// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunWritingResponseBody extends TeaModel {
    @NameInMap("End")
    public Boolean end;

    @NameInMap("Header")
    public RunWritingResponseBodyHeader header;

    @NameInMap("Payload")
    public RunWritingResponseBodyPayload payload;

    /**
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunWritingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunWritingResponseBody self = new RunWritingResponseBody();
        return TeaModel.build(map, self);
    }

    public RunWritingResponseBody setEnd(Boolean end) {
        this.end = end;
        return this;
    }
    public Boolean getEnd() {
        return this.end;
    }

    public RunWritingResponseBody setHeader(RunWritingResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunWritingResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunWritingResponseBody setPayload(RunWritingResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunWritingResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunWritingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunWritingResponseBodyHeader extends TeaModel {
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
         * <p>400</p>
         */
        @NameInMap("StatusCode")
        public Integer statusCode;

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

        public static RunWritingResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunWritingResponseBodyHeader self = new RunWritingResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunWritingResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunWritingResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunWritingResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunWritingResponseBodyHeader setOriginSessionId(String originSessionId) {
            this.originSessionId = originSessionId;
            return this;
        }
        public String getOriginSessionId() {
            return this.originSessionId;
        }

        public RunWritingResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunWritingResponseBodyHeader setStatusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public Integer getStatusCode() {
            return this.statusCode;
        }

        public RunWritingResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunWritingResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunWritingResponseBodyPayloadOutputArticles extends TeaModel {
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
         * <p>98229f6001cf4deeb1668191d4eccc75</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        /**
         * <strong>example:</strong>
         * <p>2024-08-28 11:38:28</p>
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

        public static RunWritingResponseBodyPayloadOutputArticles build(java.util.Map<String, ?> map) throws Exception {
            RunWritingResponseBodyPayloadOutputArticles self = new RunWritingResponseBodyPayloadOutputArticles();
            return TeaModel.build(map, self);
        }

        public RunWritingResponseBodyPayloadOutputArticles setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public RunWritingResponseBodyPayloadOutputArticles setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RunWritingResponseBodyPayloadOutputArticles setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public RunWritingResponseBodyPayloadOutputArticles setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public RunWritingResponseBodyPayloadOutputArticles setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public RunWritingResponseBodyPayloadOutputArticles setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public RunWritingResponseBodyPayloadOutputArticles setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public RunWritingResponseBodyPayloadOutputArticles setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public RunWritingResponseBodyPayloadOutputArticles setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RunWritingResponseBodyPayloadOutputArticles setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunWritingResponseBodyPayloadOutput extends TeaModel {
        @NameInMap("Articles")
        public java.util.List<RunWritingResponseBodyPayloadOutputArticles> articles;

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

        public static RunWritingResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunWritingResponseBodyPayloadOutput self = new RunWritingResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunWritingResponseBodyPayloadOutput setArticles(java.util.List<RunWritingResponseBodyPayloadOutputArticles> articles) {
            this.articles = articles;
            return this;
        }
        public java.util.List<RunWritingResponseBodyPayloadOutputArticles> getArticles() {
            return this.articles;
        }

        public RunWritingResponseBodyPayloadOutput setMiniDoc(java.util.List<String> miniDoc) {
            this.miniDoc = miniDoc;
            return this;
        }
        public java.util.List<String> getMiniDoc() {
            return this.miniDoc;
        }

        public RunWritingResponseBodyPayloadOutput setSearchQuery(String searchQuery) {
            this.searchQuery = searchQuery;
            return this;
        }
        public String getSearchQuery() {
            return this.searchQuery;
        }

        public RunWritingResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunWritingResponseBodyPayloadUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InputTokens")
        public Long inputTokens;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OutputTokens")
        public Long outputTokens;

        @NameInMap("TokenMap")
        public java.util.Map<String, Long> tokenMap;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalTokens")
        public Long totalTokens;

        public static RunWritingResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunWritingResponseBodyPayloadUsage self = new RunWritingResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunWritingResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunWritingResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunWritingResponseBodyPayloadUsage setTokenMap(java.util.Map<String, Long> tokenMap) {
            this.tokenMap = tokenMap;
            return this;
        }
        public java.util.Map<String, Long> getTokenMap() {
            return this.tokenMap;
        }

        public RunWritingResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunWritingResponseBodyPayload extends TeaModel {
        @NameInMap("Output")
        public RunWritingResponseBodyPayloadOutput output;

        @NameInMap("Usage")
        public RunWritingResponseBodyPayloadUsage usage;

        public static RunWritingResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunWritingResponseBodyPayload self = new RunWritingResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunWritingResponseBodyPayload setOutput(RunWritingResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunWritingResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunWritingResponseBodyPayload setUsage(RunWritingResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunWritingResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
