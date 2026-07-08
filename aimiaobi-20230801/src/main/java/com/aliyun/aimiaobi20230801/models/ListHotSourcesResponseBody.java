// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListHotSourcesResponseBody extends TeaModel {
    /**
     * <p>Status code</p>
     * 
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Third-party source list</p>
     */
    @NameInMap("Data")
    public java.util.List<ListHotSourcesResponseBodyData> data;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Maximum number of results returned</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
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
     * <p>Next page token</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx</p>
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
     * <p>Total number of records</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListHotSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHotSourcesResponseBody self = new ListHotSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHotSourcesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHotSourcesResponseBody setData(java.util.List<ListHotSourcesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListHotSourcesResponseBodyData> getData() {
        return this.data;
    }

    public ListHotSourcesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListHotSourcesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListHotSourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHotSourcesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListHotSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHotSourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListHotSourcesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListHotSourcesResponseBodyData extends TeaModel {
        /**
         * <p>Hot ranking source description</p>
         * 
         * <strong>example:</strong>
         * <p>热榜源描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Whether to display in the console</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Show")
        public Boolean show;

        /**
         * <p>Sorting value</p>
         * 
         * <strong>example:</strong>
         * <p>86</p>
         */
        @NameInMap("Sort")
        public Integer sort;

        /**
         * <p>Hot ranking source identity</p>
         * 
         * <strong>example:</strong>
         * <p>热榜源标识</p>
         */
        @NameInMap("Source")
        public String source;

        public static ListHotSourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListHotSourcesResponseBodyData self = new ListHotSourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListHotSourcesResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListHotSourcesResponseBodyData setShow(Boolean show) {
            this.show = show;
            return this;
        }
        public Boolean getShow() {
            return this.show;
        }

        public ListHotSourcesResponseBodyData setSort(Integer sort) {
            this.sort = sort;
            return this;
        }
        public Integer getSort() {
            return this.sort;
        }

        public ListHotSourcesResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

}
