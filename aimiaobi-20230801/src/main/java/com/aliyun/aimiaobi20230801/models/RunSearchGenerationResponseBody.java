// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunSearchGenerationResponseBody extends TeaModel {
    @NameInMap("Header")
    public RunSearchGenerationResponseBodyHeader header;

    @NameInMap("Payload")
    public RunSearchGenerationResponseBodyPayload payload;

    /**
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunSearchGenerationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunSearchGenerationResponseBody self = new RunSearchGenerationResponseBody();
        return TeaModel.build(map, self);
    }

    public RunSearchGenerationResponseBody setHeader(RunSearchGenerationResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunSearchGenerationResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunSearchGenerationResponseBody setPayload(RunSearchGenerationResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunSearchGenerationResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunSearchGenerationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunSearchGenerationResponseBodyHeader extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>AccessForbid</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
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
         * <p>xx</p>
         */
        @NameInMap("EventInfo")
        public String eventInfo;

        /**
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("OriginSessionId")
        public String originSessionId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResponseTime")
        public Long responseTime;

        /**
         * <strong>example:</strong>
         * <p>x</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>x</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static RunSearchGenerationResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyHeader self = new RunSearchGenerationResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunSearchGenerationResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunSearchGenerationResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunSearchGenerationResponseBodyHeader setEventInfo(String eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public String getEventInfo() {
            return this.eventInfo;
        }

        public RunSearchGenerationResponseBodyHeader setOriginSessionId(String originSessionId) {
            this.originSessionId = originSessionId;
            return this;
        }
        public String getOriginSessionId() {
            return this.originSessionId;
        }

        public RunSearchGenerationResponseBodyHeader setResponseTime(Long responseTime) {
            this.responseTime = responseTime;
            return this;
        }
        public Long getResponseTime() {
            return this.responseTime;
        }

        public RunSearchGenerationResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunSearchGenerationResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunSearchGenerationResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsImageSearchResultSearchResultArticle extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DocId")
        public String docId;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        /**
         * <strong>example:</strong>
         * <p>互联网搜索</p>
         */
        @NameInMap("SearchSourceName")
        public String searchSourceName;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Url")
        public String url;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsImageSearchResultSearchResultArticle build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsImageSearchResultSearchResultArticle self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsImageSearchResultSearchResultArticle();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsImageSearchResultSearchResultArticle setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsImageSearchResultSearchResultArticle setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsImageSearchResultSearchResultArticle setSearchSourceName(String searchSourceName) {
            this.searchSourceName = searchSourceName;
            return this;
        }
        public String getSearchSourceName() {
            return this.searchSourceName;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsImageSearchResultSearchResultArticle setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsImageSearchResultSearchResultArticle setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsImageSearchResultSearchResultArticle setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsImageSearchResultSearchResult extends TeaModel {
        @NameInMap("Article")
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsImageSearchResultSearchResultArticle article;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsImageSearchResultSearchResult build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsImageSearchResultSearchResult self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsImageSearchResultSearchResult();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsImageSearchResultSearchResult setArticle(RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsImageSearchResultSearchResultArticle article) {
            this.article = article;
            return this;
        }
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsImageSearchResultSearchResultArticle getArticle() {
            return this.article;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsImageSearchResultSearchResult setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsImageSearchResultSearchResult setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsImageSearchResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Current")
        public Integer current;

        @NameInMap("SearchResult")
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsImageSearchResultSearchResult> searchResult;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsImageSearchResult build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsImageSearchResult self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsImageSearchResult();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsImageSearchResult setCurrent(Integer current) {
            this.current = current;
            return this;
        }
        public Integer getCurrent() {
            return this.current;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsImageSearchResult setSearchResult(java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsImageSearchResultSearchResult> searchResult) {
            this.searchResult = searchResult;
            return this;
        }
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsImageSearchResultSearchResult> getSearchResult() {
            return this.searchResult;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsImageSearchResult setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsImageSearchResult setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResultSearchResultMultimodalMedias extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <strong>example:</strong>
         * <p>image</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResultSearchResultMultimodalMedias build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResultSearchResultMultimodalMedias self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResultSearchResultMultimodalMedias();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResultSearchResultMultimodalMedias setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResultSearchResultMultimodalMedias setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResultSearchResultMultimodalMedias setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResultSearchResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DocId")
        public String docId;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        @NameInMap("MultimodalMedias")
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResultSearchResultMultimodalMedias> multimodalMedias;

        /**
         * <strong>example:</strong>
         * <p>2023-04-04 08:39:09</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        /**
         * <strong>example:</strong>
         * <p>QuarkCommonNews</p>
         */
        @NameInMap("SearchSource")
        public String searchSource;

        /**
         * <strong>example:</strong>
         * <p>互联网搜索</p>
         */
        @NameInMap("SearchSourceName")
        public String searchSourceName;

        /**
         * <strong>example:</strong>
         * <p>SystemSearch</p>
         */
        @NameInMap("SearchSourceType")
        public String searchSourceType;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Url")
        public String url;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResultSearchResult build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResultSearchResult self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResultSearchResult();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResultSearchResult setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResultSearchResult setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResultSearchResult setMultimodalMedias(java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResultSearchResultMultimodalMedias> multimodalMedias) {
            this.multimodalMedias = multimodalMedias;
            return this;
        }
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResultSearchResultMultimodalMedias> getMultimodalMedias() {
            return this.multimodalMedias;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResultSearchResult setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResultSearchResult setSearchSource(String searchSource) {
            this.searchSource = searchSource;
            return this;
        }
        public String getSearchSource() {
            return this.searchSource;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResultSearchResult setSearchSourceName(String searchSourceName) {
            this.searchSourceName = searchSourceName;
            return this;
        }
        public String getSearchSourceName() {
            return this.searchSourceName;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResultSearchResult setSearchSourceType(String searchSourceType) {
            this.searchSourceType = searchSourceType;
            return this;
        }
        public String getSearchSourceType() {
            return this.searchSourceType;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResultSearchResult setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResultSearchResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResultSearchResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Current")
        public Integer current;

        @NameInMap("SearchResult")
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResultSearchResult> searchResult;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResult build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResult self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResult();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResult setCurrent(Integer current) {
            this.current = current;
            return this;
        }
        public Integer getCurrent() {
            return this.current;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResult setSearchResult(java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResultSearchResult> searchResult) {
            this.searchResult = searchResult;
            return this;
        }
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResultSearchResult> getSearchResult() {
            return this.searchResult;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResult setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResult setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResultArticle extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DocId")
        public String docId;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        /**
         * <strong>example:</strong>
         * <p>互联网搜索</p>
         */
        @NameInMap("SearchSourceName")
        public String searchSourceName;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Url")
        public String url;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResultArticle build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResultArticle self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResultArticle();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResultArticle setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResultArticle setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResultArticle setSearchSourceName(String searchSourceName) {
            this.searchSourceName = searchSourceName;
            return this;
        }
        public String getSearchSourceName() {
            return this.searchSourceName;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResultArticle setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResultArticle setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResultArticle setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResultClipInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("From")
        public Double from;

        /**
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("Score")
        public Double score;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("To")
        public Double to;

        /**
         * <strong>example:</strong>
         * <p>asr</p>
         */
        @NameInMap("Type")
        public String type;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResultClipInfos build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResultClipInfos self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResultClipInfos();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResultClipInfos setFrom(Double from) {
            this.from = from;
            return this;
        }
        public Double getFrom() {
            return this.from;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResultClipInfos setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResultClipInfos setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResultClipInfos setTo(Double to) {
            this.to = to;
            return this;
        }
        public Double getTo() {
            return this.to;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResultClipInfos setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResult extends TeaModel {
        @NameInMap("Article")
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResultArticle article;

        @NameInMap("ClipInfos")
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResultClipInfos> clipInfos;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResult build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResult self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResult();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResult setArticle(RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResultArticle article) {
            this.article = article;
            return this;
        }
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResultArticle getArticle() {
            return this.article;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResult setClipInfos(java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResultClipInfos> clipInfos) {
            this.clipInfos = clipInfos;
            return this;
        }
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResultClipInfos> getClipInfos() {
            return this.clipInfos;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResult setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResult setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Current")
        public Integer current;

        @NameInMap("SearchResult")
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResult> searchResult;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResult build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResult self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResult();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResult setCurrent(Integer current) {
            this.current = current;
            return this;
        }
        public Integer getCurrent() {
            return this.current;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResult setSearchResult(java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResult> searchResult) {
            this.searchResult = searchResult;
            return this;
        }
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResultSearchResult> getSearchResult() {
            return this.searchResult;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResult setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResult setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopics extends TeaModel {
        @NameInMap("ImageSearchResult")
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsImageSearchResult imageSearchResult;

        @NameInMap("TextSearchResult")
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResult textSearchResult;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Topic")
        public String topic;

        @NameInMap("VideoSearchResult")
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResult videoSearchResult;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopics build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopics self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopics();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopics setImageSearchResult(RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsImageSearchResult imageSearchResult) {
            this.imageSearchResult = imageSearchResult;
            return this;
        }
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsImageSearchResult getImageSearchResult() {
            return this.imageSearchResult;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopics setTextSearchResult(RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResult textSearchResult) {
            this.textSearchResult = textSearchResult;
            return this;
        }
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsTextSearchResult getTextSearchResult() {
            return this.textSearchResult;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopics setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopics setVideoSearchResult(RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResult videoSearchResult) {
            this.videoSearchResult = videoSearchResult;
            return this;
        }
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopicsVideoSearchResult getVideoSearchResult() {
            return this.videoSearchResult;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResult extends TeaModel {
        @NameInMap("ClusterTopics")
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopics> clusterTopics;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("GenerateFinished")
        public Boolean generateFinished;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("TextGenerate")
        public String textGenerate;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResult build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResult self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResult();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResult setClusterTopics(java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopics> clusterTopics) {
            this.clusterTopics = clusterTopics;
            return this;
        }
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResultClusterTopics> getClusterTopics() {
            return this.clusterTopics;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResult setGenerateFinished(Boolean generateFinished) {
            this.generateFinished = generateFinished;
            return this;
        }
        public Boolean getGenerateFinished() {
            return this.generateFinished;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResult setTextGenerate(String textGenerate) {
            this.textGenerate = textGenerate;
            return this;
        }
        public String getTextGenerate() {
            return this.textGenerate;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultMultimodalMedias extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <strong>example:</strong>
         * <p>image</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultMultimodalMedias build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultMultimodalMedias self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultMultimodalMedias();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultMultimodalMedias setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultMultimodalMedias setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultMultimodalMedias setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultTextGenerateMultimodalMediaListMultimodalMediaListArticle extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DocId")
        public String docId;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("SearchSourceName")
        public String searchSourceName;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Url")
        public String url;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultTextGenerateMultimodalMediaListMultimodalMediaListArticle build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultTextGenerateMultimodalMediaListMultimodalMediaListArticle self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultTextGenerateMultimodalMediaListMultimodalMediaListArticle();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultTextGenerateMultimodalMediaListMultimodalMediaListArticle setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultTextGenerateMultimodalMediaListMultimodalMediaListArticle setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultTextGenerateMultimodalMediaListMultimodalMediaListArticle setSearchSourceName(String searchSourceName) {
            this.searchSourceName = searchSourceName;
            return this;
        }
        public String getSearchSourceName() {
            return this.searchSourceName;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultTextGenerateMultimodalMediaListMultimodalMediaListArticle setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultTextGenerateMultimodalMediaListMultimodalMediaListArticle setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultTextGenerateMultimodalMediaListMultimodalMediaList extends TeaModel {
        @NameInMap("Article")
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultTextGenerateMultimodalMediaListMultimodalMediaListArticle article;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <strong>example:</strong>
         * <p>image</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultTextGenerateMultimodalMediaListMultimodalMediaList build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultTextGenerateMultimodalMediaListMultimodalMediaList self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultTextGenerateMultimodalMediaListMultimodalMediaList();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultTextGenerateMultimodalMediaListMultimodalMediaList setArticle(RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultTextGenerateMultimodalMediaListMultimodalMediaListArticle article) {
            this.article = article;
            return this;
        }
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultTextGenerateMultimodalMediaListMultimodalMediaListArticle getArticle() {
            return this.article;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultTextGenerateMultimodalMediaListMultimodalMediaList setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultTextGenerateMultimodalMediaListMultimodalMediaList setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultTextGenerateMultimodalMediaListMultimodalMediaList setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultTextGenerateMultimodalMediaList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("End")
        public Integer end;

        @NameInMap("MultimodalMediaList")
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultTextGenerateMultimodalMediaListMultimodalMediaList> multimodalMediaList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Start")
        public Integer start;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultTextGenerateMultimodalMediaList build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultTextGenerateMultimodalMediaList self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultTextGenerateMultimodalMediaList();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultTextGenerateMultimodalMediaList setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultTextGenerateMultimodalMediaList setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultTextGenerateMultimodalMediaList setMultimodalMediaList(java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultTextGenerateMultimodalMediaListMultimodalMediaList> multimodalMediaList) {
            this.multimodalMediaList = multimodalMediaList;
            return this;
        }
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultTextGenerateMultimodalMediaListMultimodalMediaList> getMultimodalMediaList() {
            return this.multimodalMediaList;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultTextGenerateMultimodalMediaList setStart(Integer start) {
            this.start = start;
            return this;
        }
        public Integer getStart() {
            return this.start;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResult extends TeaModel {
        @NameInMap("Chunks")
        public java.util.List<String> chunks;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DocId")
        public String docId;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Excerpt")
        public String excerpt;

        @NameInMap("MultimodalMedias")
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultMultimodalMedias> multimodalMedias;

        /**
         * <strong>example:</strong>
         * <p>2023-04-04 08:39:09</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        /**
         * <strong>example:</strong>
         * <p>0.99</p>
         */
        @NameInMap("Score")
        public Float score;

        /**
         * <strong>example:</strong>
         * <p>QuarkCommonNews</p>
         */
        @NameInMap("SearchSource")
        public String searchSource;

        /**
         * <strong>example:</strong>
         * <p>互联网搜索</p>
         */
        @NameInMap("SearchSourceName")
        public String searchSourceName;

        /**
         * <strong>example:</strong>
         * <p>SystemSearch</p>
         */
        @NameInMap("SearchSourceType")
        public String searchSourceType;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Select")
        public Boolean select;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Summary")
        public String summary;

        @NameInMap("TextGenerateMultimodalMediaList")
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultTextGenerateMultimodalMediaList> textGenerateMultimodalMediaList;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TraceabilityId")
        public Integer traceabilityId;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Url")
        public String url;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResult build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResult self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResult();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResult setChunks(java.util.List<String> chunks) {
            this.chunks = chunks;
            return this;
        }
        public java.util.List<String> getChunks() {
            return this.chunks;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResult setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResult setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResult setExcerpt(String excerpt) {
            this.excerpt = excerpt;
            return this;
        }
        public String getExcerpt() {
            return this.excerpt;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResult setMultimodalMedias(java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultMultimodalMedias> multimodalMedias) {
            this.multimodalMedias = multimodalMedias;
            return this;
        }
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultMultimodalMedias> getMultimodalMedias() {
            return this.multimodalMedias;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResult setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResult setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResult setSearchSource(String searchSource) {
            this.searchSource = searchSource;
            return this;
        }
        public String getSearchSource() {
            return this.searchSource;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResult setSearchSourceName(String searchSourceName) {
            this.searchSourceName = searchSourceName;
            return this;
        }
        public String getSearchSourceName() {
            return this.searchSourceName;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResult setSearchSourceType(String searchSourceType) {
            this.searchSourceType = searchSourceType;
            return this;
        }
        public String getSearchSourceType() {
            return this.searchSourceType;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResult setSelect(Boolean select) {
            this.select = select;
            return this;
        }
        public Boolean getSelect() {
            return this.select;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResult setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResult setTextGenerateMultimodalMediaList(java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultTextGenerateMultimodalMediaList> textGenerateMultimodalMediaList) {
            this.textGenerateMultimodalMediaList = textGenerateMultimodalMediaList;
            return this;
        }
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResultTextGenerateMultimodalMediaList> getTextGenerateMultimodalMediaList() {
            return this.textGenerateMultimodalMediaList;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResult setTraceabilityId(Integer traceabilityId) {
            this.traceabilityId = traceabilityId;
            return this;
        }
        public Integer getTraceabilityId() {
            return this.traceabilityId;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("GenerateFinished")
        public Boolean generateFinished;

        /**
         * <strong>example:</strong>
         * <p>concise</p>
         */
        @NameInMap("GenerateLevel")
        public String generateLevel;

        @NameInMap("ReasonTextGenerate")
        public String reasonTextGenerate;

        @NameInMap("SearchResult")
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResult> searchResult;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("TextGenerate")
        public String textGenerate;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResult build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResult self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResult();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResult setGenerateFinished(Boolean generateFinished) {
            this.generateFinished = generateFinished;
            return this;
        }
        public Boolean getGenerateFinished() {
            return this.generateFinished;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResult setGenerateLevel(String generateLevel) {
            this.generateLevel = generateLevel;
            return this;
        }
        public String getGenerateLevel() {
            return this.generateLevel;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResult setReasonTextGenerate(String reasonTextGenerate) {
            this.reasonTextGenerate = reasonTextGenerate;
            return this;
        }
        public String getReasonTextGenerate() {
            return this.reasonTextGenerate;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResult setSearchResult(java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResult> searchResult) {
            this.searchResult = searchResult;
            return this;
        }
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResultSearchResult> getSearchResult() {
            return this.searchResult;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResult setTextGenerate(String textGenerate) {
            this.textGenerate = textGenerate;
            return this;
        }
        public String getTextGenerate() {
            return this.textGenerate;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentImageSearchResultSearchResultArticle extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DocId")
        public String docId;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        /**
         * <strong>example:</strong>
         * <p>互联网搜索</p>
         */
        @NameInMap("SearchSourceName")
        public String searchSourceName;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Url")
        public String url;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentImageSearchResultSearchResultArticle build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentImageSearchResultSearchResultArticle self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentImageSearchResultSearchResultArticle();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentImageSearchResultSearchResultArticle setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentImageSearchResultSearchResultArticle setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentImageSearchResultSearchResultArticle setSearchSourceName(String searchSourceName) {
            this.searchSourceName = searchSourceName;
            return this;
        }
        public String getSearchSourceName() {
            return this.searchSourceName;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentImageSearchResultSearchResultArticle setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentImageSearchResultSearchResultArticle setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentImageSearchResultSearchResultArticle setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentImageSearchResultSearchResult extends TeaModel {
        @NameInMap("Article")
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentImageSearchResultSearchResultArticle article;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentImageSearchResultSearchResult build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentImageSearchResultSearchResult self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentImageSearchResultSearchResult();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentImageSearchResultSearchResult setArticle(RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentImageSearchResultSearchResultArticle article) {
            this.article = article;
            return this;
        }
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentImageSearchResultSearchResultArticle getArticle() {
            return this.article;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentImageSearchResultSearchResult setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentImageSearchResultSearchResult setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentImageSearchResult extends TeaModel {
        @NameInMap("SearchResult")
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentImageSearchResultSearchResult> searchResult;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentImageSearchResult build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentImageSearchResult self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentImageSearchResult();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentImageSearchResult setSearchResult(java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentImageSearchResultSearchResult> searchResult) {
            this.searchResult = searchResult;
            return this;
        }
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentImageSearchResultSearchResult> getSearchResult() {
            return this.searchResult;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListArticle extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DocId")
        public String docId;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        /**
         * <strong>example:</strong>
         * <p>2023-04-04 08:39:09</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        /**
         * <strong>example:</strong>
         * <p>0.99</p>
         */
        @NameInMap("Score")
        public Float score;

        /**
         * <strong>example:</strong>
         * <p>QuarkCommonNews</p>
         */
        @NameInMap("SearchSource")
        public String searchSource;

        /**
         * <strong>example:</strong>
         * <p>互联网搜索</p>
         */
        @NameInMap("SearchSourceName")
        public String searchSourceName;

        /**
         * <strong>example:</strong>
         * <p>SystemSearch</p>
         */
        @NameInMap("SearchSourceType")
        public String searchSourceType;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Select")
        public Boolean select;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Url")
        public String url;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListArticle build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListArticle self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListArticle();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListArticle setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListArticle setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListArticle setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListArticle setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListArticle setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListArticle setSearchSource(String searchSource) {
            this.searchSource = searchSource;
            return this;
        }
        public String getSearchSource() {
            return this.searchSource;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListArticle setSearchSourceName(String searchSourceName) {
            this.searchSourceName = searchSourceName;
            return this;
        }
        public String getSearchSourceName() {
            return this.searchSourceName;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListArticle setSearchSourceType(String searchSourceType) {
            this.searchSourceType = searchSourceType;
            return this;
        }
        public String getSearchSourceType() {
            return this.searchSourceType;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListArticle setSelect(Boolean select) {
            this.select = select;
            return this;
        }
        public Boolean getSelect() {
            return this.select;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListArticle setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListArticle setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListArticle setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListNewsElementListEvent extends TeaModel {
        @NameInMap("CauseList")
        public java.util.List<String> causeList;

        @NameInMap("ProcessList")
        public java.util.List<String> processList;

        @NameInMap("ResultList")
        public java.util.List<String> resultList;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListNewsElementListEvent build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListNewsElementListEvent self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListNewsElementListEvent();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListNewsElementListEvent setCauseList(java.util.List<String> causeList) {
            this.causeList = causeList;
            return this;
        }
        public java.util.List<String> getCauseList() {
            return this.causeList;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListNewsElementListEvent setProcessList(java.util.List<String> processList) {
            this.processList = processList;
            return this;
        }
        public java.util.List<String> getProcessList() {
            return this.processList;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListNewsElementListEvent setResultList(java.util.List<String> resultList) {
            this.resultList = resultList;
            return this;
        }
        public java.util.List<String> getResultList() {
            return this.resultList;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListNewsElementList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>task-started</p>
         */
        @NameInMap("Event")
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListNewsElementListEvent event;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("People")
        public String people;

        /**
         * <strong>example:</strong>
         * <p>时间</p>
         */
        @NameInMap("Time")
        public String time;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListNewsElementList build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListNewsElementList self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListNewsElementList();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListNewsElementList setEvent(RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListNewsElementListEvent event) {
            this.event = event;
            return this;
        }
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListNewsElementListEvent getEvent() {
            return this.event;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListNewsElementList setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListNewsElementList setPeople(String people) {
            this.people = people;
            return this;
        }
        public String getPeople() {
            return this.people;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListNewsElementList setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleList extends TeaModel {
        @NameInMap("Article")
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListArticle article;

        @NameInMap("NewsElementList")
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListNewsElementList> newsElementList;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("TextGenerate")
        public String textGenerate;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleList build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleList self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleList();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleList setArticle(RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListArticle article) {
            this.article = article;
            return this;
        }
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListArticle getArticle() {
            return this.article;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleList setNewsElementList(java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListNewsElementList> newsElementList) {
            this.newsElementList = newsElementList;
            return this;
        }
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleListNewsElementList> getNewsElementList() {
            return this.newsElementList;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleList setTextGenerate(String textGenerate) {
            this.textGenerate = textGenerate;
            return this;
        }
        public String getTextGenerate() {
            return this.textGenerate;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("GenerateFinished")
        public Boolean generateFinished;

        @NameInMap("NewsElementArticleList")
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleList> newsElementArticleList;

        /**
         * <strong>example:</strong>
         * <p>x</p>
         */
        @NameInMap("TextGenerate")
        public String textGenerate;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResult build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResult self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResult();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResult setGenerateFinished(Boolean generateFinished) {
            this.generateFinished = generateFinished;
            return this;
        }
        public Boolean getGenerateFinished() {
            return this.generateFinished;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResult setNewsElementArticleList(java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleList> newsElementArticleList) {
            this.newsElementArticleList = newsElementArticleList;
            return this;
        }
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResultNewsElementArticleList> getNewsElementArticleList() {
            return this.newsElementArticleList;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResult setTextGenerate(String textGenerate) {
            this.textGenerate = textGenerate;
            return this;
        }
        public String getTextGenerate() {
            return this.textGenerate;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceabilityCoordinatesGenerateCoordinate extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("X")
        public Integer x;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Y")
        public Integer y;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Z")
        public Integer z;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceabilityCoordinatesGenerateCoordinate build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceabilityCoordinatesGenerateCoordinate self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceabilityCoordinatesGenerateCoordinate();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceabilityCoordinatesGenerateCoordinate setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceabilityCoordinatesGenerateCoordinate setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceabilityCoordinatesGenerateCoordinate setZ(Integer z) {
            this.z = z;
            return this;
        }
        public Integer getZ() {
            return this.z;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceabilityCoordinatesNewsCoordinate extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("X")
        public Integer x;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Y")
        public Integer y;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Z")
        public Integer z;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceabilityCoordinatesNewsCoordinate build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceabilityCoordinatesNewsCoordinate self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceabilityCoordinatesNewsCoordinate();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceabilityCoordinatesNewsCoordinate setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceabilityCoordinatesNewsCoordinate setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceabilityCoordinatesNewsCoordinate setZ(Integer z) {
            this.z = z;
            return this;
        }
        public Integer getZ() {
            return this.z;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceabilityCoordinates extends TeaModel {
        @NameInMap("GenerateCoordinate")
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceabilityCoordinatesGenerateCoordinate generateCoordinate;

        @NameInMap("NewsCoordinate")
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceabilityCoordinatesNewsCoordinate newsCoordinate;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceabilityCoordinates build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceabilityCoordinates self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceabilityCoordinates();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceabilityCoordinates setGenerateCoordinate(RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceabilityCoordinatesGenerateCoordinate generateCoordinate) {
            this.generateCoordinate = generateCoordinate;
            return this;
        }
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceabilityCoordinatesGenerateCoordinate getGenerateCoordinate() {
            return this.generateCoordinate;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceabilityCoordinates setNewsCoordinate(RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceabilityCoordinatesNewsCoordinate newsCoordinate) {
            this.newsCoordinate = newsCoordinate;
            return this;
        }
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceabilityCoordinatesNewsCoordinate getNewsCoordinate() {
            return this.newsCoordinate;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceability extends TeaModel {
        @NameInMap("Coordinates")
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceabilityCoordinates> coordinates;

        /**
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("Duplicate")
        public Double duplicate;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceability build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceability self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceability();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceability setCoordinates(java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceabilityCoordinates> coordinates) {
            this.coordinates = coordinates;
            return this;
        }
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceabilityCoordinates> getCoordinates() {
            return this.coordinates;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceability setDuplicate(Double duplicate) {
            this.duplicate = duplicate;
            return this;
        }
        public Double getDuplicate() {
            return this.duplicate;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResultArticle extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DocId")
        public String docId;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("SearchSourceName")
        public String searchSourceName;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Url")
        public String url;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResultArticle build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResultArticle self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResultArticle();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResultArticle setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResultArticle setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResultArticle setSearchSourceName(String searchSourceName) {
            this.searchSourceName = searchSourceName;
            return this;
        }
        public String getSearchSourceName() {
            return this.searchSourceName;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResultArticle setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResultArticle setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResultArticle setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResultClipInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("From")
        public Double from;

        /**
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("Score")
        public Double score;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("To")
        public Double to;

        /**
         * <strong>example:</strong>
         * <p>asr</p>
         */
        @NameInMap("Type")
        public String type;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResultClipInfos build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResultClipInfos self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResultClipInfos();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResultClipInfos setFrom(Double from) {
            this.from = from;
            return this;
        }
        public Double getFrom() {
            return this.from;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResultClipInfos setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResultClipInfos setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResultClipInfos setTo(Double to) {
            this.to = to;
            return this;
        }
        public Double getTo() {
            return this.to;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResultClipInfos setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResult extends TeaModel {
        @NameInMap("Article")
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResultArticle article;

        @NameInMap("ClipInfos")
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResultClipInfos> clipInfos;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <strong>example:</strong>
         * <p>image</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResult build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResult self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResult();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResult setArticle(RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResultArticle article) {
            this.article = article;
            return this;
        }
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResultArticle getArticle() {
            return this.article;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResult setClipInfos(java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResultClipInfos> clipInfos) {
            this.clipInfos = clipInfos;
            return this;
        }
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResultClipInfos> getClipInfos() {
            return this.clipInfos;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResult setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResult setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResult setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Current")
        public Integer current;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("SearchQuery")
        public String searchQuery;

        @NameInMap("SearchResult")
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResult> searchResult;

        /**
         * <strong>example:</strong>
         * <p>realtime</p>
         */
        @NameInMap("SearchType")
        public String searchType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <strong>example:</strong>
         * <p>时间脉络-时间</p>
         */
        @NameInMap("TimelineDateStr")
        public String timelineDateStr;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultList build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultList self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultList();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultList setCurrent(Integer current) {
            this.current = current;
            return this;
        }
        public Integer getCurrent() {
            return this.current;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultList setSearchQuery(String searchQuery) {
            this.searchQuery = searchQuery;
            return this;
        }
        public String getSearchQuery() {
            return this.searchQuery;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultList setSearchResult(java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResult> searchResult) {
            this.searchResult = searchResult;
            return this;
        }
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultListSearchResult> getSearchResult() {
            return this.searchResult;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultList setSearchType(String searchType) {
            this.searchType = searchType;
            return this;
        }
        public String getSearchType() {
            return this.searchType;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultList setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultList setTimelineDateStr(String timelineDateStr) {
            this.timelineDateStr = timelineDateStr;
            return this;
        }
        public String getTimelineDateStr() {
            return this.timelineDateStr;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultList setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultReferenceList extends TeaModel {
        @NameInMap("Chunks")
        public java.util.List<String> chunks;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DocId")
        public String docId;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        /**
         * <strong>example:</strong>
         * <p>2023-04-04 08:39:09</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        /**
         * <strong>example:</strong>
         * <p>0.99</p>
         */
        @NameInMap("Score")
        public Float score;

        /**
         * <strong>example:</strong>
         * <p>QuarkCommonNews</p>
         */
        @NameInMap("SearchSource")
        public String searchSource;

        /**
         * <strong>example:</strong>
         * <p>互联网搜索</p>
         */
        @NameInMap("SearchSourceName")
        public String searchSourceName;

        /**
         * <strong>example:</strong>
         * <p>SystemSearch</p>
         */
        @NameInMap("SearchSourceType")
        public String searchSourceType;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Select")
        public Boolean select;

        /**
         * <strong>example:</strong>
         * <p>新华社</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TraceabilityId")
        public Integer traceabilityId;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Url")
        public String url;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultReferenceList build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultReferenceList self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultReferenceList();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultReferenceList setChunks(java.util.List<String> chunks) {
            this.chunks = chunks;
            return this;
        }
        public java.util.List<String> getChunks() {
            return this.chunks;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultReferenceList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultReferenceList setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultReferenceList setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultReferenceList setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultReferenceList setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultReferenceList setSearchSource(String searchSource) {
            this.searchSource = searchSource;
            return this;
        }
        public String getSearchSource() {
            return this.searchSource;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultReferenceList setSearchSourceName(String searchSourceName) {
            this.searchSourceName = searchSourceName;
            return this;
        }
        public String getSearchSourceName() {
            return this.searchSourceName;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultReferenceList setSearchSourceType(String searchSourceType) {
            this.searchSourceType = searchSourceType;
            return this;
        }
        public String getSearchSourceType() {
            return this.searchSourceType;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultReferenceList setSelect(Boolean select) {
            this.select = select;
            return this;
        }
        public Boolean getSelect() {
            return this.select;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultReferenceList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultReferenceList setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultReferenceList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultReferenceList setTraceabilityId(Integer traceabilityId) {
            this.traceabilityId = traceabilityId;
            return this;
        }
        public Integer getTraceabilityId() {
            return this.traceabilityId;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultReferenceList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultTextGenerateMultimodalMediaListMultimodalMediaListArticle extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DocId")
        public String docId;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("SearchSourceName")
        public String searchSourceName;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Url")
        public String url;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultTextGenerateMultimodalMediaListMultimodalMediaListArticle build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultTextGenerateMultimodalMediaListMultimodalMediaListArticle self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultTextGenerateMultimodalMediaListMultimodalMediaListArticle();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultTextGenerateMultimodalMediaListMultimodalMediaListArticle setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultTextGenerateMultimodalMediaListMultimodalMediaListArticle setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultTextGenerateMultimodalMediaListMultimodalMediaListArticle setSearchSourceName(String searchSourceName) {
            this.searchSourceName = searchSourceName;
            return this;
        }
        public String getSearchSourceName() {
            return this.searchSourceName;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultTextGenerateMultimodalMediaListMultimodalMediaListArticle setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultTextGenerateMultimodalMediaListMultimodalMediaListArticle setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultTextGenerateMultimodalMediaListMultimodalMediaListArticle setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultTextGenerateMultimodalMediaListMultimodalMediaList extends TeaModel {
        @NameInMap("Article")
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultTextGenerateMultimodalMediaListMultimodalMediaListArticle article;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <strong>example:</strong>
         * <p>image</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultTextGenerateMultimodalMediaListMultimodalMediaList build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultTextGenerateMultimodalMediaListMultimodalMediaList self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultTextGenerateMultimodalMediaListMultimodalMediaList();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultTextGenerateMultimodalMediaListMultimodalMediaList setArticle(RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultTextGenerateMultimodalMediaListMultimodalMediaListArticle article) {
            this.article = article;
            return this;
        }
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultTextGenerateMultimodalMediaListMultimodalMediaListArticle getArticle() {
            return this.article;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultTextGenerateMultimodalMediaListMultimodalMediaList setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultTextGenerateMultimodalMediaListMultimodalMediaList setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultTextGenerateMultimodalMediaListMultimodalMediaList setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultTextGenerateMultimodalMediaList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("End")
        public Integer end;

        @NameInMap("MultimodalMediaList")
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultTextGenerateMultimodalMediaListMultimodalMediaList> multimodalMediaList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Start")
        public Integer start;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultTextGenerateMultimodalMediaList build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultTextGenerateMultimodalMediaList self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultTextGenerateMultimodalMediaList();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultTextGenerateMultimodalMediaList setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultTextGenerateMultimodalMediaList setMultimodalMediaList(java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultTextGenerateMultimodalMediaListMultimodalMediaList> multimodalMediaList) {
            this.multimodalMediaList = multimodalMediaList;
            return this;
        }
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultTextGenerateMultimodalMediaListMultimodalMediaList> getMultimodalMediaList() {
            return this.multimodalMediaList;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultTextGenerateMultimodalMediaList setStart(Integer start) {
            this.start = start;
            return this;
        }
        public Integer getStart() {
            return this.start;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("GenerateFinished")
        public Boolean generateFinished;

        /**
         * <strong>example:</strong>
         * <p>concise</p>
         */
        @NameInMap("GenerateLevel")
        public String generateLevel;

        @NameInMap("GenerateTraceability")
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceability generateTraceability;

        @NameInMap("MultimodalSearchResultList")
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultList> multimodalSearchResultList;

        @NameInMap("ReasonTextGenerate")
        public String reasonTextGenerate;

        @NameInMap("ReferenceList")
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultReferenceList> referenceList;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("TextGenerate")
        public String textGenerate;

        @NameInMap("TextGenerateMultimodalMediaList")
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultTextGenerateMultimodalMediaList> textGenerateMultimodalMediaList;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResult build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResult self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResult();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResult setGenerateFinished(Boolean generateFinished) {
            this.generateFinished = generateFinished;
            return this;
        }
        public Boolean getGenerateFinished() {
            return this.generateFinished;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResult setGenerateLevel(String generateLevel) {
            this.generateLevel = generateLevel;
            return this;
        }
        public String getGenerateLevel() {
            return this.generateLevel;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResult setGenerateTraceability(RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceability generateTraceability) {
            this.generateTraceability = generateTraceability;
            return this;
        }
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultGenerateTraceability getGenerateTraceability() {
            return this.generateTraceability;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResult setMultimodalSearchResultList(java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultList> multimodalSearchResultList) {
            this.multimodalSearchResultList = multimodalSearchResultList;
            return this;
        }
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultMultimodalSearchResultList> getMultimodalSearchResultList() {
            return this.multimodalSearchResultList;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResult setReasonTextGenerate(String reasonTextGenerate) {
            this.reasonTextGenerate = reasonTextGenerate;
            return this;
        }
        public String getReasonTextGenerate() {
            return this.reasonTextGenerate;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResult setReferenceList(java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultReferenceList> referenceList) {
            this.referenceList = referenceList;
            return this;
        }
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultReferenceList> getReferenceList() {
            return this.referenceList;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResult setTextGenerate(String textGenerate) {
            this.textGenerate = textGenerate;
            return this;
        }
        public String getTextGenerate() {
            return this.textGenerate;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResult setTextGenerateMultimodalMediaList(java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultTextGenerateMultimodalMediaList> textGenerateMultimodalMediaList) {
            this.textGenerateMultimodalMediaList = textGenerateMultimodalMediaList;
            return this;
        }
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResultTextGenerateMultimodalMediaList> getTextGenerateMultimodalMediaList() {
            return this.textGenerateMultimodalMediaList;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextSearchResultSearchResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DocId")
        public String docId;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        /**
         * <strong>example:</strong>
         * <p>2024-11-25 14:25:59</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        /**
         * <strong>example:</strong>
         * <p>QuarkCommonNews</p>
         */
        @NameInMap("SearchSource")
        public String searchSource;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("SearchSourceName")
        public String searchSourceName;

        /**
         * <strong>example:</strong>
         * <p>SystemSearch</p>
         */
        @NameInMap("SearchSourceType")
        public String searchSourceType;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Url")
        public String url;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextSearchResultSearchResult build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextSearchResultSearchResult self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextSearchResultSearchResult();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextSearchResultSearchResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextSearchResultSearchResult setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextSearchResultSearchResult setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextSearchResultSearchResult setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextSearchResultSearchResult setSearchSource(String searchSource) {
            this.searchSource = searchSource;
            return this;
        }
        public String getSearchSource() {
            return this.searchSource;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextSearchResultSearchResult setSearchSourceName(String searchSourceName) {
            this.searchSourceName = searchSourceName;
            return this;
        }
        public String getSearchSourceName() {
            return this.searchSourceName;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextSearchResultSearchResult setSearchSourceType(String searchSourceType) {
            this.searchSourceType = searchSourceType;
            return this;
        }
        public String getSearchSourceType() {
            return this.searchSourceType;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextSearchResultSearchResult setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextSearchResultSearchResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextSearchResultSearchResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextSearchResult extends TeaModel {
        @NameInMap("Current")
        public Integer current;

        @NameInMap("SearchResult")
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextSearchResultSearchResult> searchResult;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("Total")
        public Integer total;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextSearchResult build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextSearchResult self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextSearchResult();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextSearchResult setCurrent(Integer current) {
            this.current = current;
            return this;
        }
        public Integer getCurrent() {
            return this.current;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextSearchResult setSearchResult(java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextSearchResultSearchResult> searchResult) {
            this.searchResult = searchResult;
            return this;
        }
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextSearchResultSearchResult> getSearchResult() {
            return this.searchResult;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextSearchResult setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextSearchResult setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceabilityCoordinatesGenerateCoordinate extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("X")
        public Integer x;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Y")
        public Integer y;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Z")
        public Integer z;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceabilityCoordinatesGenerateCoordinate build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceabilityCoordinatesGenerateCoordinate self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceabilityCoordinatesGenerateCoordinate();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceabilityCoordinatesGenerateCoordinate setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceabilityCoordinatesGenerateCoordinate setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceabilityCoordinatesGenerateCoordinate setZ(Integer z) {
            this.z = z;
            return this;
        }
        public Integer getZ() {
            return this.z;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceabilityCoordinatesNewsCoordinate extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("X")
        public Integer x;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Y")
        public Integer y;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Z")
        public Integer z;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceabilityCoordinatesNewsCoordinate build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceabilityCoordinatesNewsCoordinate self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceabilityCoordinatesNewsCoordinate();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceabilityCoordinatesNewsCoordinate setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceabilityCoordinatesNewsCoordinate setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceabilityCoordinatesNewsCoordinate setZ(Integer z) {
            this.z = z;
            return this;
        }
        public Integer getZ() {
            return this.z;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceabilityCoordinates extends TeaModel {
        @NameInMap("GenerateCoordinate")
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceabilityCoordinatesGenerateCoordinate generateCoordinate;

        @NameInMap("NewsCoordinate")
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceabilityCoordinatesNewsCoordinate newsCoordinate;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceabilityCoordinates build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceabilityCoordinates self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceabilityCoordinates();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceabilityCoordinates setGenerateCoordinate(RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceabilityCoordinatesGenerateCoordinate generateCoordinate) {
            this.generateCoordinate = generateCoordinate;
            return this;
        }
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceabilityCoordinatesGenerateCoordinate getGenerateCoordinate() {
            return this.generateCoordinate;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceabilityCoordinates setNewsCoordinate(RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceabilityCoordinatesNewsCoordinate newsCoordinate) {
            this.newsCoordinate = newsCoordinate;
            return this;
        }
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceabilityCoordinatesNewsCoordinate getNewsCoordinate() {
            return this.newsCoordinate;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceability extends TeaModel {
        @NameInMap("Coordinates")
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceabilityCoordinates> coordinates;

        /**
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("Duplicate")
        public Double duplicate;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceability build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceability self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceability();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceability setCoordinates(java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceabilityCoordinates> coordinates) {
            this.coordinates = coordinates;
            return this;
        }
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceabilityCoordinates> getCoordinates() {
            return this.coordinates;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceability setDuplicate(Double duplicate) {
            this.duplicate = duplicate;
            return this;
        }
        public Double getDuplicate() {
            return this.duplicate;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResultArticle extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DocId")
        public String docId;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        /**
         * <strong>example:</strong>
         * <p>互联网搜索</p>
         */
        @NameInMap("SearchSourceName")
        public String searchSourceName;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Url")
        public String url;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResultArticle build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResultArticle self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResultArticle();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResultArticle setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResultArticle setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResultArticle setSearchSourceName(String searchSourceName) {
            this.searchSourceName = searchSourceName;
            return this;
        }
        public String getSearchSourceName() {
            return this.searchSourceName;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResultArticle setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResultArticle setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResultArticle setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResultClipInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("From")
        public Double from;

        /**
         * <strong>example:</strong>
         * <p>0.99</p>
         */
        @NameInMap("Score")
        public Double score;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("To")
        public Double to;

        /**
         * <strong>example:</strong>
         * <p>asr</p>
         */
        @NameInMap("Type")
        public String type;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResultClipInfos build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResultClipInfos self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResultClipInfos();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResultClipInfos setFrom(Double from) {
            this.from = from;
            return this;
        }
        public Double getFrom() {
            return this.from;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResultClipInfos setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResultClipInfos setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResultClipInfos setTo(Double to) {
            this.to = to;
            return this;
        }
        public Double getTo() {
            return this.to;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResultClipInfos setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResult extends TeaModel {
        @NameInMap("Article")
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResultArticle article;

        @NameInMap("ClipInfos")
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResultClipInfos> clipInfos;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <strong>example:</strong>
         * <p>image</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResult build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResult self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResult();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResult setArticle(RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResultArticle article) {
            this.article = article;
            return this;
        }
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResultArticle getArticle() {
            return this.article;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResult setClipInfos(java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResultClipInfos> clipInfos) {
            this.clipInfos = clipInfos;
            return this;
        }
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResultClipInfos> getClipInfos() {
            return this.clipInfos;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResult setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResult setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResult setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultList extends TeaModel {
        @NameInMap("SearchResult")
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResult> searchResult;

        /**
         * <strong>example:</strong>
         * <p>2024-09-11</p>
         */
        @NameInMap("TimelineDateStr")
        public String timelineDateStr;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultList build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultList self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultList();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultList setSearchResult(java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResult> searchResult) {
            this.searchResult = searchResult;
            return this;
        }
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultListSearchResult> getSearchResult() {
            return this.searchResult;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultList setTimelineDateStr(String timelineDateStr) {
            this.timelineDateStr = timelineDateStr;
            return this;
        }
        public String getTimelineDateStr() {
            return this.timelineDateStr;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultReferenceList extends TeaModel {
        @NameInMap("Chunks")
        public java.util.List<String> chunks;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DocId")
        public String docId;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        /**
         * <strong>example:</strong>
         * <p>2023-04-04 08:39:09</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        /**
         * <strong>example:</strong>
         * <p>0.99</p>
         */
        @NameInMap("Score")
        public Float score;

        /**
         * <strong>example:</strong>
         * <p>QuarkCommonNews</p>
         */
        @NameInMap("SearchSource")
        public String searchSource;

        /**
         * <strong>example:</strong>
         * <p>互联网搜索</p>
         */
        @NameInMap("SearchSourceName")
        public String searchSourceName;

        /**
         * <strong>example:</strong>
         * <p>SystemSearch</p>
         */
        @NameInMap("SearchSourceType")
        public String searchSourceType;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Select")
        public Boolean select;

        /**
         * <strong>example:</strong>
         * <p>新华社</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TraceabilityId")
        public Integer traceabilityId;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Url")
        public String url;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultReferenceList build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultReferenceList self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultReferenceList();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultReferenceList setChunks(java.util.List<String> chunks) {
            this.chunks = chunks;
            return this;
        }
        public java.util.List<String> getChunks() {
            return this.chunks;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultReferenceList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultReferenceList setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultReferenceList setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultReferenceList setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultReferenceList setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultReferenceList setSearchSource(String searchSource) {
            this.searchSource = searchSource;
            return this;
        }
        public String getSearchSource() {
            return this.searchSource;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultReferenceList setSearchSourceName(String searchSourceName) {
            this.searchSourceName = searchSourceName;
            return this;
        }
        public String getSearchSourceName() {
            return this.searchSourceName;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultReferenceList setSearchSourceType(String searchSourceType) {
            this.searchSourceType = searchSourceType;
            return this;
        }
        public String getSearchSourceType() {
            return this.searchSourceType;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultReferenceList setSelect(Boolean select) {
            this.select = select;
            return this;
        }
        public Boolean getSelect() {
            return this.select;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultReferenceList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultReferenceList setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultReferenceList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultReferenceList setTraceabilityId(Integer traceabilityId) {
            this.traceabilityId = traceabilityId;
            return this;
        }
        public Integer getTraceabilityId() {
            return this.traceabilityId;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultReferenceList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultTextGenerateMultimodalMediaListMultimodalMediaListArticle extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DocId")
        public String docId;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        /**
         * <strong>example:</strong>
         * <p>互联网搜索</p>
         */
        @NameInMap("SearchSourceName")
        public String searchSourceName;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Url")
        public String url;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultTextGenerateMultimodalMediaListMultimodalMediaListArticle build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultTextGenerateMultimodalMediaListMultimodalMediaListArticle self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultTextGenerateMultimodalMediaListMultimodalMediaListArticle();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultTextGenerateMultimodalMediaListMultimodalMediaListArticle setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultTextGenerateMultimodalMediaListMultimodalMediaListArticle setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultTextGenerateMultimodalMediaListMultimodalMediaListArticle setSearchSourceName(String searchSourceName) {
            this.searchSourceName = searchSourceName;
            return this;
        }
        public String getSearchSourceName() {
            return this.searchSourceName;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultTextGenerateMultimodalMediaListMultimodalMediaListArticle setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultTextGenerateMultimodalMediaListMultimodalMediaListArticle setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultTextGenerateMultimodalMediaListMultimodalMediaListArticle setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultTextGenerateMultimodalMediaListMultimodalMediaList extends TeaModel {
        @NameInMap("Article")
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultTextGenerateMultimodalMediaListMultimodalMediaListArticle article;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <strong>example:</strong>
         * <p>image</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultTextGenerateMultimodalMediaListMultimodalMediaList build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultTextGenerateMultimodalMediaListMultimodalMediaList self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultTextGenerateMultimodalMediaListMultimodalMediaList();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultTextGenerateMultimodalMediaListMultimodalMediaList setArticle(RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultTextGenerateMultimodalMediaListMultimodalMediaListArticle article) {
            this.article = article;
            return this;
        }
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultTextGenerateMultimodalMediaListMultimodalMediaListArticle getArticle() {
            return this.article;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultTextGenerateMultimodalMediaListMultimodalMediaList setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultTextGenerateMultimodalMediaListMultimodalMediaList setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultTextGenerateMultimodalMediaListMultimodalMediaList setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultTextGenerateMultimodalMediaList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("End")
        public Integer end;

        @NameInMap("MultimodalMediaList")
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultTextGenerateMultimodalMediaListMultimodalMediaList> multimodalMediaList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Start")
        public Integer start;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultTextGenerateMultimodalMediaList build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultTextGenerateMultimodalMediaList self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultTextGenerateMultimodalMediaList();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultTextGenerateMultimodalMediaList setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultTextGenerateMultimodalMediaList setMultimodalMediaList(java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultTextGenerateMultimodalMediaListMultimodalMediaList> multimodalMediaList) {
            this.multimodalMediaList = multimodalMediaList;
            return this;
        }
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultTextGenerateMultimodalMediaListMultimodalMediaList> getMultimodalMediaList() {
            return this.multimodalMediaList;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultTextGenerateMultimodalMediaList setStart(Integer start) {
            this.start = start;
            return this;
        }
        public Integer getStart() {
            return this.start;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("GenerateFinished")
        public Boolean generateFinished;

        @NameInMap("GenerateTraceability")
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceability generateTraceability;

        @NameInMap("MultimodalSearchResultList")
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultList> multimodalSearchResultList;

        @NameInMap("ReasonTextGenerate")
        public String reasonTextGenerate;

        @NameInMap("ReferenceList")
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultReferenceList> referenceList;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("TextGenerate")
        public String textGenerate;

        @NameInMap("TextGenerateMultimodalMediaList")
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultTextGenerateMultimodalMediaList> textGenerateMultimodalMediaList;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResult build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResult self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResult();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResult setGenerateFinished(Boolean generateFinished) {
            this.generateFinished = generateFinished;
            return this;
        }
        public Boolean getGenerateFinished() {
            return this.generateFinished;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResult setGenerateTraceability(RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceability generateTraceability) {
            this.generateTraceability = generateTraceability;
            return this;
        }
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultGenerateTraceability getGenerateTraceability() {
            return this.generateTraceability;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResult setMultimodalSearchResultList(java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultList> multimodalSearchResultList) {
            this.multimodalSearchResultList = multimodalSearchResultList;
            return this;
        }
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultMultimodalSearchResultList> getMultimodalSearchResultList() {
            return this.multimodalSearchResultList;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResult setReasonTextGenerate(String reasonTextGenerate) {
            this.reasonTextGenerate = reasonTextGenerate;
            return this;
        }
        public String getReasonTextGenerate() {
            return this.reasonTextGenerate;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResult setReferenceList(java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultReferenceList> referenceList) {
            this.referenceList = referenceList;
            return this;
        }
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultReferenceList> getReferenceList() {
            return this.referenceList;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResult setTextGenerate(String textGenerate) {
            this.textGenerate = textGenerate;
            return this;
        }
        public String getTextGenerate() {
            return this.textGenerate;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResult setTextGenerateMultimodalMediaList(java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultTextGenerateMultimodalMediaList> textGenerateMultimodalMediaList) {
            this.textGenerateMultimodalMediaList = textGenerateMultimodalMediaList;
            return this;
        }
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResultTextGenerateMultimodalMediaList> getTextGenerateMultimodalMediaList() {
            return this.textGenerateMultimodalMediaList;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResultArticle extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DocId")
        public String docId;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        /**
         * <strong>example:</strong>
         * <p>互联网搜索</p>
         */
        @NameInMap("SearchSourceName")
        public String searchSourceName;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Url")
        public String url;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResultArticle build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResultArticle self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResultArticle();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResultArticle setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResultArticle setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResultArticle setSearchSourceName(String searchSourceName) {
            this.searchSourceName = searchSourceName;
            return this;
        }
        public String getSearchSourceName() {
            return this.searchSourceName;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResultArticle setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResultArticle setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResultArticle setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResultClipInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("From")
        public Double from;

        /**
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("Score")
        public Double score;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("To")
        public Double to;

        /**
         * <strong>example:</strong>
         * <p>asr</p>
         */
        @NameInMap("Type")
        public String type;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResultClipInfos build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResultClipInfos self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResultClipInfos();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResultClipInfos setFrom(Double from) {
            this.from = from;
            return this;
        }
        public Double getFrom() {
            return this.from;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResultClipInfos setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResultClipInfos setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResultClipInfos setTo(Double to) {
            this.to = to;
            return this;
        }
        public Double getTo() {
            return this.to;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResultClipInfos setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResult extends TeaModel {
        @NameInMap("Article")
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResultArticle article;

        @NameInMap("ClipInfos")
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResultClipInfos> clipInfos;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResult build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResult self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResult();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResult setArticle(RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResultArticle article) {
            this.article = article;
            return this;
        }
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResultArticle getArticle() {
            return this.article;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResult setClipInfos(java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResultClipInfos> clipInfos) {
            this.clipInfos = clipInfos;
            return this;
        }
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResultClipInfos> getClipInfos() {
            return this.clipInfos;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResult setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResult setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResult extends TeaModel {
        @NameInMap("SearchResult")
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResult> searchResult;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResult build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResult self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResult();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResult setSearchResult(java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResult> searchResult) {
            this.searchResult = searchResult;
            return this;
        }
        public java.util.List<RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResultSearchResult> getSearchResult() {
            return this.searchResult;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContent extends TeaModel {
        @NameInMap("ClusterTopicResult")
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResult clusterTopicResult;

        @NameInMap("ExcerptResult")
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResult excerptResult;

        @NameInMap("ImageSearchResult")
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentImageSearchResult imageSearchResult;

        @NameInMap("NewsElementResult")
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResult newsElementResult;

        @NameInMap("TextGenerateResult")
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResult textGenerateResult;

        @NameInMap("TextSearchResult")
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextSearchResult textSearchResult;

        @NameInMap("TimelineResult")
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResult timelineResult;

        @NameInMap("VideoSearchResult")
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResult videoSearchResult;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContent build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContent self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContent();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContent setClusterTopicResult(RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResult clusterTopicResult) {
            this.clusterTopicResult = clusterTopicResult;
            return this;
        }
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentClusterTopicResult getClusterTopicResult() {
            return this.clusterTopicResult;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContent setExcerptResult(RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResult excerptResult) {
            this.excerptResult = excerptResult;
            return this;
        }
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentExcerptResult getExcerptResult() {
            return this.excerptResult;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContent setImageSearchResult(RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentImageSearchResult imageSearchResult) {
            this.imageSearchResult = imageSearchResult;
            return this;
        }
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentImageSearchResult getImageSearchResult() {
            return this.imageSearchResult;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContent setNewsElementResult(RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResult newsElementResult) {
            this.newsElementResult = newsElementResult;
            return this;
        }
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentNewsElementResult getNewsElementResult() {
            return this.newsElementResult;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContent setTextGenerateResult(RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResult textGenerateResult) {
            this.textGenerateResult = textGenerateResult;
            return this;
        }
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextGenerateResult getTextGenerateResult() {
            return this.textGenerateResult;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContent setTextSearchResult(RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextSearchResult textSearchResult) {
            this.textSearchResult = textSearchResult;
            return this;
        }
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTextSearchResult getTextSearchResult() {
            return this.textSearchResult;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContent setTimelineResult(RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResult timelineResult) {
            this.timelineResult = timelineResult;
            return this;
        }
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentTimelineResult getTimelineResult() {
            return this.timelineResult;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContent setVideoSearchResult(RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResult videoSearchResult) {
            this.videoSearchResult = videoSearchResult;
            return this;
        }
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContentVideoSearchResult getVideoSearchResult() {
            return this.videoSearchResult;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextTokenCalculate extends TeaModel {
        @NameInMap("FirstTokenTime")
        public Float firstTokenTime;

        @NameInMap("OutputAvgTime")
        public Float outputAvgTime;

        @NameInMap("SearchTime")
        public Float searchTime;

        @NameInMap("Time")
        public Float time;

        @NameInMap("TotalTokens")
        public Long totalTokens;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextTokenCalculate build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextTokenCalculate self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextTokenCalculate();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextTokenCalculate setFirstTokenTime(Float firstTokenTime) {
            this.firstTokenTime = firstTokenTime;
            return this;
        }
        public Float getFirstTokenTime() {
            return this.firstTokenTime;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextTokenCalculate setOutputAvgTime(Float outputAvgTime) {
            this.outputAvgTime = outputAvgTime;
            return this;
        }
        public Float getOutputAvgTime() {
            return this.outputAvgTime;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextTokenCalculate setSearchTime(Float searchTime) {
            this.searchTime = searchTime;
            return this;
        }
        public Float getSearchTime() {
            return this.searchTime;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextTokenCalculate setTime(Float time) {
            this.time = time;
            return this;
        }
        public Float getTime() {
            return this.time;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextTokenCalculate setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>您想了解关于xx的哪些信息？</p>
         */
        @NameInMap("AskUser")
        public String askUser;

        @NameInMap("AskUserKeywords")
        public java.util.List<String> askUserKeywords;

        /**
         * <strong>example:</strong>
         * <p>start</p>
         */
        @NameInMap("CurrentStep")
        public String currentStep;

        @NameInMap("GeneratedContent")
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContent generatedContent;

        @NameInMap("ModelId")
        public String modelId;

        /**
         * <strong>example:</strong>
         * <p>search</p>
         */
        @NameInMap("NextStep")
        public String nextStep;

        @NameInMap("RecommendSearchQueryList")
        public java.util.List<String> recommendSearchQueryList;

        @NameInMap("SearchKeywords")
        public java.util.List<String> searchKeywords;

        @NameInMap("SearchQueryList")
        public java.util.List<String> searchQueryList;

        /**
         * <strong>example:</strong>
         * <p>searchQuery</p>
         */
        @NameInMap("SupplementDataType")
        public String supplementDataType;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupplementEnable")
        public Boolean supplementEnable;

        @NameInMap("TokenCalculate")
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextTokenCalculate tokenCalculate;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContext build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContext self = new RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContext();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContext setAskUser(String askUser) {
            this.askUser = askUser;
            return this;
        }
        public String getAskUser() {
            return this.askUser;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContext setAskUserKeywords(java.util.List<String> askUserKeywords) {
            this.askUserKeywords = askUserKeywords;
            return this;
        }
        public java.util.List<String> getAskUserKeywords() {
            return this.askUserKeywords;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContext setCurrentStep(String currentStep) {
            this.currentStep = currentStep;
            return this;
        }
        public String getCurrentStep() {
            return this.currentStep;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContext setGeneratedContent(RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContent generatedContent) {
            this.generatedContent = generatedContent;
            return this;
        }
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextGeneratedContent getGeneratedContent() {
            return this.generatedContent;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContext setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContext setNextStep(String nextStep) {
            this.nextStep = nextStep;
            return this;
        }
        public String getNextStep() {
            return this.nextStep;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContext setRecommendSearchQueryList(java.util.List<String> recommendSearchQueryList) {
            this.recommendSearchQueryList = recommendSearchQueryList;
            return this;
        }
        public java.util.List<String> getRecommendSearchQueryList() {
            return this.recommendSearchQueryList;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContext setSearchKeywords(java.util.List<String> searchKeywords) {
            this.searchKeywords = searchKeywords;
            return this;
        }
        public java.util.List<String> getSearchKeywords() {
            return this.searchKeywords;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContext setSearchQueryList(java.util.List<String> searchQueryList) {
            this.searchQueryList = searchQueryList;
            return this;
        }
        public java.util.List<String> getSearchQueryList() {
            return this.searchQueryList;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContext setSupplementDataType(String supplementDataType) {
            this.supplementDataType = supplementDataType;
            return this;
        }
        public String getSupplementDataType() {
            return this.supplementDataType;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContext setSupplementEnable(Boolean supplementEnable) {
            this.supplementEnable = supplementEnable;
            return this;
        }
        public Boolean getSupplementEnable() {
            return this.supplementEnable;
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContext setTokenCalculate(RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextTokenCalculate tokenCalculate) {
            this.tokenCalculate = tokenCalculate;
            return this;
        }
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContextTokenCalculate getTokenCalculate() {
            return this.tokenCalculate;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutputAgentContext extends TeaModel {
        @NameInMap("BizContext")
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContext bizContext;

        public static RunSearchGenerationResponseBodyPayloadOutputAgentContext build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutputAgentContext self = new RunSearchGenerationResponseBodyPayloadOutputAgentContext();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutputAgentContext setBizContext(RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContext bizContext) {
            this.bizContext = bizContext;
            return this;
        }
        public RunSearchGenerationResponseBodyPayloadOutputAgentContextBizContext getBizContext() {
            return this.bizContext;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadOutput extends TeaModel {
        @NameInMap("AgentContext")
        public RunSearchGenerationResponseBodyPayloadOutputAgentContext agentContext;

        public static RunSearchGenerationResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadOutput self = new RunSearchGenerationResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadOutput setAgentContext(RunSearchGenerationResponseBodyPayloadOutputAgentContext agentContext) {
            this.agentContext = agentContext;
            return this;
        }
        public RunSearchGenerationResponseBodyPayloadOutputAgentContext getAgentContext() {
            return this.agentContext;
        }

    }

    public static class RunSearchGenerationResponseBodyPayloadUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InputTokens")
        public Long inputTokens;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("OutputTokens")
        public Long outputTokens;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalTokens")
        public Long totalTokens;

        public static RunSearchGenerationResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayloadUsage self = new RunSearchGenerationResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunSearchGenerationResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunSearchGenerationResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunSearchGenerationResponseBodyPayload extends TeaModel {
        @NameInMap("Output")
        public RunSearchGenerationResponseBodyPayloadOutput output;

        @NameInMap("Usage")
        public RunSearchGenerationResponseBodyPayloadUsage usage;

        public static RunSearchGenerationResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationResponseBodyPayload self = new RunSearchGenerationResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationResponseBodyPayload setOutput(RunSearchGenerationResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunSearchGenerationResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunSearchGenerationResponseBodyPayload setUsage(RunSearchGenerationResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunSearchGenerationResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
