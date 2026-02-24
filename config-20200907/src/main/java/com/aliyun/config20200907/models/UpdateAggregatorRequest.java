// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateAggregatorRequest extends TeaModel {
    /**
     * <p>The members in the account group.</p>
     * <blockquote>
     * <p>You can leave this parameter empty to skip updating the member list. To update the member list, you must specify both <code>AccountId</code> and <code>AccountType</code>.</p>
     * </blockquote>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("AggregatorAccounts")
    public java.util.List<UpdateAggregatorRequestAggregatorAccounts> aggregatorAccounts;

    /**
     * <p>The ID of the account group.</p>
     * <p>For more information about how to obtain the ID of an account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-dacf86d8314e00eb****</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The name of the account group.</p>
     * <p>For more information about how to obtain the name of an account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Test_Group</p>
     */
    @NameInMap("AggregatorName")
    public String aggregatorName;

    /**
     * <p>A client token that ensures the idempotence of the request. Generate a unique token for each request. The token can contain only ASCII characters and must be no more than 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>1594295238-f9361358-5843-4294-8d30-b5183fac****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the account group.</p>
     * <p>For more information about how to obtain the description of an account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>测试组</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the folder. You can enter multiple folder IDs. Separate the IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>fd-brHdgv****,fd-brHdgk****</p>
     */
    @NameInMap("FolderId")
    public String folderId;

    /**
     * <p>The tags of the resource. This parameter is deprecated and no longer takes effect. Ignore this parameter.</p>
     * <p>You can attach up to 20 tags.</p>
     */
    @NameInMap("Tag")
    @Deprecated
    public java.util.List<UpdateAggregatorRequestTag> tag;

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

    public UpdateAggregatorRequest setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    @Deprecated
    public UpdateAggregatorRequest setTag(java.util.List<UpdateAggregatorRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<UpdateAggregatorRequestTag> getTag() {
        return this.tag;
    }

    public static class UpdateAggregatorRequestAggregatorAccounts extends TeaModel {
        /**
         * <p>The ID of the member.</p>
         * <p>For more information about how to obtain the ID of a member, see <a href="https://help.aliyun.com/document_detail/160016.html">ListAccounts</a>.</p>
         * <blockquote>
         * <p>To update the member list, you must specify both <code>AccountId</code> and <code>AccountType</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>173808452267****</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The name of the member.</p>
         * <p>For more information about how to obtain the name of a member, see <a href="https://help.aliyun.com/document_detail/160016.html">ListAccounts</a>.</p>
         * <blockquote>
         * <p>To update the member list, you must specify both <code>AccountId</code> and <code>AccountType</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Tony</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The affiliation of the member. Only ResourceDirectory is supported.</p>
         * <blockquote>
         * <p>To update the member list, you must specify both <code>AccountId</code> and <code>AccountType</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ResourceDirectory</p>
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

    public static class UpdateAggregatorRequestTag extends TeaModel {
        /**
         * <p>The key of the tag. A tag key cannot be an empty string.</p>
         * <p>The tag key can be up to 64 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>key-1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value can be up to 128 characters in length. It cannot start with <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>value-1</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateAggregatorRequestTag build(java.util.Map<String, ?> map) throws Exception {
            UpdateAggregatorRequestTag self = new UpdateAggregatorRequestTag();
            return TeaModel.build(map, self);
        }

        public UpdateAggregatorRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateAggregatorRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
