// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetStyleLearningResultResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data.</p>
     */
    @NameInMap("Data")
    public GetStyleLearningResultResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. \<code>true\\</code> indicates success. \<code>false\\</code> indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetStyleLearningResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStyleLearningResultResponseBody self = new GetStyleLearningResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStyleLearningResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetStyleLearningResultResponseBody setData(GetStyleLearningResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetStyleLearningResultResponseBodyData getData() {
        return this.data;
    }

    public GetStyleLearningResultResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetStyleLearningResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetStyleLearningResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStyleLearningResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetStyleLearningResultResponseBodyDataContentList extends TeaModel {
        /**
         * <p>The content.</p>
         * 
         * <strong>example:</strong>
         * <p>内容</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The time when the content was created.</p>
         * 
         * <strong>example:</strong>
         * <p>创建时间</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The user who created the content.</p>
         * 
         * <strong>example:</strong>
         * <p>创建用户</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The primary key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The title.</p>
         * 
         * <strong>example:</strong>
         * <p>标题</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The time when the content was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>修改时间</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The user who last modified the content.</p>
         * 
         * <strong>example:</strong>
         * <p>修改用户</p>
         */
        @NameInMap("UpdateUser")
        public String updateUser;

        public static GetStyleLearningResultResponseBodyDataContentList build(java.util.Map<String, ?> map) throws Exception {
            GetStyleLearningResultResponseBodyDataContentList self = new GetStyleLearningResultResponseBodyDataContentList();
            return TeaModel.build(map, self);
        }

        public GetStyleLearningResultResponseBodyDataContentList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetStyleLearningResultResponseBodyDataContentList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetStyleLearningResultResponseBodyDataContentList setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetStyleLearningResultResponseBodyDataContentList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetStyleLearningResultResponseBodyDataContentList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetStyleLearningResultResponseBodyDataContentList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetStyleLearningResultResponseBodyDataContentList setUpdateUser(String updateUser) {
            this.updateUser = updateUser;
            return this;
        }
        public String getUpdateUser() {
            return this.updateUser;
        }

    }

    public static class GetStyleLearningResultResponseBodyDataMaterialInfoList extends TeaModel {
        /**
         * <p>The author.</p>
         * 
         * <strong>example:</strong>
         * <p>作者</p>
         */
        @NameInMap("Author")
        public String author;

        /**
         * <p>The time when the material was created.</p>
         * 
         * <strong>example:</strong>
         * <p>创建时间</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the user who created the material.</p>
         * 
         * <strong>example:</strong>
         * <p>创建用户ID</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The name of the user who created the material.</p>
         * 
         * <strong>example:</strong>
         * <p>创建用户姓名</p>
         */
        @NameInMap("CreateUserName")
        public String createUserName;

        /**
         * <p>The document tags used for purposes such as categorization. Separate keywords with commas.</p>
         */
        @NameInMap("DocKeywords")
        public java.util.List<String> docKeywords;

        /**
         * <p>The document type. Valid values: pdf, word, url, and image.</p>
         * 
         * <strong>example:</strong>
         * <p>文档类型，pdf、word、url、image</p>
         */
        @NameInMap("DocType")
        public String docType;

        /**
         * <p>The URL of the file uploaded by the customer. This is for record-keeping only.</p>
         * 
         * <strong>example:</strong>
         * <p>外部客户上传的URL，仅用作记录保存</p>
         */
        @NameInMap("ExternalUrl")
        public String externalUrl;

        /**
         * <p>The length of the file content.</p>
         * 
         * <strong>example:</strong>
         * <p>41</p>
         */
        @NameInMap("FileLength")
        public Integer fileLength;

        /**
         * <p>The raw HTML content after parsing.</p>
         * 
         * <strong>example:</strong>
         * <p>解析后的原始html内容</p>
         */
        @NameInMap("HtmlContent")
        public String htmlContent;

        /**
         * <p>The primary key.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The publishing time.</p>
         * 
         * <strong>example:</strong>
         * <p>发布时间</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        /**
         * <p>A temporary public URL.</p>
         * 
         * <strong>example:</strong>
         * <p>临时的对外公开的URL</p>
         */
        @NameInMap("PublicUrl")
        public String publicUrl;

        /**
         * <p>The sharing property, stored as a bitmask. The first bit indicates sharing within the workspace, the second within the tenant, and the third system-wide.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ShareAttr")
        public Integer shareAttr;

        /**
         * <p>The source of the document. Valid values: user_upload, search, and viewpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>文档来源，user_upload、search、viewpoint</p>
         */
        @NameInMap("SrcFrom")
        public String srcFrom;

        /**
         * <p>The document summary.</p>
         * 
         * <strong>example:</strong>
         * <p>文档摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <p>The parsed text content. This is empty for images.</p>
         * 
         * <strong>example:</strong>
         * <p>解析后的文本内容，对于图片来说为空</p>
         */
        @NameInMap("TextContent")
        public String textContent;

        /**
         * <p>The Base64-encoded thumbnail for image documents.</p>
         * 
         * <strong>example:</strong>
         * <p>图片文档类型的Base64缩略图</p>
         */
        @NameInMap("ThumbnailInBase64")
        public String thumbnailInBase64;

        /**
         * <p>The document title.</p>
         * 
         * <strong>example:</strong>
         * <p>文档标题</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The time when the material was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>修改时间</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The ID of the user who last modified the material.</p>
         * 
         * <strong>example:</strong>
         * <p>修改用户ID</p>
         */
        @NameInMap("UpdateUser")
        public String updateUser;

        /**
         * <p>The name of the user who last modified the material.</p>
         * 
         * <strong>example:</strong>
         * <p>修改用户姓名</p>
         */
        @NameInMap("UpdateUserName")
        public String updateUserName;

        /**
         * <p>The internal storage URL of the document. It supports multiple protocols, such as \<code>http\\://\\</code>, \<code>file://\\</code>, and \<code>ftp\\://\\</code>. This URL is for long-term storage of uploaded files and is deleted on expiration.</p>
         * 
         * <strong>example:</strong>
         * <p>内部文档保存的URL，支持多协议，http://,file://,ftp://:客户上传时保存到内部存储的URL、长期保存、到期删除</p>
         */
        @NameInMap("Url")
        public String url;

        public static GetStyleLearningResultResponseBodyDataMaterialInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetStyleLearningResultResponseBodyDataMaterialInfoList self = new GetStyleLearningResultResponseBodyDataMaterialInfoList();
            return TeaModel.build(map, self);
        }

        public GetStyleLearningResultResponseBodyDataMaterialInfoList setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public GetStyleLearningResultResponseBodyDataMaterialInfoList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetStyleLearningResultResponseBodyDataMaterialInfoList setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetStyleLearningResultResponseBodyDataMaterialInfoList setCreateUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }
        public String getCreateUserName() {
            return this.createUserName;
        }

        public GetStyleLearningResultResponseBodyDataMaterialInfoList setDocKeywords(java.util.List<String> docKeywords) {
            this.docKeywords = docKeywords;
            return this;
        }
        public java.util.List<String> getDocKeywords() {
            return this.docKeywords;
        }

        public GetStyleLearningResultResponseBodyDataMaterialInfoList setDocType(String docType) {
            this.docType = docType;
            return this;
        }
        public String getDocType() {
            return this.docType;
        }

        public GetStyleLearningResultResponseBodyDataMaterialInfoList setExternalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }
        public String getExternalUrl() {
            return this.externalUrl;
        }

        public GetStyleLearningResultResponseBodyDataMaterialInfoList setFileLength(Integer fileLength) {
            this.fileLength = fileLength;
            return this;
        }
        public Integer getFileLength() {
            return this.fileLength;
        }

        public GetStyleLearningResultResponseBodyDataMaterialInfoList setHtmlContent(String htmlContent) {
            this.htmlContent = htmlContent;
            return this;
        }
        public String getHtmlContent() {
            return this.htmlContent;
        }

        public GetStyleLearningResultResponseBodyDataMaterialInfoList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetStyleLearningResultResponseBodyDataMaterialInfoList setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public GetStyleLearningResultResponseBodyDataMaterialInfoList setPublicUrl(String publicUrl) {
            this.publicUrl = publicUrl;
            return this;
        }
        public String getPublicUrl() {
            return this.publicUrl;
        }

        public GetStyleLearningResultResponseBodyDataMaterialInfoList setShareAttr(Integer shareAttr) {
            this.shareAttr = shareAttr;
            return this;
        }
        public Integer getShareAttr() {
            return this.shareAttr;
        }

        public GetStyleLearningResultResponseBodyDataMaterialInfoList setSrcFrom(String srcFrom) {
            this.srcFrom = srcFrom;
            return this;
        }
        public String getSrcFrom() {
            return this.srcFrom;
        }

        public GetStyleLearningResultResponseBodyDataMaterialInfoList setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public GetStyleLearningResultResponseBodyDataMaterialInfoList setTextContent(String textContent) {
            this.textContent = textContent;
            return this;
        }
        public String getTextContent() {
            return this.textContent;
        }

        public GetStyleLearningResultResponseBodyDataMaterialInfoList setThumbnailInBase64(String thumbnailInBase64) {
            this.thumbnailInBase64 = thumbnailInBase64;
            return this;
        }
        public String getThumbnailInBase64() {
            return this.thumbnailInBase64;
        }

        public GetStyleLearningResultResponseBodyDataMaterialInfoList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetStyleLearningResultResponseBodyDataMaterialInfoList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetStyleLearningResultResponseBodyDataMaterialInfoList setUpdateUser(String updateUser) {
            this.updateUser = updateUser;
            return this;
        }
        public String getUpdateUser() {
            return this.updateUser;
        }

        public GetStyleLearningResultResponseBodyDataMaterialInfoList setUpdateUserName(String updateUserName) {
            this.updateUserName = updateUserName;
            return this;
        }
        public String getUpdateUserName() {
            return this.updateUserName;
        }

        public GetStyleLearningResultResponseBodyDataMaterialInfoList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetStyleLearningResultResponseBodyData extends TeaModel {
        /**
         * <p>The content generated by AIGC.</p>
         * 
         * <strong>example:</strong>
         * <p>AIGC 生成的内容</p>
         */
        @NameInMap("AigcResult")
        public String aigcResult;

        /**
         * <p>A list of custom content entities.</p>
         */
        @NameInMap("ContentList")
        public java.util.List<GetStyleLearningResultResponseBodyDataContentList> contentList;

        /**
         * <p>A list of custom content IDs.</p>
         */
        @NameInMap("CustomTextIdList")
        public java.util.List<Long> customTextIdList;

        /**
         * <p>The ID of the style learning analysis result.</p>
         * 
         * <strong>example:</strong>
         * <p>33</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>A list of material IDs.</p>
         */
        @NameInMap("MaterialIdList")
        public java.util.List<Long> materialIdList;

        /**
         * <p>A list of detailed information about the materials.</p>
         */
        @NameInMap("MaterialInfoList")
        public java.util.List<GetStyleLearningResultResponseBodyDataMaterialInfoList> materialInfoList;

        /**
         * <p>The user-revised content.</p>
         * 
         * <strong>example:</strong>
         * <p>用户修订后内容</p>
         */
        @NameInMap("RewriteResult")
        public String rewriteResult;

        /**
         * <p>The user-revised content.</p>
         * 
         * <strong>example:</strong>
         * <p>用户修订后内容</p>
         */
        @NameInMap("StyleName")
        public String styleName;

        /**
         * <p>The ID of the style analysis task.</p>
         * 
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static GetStyleLearningResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetStyleLearningResultResponseBodyData self = new GetStyleLearningResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetStyleLearningResultResponseBodyData setAigcResult(String aigcResult) {
            this.aigcResult = aigcResult;
            return this;
        }
        public String getAigcResult() {
            return this.aigcResult;
        }

        public GetStyleLearningResultResponseBodyData setContentList(java.util.List<GetStyleLearningResultResponseBodyDataContentList> contentList) {
            this.contentList = contentList;
            return this;
        }
        public java.util.List<GetStyleLearningResultResponseBodyDataContentList> getContentList() {
            return this.contentList;
        }

        public GetStyleLearningResultResponseBodyData setCustomTextIdList(java.util.List<Long> customTextIdList) {
            this.customTextIdList = customTextIdList;
            return this;
        }
        public java.util.List<Long> getCustomTextIdList() {
            return this.customTextIdList;
        }

        public GetStyleLearningResultResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetStyleLearningResultResponseBodyData setMaterialIdList(java.util.List<Long> materialIdList) {
            this.materialIdList = materialIdList;
            return this;
        }
        public java.util.List<Long> getMaterialIdList() {
            return this.materialIdList;
        }

        public GetStyleLearningResultResponseBodyData setMaterialInfoList(java.util.List<GetStyleLearningResultResponseBodyDataMaterialInfoList> materialInfoList) {
            this.materialInfoList = materialInfoList;
            return this;
        }
        public java.util.List<GetStyleLearningResultResponseBodyDataMaterialInfoList> getMaterialInfoList() {
            return this.materialInfoList;
        }

        public GetStyleLearningResultResponseBodyData setRewriteResult(String rewriteResult) {
            this.rewriteResult = rewriteResult;
            return this;
        }
        public String getRewriteResult() {
            return this.rewriteResult;
        }

        public GetStyleLearningResultResponseBodyData setStyleName(String styleName) {
            this.styleName = styleName;
            return this;
        }
        public String getStyleName() {
            return this.styleName;
        }

        public GetStyleLearningResultResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
