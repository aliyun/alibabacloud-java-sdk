// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetDatasetDocumentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDatasetDocumentResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDatasetDocumentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDatasetDocumentResponseBody self = new GetDatasetDocumentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDatasetDocumentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDatasetDocumentResponseBody setData(GetDatasetDocumentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDatasetDocumentResponseBodyData getData() {
        return this.data;
    }

    public GetDatasetDocumentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDatasetDocumentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDatasetDocumentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDatasetDocumentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDatasetDocumentResponseBodyDataMetadataAsrSentences extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Text")
        public String text;

        public static GetDatasetDocumentResponseBodyDataMetadataAsrSentences build(java.util.Map<String, ?> map) throws Exception {
            GetDatasetDocumentResponseBodyDataMetadataAsrSentences self = new GetDatasetDocumentResponseBodyDataMetadataAsrSentences();
            return TeaModel.build(map, self);
        }

        public GetDatasetDocumentResponseBodyDataMetadataAsrSentences setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetDatasetDocumentResponseBodyDataMetadataAsrSentences setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetDatasetDocumentResponseBodyDataMetadataAsrSentences setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class GetDatasetDocumentResponseBodyDataMetadataVideoShots extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Text")
        public String text;

        public static GetDatasetDocumentResponseBodyDataMetadataVideoShots build(java.util.Map<String, ?> map) throws Exception {
            GetDatasetDocumentResponseBodyDataMetadataVideoShots self = new GetDatasetDocumentResponseBodyDataMetadataVideoShots();
            return TeaModel.build(map, self);
        }

        public GetDatasetDocumentResponseBodyDataMetadataVideoShots setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetDatasetDocumentResponseBodyDataMetadataVideoShots setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetDatasetDocumentResponseBodyDataMetadataVideoShots setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class GetDatasetDocumentResponseBodyDataMetadata extends TeaModel {
        @NameInMap("AsrSentences")
        public java.util.List<GetDatasetDocumentResponseBodyDataMetadataAsrSentences> asrSentences;

        @NameInMap("Text")
        public String text;

        @NameInMap("VideoShots")
        public java.util.List<GetDatasetDocumentResponseBodyDataMetadataVideoShots> videoShots;

        public static GetDatasetDocumentResponseBodyDataMetadata build(java.util.Map<String, ?> map) throws Exception {
            GetDatasetDocumentResponseBodyDataMetadata self = new GetDatasetDocumentResponseBodyDataMetadata();
            return TeaModel.build(map, self);
        }

        public GetDatasetDocumentResponseBodyDataMetadata setAsrSentences(java.util.List<GetDatasetDocumentResponseBodyDataMetadataAsrSentences> asrSentences) {
            this.asrSentences = asrSentences;
            return this;
        }
        public java.util.List<GetDatasetDocumentResponseBodyDataMetadataAsrSentences> getAsrSentences() {
            return this.asrSentences;
        }

        public GetDatasetDocumentResponseBodyDataMetadata setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public GetDatasetDocumentResponseBodyDataMetadata setVideoShots(java.util.List<GetDatasetDocumentResponseBodyDataMetadataVideoShots> videoShots) {
            this.videoShots = videoShots;
            return this;
        }
        public java.util.List<GetDatasetDocumentResponseBodyDataMetadataVideoShots> getVideoShots() {
            return this.videoShots;
        }

    }

    public static class GetDatasetDocumentResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DisableHandleMultimodalMedia")
        public Boolean disableHandleMultimodalMedia;

        /**
         * <strong>example:</strong>
         * <p>用户指定的文档唯一ID</p>
         */
        @NameInMap("DocId")
        public String docId;

        @NameInMap("DocType")
        public String docType;

        /**
         * <strong>example:</strong>
         * <p>内部文档唯一ID</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        @NameInMap("Metadata")
        public GetDatasetDocumentResponseBodyDataMetadata metadata;

        /**
         * <strong>example:</strong>
         * <p>2024-05-14 08:54:33</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        /**
         * <strong>example:</strong>
         * <p>来源</p>
         */
        @NameInMap("SourceFrom")
        public String sourceFrom;

        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>文章摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static GetDatasetDocumentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDatasetDocumentResponseBodyData self = new GetDatasetDocumentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDatasetDocumentResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetDatasetDocumentResponseBodyData setDisableHandleMultimodalMedia(Boolean disableHandleMultimodalMedia) {
            this.disableHandleMultimodalMedia = disableHandleMultimodalMedia;
            return this;
        }
        public Boolean getDisableHandleMultimodalMedia() {
            return this.disableHandleMultimodalMedia;
        }

        public GetDatasetDocumentResponseBodyData setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public GetDatasetDocumentResponseBodyData setDocType(String docType) {
            this.docType = docType;
            return this;
        }
        public String getDocType() {
            return this.docType;
        }

        public GetDatasetDocumentResponseBodyData setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public GetDatasetDocumentResponseBodyData setMetadata(GetDatasetDocumentResponseBodyDataMetadata metadata) {
            this.metadata = metadata;
            return this;
        }
        public GetDatasetDocumentResponseBodyDataMetadata getMetadata() {
            return this.metadata;
        }

        public GetDatasetDocumentResponseBodyData setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public GetDatasetDocumentResponseBodyData setSourceFrom(String sourceFrom) {
            this.sourceFrom = sourceFrom;
            return this;
        }
        public String getSourceFrom() {
            return this.sourceFrom;
        }

        public GetDatasetDocumentResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetDatasetDocumentResponseBodyData setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public GetDatasetDocumentResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetDatasetDocumentResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
