// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListRiskCheckResultsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListRiskCheckResultsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>token-xxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BF76AA7C-2C1E-5C3F-B366-5EC07F9662DB</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListRiskCheckResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRiskCheckResultsResponseBody self = new ListRiskCheckResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRiskCheckResultsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRiskCheckResultsResponseBody setData(ListRiskCheckResultsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListRiskCheckResultsResponseBodyData getData() {
        return this.data;
    }

    public ListRiskCheckResultsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRiskCheckResultsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRiskCheckResultsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRiskCheckResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListRiskCheckResultsResponseBodyData extends TeaModel {
        @NameInMap("items")
        public java.util.List<RiskCheckResults> items;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("totalSize")
        public Integer totalSize;

        public static ListRiskCheckResultsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRiskCheckResultsResponseBodyData self = new ListRiskCheckResultsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRiskCheckResultsResponseBodyData setItems(java.util.List<RiskCheckResults> items) {
            this.items = items;
            return this;
        }
        public java.util.List<RiskCheckResults> getItems() {
            return this.items;
        }

        public ListRiskCheckResultsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListRiskCheckResultsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListRiskCheckResultsResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
