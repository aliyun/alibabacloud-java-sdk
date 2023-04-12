// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregatorsResponseBody extends TeaModel {
    /**
     * <p>The account groups returned.</p>
     */
    @NameInMap("AggregatorsResult")
    public ListAggregatorsResponseBodyAggregatorsResult aggregatorsResult;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAggregatorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAggregatorsResponseBody self = new ListAggregatorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAggregatorsResponseBody setAggregatorsResult(ListAggregatorsResponseBodyAggregatorsResult aggregatorsResult) {
        this.aggregatorsResult = aggregatorsResult;
        return this;
    }
    public ListAggregatorsResponseBodyAggregatorsResult getAggregatorsResult() {
        return this.aggregatorsResult;
    }

    public ListAggregatorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAggregatorsResponseBodyAggregatorsResultAggregators extends TeaModel {
        /**
         * <p>The ID of the management account used to create the account group.</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The number of member accounts in the account group.</p>
         */
        @NameInMap("AggregatorAccountCount")
        public Long aggregatorAccountCount;

        /**
         * <p>The timestamp when the account group was created.</p>
         */
        @NameInMap("AggregatorCreateTimestamp")
        public Long aggregatorCreateTimestamp;

        /**
         * <p>The ID of the account group.</p>
         */
        @NameInMap("AggregatorId")
        public String aggregatorId;

        /**
         * <p>The name of the account group.</p>
         */
        @NameInMap("AggregatorName")
        public String aggregatorName;

        /**
         * <p>The status of the account group. Valid values:</p>
         * <br>
         * <p>*   0: being created.</p>
         * <p>*   1: created.</p>
         */
        @NameInMap("AggregatorStatus")
        public Integer aggregatorStatus;

        /**
         * <p>The type of the account group. Valid values:</p>
         * <br>
         * <p>*   RD: global account group.</p>
         * <p>*   CUSTOM: custom account group.</p>
         */
        @NameInMap("AggregatorType")
        public String aggregatorType;

        /**
         * <p>The description of the account group.</p>
         */
        @NameInMap("Description")
        public String description;

        public static ListAggregatorsResponseBodyAggregatorsResultAggregators build(java.util.Map<String, ?> map) throws Exception {
            ListAggregatorsResponseBodyAggregatorsResultAggregators self = new ListAggregatorsResponseBodyAggregatorsResultAggregators();
            return TeaModel.build(map, self);
        }

        public ListAggregatorsResponseBodyAggregatorsResultAggregators setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public ListAggregatorsResponseBodyAggregatorsResultAggregators setAggregatorAccountCount(Long aggregatorAccountCount) {
            this.aggregatorAccountCount = aggregatorAccountCount;
            return this;
        }
        public Long getAggregatorAccountCount() {
            return this.aggregatorAccountCount;
        }

        public ListAggregatorsResponseBodyAggregatorsResultAggregators setAggregatorCreateTimestamp(Long aggregatorCreateTimestamp) {
            this.aggregatorCreateTimestamp = aggregatorCreateTimestamp;
            return this;
        }
        public Long getAggregatorCreateTimestamp() {
            return this.aggregatorCreateTimestamp;
        }

        public ListAggregatorsResponseBodyAggregatorsResultAggregators setAggregatorId(String aggregatorId) {
            this.aggregatorId = aggregatorId;
            return this;
        }
        public String getAggregatorId() {
            return this.aggregatorId;
        }

        public ListAggregatorsResponseBodyAggregatorsResultAggregators setAggregatorName(String aggregatorName) {
            this.aggregatorName = aggregatorName;
            return this;
        }
        public String getAggregatorName() {
            return this.aggregatorName;
        }

        public ListAggregatorsResponseBodyAggregatorsResultAggregators setAggregatorStatus(Integer aggregatorStatus) {
            this.aggregatorStatus = aggregatorStatus;
            return this;
        }
        public Integer getAggregatorStatus() {
            return this.aggregatorStatus;
        }

        public ListAggregatorsResponseBodyAggregatorsResultAggregators setAggregatorType(String aggregatorType) {
            this.aggregatorType = aggregatorType;
            return this;
        }
        public String getAggregatorType() {
            return this.aggregatorType;
        }

        public ListAggregatorsResponseBodyAggregatorsResultAggregators setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class ListAggregatorsResponseBodyAggregatorsResult extends TeaModel {
        /**
         * <p>The information about the account groups.</p>
         */
        @NameInMap("Aggregators")
        public java.util.List<ListAggregatorsResponseBodyAggregatorsResultAggregators> aggregators;

        /**
         * <p>The token that is used to initiate the next request. If the response of the current request is truncated, this token is used to initiate another request and obtain the remaining entries.</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        public static ListAggregatorsResponseBodyAggregatorsResult build(java.util.Map<String, ?> map) throws Exception {
            ListAggregatorsResponseBodyAggregatorsResult self = new ListAggregatorsResponseBodyAggregatorsResult();
            return TeaModel.build(map, self);
        }

        public ListAggregatorsResponseBodyAggregatorsResult setAggregators(java.util.List<ListAggregatorsResponseBodyAggregatorsResultAggregators> aggregators) {
            this.aggregators = aggregators;
            return this;
        }
        public java.util.List<ListAggregatorsResponseBodyAggregatorsResultAggregators> getAggregators() {
            return this.aggregators;
        }

        public ListAggregatorsResponseBodyAggregatorsResult setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
