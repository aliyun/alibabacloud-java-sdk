// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListDatasetDocumentsResponseBody extends TeaModel {
    /**
     * <p>The status code for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>A list of documents.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListDatasetDocumentsResponseBodyData> data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>A detailed message about the request status.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The token used to retrieve the next page of results. This field appears only when more results are available.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. A value of <code>true</code> indicates success, and <code>false</code> indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of matching documents.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDatasetDocumentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetDocumentsResponseBody self = new ListDatasetDocumentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatasetDocumentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDatasetDocumentsResponseBody setData(java.util.List<ListDatasetDocumentsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDatasetDocumentsResponseBodyData> getData() {
        return this.data;
    }

    public ListDatasetDocumentsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDatasetDocumentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDatasetDocumentsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDatasetDocumentsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDatasetDocumentsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDatasetDocumentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDatasetDocumentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDatasetDocumentsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDatasetDocumentsResponseBodyDataMultimodalMedias extends TeaModel {
        /**
         * <p>The URL of the image or video file.</p>
         * 
         * <strong>example:</strong>
         * <p>图片或视频文件地址</p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <p>The unique ID of the multimodal media.</p>
         * 
         * <strong>example:</strong>
         * <p>多模态数据唯一标识</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The type of the multimodal media.</p>
         * 
         * <strong>example:</strong>
         * <p>多模态数据类型</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        public static ListDatasetDocumentsResponseBodyDataMultimodalMedias build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetDocumentsResponseBodyDataMultimodalMedias self = new ListDatasetDocumentsResponseBodyDataMultimodalMedias();
            return TeaModel.build(map, self);
        }

        public ListDatasetDocumentsResponseBodyDataMultimodalMedias setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public ListDatasetDocumentsResponseBodyDataMultimodalMedias setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public ListDatasetDocumentsResponseBodyDataMultimodalMedias setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

    }

    public static class ListDatasetDocumentsResponseBodyData extends TeaModel {
        /**
         * <p>The unique ID of the category.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("CategoryUuid")
        public String categoryUuid;

        /**
         * <p>The content of the document.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The creation time of the document.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-14 19:59:53</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The creator of the document.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>Indicates whether multimodal indexing is disabled for this document.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DisableHandleMultimodalMedia")
        public Boolean disableHandleMultimodalMedia;

        /**
         * <p>The user-specified unique document ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DocId")
        public String docId;

        /**
         * <p>The type of the document.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("DocType")
        public String docType;

        /**
         * <p>The unique internal document ID.</p>
         * 
         * <strong>example:</strong>
         * <p>内部文档唯一ID</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        /**
         * <p>Extension field 1.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Extend1")
        public String extend1;

        /**
         * <p>Extension field 2.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Extend2")
        public String extend2;

        /**
         * <p>Extension field 3.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Extend3")
        public String extend3;

        /**
         * <p>A list of multimodal media items associated with the document.</p>
         */
        @NameInMap("MultimodalMedias")
        public java.util.List<ListDatasetDocumentsResponseBodyDataMultimodalMedias> multimodalMedias;

        /**
         * <p>The publication time of the document.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-01 00:00:00</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        /**
         * <p>The source of the document.</p>
         * 
         * <strong>example:</strong>
         * <p>来源</p>
         */
        @NameInMap("SourceFrom")
        public String sourceFrom;

        /**
         * <p>The build status of the document index.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The summary of the document.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <p>A list of tags associated with the document.</p>
         */
        @NameInMap("Tags")
        public java.util.List<String> tags;

        /**
         * <p>The title of the document.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The last update time of the document.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-14 19:59:53</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The user who last updated the document.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UpdateUser")
        public String updateUser;

        /**
         * <p>The URL of the document.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx/xx">https://xxx/xx</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static ListDatasetDocumentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetDocumentsResponseBodyData self = new ListDatasetDocumentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDatasetDocumentsResponseBodyData setCategoryUuid(String categoryUuid) {
            this.categoryUuid = categoryUuid;
            return this;
        }
        public String getCategoryUuid() {
            return this.categoryUuid;
        }

        public ListDatasetDocumentsResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListDatasetDocumentsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDatasetDocumentsResponseBodyData setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListDatasetDocumentsResponseBodyData setDisableHandleMultimodalMedia(Boolean disableHandleMultimodalMedia) {
            this.disableHandleMultimodalMedia = disableHandleMultimodalMedia;
            return this;
        }
        public Boolean getDisableHandleMultimodalMedia() {
            return this.disableHandleMultimodalMedia;
        }

        public ListDatasetDocumentsResponseBodyData setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public ListDatasetDocumentsResponseBodyData setDocType(String docType) {
            this.docType = docType;
            return this;
        }
        public String getDocType() {
            return this.docType;
        }

        public ListDatasetDocumentsResponseBodyData setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public ListDatasetDocumentsResponseBodyData setExtend1(String extend1) {
            this.extend1 = extend1;
            return this;
        }
        public String getExtend1() {
            return this.extend1;
        }

        public ListDatasetDocumentsResponseBodyData setExtend2(String extend2) {
            this.extend2 = extend2;
            return this;
        }
        public String getExtend2() {
            return this.extend2;
        }

        public ListDatasetDocumentsResponseBodyData setExtend3(String extend3) {
            this.extend3 = extend3;
            return this;
        }
        public String getExtend3() {
            return this.extend3;
        }

        public ListDatasetDocumentsResponseBodyData setMultimodalMedias(java.util.List<ListDatasetDocumentsResponseBodyDataMultimodalMedias> multimodalMedias) {
            this.multimodalMedias = multimodalMedias;
            return this;
        }
        public java.util.List<ListDatasetDocumentsResponseBodyDataMultimodalMedias> getMultimodalMedias() {
            return this.multimodalMedias;
        }

        public ListDatasetDocumentsResponseBodyData setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public ListDatasetDocumentsResponseBodyData setSourceFrom(String sourceFrom) {
            this.sourceFrom = sourceFrom;
            return this;
        }
        public String getSourceFrom() {
            return this.sourceFrom;
        }

        public ListDatasetDocumentsResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListDatasetDocumentsResponseBodyData setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public ListDatasetDocumentsResponseBodyData setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public ListDatasetDocumentsResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListDatasetDocumentsResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListDatasetDocumentsResponseBodyData setUpdateUser(String updateUser) {
            this.updateUser = updateUser;
            return this;
        }
        public String getUpdateUser() {
            return this.updateUser;
        }

        public ListDatasetDocumentsResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
