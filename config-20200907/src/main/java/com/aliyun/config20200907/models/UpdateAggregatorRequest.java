// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateAggregatorRequest extends TeaModel {
    @NameInMap("AggregatorAccounts")
    public java.util.List<UpdateAggregatorRequestAggregatorAccounts> aggregatorAccounts;

    @NameInMap("AggregatorId")
    public String aggregatorId;

    @NameInMap("AggregatorName")
    public String aggregatorName;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    public static UpdateAggregatorRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAggregatorRequest self = new UpdateAggregatorRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAggregatorRequest setAggregatorAccounts(java.util.List<UpdateAggregatorRequestAggregatorAccounts> aggregatorAccounts) {
        this.aggregatorAccounts = aggregatorAccounts;
        return this;
    }
    public java.util.List<UpdateAggregatorRequestAggregatorAccounts> getAggregatorAccounts() {
        return this.aggregatorAccounts;
    }

    public UpdateAggregatorRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public UpdateAggregatorRequest setAggregatorName(String aggregatorName) {
        this.aggregatorName = aggregatorName;
        return this;
    }
    public String getAggregatorName() {
        return this.aggregatorName;
    }

    public UpdateAggregatorRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateAggregatorRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public static class UpdateAggregatorRequestAggregatorAccounts extends TeaModel {
        @NameInMap("AccountId")
        public Long accountId;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("AccountType")
        public String accountType;

        public static UpdateAggregatorRequestAggregatorAccounts build(java.util.Map<String, ?> map) throws Exception {
            UpdateAggregatorRequestAggregatorAccounts self = new UpdateAggregatorRequestAggregatorAccounts();
            return TeaModel.build(map, self);
        }

        public UpdateAggregatorRequestAggregatorAccounts setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public UpdateAggregatorRequestAggregatorAccounts setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public UpdateAggregatorRequestAggregatorAccounts setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

    }

}
