// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListFreshViewPointsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListFreshViewPointsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>94</p>
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
     * <p>26</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListFreshViewPointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFreshViewPointsResponseBody self = new ListFreshViewPointsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFreshViewPointsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListFreshViewPointsResponseBody setData(java.util.List<ListFreshViewPointsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListFreshViewPointsResponseBodyData> getData() {
        return this.data;
    }

    public ListFreshViewPointsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListFreshViewPointsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListFreshViewPointsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListFreshViewPointsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListFreshViewPointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFreshViewPointsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListFreshViewPointsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListFreshViewPointsResponseBodyDataOutlines extends TeaModel {
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

        public static ListFreshViewPointsResponseBodyDataOutlines build(java.util.Map<String, ?> map) throws Exception {
            ListFreshViewPointsResponseBodyDataOutlines self = new ListFreshViewPointsResponseBodyDataOutlines();
            return TeaModel.build(map, self);
        }

        public ListFreshViewPointsResponseBodyDataOutlines setOutline(String outline) {
            this.outline = outline;
            return this;
        }
        public String getOutline() {
            return this.outline;
        }

        public ListFreshViewPointsResponseBodyDataOutlines setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

    public static class ListFreshViewPointsResponseBodyData extends TeaModel {
        @NameInMap("Outlines")
        public java.util.List<ListFreshViewPointsResponseBodyDataOutlines> outlines;

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

        public static ListFreshViewPointsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFreshViewPointsResponseBodyData self = new ListFreshViewPointsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFreshViewPointsResponseBodyData setOutlines(java.util.List<ListFreshViewPointsResponseBodyDataOutlines> outlines) {
            this.outlines = outlines;
            return this;
        }
        public java.util.List<ListFreshViewPointsResponseBodyDataOutlines> getOutlines() {
            return this.outlines;
        }

        public ListFreshViewPointsResponseBodyData setPoint(String point) {
            this.point = point;
            return this;
        }
        public String getPoint() {
            return this.point;
        }

        public ListFreshViewPointsResponseBodyData setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

}
