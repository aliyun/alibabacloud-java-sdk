// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListHotNewsWithTypeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListHotNewsWithTypeResponseBodyData> data;

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
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListHotNewsWithTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHotNewsWithTypeResponseBody self = new ListHotNewsWithTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHotNewsWithTypeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHotNewsWithTypeResponseBody setData(java.util.List<ListHotNewsWithTypeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListHotNewsWithTypeResponseBodyData> getData() {
        return this.data;
    }

    public ListHotNewsWithTypeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListHotNewsWithTypeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHotNewsWithTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHotNewsWithTypeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListHotNewsWithTypeResponseBodyDataNews extends TeaModel {
        @NameInMap("Author")
        public String author;

        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        @NameInMap("ImageUrls")
        public java.util.List<String> imageUrls;

        /**
         * <strong>example:</strong>
         * <p>2023-04-11 06:14:07</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        @NameInMap("SearchSource")
        public String searchSource;

        @NameInMap("SearchSourceName")
        public String searchSourceName;

        @NameInMap("Source")
        public String source;

        @NameInMap("Summary")
        public String summary;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>2023-10-14 14:30:00</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxxxx/xxx">http://xxxxx/xxx</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static ListHotNewsWithTypeResponseBodyDataNews build(java.util.Map<String, ?> map) throws Exception {
            ListHotNewsWithTypeResponseBodyDataNews self = new ListHotNewsWithTypeResponseBodyDataNews();
            return TeaModel.build(map, self);
        }

        public ListHotNewsWithTypeResponseBodyDataNews setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public ListHotNewsWithTypeResponseBodyDataNews setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListHotNewsWithTypeResponseBodyDataNews setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public ListHotNewsWithTypeResponseBodyDataNews setImageUrls(java.util.List<String> imageUrls) {
            this.imageUrls = imageUrls;
            return this;
        }
        public java.util.List<String> getImageUrls() {
            return this.imageUrls;
        }

        public ListHotNewsWithTypeResponseBodyDataNews setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public ListHotNewsWithTypeResponseBodyDataNews setSearchSource(String searchSource) {
            this.searchSource = searchSource;
            return this;
        }
        public String getSearchSource() {
            return this.searchSource;
        }

        public ListHotNewsWithTypeResponseBodyDataNews setSearchSourceName(String searchSourceName) {
            this.searchSourceName = searchSourceName;
            return this;
        }
        public String getSearchSourceName() {
            return this.searchSourceName;
        }

        public ListHotNewsWithTypeResponseBodyDataNews setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListHotNewsWithTypeResponseBodyDataNews setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public ListHotNewsWithTypeResponseBodyDataNews setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListHotNewsWithTypeResponseBodyDataNews setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListHotNewsWithTypeResponseBodyDataNews setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListHotNewsWithTypeResponseBodyDataNews setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListHotNewsWithTypeResponseBodyData extends TeaModel {
        @NameInMap("News")
        public java.util.List<ListHotNewsWithTypeResponseBodyDataNews> news;

        /**
         * <strong>example:</strong>
         * <p>society</p>
         */
        @NameInMap("NewsType")
        public String newsType;

        @NameInMap("NewsTypeName")
        public String newsTypeName;

        /**
         * <strong>example:</strong>
         * <p>77</p>
         */
        @NameInMap("TotalPages")
        public Integer totalPages;

        public static ListHotNewsWithTypeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListHotNewsWithTypeResponseBodyData self = new ListHotNewsWithTypeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListHotNewsWithTypeResponseBodyData setNews(java.util.List<ListHotNewsWithTypeResponseBodyDataNews> news) {
            this.news = news;
            return this;
        }
        public java.util.List<ListHotNewsWithTypeResponseBodyDataNews> getNews() {
            return this.news;
        }

        public ListHotNewsWithTypeResponseBodyData setNewsType(String newsType) {
            this.newsType = newsType;
            return this;
        }
        public String getNewsType() {
            return this.newsType;
        }

        public ListHotNewsWithTypeResponseBodyData setNewsTypeName(String newsTypeName) {
            this.newsTypeName = newsTypeName;
            return this;
        }
        public String getNewsTypeName() {
            return this.newsTypeName;
        }

        public ListHotNewsWithTypeResponseBodyData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

}
