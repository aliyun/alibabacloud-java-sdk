// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SearchNewsResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Current")
    public Integer current;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<SearchNewsResponseBodyData> data;

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
     * <p>successful</p>
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
     * <p>The number of records on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <p>Indicates whether the request was successful. A value of \<code>true\\</code> indicates success and a value of \<code>false\\</code> indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static SearchNewsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchNewsResponseBody self = new SearchNewsResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchNewsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchNewsResponseBody setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public SearchNewsResponseBody setData(java.util.List<SearchNewsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SearchNewsResponseBodyData> getData() {
        return this.data;
    }

    public SearchNewsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SearchNewsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchNewsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchNewsResponseBody setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public SearchNewsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SearchNewsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class SearchNewsResponseBodyData extends TeaModel {
        /**
         * <p>The author of the article. This parameter may not be returned for some articles.</p>
         * 
         * <strong>example:</strong>
         * <p>作者</p>
         */
        @NameInMap("Author")
        public String author;

        /**
         * <p>The content of the article. This parameter is always returned.</p>
         * 
         * <strong>example:</strong>
         * <p>文章内容</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The unique ID of the internal document. This parameter is always returned.</p>
         * 
         * <strong>example:</strong>
         * <p>9a598b44c6444da5907b8ea68a5f82c4</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        /**
         * <p>The URLs of the images. This parameter is deprecated and is no longer returned. Do not use it.</p>
         */
        @NameInMap("ImageUrls")
        public java.util.List<String> imageUrls;

        /**
         * <p>The time when the article was published. This parameter is always returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-18 06:46:22</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        /**
         * <p>The ID of the internal search source. This parameter is always returned.</p>
         * 
         * <strong>example:</strong>
         * <p>QuarkCommonNews</p>
         */
        @NameInMap("SearchSource")
        public String searchSource;

        /**
         * <p>The name of the internal search source. This parameter is always returned.</p>
         * 
         * <strong>example:</strong>
         * <p>夸克检索</p>
         */
        @NameInMap("SearchSourceName")
        public String searchSourceName;

        /**
         * <p>The source of the article. This parameter may not be returned for some articles.</p>
         * 
         * <strong>example:</strong>
         * <p>央视网</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The summary of the article. This parameter may not be returned for some articles.</p>
         * 
         * <strong>example:</strong>
         * <p>文章摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <p>The tag of the article. This parameter may not be returned for some articles.</p>
         * 
         * <strong>example:</strong>
         * <p>文章标签</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The title of the article. This parameter is always returned.</p>
         * 
         * <strong>example:</strong>
         * <p>文章标题</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The time when the system was updated. This parameter is deprecated and is no longer returned. Do not use it.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-18 06:46:22</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The URL of the article. This parameter is always returned.</p>
         * 
         * <strong>example:</strong>
         * <p>文章URL</p>
         */
        @NameInMap("Url")
        public String url;

        public static SearchNewsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchNewsResponseBodyData self = new SearchNewsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchNewsResponseBodyData setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public SearchNewsResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SearchNewsResponseBodyData setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public SearchNewsResponseBodyData setImageUrls(java.util.List<String> imageUrls) {
            this.imageUrls = imageUrls;
            return this;
        }
        public java.util.List<String> getImageUrls() {
            return this.imageUrls;
        }

        public SearchNewsResponseBodyData setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public SearchNewsResponseBodyData setSearchSource(String searchSource) {
            this.searchSource = searchSource;
            return this;
        }
        public String getSearchSource() {
            return this.searchSource;
        }

        public SearchNewsResponseBodyData setSearchSourceName(String searchSourceName) {
            this.searchSourceName = searchSourceName;
            return this;
        }
        public String getSearchSourceName() {
            return this.searchSourceName;
        }

        public SearchNewsResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public SearchNewsResponseBodyData setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public SearchNewsResponseBodyData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public SearchNewsResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public SearchNewsResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public SearchNewsResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
