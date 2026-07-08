// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListHotViewPointsResponseBody extends TeaModel {
    /**
     * <p>Status code</p>
     * 
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Business Data</p>
     */
    @NameInMap("Data")
    public java.util.List<ListHotViewPointsResponseBodyData> data;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Maximum number of return results</p>
     * 
     * <strong>example:</strong>
     * <p>67</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Fault description</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Token for the next page</p>
     * 
     * <strong>example:</strong>
     * <p>下一页的token</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Request UUID</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation succeeded: true for success, false for failure</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Total count</p>
     * 
     * <strong>example:</strong>
     * <p>70</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListHotViewPointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHotViewPointsResponseBody self = new ListHotViewPointsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHotViewPointsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHotViewPointsResponseBody setData(java.util.List<ListHotViewPointsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListHotViewPointsResponseBodyData> getData() {
        return this.data;
    }

    public ListHotViewPointsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListHotViewPointsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListHotViewPointsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHotViewPointsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListHotViewPointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHotViewPointsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListHotViewPointsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListHotViewPointsResponseBodyDataNews extends TeaModel {
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
         * <p>External UUID of the article</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx</p>
         */
        @NameInMap("DocId")
        public String docId;

        /**
         * <p>Unique ID of the article</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        /**
         * <p>URLs of article images</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.example.com/aaa.png">https://www.example.com/aaa.png</a></p>
         */
        @NameInMap("ImageUrls")
        public java.util.List<String> imageUrls;

        /**
         * <p>Published At. Format: YYYY-MM-dd HH:mm:ss</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-22 10:29:00</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        /**
         * <p>Source</p>
         * 
         * <strong>example:</strong>
         * <p>新浪</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>summary</p>
         * 
         * <strong>example:</strong>
         * <p>文章摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <p>tags</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;标签1&quot;,&quot;标签2&quot;]</p>
         */
        @NameInMap("Tags")
        public java.util.List<String> tags;

        /**
         * <p>title</p>
         * 
         * <strong>example:</strong>
         * <p>文章标题</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>topic</p>
         * 
         * <strong>example:</strong>
         * <p>文章主题</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>Article URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.example.com/aaa.docx">https://www.example.com/aaa.docx</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static ListHotViewPointsResponseBodyDataNews build(java.util.Map<String, ?> map) throws Exception {
            ListHotViewPointsResponseBodyDataNews self = new ListHotViewPointsResponseBodyDataNews();
            return TeaModel.build(map, self);
        }

        public ListHotViewPointsResponseBodyDataNews setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public ListHotViewPointsResponseBodyDataNews setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListHotViewPointsResponseBodyDataNews setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public ListHotViewPointsResponseBodyDataNews setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public ListHotViewPointsResponseBodyDataNews setImageUrls(java.util.List<String> imageUrls) {
            this.imageUrls = imageUrls;
            return this;
        }
        public java.util.List<String> getImageUrls() {
            return this.imageUrls;
        }

        public ListHotViewPointsResponseBodyDataNews setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public ListHotViewPointsResponseBodyDataNews setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListHotViewPointsResponseBodyDataNews setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public ListHotViewPointsResponseBodyDataNews setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public ListHotViewPointsResponseBodyDataNews setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListHotViewPointsResponseBodyDataNews setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public ListHotViewPointsResponseBodyDataNews setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListHotViewPointsResponseBodyDataViewPointsOutlines extends TeaModel {
        /**
         * <p>Outline</p>
         * 
         * <strong>example:</strong>
         * <p>大纲</p>
         */
        @NameInMap("Outline")
        public String outline;

        /**
         * <p>Outline summary</p>
         * 
         * <strong>example:</strong>
         * <p>大纲摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        public static ListHotViewPointsResponseBodyDataViewPointsOutlines build(java.util.Map<String, ?> map) throws Exception {
            ListHotViewPointsResponseBodyDataViewPointsOutlines self = new ListHotViewPointsResponseBodyDataViewPointsOutlines();
            return TeaModel.build(map, self);
        }

        public ListHotViewPointsResponseBodyDataViewPointsOutlines setOutline(String outline) {
            this.outline = outline;
            return this;
        }
        public String getOutline() {
            return this.outline;
        }

        public ListHotViewPointsResponseBodyDataViewPointsOutlines setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

    public static class ListHotViewPointsResponseBodyDataViewPoints extends TeaModel {
        /**
         * <p>Outline</p>
         */
        @NameInMap("Outlines")
        public java.util.List<ListHotViewPointsResponseBodyDataViewPointsOutlines> outlines;

        /**
         * <p>Generated point</p>
         * 
         * <strong>example:</strong>
         * <p>视角</p>
         */
        @NameInMap("Point")
        public String point;

        /**
         * <p>Summary</p>
         * 
         * <strong>example:</strong>
         * <p>摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        public static ListHotViewPointsResponseBodyDataViewPoints build(java.util.Map<String, ?> map) throws Exception {
            ListHotViewPointsResponseBodyDataViewPoints self = new ListHotViewPointsResponseBodyDataViewPoints();
            return TeaModel.build(map, self);
        }

        public ListHotViewPointsResponseBodyDataViewPoints setOutlines(java.util.List<ListHotViewPointsResponseBodyDataViewPointsOutlines> outlines) {
            this.outlines = outlines;
            return this;
        }
        public java.util.List<ListHotViewPointsResponseBodyDataViewPointsOutlines> getOutlines() {
            return this.outlines;
        }

        public ListHotViewPointsResponseBodyDataViewPoints setPoint(String point) {
            this.point = point;
            return this;
        }
        public String getPoint() {
            return this.point;
        }

        public ListHotViewPointsResponseBodyDataViewPoints setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

    public static class ListHotViewPointsResponseBodyData extends TeaModel {
        /**
         * <p>Current viewpoint</p>
         * 
         * <strong>example:</strong>
         * <p>当前观点</p>
         */
        @NameInMap("Attitude")
        public String attitude;

        /**
         * <p>Attitude Type</p>
         * 
         * <strong>example:</strong>
         * <p>观点类型</p>
         */
        @NameInMap("AttitudeType")
        public String attitudeType;

        /**
         * <p>List of related news articles</p>
         */
        @NameInMap("News")
        public java.util.List<ListHotViewPointsResponseBodyDataNews> news;

        /**
         * <p>Current viewpoint ratio</p>
         * 
         * <strong>example:</strong>
         * <p>当前观点占比</p>
         */
        @NameInMap("Ratio")
        public String ratio;

        /**
         * <p>List of topic viewpoints</p>
         */
        @NameInMap("ViewPoints")
        public java.util.List<ListHotViewPointsResponseBodyDataViewPoints> viewPoints;

        public static ListHotViewPointsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListHotViewPointsResponseBodyData self = new ListHotViewPointsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListHotViewPointsResponseBodyData setAttitude(String attitude) {
            this.attitude = attitude;
            return this;
        }
        public String getAttitude() {
            return this.attitude;
        }

        public ListHotViewPointsResponseBodyData setAttitudeType(String attitudeType) {
            this.attitudeType = attitudeType;
            return this;
        }
        public String getAttitudeType() {
            return this.attitudeType;
        }

        public ListHotViewPointsResponseBodyData setNews(java.util.List<ListHotViewPointsResponseBodyDataNews> news) {
            this.news = news;
            return this;
        }
        public java.util.List<ListHotViewPointsResponseBodyDataNews> getNews() {
            return this.news;
        }

        public ListHotViewPointsResponseBodyData setRatio(String ratio) {
            this.ratio = ratio;
            return this;
        }
        public String getRatio() {
            return this.ratio;
        }

        public ListHotViewPointsResponseBodyData setViewPoints(java.util.List<ListHotViewPointsResponseBodyDataViewPoints> viewPoints) {
            this.viewPoints = viewPoints;
            return this;
        }
        public java.util.List<ListHotViewPointsResponseBodyDataViewPoints> getViewPoints() {
            return this.viewPoints;
        }

    }

}
