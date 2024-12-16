// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunDocQaResponseBody extends TeaModel {
    @NameInMap("Header")
    public RunDocQaResponseBodyHeader header;

    @NameInMap("Payload")
    public RunDocQaResponseBodyPayload payload;

    /**
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunDocQaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunDocQaResponseBody self = new RunDocQaResponseBody();
        return TeaModel.build(map, self);
    }

    public RunDocQaResponseBody setHeader(RunDocQaResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public RunDocQaResponseBodyHeader getHeader() {
        return this.header;
    }

    public RunDocQaResponseBody setPayload(RunDocQaResponseBodyPayload payload) {
        this.payload = payload;
        return this;
    }
    public RunDocQaResponseBodyPayload getPayload() {
        return this.payload;
    }

    public RunDocQaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunDocQaResponseBodyHeader extends TeaModel {
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
         * <p>f5517ee8-dbec-4dc8-bd0a-af084b5e3db1</p>
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
         * <p>46e5c2b5-0877-4f09-bd91-ab0cf314e48b</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static RunDocQaResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            RunDocQaResponseBodyHeader self = new RunDocQaResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public RunDocQaResponseBodyHeader setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RunDocQaResponseBodyHeader setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RunDocQaResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunDocQaResponseBodyHeader setEventInfo(String eventInfo) {
            this.eventInfo = eventInfo;
            return this;
        }
        public String getEventInfo() {
            return this.eventInfo;
        }

        public RunDocQaResponseBodyHeader setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunDocQaResponseBodyHeader setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RunDocQaResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class RunDocQaResponseBodyPayloadOutputMediaUrlListClipInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("From")
        public Double from;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("To")
        public Double to;

        public static RunDocQaResponseBodyPayloadOutputMediaUrlListClipInfos build(java.util.Map<String, ?> map) throws Exception {
            RunDocQaResponseBodyPayloadOutputMediaUrlListClipInfos self = new RunDocQaResponseBodyPayloadOutputMediaUrlListClipInfos();
            return TeaModel.build(map, self);
        }

        public RunDocQaResponseBodyPayloadOutputMediaUrlListClipInfos setFrom(Double from) {
            this.from = from;
            return this;
        }
        public Double getFrom() {
            return this.from;
        }

        public RunDocQaResponseBodyPayloadOutputMediaUrlListClipInfos setTo(Double to) {
            this.to = to;
            return this;
        }
        public Double getTo() {
            return this.to;
        }

    }

    public static class RunDocQaResponseBodyPayloadOutputMediaUrlList extends TeaModel {
        @NameInMap("ClipInfos")
        public java.util.List<RunDocQaResponseBodyPayloadOutputMediaUrlListClipInfos> clipInfos;

        /**
         * <strong>example:</strong>
         * <p><a href="https://gw.alicdn.com/imgextra/i3/2775676850/O1CN01kdeffE20TM0E7wvpq_!!2775676850.jpg_q60.jpg">https://gw.alicdn.com/imgextra/i3/2775676850/O1CN01kdeffE20TM0E7wvpq_!!2775676850.jpg_q60.jpg</a></p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <strong>example:</strong>
         * <p>video</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        public static RunDocQaResponseBodyPayloadOutputMediaUrlList build(java.util.Map<String, ?> map) throws Exception {
            RunDocQaResponseBodyPayloadOutputMediaUrlList self = new RunDocQaResponseBodyPayloadOutputMediaUrlList();
            return TeaModel.build(map, self);
        }

        public RunDocQaResponseBodyPayloadOutputMediaUrlList setClipInfos(java.util.List<RunDocQaResponseBodyPayloadOutputMediaUrlListClipInfos> clipInfos) {
            this.clipInfos = clipInfos;
            return this;
        }
        public java.util.List<RunDocQaResponseBodyPayloadOutputMediaUrlListClipInfos> getClipInfos() {
            return this.clipInfos;
        }

        public RunDocQaResponseBodyPayloadOutputMediaUrlList setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public RunDocQaResponseBodyPayloadOutputMediaUrlList setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

    }

    public static class RunDocQaResponseBodyPayloadOutputRecommends extends TeaModel {
        @NameInMap("Title")
        public String title;

        @NameInMap("Url")
        public String url;

        public static RunDocQaResponseBodyPayloadOutputRecommends build(java.util.Map<String, ?> map) throws Exception {
            RunDocQaResponseBodyPayloadOutputRecommends self = new RunDocQaResponseBodyPayloadOutputRecommends();
            return TeaModel.build(map, self);
        }

        public RunDocQaResponseBodyPayloadOutputRecommends setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RunDocQaResponseBodyPayloadOutputRecommends setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunDocQaResponseBodyPayloadOutputReferences extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-10-08 18:00</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("SourceDocId")
        public String sourceDocId;

        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxxxx">http://xxxxx</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static RunDocQaResponseBodyPayloadOutputReferences build(java.util.Map<String, ?> map) throws Exception {
            RunDocQaResponseBodyPayloadOutputReferences self = new RunDocQaResponseBodyPayloadOutputReferences();
            return TeaModel.build(map, self);
        }

        public RunDocQaResponseBodyPayloadOutputReferences setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public RunDocQaResponseBodyPayloadOutputReferences setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public RunDocQaResponseBodyPayloadOutputReferences setSourceDocId(String sourceDocId) {
            this.sourceDocId = sourceDocId;
            return this;
        }
        public String getSourceDocId() {
            return this.sourceDocId;
        }

        public RunDocQaResponseBodyPayloadOutputReferences setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RunDocQaResponseBodyPayloadOutputReferences setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunDocQaResponseBodyPayloadOutput extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("InterveneContent")
        public String interveneContent;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsReject")
        public Boolean isReject;

        @NameInMap("MediaUrlList")
        public java.util.List<RunDocQaResponseBodyPayloadOutputMediaUrlList> mediaUrlList;

        @NameInMap("Recommends")
        public java.util.List<RunDocQaResponseBodyPayloadOutputRecommends> recommends;

        @NameInMap("References")
        public java.util.List<RunDocQaResponseBodyPayloadOutputReferences> references;

        public static RunDocQaResponseBodyPayloadOutput build(java.util.Map<String, ?> map) throws Exception {
            RunDocQaResponseBodyPayloadOutput self = new RunDocQaResponseBodyPayloadOutput();
            return TeaModel.build(map, self);
        }

        public RunDocQaResponseBodyPayloadOutput setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RunDocQaResponseBodyPayloadOutput setInterveneContent(String interveneContent) {
            this.interveneContent = interveneContent;
            return this;
        }
        public String getInterveneContent() {
            return this.interveneContent;
        }

        public RunDocQaResponseBodyPayloadOutput setIsReject(Boolean isReject) {
            this.isReject = isReject;
            return this;
        }
        public Boolean getIsReject() {
            return this.isReject;
        }

        public RunDocQaResponseBodyPayloadOutput setMediaUrlList(java.util.List<RunDocQaResponseBodyPayloadOutputMediaUrlList> mediaUrlList) {
            this.mediaUrlList = mediaUrlList;
            return this;
        }
        public java.util.List<RunDocQaResponseBodyPayloadOutputMediaUrlList> getMediaUrlList() {
            return this.mediaUrlList;
        }

        public RunDocQaResponseBodyPayloadOutput setRecommends(java.util.List<RunDocQaResponseBodyPayloadOutputRecommends> recommends) {
            this.recommends = recommends;
            return this;
        }
        public java.util.List<RunDocQaResponseBodyPayloadOutputRecommends> getRecommends() {
            return this.recommends;
        }

        public RunDocQaResponseBodyPayloadOutput setReferences(java.util.List<RunDocQaResponseBodyPayloadOutputReferences> references) {
            this.references = references;
            return this;
        }
        public java.util.List<RunDocQaResponseBodyPayloadOutputReferences> getReferences() {
            return this.references;
        }

    }

    public static class RunDocQaResponseBodyPayloadUsage extends TeaModel {
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

        public static RunDocQaResponseBodyPayloadUsage build(java.util.Map<String, ?> map) throws Exception {
            RunDocQaResponseBodyPayloadUsage self = new RunDocQaResponseBodyPayloadUsage();
            return TeaModel.build(map, self);
        }

        public RunDocQaResponseBodyPayloadUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public RunDocQaResponseBodyPayloadUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public RunDocQaResponseBodyPayloadUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class RunDocQaResponseBodyPayload extends TeaModel {
        @NameInMap("Output")
        public RunDocQaResponseBodyPayloadOutput output;

        @NameInMap("Usage")
        public RunDocQaResponseBodyPayloadUsage usage;

        public static RunDocQaResponseBodyPayload build(java.util.Map<String, ?> map) throws Exception {
            RunDocQaResponseBodyPayload self = new RunDocQaResponseBodyPayload();
            return TeaModel.build(map, self);
        }

        public RunDocQaResponseBodyPayload setOutput(RunDocQaResponseBodyPayloadOutput output) {
            this.output = output;
            return this;
        }
        public RunDocQaResponseBodyPayloadOutput getOutput() {
            return this.output;
        }

        public RunDocQaResponseBodyPayload setUsage(RunDocQaResponseBodyPayloadUsage usage) {
            this.usage = usage;
            return this;
        }
        public RunDocQaResponseBodyPayloadUsage getUsage() {
            return this.usage;
        }

    }

}
