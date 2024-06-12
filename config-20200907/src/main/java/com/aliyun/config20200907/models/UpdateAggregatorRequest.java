// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateAggregatorRequest extends TeaModel {
    /**
     * <p>The information about the member accounts in the account group.</p>
     * <br>
     * <p>>  When you modify the configurations of an account group, this parameter can be left empty. In this case, the member account list is not updated. If you want to update the member account list, you must set the `AccountId`, `AccountName` and `AccountType` parameters.</p>
     */
    @NameInMap("AggregatorAccounts")
    public java.util.List<UpdateAggregatorRequestAggregatorAccounts> aggregatorAccounts;

    /**
     * <p>The ID of the account group.</p>
     * <br>
     * <p>For more information about how to obtain the ID of an account group, see [ListAggregators](https://help.aliyun.com/document_detail/255797.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The name of the account group.</p>
     * <br>
     * <p>For more information about how to obtain the name of an account group, see [ListAggregators](https://help.aliyun.com/document_detail/255797.html).</p>
     */
    @NameInMap("AggregatorName")
    public String aggregatorName;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the account group.</p>
     * <br>
     * <p>For more information about how to obtain the description of an account group, see [ListAggregators](https://help.aliyun.com/document_detail/255797.html).</p>
     */
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
        /**
         * <p>The member account ID, which indicates the Alibaba Cloud account ID of the member account.</p>
         * <br>
         * <p>For more information about how to obtain the ID of a member account, see [ListAccounts](https://help.aliyun.com/document_detail/160016.html).</p>
         * <br>
         * <p>>  If you want to update the member account list, you must set the `AccountId`, `AccountName` and `AccountType` parameters.</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The member account name, which indicates the name of the Alibaba Cloud account that corresponds to the member account.</p>
         * <br>
         * <p>For more information about how to obtain the name of a member account, see [ListAccounts](https://help.aliyun.com/document_detail/160016.html).</p>
         * <br>
         * <p>>  If you want to update the member account list, you must set the `AccountId`, `AccountName` and `AccountType` parameters.</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The affiliation of the member account. You can set this parameter to only ResourceDirectory.</p>
         * <br>
         * <p>>  If you want to update the member account list, you must set the `AccountId`, `AccountName` and `AccountType` parameters.</p>
         */
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
