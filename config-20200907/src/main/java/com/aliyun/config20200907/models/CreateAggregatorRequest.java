// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAggregatorRequest extends TeaModel {
    /**
     * <p>The member accounts of the account group.</p>
     * <blockquote>
     * <ul>
     * <li><p>If you set <code>AggregatorType</code> to \`RD, you can leave this parameter empty. This indicates that all members in the resource directory are added to the global account group.</p>
     * </li>
     * <li><p>If you set <code>AggregatorType</code> to <code>FOLDER</code>, you can leave this parameter empty. This indicates that all members in a specific folder in the resource directory are added to the folder account group.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("AggregatorAccounts")
    public java.util.List<CreateAggregatorRequestAggregatorAccounts> aggregatorAccounts;

    /**
     * <p>The name of the account group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Example_Aggregator</p>
     */
    @NameInMap("AggregatorName")
    public String aggregatorName;

    /**
     * <p>The type of the account group. Valid values:</p>
     * <ul>
     * <li><p>RD: global account group.</p>
     * </li>
     * <li><p>FOLDER: folder account group. You must also set the <code>FolderId</code> parameter. For more information about how to obtain a folder ID, see <a href="https://help.aliyun.com/document_detail/160016.html">ListAccounts</a>.</p>
     * </li>
     * <li><p>CUSTOM (default): custom account group. You must also set the <code>AccountId</code> and <code>AccountType</code> parameters for <code>AggregatorAccounts</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CUSTOM</p>
     */
    @NameInMap("AggregatorType")
    public String aggregatorType;

    /**
     * <p>A client token that is used to ensure the idempotence of the request. You must make sure that the token is unique for different requests. The <code>ClientToken</code> parameter can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>1594295238-f9361358-5843-4294-8d30-b5183fac****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the account group.</p>
     * 
     * <strong>example:</strong>
     * <p>Example aggregator used to demonstrate how to create an aggregator.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the attached folder. You can specify multiple folder IDs. Separate the IDs with commas (,).</p>
     * <p>This parameter is required if you set <code>AggregatorType</code> to <code>FOLDER</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>fd-brHdgv****,fd-brHdgk****</p>
     */
    @NameInMap("FolderId")
    public String folderId;

    /**
     * <p>The tags of the resource.</p>
     * <p>You can attach a maximum of 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateAggregatorRequestTag> tag;

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

    public CreateAggregatorRequest setTag(java.util.List<CreateAggregatorRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateAggregatorRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateAggregatorRequestAggregatorAccounts extends TeaModel {
        /**
         * <p>The member ID. For more information about how to obtain the member ID, see <a href="https://help.aliyun.com/document_detail/160016.html">ListAccounts</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>171322098523****</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The member name. For more information about how to obtain the member name, see <a href="https://help.aliyun.com/document_detail/160016.html">ListAccounts</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The affiliation of the member. Only <code>ResourceDirectory</code> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>ResourceDirectory</p>
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

    public static class CreateAggregatorRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource. You can specify a maximum of 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>A tag key can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain http\:// or https\://.</p>
         * 
         * <strong>example:</strong>
         * <p>key-1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource. You can specify a maximum of 20 tag values. The tag value can be an empty string.</p>
         * <p>A tag value can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>value-1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateAggregatorRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateAggregatorRequestTag self = new CreateAggregatorRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateAggregatorRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAggregatorRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
