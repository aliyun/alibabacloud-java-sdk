// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListEventHouseRuntimesResponseBody extends TeaModel {
    /**
     * <p>The response code. Success indicates that the operation was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The runtime list result.</p>
     */
    @NameInMap("Data")
    public ListEventHouseRuntimesResponseBodyData data;

    /**
     * <p>The message returned by the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>Operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>34AD682D-5B91-5773-8132-AA38C130****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListEventHouseRuntimesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEventHouseRuntimesResponseBody self = new ListEventHouseRuntimesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEventHouseRuntimesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListEventHouseRuntimesResponseBody setData(ListEventHouseRuntimesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEventHouseRuntimesResponseBodyData getData() {
        return this.data;
    }

    public ListEventHouseRuntimesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEventHouseRuntimesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEventHouseRuntimesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListEventHouseRuntimesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The list of runtimes.</p>
         */
        @NameInMap("Runtimes")
        public java.util.List<EventHouseRuntime> runtimes;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListEventHouseRuntimesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEventHouseRuntimesResponseBodyData self = new ListEventHouseRuntimesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEventHouseRuntimesResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListEventHouseRuntimesResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListEventHouseRuntimesResponseBodyData setRuntimes(java.util.List<EventHouseRuntime> runtimes) {
            this.runtimes = runtimes;
            return this;
        }
        public java.util.List<EventHouseRuntime> getRuntimes() {
            return this.runtimes;
        }

        public ListEventHouseRuntimesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
