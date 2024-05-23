// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DocumentExtractionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<DocumentExtractionResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DocumentExtractionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DocumentExtractionResponseBody self = new DocumentExtractionResponseBody();
        return TeaModel.build(map, self);
    }

    public DocumentExtractionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DocumentExtractionResponseBody setData(java.util.List<DocumentExtractionResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DocumentExtractionResponseBodyData> getData() {
        return this.data;
    }

    public DocumentExtractionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DocumentExtractionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DocumentExtractionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DocumentExtractionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DocumentExtractionResponseBodyData extends TeaModel {
        @NameInMap("Author")
        public String author;

        @NameInMap("Content")
        public String content;

        @NameInMap("DocId")
        public String docId;

        @NameInMap("DocUuid")
        public String docUuid;

        @NameInMap("PubTime")
        public String pubTime;

        @NameInMap("Source")
        public String source;

        @NameInMap("Summary")
        public String summary;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("Title")
        public String title;

        @NameInMap("Url")
        public String url;

        public static DocumentExtractionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DocumentExtractionResponseBodyData self = new DocumentExtractionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DocumentExtractionResponseBodyData setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public DocumentExtractionResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DocumentExtractionResponseBodyData setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public DocumentExtractionResponseBodyData setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public DocumentExtractionResponseBodyData setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public DocumentExtractionResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DocumentExtractionResponseBodyData setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public DocumentExtractionResponseBodyData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DocumentExtractionResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DocumentExtractionResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
