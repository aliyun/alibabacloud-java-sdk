// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListSearchTaskDialogueDatasResponseBody extends TeaModel {
    @NameInMap("Articles")
    public java.util.List<ListSearchTaskDialogueDatasResponseBodyArticles> articles;

    /**
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Images")
    public java.util.List<ListSearchTaskDialogueDatasResponseBodyImages> images;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RealtimeSearch")
    public Boolean realtimeSearch;

    /**
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>realtime</p>
     */
    @NameInMap("SearchType")
    public String searchType;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Videos")
    public java.util.List<ListSearchTaskDialogueDatasResponseBodyVideos> videos;

    public static ListSearchTaskDialogueDatasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSearchTaskDialogueDatasResponseBody self = new ListSearchTaskDialogueDatasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSearchTaskDialogueDatasResponseBody setArticles(java.util.List<ListSearchTaskDialogueDatasResponseBodyArticles> articles) {
        this.articles = articles;
        return this;
    }
    public java.util.List<ListSearchTaskDialogueDatasResponseBodyArticles> getArticles() {
        return this.articles;
    }

    public ListSearchTaskDialogueDatasResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSearchTaskDialogueDatasResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSearchTaskDialogueDatasResponseBody setImages(java.util.List<ListSearchTaskDialogueDatasResponseBodyImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<ListSearchTaskDialogueDatasResponseBodyImages> getImages() {
        return this.images;
    }

    public ListSearchTaskDialogueDatasResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSearchTaskDialogueDatasResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSearchTaskDialogueDatasResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSearchTaskDialogueDatasResponseBody setRealtimeSearch(Boolean realtimeSearch) {
        this.realtimeSearch = realtimeSearch;
        return this;
    }
    public Boolean getRealtimeSearch() {
        return this.realtimeSearch;
    }

    public ListSearchTaskDialogueDatasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSearchTaskDialogueDatasResponseBody setSearchType(String searchType) {
        this.searchType = searchType;
        return this;
    }
    public String getSearchType() {
        return this.searchType;
    }

    public ListSearchTaskDialogueDatasResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSearchTaskDialogueDatasResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListSearchTaskDialogueDatasResponseBody setVideos(java.util.List<ListSearchTaskDialogueDatasResponseBodyVideos> videos) {
        this.videos = videos;
        return this;
    }
    public java.util.List<ListSearchTaskDialogueDatasResponseBodyVideos> getVideos() {
        return this.videos;
    }

    public static class ListSearchTaskDialogueDatasResponseBodyArticlesMultimodalMedias extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>图片或视频文件地址</p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <strong>example:</strong>
         * <p>多模态数据唯一标识</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <strong>example:</strong>
         * <p>多模态数据类型</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        public static ListSearchTaskDialogueDatasResponseBodyArticlesMultimodalMedias build(java.util.Map<String, ?> map) throws Exception {
            ListSearchTaskDialogueDatasResponseBodyArticlesMultimodalMedias self = new ListSearchTaskDialogueDatasResponseBodyArticlesMultimodalMedias();
            return TeaModel.build(map, self);
        }

        public ListSearchTaskDialogueDatasResponseBodyArticlesMultimodalMedias setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public ListSearchTaskDialogueDatasResponseBodyArticlesMultimodalMedias setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public ListSearchTaskDialogueDatasResponseBodyArticlesMultimodalMedias setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

    }

    public static class ListSearchTaskDialogueDatasResponseBodyArticles extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>作者</p>
         */
        @NameInMap("Author")
        public String author;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("CategoryUuid")
        public String categoryUuid;

        /**
         * <strong>example:</strong>
         * <p>文章内容</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>文档-自定义的唯一ID</p>
         */
        @NameInMap("DocId")
        public String docId;

        /**
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("DocType")
        public String docType;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Extend1")
        public String extend1;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Extend2")
        public String extend2;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Extend3")
        public String extend3;

        @NameInMap("MultimodalMedias")
        public java.util.List<ListSearchTaskDialogueDatasResponseBodyArticlesMultimodalMedias> multimodalMedias;

        /**
         * <strong>example:</strong>
         * <p>2024-11-25 14:25:59</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        /**
         * <strong>example:</strong>
         * <p>新华社</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>文章摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <strong>example:</strong>
         * <p>文章标题</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p><a href="https://www.example.com/aaa.docx">https://www.example.com/aaa.docx</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static ListSearchTaskDialogueDatasResponseBodyArticles build(java.util.Map<String, ?> map) throws Exception {
            ListSearchTaskDialogueDatasResponseBodyArticles self = new ListSearchTaskDialogueDatasResponseBodyArticles();
            return TeaModel.build(map, self);
        }

        public ListSearchTaskDialogueDatasResponseBodyArticles setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public ListSearchTaskDialogueDatasResponseBodyArticles setCategoryUuid(String categoryUuid) {
            this.categoryUuid = categoryUuid;
            return this;
        }
        public String getCategoryUuid() {
            return this.categoryUuid;
        }

        public ListSearchTaskDialogueDatasResponseBodyArticles setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListSearchTaskDialogueDatasResponseBodyArticles setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public ListSearchTaskDialogueDatasResponseBodyArticles setDocType(String docType) {
            this.docType = docType;
            return this;
        }
        public String getDocType() {
            return this.docType;
        }

        public ListSearchTaskDialogueDatasResponseBodyArticles setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public ListSearchTaskDialogueDatasResponseBodyArticles setExtend1(String extend1) {
            this.extend1 = extend1;
            return this;
        }
        public String getExtend1() {
            return this.extend1;
        }

        public ListSearchTaskDialogueDatasResponseBodyArticles setExtend2(String extend2) {
            this.extend2 = extend2;
            return this;
        }
        public String getExtend2() {
            return this.extend2;
        }

        public ListSearchTaskDialogueDatasResponseBodyArticles setExtend3(String extend3) {
            this.extend3 = extend3;
            return this;
        }
        public String getExtend3() {
            return this.extend3;
        }

        public ListSearchTaskDialogueDatasResponseBodyArticles setMultimodalMedias(java.util.List<ListSearchTaskDialogueDatasResponseBodyArticlesMultimodalMedias> multimodalMedias) {
            this.multimodalMedias = multimodalMedias;
            return this;
        }
        public java.util.List<ListSearchTaskDialogueDatasResponseBodyArticlesMultimodalMedias> getMultimodalMedias() {
            return this.multimodalMedias;
        }

        public ListSearchTaskDialogueDatasResponseBodyArticles setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public ListSearchTaskDialogueDatasResponseBodyArticles setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListSearchTaskDialogueDatasResponseBodyArticles setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public ListSearchTaskDialogueDatasResponseBodyArticles setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListSearchTaskDialogueDatasResponseBodyArticles setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListSearchTaskDialogueDatasResponseBodyImages extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>图片或视频文件地址</p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <strong>example:</strong>
         * <p>多模态数据唯一标识</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <strong>example:</strong>
         * <p>多模态数据类型</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        public static ListSearchTaskDialogueDatasResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            ListSearchTaskDialogueDatasResponseBodyImages self = new ListSearchTaskDialogueDatasResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public ListSearchTaskDialogueDatasResponseBodyImages setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public ListSearchTaskDialogueDatasResponseBodyImages setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public ListSearchTaskDialogueDatasResponseBodyImages setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

    }

    public static class ListSearchTaskDialogueDatasResponseBodyVideos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>图片或视频文件地址</p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <strong>example:</strong>
         * <p>多模态数据唯一标识</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <strong>example:</strong>
         * <p>多模态数据类型</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        public static ListSearchTaskDialogueDatasResponseBodyVideos build(java.util.Map<String, ?> map) throws Exception {
            ListSearchTaskDialogueDatasResponseBodyVideos self = new ListSearchTaskDialogueDatasResponseBodyVideos();
            return TeaModel.build(map, self);
        }

        public ListSearchTaskDialogueDatasResponseBodyVideos setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public ListSearchTaskDialogueDatasResponseBodyVideos setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public ListSearchTaskDialogueDatasResponseBodyVideos setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

    }

}
