// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAggregatorRequest extends TeaModel {
    /**
     * <p>The type of the member account. Valid value: ResourceDirectory.</p>
     */
    @NameInMap("AggregatorAccounts")
    public java.util.List<CreateAggregatorRequestAggregatorAccounts> aggregatorAccounts;

    /**
     * <p>The name of the account group.</p>
     */
    @NameInMap("AggregatorName")
    public String aggregatorName;

    /**
     * <p>The type of the account group. Valid values:</p>
     * <br>
     * <p>*   RD: global account group</p>
     * <p>*   CUSTOM (default): custom account group</p>
     */
    @NameInMap("AggregatorType")
    public String aggregatorType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The `token` can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the account group.</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("FolderId")
    public String folderId;

    public static CreateAggregatorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAggregatorRequest self = new CreateAggregatorRequest();
        return TeaModel.build(map, self);
    }

    public CreateAggregatorRequest setAggregatorAccounts(java.util.List<CreateAggregatorRequestAggregatorAccounts> aggregatorAccounts) {
        this.aggregatorAccounts = aggregatorAccounts;
        return this;
    }
    public java.util.List<CreateAggregatorRequestAggregatorAccounts> getAggregatorAccounts() {
        return this.aggregatorAccounts;
    }

    public CreateAggregatorRequest setAggregatorName(String aggregatorName) {
        this.aggregatorName = aggregatorName;
        return this;
    }
    public String getAggregatorName() {
        return this.aggregatorName;
    }

    public CreateAggregatorRequest setAggregatorType(String aggregatorType) {
        this.aggregatorType = aggregatorType;
        return this;
    }
    public String getAggregatorType() {
        return this.aggregatorType;
    }

    public CreateAggregatorRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAggregatorRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAggregatorRequest setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public static class CreateAggregatorRequestAggregatorAccounts extends TeaModel {
        /**
         * <p>The Alibaba Cloud account ID of the member. For more information about how to obtain the ID of a member account, see [ListAccounts](~~160016~~).</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The name of the member account. For more information about how to obtain the name of a member account, see [ListAccounts](~~160016~~).</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The type of the member account. The value is fixed to ResourceDirectory.</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        public static CreateAggregatorRequestAggregatorAccounts build(java.util.Map<String, ?> map) throws Exception {
            CreateAggregatorRequestAggregatorAccounts self = new CreateAggregatorRequestAggregatorAccounts();
            return TeaModel.build(map, self);
        }

        public CreateAggregatorRequestAggregatorAccounts setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public CreateAggregatorRequestAggregatorAccounts setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public CreateAggregatorRequestAggregatorAccounts setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

    }

}
