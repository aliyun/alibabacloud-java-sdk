// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregatorResponseBody extends TeaModel {
    /**
     * <p>The details of the account group.</p>
     */
    @NameInMap("Aggregator")
    public GetAggregatorResponseBodyAggregator aggregator;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The ID of the member account.</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The name of the member account.</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The affiliation of the member account. The value is fixed to ResourceDirectory.</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>The status of the configuration recorder for the member account. Valid values:</p>
         * <br>
         * <p>*   REGISTRABLE: The configuration recorder has not been registered.</p>
         * <p>*   BUILDING: The configuration recorder is being deployed.</p>
         * <p>*   REGISTERED: The configuration recorder has been registered.</p>
         * <p>*   REBUILDING: The configuration recorder is being redeployed.</p>
         */
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
         * <p>The information about the member accounts in the account group.</p>
         */
        @NameInMap("AggregatorAccounts")
        public java.util.List<GetAggregatorResponseBodyAggregatorAggregatorAccounts> aggregatorAccounts;

        /**
         * <p>The timestamp when the account group was created.</p>
         */
        @NameInMap("AggregatorCreateTimestamp")
        public String aggregatorCreateTimestamp;

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
         * <p>*   0: The account group is being created.</p>
         * <p>*   1: The account group has been created.</p>
         */
        @NameInMap("AggregatorStatus")
        public Integer aggregatorStatus;

        /**
         * <p>The type of the account group. Valid values:</p>
         * <br>
         * <p>*   RD: global account group</p>
         * <p>*   CUSTOM: custom account group</p>
         */
        @NameInMap("AggregatorType")
        public String aggregatorType;

        /**
         * <p>The description of the account group.</p>
         */
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
