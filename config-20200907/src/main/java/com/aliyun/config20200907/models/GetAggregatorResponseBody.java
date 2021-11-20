// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregatorResponseBody extends TeaModel {
    @NameInMap("Aggregator")
    public GetAggregatorResponseBodyAggregator aggregator;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAggregatorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAggregatorResponseBody self = new GetAggregatorResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAggregatorResponseBody setAggregator(GetAggregatorResponseBodyAggregator aggregator) {
        this.aggregator = aggregator;
        return this;
    }
    public GetAggregatorResponseBodyAggregator getAggregator() {
        return this.aggregator;
    }

    public GetAggregatorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAggregatorResponseBodyAggregatorAggregatorAccounts extends TeaModel {
        @NameInMap("AccountId")
        public Long accountId;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("RecorderStatus")
        public String recorderStatus;

        public static GetAggregatorResponseBodyAggregatorAggregatorAccounts build(java.util.Map<String, ?> map) throws Exception {
            GetAggregatorResponseBodyAggregatorAggregatorAccounts self = new GetAggregatorResponseBodyAggregatorAggregatorAccounts();
            return TeaModel.build(map, self);
        }

        public GetAggregatorResponseBodyAggregatorAggregatorAccounts setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public GetAggregatorResponseBodyAggregatorAggregatorAccounts setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public GetAggregatorResponseBodyAggregatorAggregatorAccounts setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public GetAggregatorResponseBodyAggregatorAggregatorAccounts setRecorderStatus(String recorderStatus) {
            this.recorderStatus = recorderStatus;
            return this;
        }
        public String getRecorderStatus() {
            return this.recorderStatus;
        }

    }

    public static class GetAggregatorResponseBodyAggregator extends TeaModel {
        @NameInMap("AccountId")
        public Long accountId;

        @NameInMap("AggregatorAccountCount")
        public Long aggregatorAccountCount;

        @NameInMap("AggregatorAccounts")
        public java.util.List<GetAggregatorResponseBodyAggregatorAggregatorAccounts> aggregatorAccounts;

        @NameInMap("AggregatorCreateTimestamp")
        public String aggregatorCreateTimestamp;

        @NameInMap("AggregatorId")
        public String aggregatorId;

        @NameInMap("AggregatorName")
        public String aggregatorName;

        @NameInMap("AggregatorStatus")
        public Integer aggregatorStatus;

        @NameInMap("AggregatorType")
        public String aggregatorType;

        @NameInMap("Description")
        public String description;

        public static GetAggregatorResponseBodyAggregator build(java.util.Map<String, ?> map) throws Exception {
            GetAggregatorResponseBodyAggregator self = new GetAggregatorResponseBodyAggregator();
            return TeaModel.build(map, self);
        }

        public GetAggregatorResponseBodyAggregator setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public GetAggregatorResponseBodyAggregator setAggregatorAccountCount(Long aggregatorAccountCount) {
            this.aggregatorAccountCount = aggregatorAccountCount;
            return this;
        }
        public Long getAggregatorAccountCount() {
            return this.aggregatorAccountCount;
        }

        public GetAggregatorResponseBodyAggregator setAggregatorAccounts(java.util.List<GetAggregatorResponseBodyAggregatorAggregatorAccounts> aggregatorAccounts) {
            this.aggregatorAccounts = aggregatorAccounts;
            return this;
        }
        public java.util.List<GetAggregatorResponseBodyAggregatorAggregatorAccounts> getAggregatorAccounts() {
            return this.aggregatorAccounts;
        }

        public GetAggregatorResponseBodyAggregator setAggregatorCreateTimestamp(String aggregatorCreateTimestamp) {
            this.aggregatorCreateTimestamp = aggregatorCreateTimestamp;
            return this;
        }
        public String getAggregatorCreateTimestamp() {
            return this.aggregatorCreateTimestamp;
        }

        public GetAggregatorResponseBodyAggregator setAggregatorId(String aggregatorId) {
            this.aggregatorId = aggregatorId;
            return this;
        }
        public String getAggregatorId() {
            return this.aggregatorId;
        }

        public GetAggregatorResponseBodyAggregator setAggregatorName(String aggregatorName) {
            this.aggregatorName = aggregatorName;
            return this;
        }
        public String getAggregatorName() {
            return this.aggregatorName;
        }

        public GetAggregatorResponseBodyAggregator setAggregatorStatus(Integer aggregatorStatus) {
            this.aggregatorStatus = aggregatorStatus;
            return this;
        }
        public Integer getAggregatorStatus() {
            return this.aggregatorStatus;
        }

        public GetAggregatorResponseBodyAggregator setAggregatorType(String aggregatorType) {
            this.aggregatorType = aggregatorType;
            return this;
        }
        public String getAggregatorType() {
            return this.aggregatorType;
        }

        public GetAggregatorResponseBodyAggregator setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}
