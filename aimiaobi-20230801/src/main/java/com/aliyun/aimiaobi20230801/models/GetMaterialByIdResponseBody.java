// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetMaterialByIdResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetMaterialByIdResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>数据不存在</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetMaterialByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMaterialByIdResponseBody self = new GetMaterialByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMaterialByIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMaterialByIdResponseBody setData(GetMaterialByIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMaterialByIdResponseBodyData getData() {
        return this.data;
    }

    public GetMaterialByIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMaterialByIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMaterialByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMaterialByIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMaterialByIdResponseBodyData extends TeaModel {
        @NameInMap("Author")
        public String author;

        /**
         * <strong>example:</strong>
         * <p>2023-03-21 11:34:19</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        @NameInMap("DocKeywords")
        public java.util.List<String> docKeywords;

        /**
         * <strong>example:</strong>
         * <p>pdf</p>
         */
        @NameInMap("DocType")
        public String docType;

        /**
         * <strong>example:</strong>
         * <p><a href="https://www.example.com">https://www.example.com</a></p>
         */
        @NameInMap("ExternalUrl")
        public String externalUrl;

        @NameInMap("HtmlContent")
        public String htmlContent;

        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>2023-04-11 06:14:07</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        /**
         * <strong>example:</strong>
         * <p><a href="https://www.example.com">https://www.example.com</a></p>
         */
        @NameInMap("PublicUrl")
        public String publicUrl;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ShareAttr")
        public Integer shareAttr;

        /**
         * <strong>example:</strong>
         * <p>user_upload</p>
         */
        @NameInMap("SrcFrom")
        public String srcFrom;

        @NameInMap("Summary")
        public String summary;

        @NameInMap("TextContent")
        public String textContent;

        @NameInMap("ThumbnailInBase64")
        public String thumbnailInBase64;

        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>2022-04-08 19:33:01</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UpdateUser")
        public String updateUser;

        /**
         * <strong>example:</strong>
         * <p><a href="https://www.example.com">https://www.example.com</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static GetMaterialByIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMaterialByIdResponseBodyData self = new GetMaterialByIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMaterialByIdResponseBodyData setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public GetMaterialByIdResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetMaterialByIdResponseBodyData setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetMaterialByIdResponseBodyData setDocKeywords(java.util.List<String> docKeywords) {
            this.docKeywords = docKeywords;
            return this;
        }
        public java.util.List<String> getDocKeywords() {
            return this.docKeywords;
        }

        public GetMaterialByIdResponseBodyData setDocType(String docType) {
            this.docType = docType;
            return this;
        }
        public String getDocType() {
            return this.docType;
        }

        public GetMaterialByIdResponseBodyData setExternalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }
        public String getExternalUrl() {
            return this.externalUrl;
        }

        public GetMaterialByIdResponseBodyData setHtmlContent(String htmlContent) {
            this.htmlContent = htmlContent;
            return this;
        }
        public String getHtmlContent() {
            return this.htmlContent;
        }

        public GetMaterialByIdResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetMaterialByIdResponseBodyData setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public GetMaterialByIdResponseBodyData setPublicUrl(String publicUrl) {
            this.publicUrl = publicUrl;
            return this;
        }
        public String getPublicUrl() {
            return this.publicUrl;
        }

        public GetMaterialByIdResponseBodyData setShareAttr(Integer shareAttr) {
            this.shareAttr = shareAttr;
            return this;
        }
        public Integer getShareAttr() {
            return this.shareAttr;
        }

        public GetMaterialByIdResponseBodyData setSrcFrom(String srcFrom) {
            this.srcFrom = srcFrom;
            return this;
        }
        public String getSrcFrom() {
            return this.srcFrom;
        }

        public GetMaterialByIdResponseBodyData setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public GetMaterialByIdResponseBodyData setTextContent(String textContent) {
            this.textContent = textContent;
            return this;
        }
        public String getTextContent() {
            return this.textContent;
        }

        public GetMaterialByIdResponseBodyData setThumbnailInBase64(String thumbnailInBase64) {
            this.thumbnailInBase64 = thumbnailInBase64;
            return this;
        }
        public String getThumbnailInBase64() {
            return this.thumbnailInBase64;
        }

        public GetMaterialByIdResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetMaterialByIdResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetMaterialByIdResponseBodyData setUpdateUser(String updateUser) {
            this.updateUser = updateUser;
            return this;
        }
        public String getUpdateUser() {
            return this.updateUser;
        }

        public GetMaterialByIdResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
