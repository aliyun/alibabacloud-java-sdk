// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListTimedViewAttitudeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListTimedViewAttitudeResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>15</p>
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
     * <p>58</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTimedViewAttitudeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTimedViewAttitudeResponseBody self = new ListTimedViewAttitudeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTimedViewAttitudeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTimedViewAttitudeResponseBody setData(java.util.List<ListTimedViewAttitudeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListTimedViewAttitudeResponseBodyData> getData() {
        return this.data;
    }

    public ListTimedViewAttitudeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTimedViewAttitudeResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTimedViewAttitudeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTimedViewAttitudeResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTimedViewAttitudeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTimedViewAttitudeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTimedViewAttitudeResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTimedViewAttitudeResponseBodyDataViewPointsOutlines extends TeaModel {
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

        public static ListTimedViewAttitudeResponseBodyDataViewPointsOutlines build(java.util.Map<String, ?> map) throws Exception {
            ListTimedViewAttitudeResponseBodyDataViewPointsOutlines self = new ListTimedViewAttitudeResponseBodyDataViewPointsOutlines();
            return TeaModel.build(map, self);
        }

        public ListTimedViewAttitudeResponseBodyDataViewPointsOutlines setOutline(String outline) {
            this.outline = outline;
            return this;
        }
        public String getOutline() {
            return this.outline;
        }

        public ListTimedViewAttitudeResponseBodyDataViewPointsOutlines setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

    public static class ListTimedViewAttitudeResponseBodyDataViewPoints extends TeaModel {
        @NameInMap("Outlines")
        public java.util.List<ListTimedViewAttitudeResponseBodyDataViewPointsOutlines> outlines;

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

        public static ListTimedViewAttitudeResponseBodyDataViewPoints build(java.util.Map<String, ?> map) throws Exception {
            ListTimedViewAttitudeResponseBodyDataViewPoints self = new ListTimedViewAttitudeResponseBodyDataViewPoints();
            return TeaModel.build(map, self);
        }

        public ListTimedViewAttitudeResponseBodyDataViewPoints setOutlines(java.util.List<ListTimedViewAttitudeResponseBodyDataViewPointsOutlines> outlines) {
            this.outlines = outlines;
            return this;
        }
        public java.util.List<ListTimedViewAttitudeResponseBodyDataViewPointsOutlines> getOutlines() {
            return this.outlines;
        }

        public ListTimedViewAttitudeResponseBodyDataViewPoints setPoint(String point) {
            this.point = point;
            return this;
        }
        public String getPoint() {
            return this.point;
        }

        public ListTimedViewAttitudeResponseBodyDataViewPoints setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

    public static class ListTimedViewAttitudeResponseBodyData extends TeaModel {
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

        /**
         * <strong>example:</strong>
         * <p>2024-01-22 10:29</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        /**
         * <strong>example:</strong>
         * <p>当前观点占比</p>
         */
        @NameInMap("Ratio")
        public String ratio;

        /**
         * <strong>example:</strong>
         * <p>新浪</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>标题</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.example.com/news/1.html">http://www.example.com/news/1.html</a></p>
         */
        @NameInMap("Url")
        public String url;

        @NameInMap("ViewPoints")
        public java.util.List<ListTimedViewAttitudeResponseBodyDataViewPoints> viewPoints;

        public static ListTimedViewAttitudeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTimedViewAttitudeResponseBodyData self = new ListTimedViewAttitudeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTimedViewAttitudeResponseBodyData setAttitude(String attitude) {
            this.attitude = attitude;
            return this;
        }
        public String getAttitude() {
            return this.attitude;
        }

        public ListTimedViewAttitudeResponseBodyData setAttitudeType(String attitudeType) {
            this.attitudeType = attitudeType;
            return this;
        }
        public String getAttitudeType() {
            return this.attitudeType;
        }

        public ListTimedViewAttitudeResponseBodyData setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public ListTimedViewAttitudeResponseBodyData setRatio(String ratio) {
            this.ratio = ratio;
            return this;
        }
        public String getRatio() {
            return this.ratio;
        }

        public ListTimedViewAttitudeResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListTimedViewAttitudeResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListTimedViewAttitudeResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public ListTimedViewAttitudeResponseBodyData setViewPoints(java.util.List<ListTimedViewAttitudeResponseBodyDataViewPoints> viewPoints) {
            this.viewPoints = viewPoints;
            return this;
        }
        public java.util.List<ListTimedViewAttitudeResponseBodyDataViewPoints> getViewPoints() {
            return this.viewPoints;
        }

    }

}
