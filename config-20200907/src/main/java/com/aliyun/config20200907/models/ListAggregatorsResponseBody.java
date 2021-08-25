// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregatorsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AggregatorsResult")
    public ListAggregatorsResponseBodyAggregatorsResult aggregatorsResult;

    public static ListAggregatorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAggregatorsResponseBody self = new ListAggregatorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAggregatorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAggregatorsResponseBody setAggregatorsResult(ListAggregatorsResponseBodyAggregatorsResult aggregatorsResult) {
        this.aggregatorsResult = aggregatorsResult;
        return this;
    }
    public ListAggregatorsResponseBodyAggregatorsResult getAggregatorsResult() {
        return this.aggregatorsResult;
    }

    public static class ListAggregatorsResponseBodyAggregatorsResultAggregators extends TeaModel {
        @NameInMap("AggregatorCreateTimestamp")
        public Long aggregatorCreateTimestamp;

        @NameInMap("AggregatorAccountCount")
        public Long aggregatorAccountCount;

        @NameInMap("Description")
        public String description;

        @NameInMap("AggregatorName")
        public String aggregatorName;

        @NameInMap("AggregatorStatus")
        public Integer aggregatorStatus;

        @NameInMap("AggregatorType")
        public String aggregatorType;

        @NameInMap("AccountId")
        public Long accountId;

        @NameInMap("AggregatorId")
        public String aggregatorId;

        public static ListAggregatorsResponseBodyAggregatorsResultAggregators build(java.util.Map<String, ?> map) throws Exception {
            ListAggregatorsResponseBodyAggregatorsResultAggregators self = new ListAggregatorsResponseBodyAggregatorsResultAggregators();
            return TeaModel.build(map, self);
        }

        public ListAggregatorsResponseBodyAggregatorsResultAggregators setAggregatorCreateTimestamp(Long aggregatorCreateTimestamp) {
            this.aggregatorCreateTimestamp = aggregatorCreateTimestamp;
            return this;
        }
        public Long getAggregatorCreateTimestamp() {
            return this.aggregatorCreateTimestamp;
        }

        public ListAggregatorsResponseBodyAggregatorsResultAggregators setAggregatorAccountCount(Long aggregatorAccountCount) {
            this.aggregatorAccountCount = aggregatorAccountCount;
            return this;
        }
        public Long getAggregatorAccountCount() {
            return this.aggregatorAccountCount;
        }

        public ListAggregatorsResponseBodyAggregatorsResultAggregators setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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

        public ListAggregatorsResponseBodyAggregatorsResultAggregators setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public ListAggregatorsResponseBodyAggregatorsResultAggregators setAggregatorId(String aggregatorId) {
            this.aggregatorId = aggregatorId;
            return this;
        }
        public String getAggregatorId() {
            return this.aggregatorId;
        }

    }

    public static class ListAggregatorsResponseBodyAggregatorsResult extends TeaModel {
        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("Aggregators")
        public java.util.List<ListAggregatorsResponseBodyAggregatorsResultAggregators> aggregators;

        public static ListAggregatorsResponseBodyAggregatorsResult build(java.util.Map<String, ?> map) throws Exception {
            ListAggregatorsResponseBodyAggregatorsResult self = new ListAggregatorsResponseBodyAggregatorsResult();
            return TeaModel.build(map, self);
        }

        public ListAggregatorsResponseBodyAggregatorsResult setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListAggregatorsResponseBodyAggregatorsResult setAggregators(java.util.List<ListAggregatorsResponseBodyAggregatorsResultAggregators> aggregators) {
            this.aggregators = aggregators;
            return this;
        }
        public java.util.List<ListAggregatorsResponseBodyAggregatorsResultAggregators> getAggregators() {
            return this.aggregators;
        }

    }

}
