// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunWritingV2ResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("End")
    public Boolean end;

    @NameInMap("Header")
    public RunWritingV2ResponseBodyHeader header;

    @NameInMap("Payload")
    public RunWritingV2ResponseBodyPayload payload;

    /**
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunWritingV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunWritingV2ResponseBody self = new RunWritingV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public RunWritingV2ResponseBody setEnd(Boolean end) {
        this.end = end;
        return this;
    }
    public Boolean getEnd() {
        return this.end;
    }

    public RunWritingV2ResponseBody setHeader(RunWritingV2ResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunWritingV2ResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunWritingV2ResponseBody setPayload(RunWritingV2ResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunWritingV2ResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunWritingV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunWritingV2ResponseBodyHeader extends TeaModel {
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

        public static RunWritingV2ResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunWritingV2ResponseBodyHeader self = new RunWritingV2ResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunWritingV2ResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunWritingV2ResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunWritingV2ResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunWritingV2ResponseBodyHeader setOriginSessionId(String originSessionId) {
            this.originSessionId = originSessionId;
            return this;
        }
        public String getOriginSessionId() {
            return this.originSessionId;
        }

        public RunWritingV2ResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunWritingV2ResponseBodyHeader setStatusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public Integer getStatusCode() {
            return this.statusCode;
        }

        public RunWritingV2ResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunWritingV2ResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunWritingV2ResponseBodyPayloadOutputArticles extends TeaModel {
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

        public static RunWritingV2ResponseBodyPayloadOutputArticles build(java.util.Map<String, ?> map) throws Exception {
            RunWritingV2ResponseBodyPayloadOutputArticles self = new RunWritingV2ResponseBodyPayloadOutputArticles();
            return TeaModel.build(map, self);
        }

        public RunWritingV2ResponseBodyPayloadOutputArticles setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public RunWritingV2ResponseBodyPayloadOutputArticles setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RunWritingV2ResponseBodyPayloadOutputArticles setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public RunWritingV2ResponseBodyPayloadOutputArticles setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public RunWritingV2ResponseBodyPayloadOutputArticles setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public RunWritingV2ResponseBodyPayloadOutputArticles setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public RunWritingV2ResponseBodyPayloadOutputArticles setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public RunWritingV2ResponseBodyPayloadOutputArticles setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public RunWritingV2ResponseBodyPayloadOutputArticles setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RunWritingV2ResponseBodyPayloadOutputArticles setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunWritingV2ResponseBodyPayloadOutput extends TeaModel {
        @NameInMap("Articles")
        public java.util.List<RunWritingV2ResponseBodyPayloadOutputArticles> articles;

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

        public static RunWritingV2ResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunWritingV2ResponseBodyPayloadOutput self = new RunWritingV2ResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunWritingV2ResponseBodyPayloadOutput setArticles(java.util.List<RunWritingV2ResponseBodyPayloadOutputArticles> articles) {
            this.articles = articles;
            return this;
        }
        public java.util.List<RunWritingV2ResponseBodyPayloadOutputArticles> getArticles() {
            return this.articles;
        }

        public RunWritingV2ResponseBodyPayloadOutput setMiniDoc(java.util.List<String> miniDoc) {
            this.miniDoc = miniDoc;
            return this;
        }
        public java.util.List<String> getMiniDoc() {
            return this.miniDoc;
        }

        public RunWritingV2ResponseBodyPayloadOutput setSearchQuery(String searchQuery) {
            this.searchQuery = searchQuery;
            return this;
        }
        public String getSearchQuery() {
            return this.searchQuery;
        }

        public RunWritingV2ResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunWritingV2ResponseBodyPayloadUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>78</p>
         */
        @NameInMap("InputTokens")
        public Long inputTokens;

        /**
         * <strong>example:</strong>
         * <p>34</p>
         */
        @NameInMap("OutputTokens")
        public Long outputTokens;

        @NameInMap("TokenMap")
        public java.util.Map<String, Long> tokenMap;

        /**
         * <strong>example:</strong>
         * <p>38</p>
         */
        @NameInMap("TotalTokens")
        public Long totalTokens;

        public static RunWritingV2ResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunWritingV2ResponseBodyPayloadUsage self = new RunWritingV2ResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunWritingV2ResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunWritingV2ResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunWritingV2ResponseBodyPayloadUsage setTokenMap(java.util.Map<String, Long> tokenMap) {
            this.tokenMap = tokenMap;
            return this;
        }
        public java.util.Map<String, Long> getTokenMap() {
            return this.tokenMap;
        }

        public RunWritingV2ResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunWritingV2ResponseBodyPayload extends TeaModel {
        @NameInMap("Output")
        public RunWritingV2ResponseBodyPayloadOutput output;

        @NameInMap("Usage")
        public RunWritingV2ResponseBodyPayloadUsage usage;

        public static RunWritingV2ResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunWritingV2ResponseBodyPayload self = new RunWritingV2ResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunWritingV2ResponseBodyPayload setOutput(RunWritingV2ResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunWritingV2ResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunWritingV2ResponseBodyPayload setUsage(RunWritingV2ResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunWritingV2ResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
