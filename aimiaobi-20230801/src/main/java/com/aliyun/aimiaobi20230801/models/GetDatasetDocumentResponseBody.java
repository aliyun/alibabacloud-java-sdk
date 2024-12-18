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

        /**
         * <strong>example:</strong>
         * <p>内部文档唯一ID</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

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

        public GetDatasetDocumentResponseBodyData setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
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
