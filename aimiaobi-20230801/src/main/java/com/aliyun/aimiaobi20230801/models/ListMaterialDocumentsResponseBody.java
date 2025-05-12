// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListMaterialDocumentsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Current")
    public Integer current;

    @NameInMap("Data")
    public java.util.List<ListMaterialDocumentsResponseBodyData> data;

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
     * <p>10</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListMaterialDocumentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMaterialDocumentsResponseBody self = new ListMaterialDocumentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMaterialDocumentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMaterialDocumentsResponseBody setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ListMaterialDocumentsResponseBody setData(java.util.List<ListMaterialDocumentsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListMaterialDocumentsResponseBodyData> getData() {
        return this.data;
    }

    public ListMaterialDocumentsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListMaterialDocumentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMaterialDocumentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMaterialDocumentsResponseBody setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListMaterialDocumentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListMaterialDocumentsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListMaterialDocumentsResponseBodyDataFileAttr extends TeaModel {
        @NameInMap("Duration")
        public Double duration;

        @NameInMap("FileLength")
        public Long fileLength;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("MimeType")
        public String mimeType;

        @NameInMap("Width")
        public Integer width;

        public static ListMaterialDocumentsResponseBodyDataFileAttr build(java.util.Map<String, ?> map) throws Exception {
            ListMaterialDocumentsResponseBodyDataFileAttr self = new ListMaterialDocumentsResponseBodyDataFileAttr();
            return TeaModel.build(map, self);
        }

        public ListMaterialDocumentsResponseBodyDataFileAttr setDuration(Double duration) {
            this.duration = duration;
            return this;
        }
        public Double getDuration() {
            return this.duration;
        }

        public ListMaterialDocumentsResponseBodyDataFileAttr setFileLength(Long fileLength) {
            this.fileLength = fileLength;
            return this;
        }
        public Long getFileLength() {
            return this.fileLength;
        }

        public ListMaterialDocumentsResponseBodyDataFileAttr setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListMaterialDocumentsResponseBodyDataFileAttr setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public ListMaterialDocumentsResponseBodyDataFileAttr setMimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }
        public String getMimeType() {
            return this.mimeType;
        }

        public ListMaterialDocumentsResponseBodyDataFileAttr setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class ListMaterialDocumentsResponseBodyData extends TeaModel {
        @NameInMap("Author")
        public String author;

        /**
         * <strong>example:</strong>
         * <p>2023-03-18 02:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        @NameInMap("CreateUserName")
        public String createUserName;

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

        @NameInMap("FileAttr")
        public ListMaterialDocumentsResponseBodyDataFileAttr fileAttr;

        @NameInMap("FileKey")
        public String fileKey;

        @NameInMap("HtmlContent")
        public String htmlContent;

        /**
         * <strong>example:</strong>
         * <p>35</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>2023-03-18 02:00:00</p>
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
         * <p>2023-03-18 02:00:00</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UpdateUser")
        public String updateUser;

        @NameInMap("UpdateUserName")
        public String updateUserName;

        /**
         * <strong>example:</strong>
         * <p><a href="https://www.example.com">https://www.example.com</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static ListMaterialDocumentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMaterialDocumentsResponseBodyData self = new ListMaterialDocumentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMaterialDocumentsResponseBodyData setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public ListMaterialDocumentsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListMaterialDocumentsResponseBodyData setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListMaterialDocumentsResponseBodyData setCreateUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }
        public String getCreateUserName() {
            return this.createUserName;
        }

        public ListMaterialDocumentsResponseBodyData setDocKeywords(java.util.List<String> docKeywords) {
            this.docKeywords = docKeywords;
            return this;
        }
        public java.util.List<String> getDocKeywords() {
            return this.docKeywords;
        }

        public ListMaterialDocumentsResponseBodyData setDocType(String docType) {
            this.docType = docType;
            return this;
        }
        public String getDocType() {
            return this.docType;
        }

        public ListMaterialDocumentsResponseBodyData setExternalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }
        public String getExternalUrl() {
            return this.externalUrl;
        }

        public ListMaterialDocumentsResponseBodyData setFileAttr(ListMaterialDocumentsResponseBodyDataFileAttr fileAttr) {
            this.fileAttr = fileAttr;
            return this;
        }
        public ListMaterialDocumentsResponseBodyDataFileAttr getFileAttr() {
            return this.fileAttr;
        }

        public ListMaterialDocumentsResponseBodyData setFileKey(String fileKey) {
            this.fileKey = fileKey;
            return this;
        }
        public String getFileKey() {
            return this.fileKey;
        }

        public ListMaterialDocumentsResponseBodyData setHtmlContent(String htmlContent) {
            this.htmlContent = htmlContent;
            return this;
        }
        public String getHtmlContent() {
            return this.htmlContent;
        }

        public ListMaterialDocumentsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMaterialDocumentsResponseBodyData setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public ListMaterialDocumentsResponseBodyData setPublicUrl(String publicUrl) {
            this.publicUrl = publicUrl;
            return this;
        }
        public String getPublicUrl() {
            return this.publicUrl;
        }

        public ListMaterialDocumentsResponseBodyData setShareAttr(Integer shareAttr) {
            this.shareAttr = shareAttr;
            return this;
        }
        public Integer getShareAttr() {
            return this.shareAttr;
        }

        public ListMaterialDocumentsResponseBodyData setSrcFrom(String srcFrom) {
            this.srcFrom = srcFrom;
            return this;
        }
        public String getSrcFrom() {
            return this.srcFrom;
        }

        public ListMaterialDocumentsResponseBodyData setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public ListMaterialDocumentsResponseBodyData setTextContent(String textContent) {
            this.textContent = textContent;
            return this;
        }
        public String getTextContent() {
            return this.textContent;
        }

        public ListMaterialDocumentsResponseBodyData setThumbnailInBase64(String thumbnailInBase64) {
            this.thumbnailInBase64 = thumbnailInBase64;
            return this;
        }
        public String getThumbnailInBase64() {
            return this.thumbnailInBase64;
        }

        public ListMaterialDocumentsResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListMaterialDocumentsResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListMaterialDocumentsResponseBodyData setUpdateUser(String updateUser) {
            this.updateUser = updateUser;
            return this;
        }
        public String getUpdateUser() {
            return this.updateUser;
        }

        public ListMaterialDocumentsResponseBodyData setUpdateUserName(String updateUserName) {
            this.updateUserName = updateUserName;
            return this;
        }
        public String getUpdateUserName() {
            return this.updateUserName;
        }

        public ListMaterialDocumentsResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
