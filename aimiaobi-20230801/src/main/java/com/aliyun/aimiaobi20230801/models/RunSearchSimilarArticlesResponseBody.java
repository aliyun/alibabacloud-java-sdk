// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunSearchSimilarArticlesResponseBody extends TeaModel {
    /**
     * <p>Response header.</p>
     */
    @NameInMap("Header")
    public RunSearchSimilarArticlesResponseBodyHeader header;

    /**
     * <p>Response body.</p>
     */
    @NameInMap("Payload")
    public RunSearchSimilarArticlesResponseBodyPayload payload;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunSearchSimilarArticlesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunSearchSimilarArticlesResponseBody self = new RunSearchSimilarArticlesResponseBody();
        return TeaModel.build(map, self);
    }

    public RunSearchSimilarArticlesResponseBody setHeader(RunSearchSimilarArticlesResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunSearchSimilarArticlesResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunSearchSimilarArticlesResponseBody setPayload(RunSearchSimilarArticlesResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunSearchSimilarArticlesResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunSearchSimilarArticlesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunSearchSimilarArticlesResponseBodyHeader extends TeaModel {
        /**
         * <p>Error code.</p>
         * 
         * <strong>example:</strong>
         * <p>错误码</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>Error message.</p>
         * 
         * <strong>example:</strong>
         * <p>错误信息</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>Server-sent event. Valid values: task-started, task-finished, and task-failed.</p>
         * 
         * <strong>example:</strong>
         * <p>task-started</p>
         */
        @NameInMap("Event")
        public String event;

        @NameInMap("EventInfo")
        public String eventInfo;

        /**
         * <p>Session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <p>Task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static RunSearchSimilarArticlesResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunSearchSimilarArticlesResponseBodyHeader self = new RunSearchSimilarArticlesResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunSearchSimilarArticlesResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunSearchSimilarArticlesResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunSearchSimilarArticlesResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunSearchSimilarArticlesResponseBodyHeader setEventInfo(String eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public String getEventInfo() {
            return this.eventInfo;
        }

        public RunSearchSimilarArticlesResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunSearchSimilarArticlesResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class RunSearchSimilarArticlesResponseBodyPayloadOutputArticles extends TeaModel {
        /**
         * <p>UUID of the category</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("CategoryUuid")
        public String categoryUuid;

        /**
         * <p>Custom unique document ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("DocId")
        public String docId;

        /**
         * <p>Document Type:  </p>
         * <ul>
         * <li>plainText: plain text; content is required  </li>
         * <li>richText: rich text in HTML format; content is required  </li>
         * <li>text: text file; url is required  </li>
         * <li>pdf: url is required  </li>
         * <li>word: url is required  </li>
         * <li>image: Image; url is required. Supports most common image formats such as GIF, PNG, JPG, and JPEG  </li>
         * <li>video: Video; url is required. Supports most common video formats such as MP4, AVI, WMV, and MOV</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("DocType")
        public String docType;

        /**
         * <p>Article ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a26c2c1</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        /**
         * <p>Extension field 1</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Extend1")
        public String extend1;

        /**
         * <p>Extension field 2</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Extend2")
        public String extend2;

        /**
         * <p>Extension field 3</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Extend3")
        public String extend3;

        /**
         * <p>Publication time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-16 18:07:22</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        /**
         * <p>Search source</p>
         * 
         * <strong>example:</strong>
         * <p>QuarkCommonNews</p>
         */
        @NameInMap("SearchSource")
        public String searchSource;

        /**
         * <p>Search source name.</p>
         * 
         * <strong>example:</strong>
         * <p>互联网搜索</p>
         */
        @NameInMap("SearchSourceName")
        public String searchSourceName;

        /**
         * <p>Type of dataset</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("SearchSourceType")
        public String searchSourceType;

        /**
         * <p>Source website.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx.com</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>Summary.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <p>label</p>
         */
        @NameInMap("Tags")
        public java.util.List<String> tags;

        /**
         * <p>Title.</p>
         * 
         * <strong>example:</strong>
         * <p>标题</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx">https://xxx</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static RunSearchSimilarArticlesResponseBodyPayloadOutputArticles build(java.util.Map<String, ?> map) throws Exception {
            RunSearchSimilarArticlesResponseBodyPayloadOutputArticles self = new RunSearchSimilarArticlesResponseBodyPayloadOutputArticles();
            return TeaModel.build(map, self);
        }

        public RunSearchSimilarArticlesResponseBodyPayloadOutputArticles setCategoryUuid(String categoryUuid) {
            this.categoryUuid = categoryUuid;
            return this;
        }
        public String getCategoryUuid() {
            return this.categoryUuid;
        }

        public RunSearchSimilarArticlesResponseBodyPayloadOutputArticles setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public RunSearchSimilarArticlesResponseBodyPayloadOutputArticles setDocType(String docType) {
            this.docType = docType;
            return this;
        }
        public String getDocType() {
            return this.docType;
        }

        public RunSearchSimilarArticlesResponseBodyPayloadOutputArticles setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public RunSearchSimilarArticlesResponseBodyPayloadOutputArticles setExtend1(String extend1) {
            this.extend1 = extend1;
            return this;
        }
        public String getExtend1() {
            return this.extend1;
        }

        public RunSearchSimilarArticlesResponseBodyPayloadOutputArticles setExtend2(String extend2) {
            this.extend2 = extend2;
            return this;
        }
        public String getExtend2() {
            return this.extend2;
        }

        public RunSearchSimilarArticlesResponseBodyPayloadOutputArticles setExtend3(String extend3) {
            this.extend3 = extend3;
            return this;
        }
        public String getExtend3() {
            return this.extend3;
        }

        public RunSearchSimilarArticlesResponseBodyPayloadOutputArticles setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public RunSearchSimilarArticlesResponseBodyPayloadOutputArticles setSearchSource(String searchSource) {
            this.searchSource = searchSource;
            return this;
        }
        public String getSearchSource() {
            return this.searchSource;
        }

        public RunSearchSimilarArticlesResponseBodyPayloadOutputArticles setSearchSourceName(String searchSourceName) {
            this.searchSourceName = searchSourceName;
            return this;
        }
        public String getSearchSourceName() {
            return this.searchSourceName;
        }

        public RunSearchSimilarArticlesResponseBodyPayloadOutputArticles setSearchSourceType(String searchSourceType) {
            this.searchSourceType = searchSourceType;
            return this;
        }
        public String getSearchSourceType() {
            return this.searchSourceType;
        }

        public RunSearchSimilarArticlesResponseBodyPayloadOutputArticles setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public RunSearchSimilarArticlesResponseBodyPayloadOutputArticles setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public RunSearchSimilarArticlesResponseBodyPayloadOutputArticles setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public RunSearchSimilarArticlesResponseBodyPayloadOutputArticles setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RunSearchSimilarArticlesResponseBodyPayloadOutputArticles setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunSearchSimilarArticlesResponseBodyPayloadOutput extends TeaModel {
        /**
         * <p>Article list.</p>
         */
        @NameInMap("Articles")
        public java.util.List<RunSearchSimilarArticlesResponseBodyPayloadOutputArticles> articles;

        /**
         * <p>Text generation result.</p>
         * 
         * <strong>example:</strong>
         * <p>文本生成结果</p>
         */
        @NameInMap("Text")
        public String text;

        public static RunSearchSimilarArticlesResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunSearchSimilarArticlesResponseBodyPayloadOutput self = new RunSearchSimilarArticlesResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunSearchSimilarArticlesResponseBodyPayloadOutput setArticles(java.util.List<RunSearchSimilarArticlesResponseBodyPayloadOutputArticles> articles) {
            this.articles = articles;
            return this;
        }
        public java.util.List<RunSearchSimilarArticlesResponseBodyPayloadOutputArticles> getArticles() {
            return this.articles;
        }

        public RunSearchSimilarArticlesResponseBodyPayloadOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunSearchSimilarArticlesResponseBodyPayloadUsage extends TeaModel {
        /**
         * <p>Number of input tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>81</p>
         */
        @NameInMap("InputTokens")
        public Long inputTokens;

        /**
         * <p>Number of output tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("OutputTokens")
        public Long outputTokens;

        /**
         * <p>Total number of tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("TotalTokens")
        public Long totalTokens;

        public static RunSearchSimilarArticlesResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunSearchSimilarArticlesResponseBodyPayloadUsage self = new RunSearchSimilarArticlesResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunSearchSimilarArticlesResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunSearchSimilarArticlesResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunSearchSimilarArticlesResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunSearchSimilarArticlesResponseBodyPayload extends TeaModel {
        /**
         * <p>Output.</p>
         */
        @NameInMap("Output")
        public RunSearchSimilarArticlesResponseBodyPayloadOutput output;

        /**
         * <p>instance: The image is running and used by an ECS instance.</p>
         * <p>none: The image is idle and not used by any ECS instance.</p>
         */
        @NameInMap("Usage")
        public RunSearchSimilarArticlesResponseBodyPayloadUsage usage;

        public static RunSearchSimilarArticlesResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunSearchSimilarArticlesResponseBodyPayload self = new RunSearchSimilarArticlesResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunSearchSimilarArticlesResponseBodyPayload setOutput(RunSearchSimilarArticlesResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunSearchSimilarArticlesResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunSearchSimilarArticlesResponseBodyPayload setUsage(RunSearchSimilarArticlesResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunSearchSimilarArticlesResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
