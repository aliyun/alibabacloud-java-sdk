// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListMaterialDocumentsResponseBody extends TeaModel {
    /**
     * <p>Status code.</p>
     * 
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Current")
    public Integer current;

    /**
     * <p>List object.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListMaterialDocumentsResponseBodyData> data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Error description.</p>
     * 
     * <strong>example:</strong>
     * <p>数据不存在</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Unique request identity.</p>
     * 
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Number of records per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <p>Is successful: true for success, false for failure.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Total number of records.</p>
     * 
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
        /**
         * <p>Duration.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("Duration")
        public Double duration;

        /**
         * <p>File content length.</p>
         * 
         * <strong>example:</strong>
         * <p>1048576</p>
         */
        @NameInMap("FileLength")
        public Long fileLength;

        /**
         * <p>File name.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx.mp4</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>Video height.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <p>File MIME type.</p>
         * 
         * <strong>example:</strong>
         * <p>image/png</p>
         */
        @NameInMap("MimeType")
        public String mimeType;

        /**
         * <p>Video width.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
        /**
         * <p>Author.</p>
         * 
         * <strong>example:</strong>
         * <p>作者</p>
         */
        @NameInMap("Author")
        public String author;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-18 02:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Creator user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;1&quot;</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>Creator username.</p>
         * 
         * <strong>example:</strong>
         * <p>创建用户名</p>
         */
        @NameInMap("CreateUserName")
        public String createUserName;

        /**
         * <p>Document tags used for categorization. Separate keywords with commas.</p>
         */
        @NameInMap("DocKeywords")
        public java.util.List<String> docKeywords;

        /**
         * <p>Document type: pdf, word, url, or image.</p>
         * 
         * <strong>example:</strong>
         * <p>pdf</p>
         */
        @NameInMap("DocType")
        public String docType;

        /**
         * <p>URL uploaded by an external customer, used only for record keeping.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.example.com">https://www.example.com</a></p>
         */
        @NameInMap("ExternalUrl")
        public String externalUrl;

        /**
         * <p>Media file properties.</p>
         */
        @NameInMap("FileAttr")
        public ListMaterialDocumentsResponseBodyDataFileAttr fileAttr;

        /**
         * <p>Unique file identity.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://default/oss-bucket-name/aimiaobi/2021/07/01/1625126400000/1.docx</p>
         */
        @NameInMap("FileKey")
        public String fileKey;

        /**
         * <p>Web page content.</p>
         * 
         * <strong>example:</strong>
         * <p>网页内容</p>
         */
        @NameInMap("HtmlContent")
        public String htmlContent;

        /**
         * <p>Primary key.</p>
         * 
         * <strong>example:</strong>
         * <p>35</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Publish time. Format: yyyy-MM-dd HH:mm:ss</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-18 02:00:00</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        /**
         * <p>Temporary public URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.example.com">https://www.example.com</a></p>
         */
        @NameInMap("PublicUrl")
        public String publicUrl;

        /**
         * <p>Public property, stored by bit. The first bit indicates if it is shared within the workspace, the second bit indicates if it is shared within the tenant, and the third bit indicates if it is shared system-wide.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ShareAttr")
        public Integer shareAttr;

        /**
         * <p>Document source: user_upload, search, or viewpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>user_upload</p>
         */
        @NameInMap("SrcFrom")
        public String srcFrom;

        /**
         * <p>Document summary.</p>
         * 
         * <strong>example:</strong>
         * <p>摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <p>Parsed text content. This is empty for images.</p>
         * 
         * <strong>example:</strong>
         * <p>文档内容</p>
         */
        @NameInMap("TextContent")
        public String textContent;

        /**
         * <p>Base64 thumbnail for image document types.</p>
         * 
         * <strong>example:</strong>
         * <p>base64编码的图像二进制数据</p>
         */
        @NameInMap("ThumbnailInBase64")
        public String thumbnailInBase64;

        /**
         * <p>Document title.</p>
         * 
         * <strong>example:</strong>
         * <p>文档标题</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>Modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-18 02:00:00</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>Modifier user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;1&quot;</p>
         */
        @NameInMap("UpdateUser")
        public String updateUser;

        /**
         * <p>The name of the user who updated the document.</p>
         * 
         * <strong>example:</strong>
         * <p>更新用户名</p>
         */
        @NameInMap("UpdateUserName")
        public String updateUserName;

        /**
         * <p>URL for internal document storage. Supports multiple protocols (http\://, file://, ftp\://). This URL is saved to internal storage when a customer uploads a file, stored long-term, and deleted upon expiration.</p>
         * 
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
