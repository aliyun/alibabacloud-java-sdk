// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListWebReviewPointsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListWebReviewPointsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>79</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>下一页的token</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListWebReviewPointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWebReviewPointsResponseBody self = new ListWebReviewPointsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWebReviewPointsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListWebReviewPointsResponseBody setData(java.util.List<ListWebReviewPointsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListWebReviewPointsResponseBodyData> getData() {
        return this.data;
    }

    public ListWebReviewPointsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListWebReviewPointsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWebReviewPointsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListWebReviewPointsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWebReviewPointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWebReviewPointsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListWebReviewPointsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListWebReviewPointsResponseBodyDataComments extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>来源</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>评论内容</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <strong>example:</strong>
         * <p>标题</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>当前评论所属的URL</p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <strong>example:</strong>
         * <p>评论用户名</p>
         */
        @NameInMap("Username")
        public String username;

        public static ListWebReviewPointsResponseBodyDataComments build(java.util.Map<String, ?> map) throws Exception {
            ListWebReviewPointsResponseBodyDataComments self = new ListWebReviewPointsResponseBodyDataComments();
            return TeaModel.build(map, self);
        }

        public ListWebReviewPointsResponseBodyDataComments setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListWebReviewPointsResponseBodyDataComments setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public ListWebReviewPointsResponseBodyDataComments setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListWebReviewPointsResponseBodyDataComments setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public ListWebReviewPointsResponseBodyDataComments setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ListWebReviewPointsResponseBodyDataViewPointsOutlines extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>大纲</p>
         */
        @NameInMap("Outline")
        public String outline;

        /**
         * <strong>example:</strong>
         * <p>大纲摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        public static ListWebReviewPointsResponseBodyDataViewPointsOutlines build(java.util.Map<String, ?> map) throws Exception {
            ListWebReviewPointsResponseBodyDataViewPointsOutlines self = new ListWebReviewPointsResponseBodyDataViewPointsOutlines();
            return TeaModel.build(map, self);
        }

        public ListWebReviewPointsResponseBodyDataViewPointsOutlines setOutline(String outline) {
            this.outline = outline;
            return this;
        }
        public String getOutline() {
            return this.outline;
        }

        public ListWebReviewPointsResponseBodyDataViewPointsOutlines setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

    public static class ListWebReviewPointsResponseBodyDataViewPoints extends TeaModel {
        @NameInMap("Outlines")
        public java.util.List<ListWebReviewPointsResponseBodyDataViewPointsOutlines> outlines;

        /**
         * <strong>example:</strong>
         * <p>视角</p>
         */
        @NameInMap("Point")
        public String point;

        /**
         * <strong>example:</strong>
         * <p>摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        public static ListWebReviewPointsResponseBodyDataViewPoints build(java.util.Map<String, ?> map) throws Exception {
            ListWebReviewPointsResponseBodyDataViewPoints self = new ListWebReviewPointsResponseBodyDataViewPoints();
            return TeaModel.build(map, self);
        }

        public ListWebReviewPointsResponseBodyDataViewPoints setOutlines(java.util.List<ListWebReviewPointsResponseBodyDataViewPointsOutlines> outlines) {
            this.outlines = outlines;
            return this;
        }
        public java.util.List<ListWebReviewPointsResponseBodyDataViewPointsOutlines> getOutlines() {
            return this.outlines;
        }

        public ListWebReviewPointsResponseBodyDataViewPoints setPoint(String point) {
            this.point = point;
            return this;
        }
        public String getPoint() {
            return this.point;
        }

        public ListWebReviewPointsResponseBodyDataViewPoints setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

    public static class ListWebReviewPointsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>当前观点</p>
         */
        @NameInMap("Attitude")
        public String attitude;

        /**
         * <strong>example:</strong>
         * <p>观点类型</p>
         */
        @NameInMap("AttitudeType")
        public String attitudeType;

        @NameInMap("Comments")
        public java.util.List<ListWebReviewPointsResponseBodyDataComments> comments;

        /**
         * <strong>example:</strong>
         * <p>当前观点占比</p>
         */
        @NameInMap("Ratio")
        public String ratio;

        @NameInMap("ViewPoints")
        public java.util.List<ListWebReviewPointsResponseBodyDataViewPoints> viewPoints;

        public static ListWebReviewPointsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListWebReviewPointsResponseBodyData self = new ListWebReviewPointsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListWebReviewPointsResponseBodyData setAttitude(String attitude) {
            this.attitude = attitude;
            return this;
        }
        public String getAttitude() {
            return this.attitude;
        }

        public ListWebReviewPointsResponseBodyData setAttitudeType(String attitudeType) {
            this.attitudeType = attitudeType;
            return this;
        }
        public String getAttitudeType() {
            return this.attitudeType;
        }

        public ListWebReviewPointsResponseBodyData setComments(java.util.List<ListWebReviewPointsResponseBodyDataComments> comments) {
            this.comments = comments;
            return this;
        }
        public java.util.List<ListWebReviewPointsResponseBodyDataComments> getComments() {
            return this.comments;
        }

        public ListWebReviewPointsResponseBodyData setRatio(String ratio) {
            this.ratio = ratio;
            return this;
        }
        public String getRatio() {
            return this.ratio;
        }

        public ListWebReviewPointsResponseBodyData setViewPoints(java.util.List<ListWebReviewPointsResponseBodyDataViewPoints> viewPoints) {
            this.viewPoints = viewPoints;
            return this;
        }
        public java.util.List<ListWebReviewPointsResponseBodyDataViewPoints> getViewPoints() {
            return this.viewPoints;
        }

    }

}
