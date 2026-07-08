// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListTimedViewAttitudeResponseBody extends TeaModel {
    /**
     * <p>Status Code</p>
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
    public java.util.List<ListTimedViewAttitudeResponseBodyData> data;

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
     * <p>15</p>
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
         * <p>outline</p>
         * 
         * <strong>example:</strong>
         * <p>大纲</p>
         */
        @NameInMap("Outline")
        public String outline;

        /**
         * <p>outline summary</p>
         * 
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
        /**
         * <p>outlines</p>
         */
        @NameInMap("Outlines")
        public java.util.List<ListTimedViewAttitudeResponseBodyDataViewPointsOutlines> outlines;

        /**
         * <p>generated point</p>
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
         * <p>current attitude</p>
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
         * <p>Published At</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-22 10:29</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        /**
         * <p>Proportion of the current attitude</p>
         * 
         * <strong>example:</strong>
         * <p>当前观点占比</p>
         */
        @NameInMap("Ratio")
        public String ratio;

        /**
         * <p>News Source</p>
         * 
         * <strong>example:</strong>
         * <p>新浪</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>Current attitude, equivalent to the news title</p>
         * 
         * <strong>example:</strong>
         * <p>标题</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>News URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com/news/1.html">http://www.example.com/news/1.html</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>List of topic perspectives</p>
         */
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
