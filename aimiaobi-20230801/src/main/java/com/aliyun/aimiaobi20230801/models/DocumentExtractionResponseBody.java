// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DocumentExtractionResponseBody extends TeaModel {
    /**
     * <p>Status code</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Business data</p>
     */
    @NameInMap("Data")
    public java.util.List<DocumentExtractionResponseBodyData> data;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Error message</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Unique request identifier</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates success: true for success, false for failure</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>Author</p>
         * 
         * <strong>example:</strong>
         * <p>作者</p>
         */
        @NameInMap("Author")
        public String author;

        /**
         * <p>Content</p>
         * 
         * <strong>example:</strong>
         * <p>文章内容</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>Custom unique ID for the document</p>
         * 
         * <strong>example:</strong>
         * <p>文档-自定义的唯一ID</p>
         */
        @NameInMap("DocId")
        public String docId;

        /**
         * <p>Internal unique identifier for the document</p>
         * 
         * <strong>example:</strong>
         * <p>8df2d69d63a247b6b52ff455b2d426b6</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        /**
         * <p>Publication time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-14 08:54:33</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        /**
         * <p>Source</p>
         * 
         * <strong>example:</strong>
         * <p>新闻来源</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>Article summary</p>
         * 
         * <strong>example:</strong>
         * <p>文章摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <p>Tag</p>
         * 
         * <strong>example:</strong>
         * <p>文章标签</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>Title</p>
         * 
         * <strong>example:</strong>
         * <p>文章标题</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>Article URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.example.com/aaa.docx">https://www.example.com/aaa.docx</a></p>
         */
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
