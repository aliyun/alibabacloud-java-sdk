// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAggregatorRequest extends TeaModel {
    /**
     * <p>The information about the member accounts in the account group. Example:</p>
     * <pre><code>[{
     *     &quot;accountId&quot;: 171322098523****,
     *     &quot;accountType&quot;:&quot;ResourceDirectory&quot;,
     *                 &quot;accountName&quot;:&quot;Alice&quot;
     * }, {
     *     &quot;accountId&quot;: 100532098349****,
     *     &quot;accountType&quot;:&quot;ResourceDirectory&quot;,
     *                 &quot;accountName&quot;:&quot;Tom&quot;
     * }]
     * </code></pre>
     * <blockquote>
     * <p> If <code>AggregatorType</code> is set to <code>RD</code> or <code>FOLDER</code>, this parameter can be left empty, which indicates that all accounts in the resource directory are added to the global account group.</p>
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
     * <p>Test_Group</p>
     */
    @NameInMap("AggregatorName")
    public String aggregatorName;

    /**
     * <p>The type of the account group. Valid values:</p>
     * <ul>
     * <li>RD: global account group.</li>
     * <li>FOLDER: account group of the folder.</li>
     * <li>CUSTOM (default): custom account group.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CUSTOM</p>
     */
    @NameInMap("AggregatorType")
    public String aggregatorType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <code>token</code> can contain only ASCII characters and cannot exceed 64 characters in length.</p>
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
     * <p>Aggregator description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the folder to which the account group is attached. You must specify this parameter if <code>AggregatorType</code> is set to <code>FOLDER</code>. Multiple resource folder IDs should be separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>fd-brHdgv****,fd-brHdgk****</p>
     */
    @NameInMap("FolderId")
    public String folderId;

    /**
     * <p>The tags of the resource.</p>
     * <p>You can add up to 20 tags to a resource.</p>
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
         * <p>The member account ID. For more information about how to obtain the ID of a member account, see <a href="https://help.aliyun.com/document_detail/160016.html">ListAccounts</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>171322098523****</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The name of the member account. For more information about how to obtain the name of a member account, see <a href="https://help.aliyun.com/document_detail/160016.html">ListAccounts</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The type of the member account. Set this parameter to ResourceDirectory.</p>
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
         * <p>The tag key of the resource. You can specify up to 20 tag keys.</p>
         * <p>The tag key cannot be an empty string. The tag key must be 1 to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs</code>:. The tag key cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>key-1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag values.</p>
         * <p>The tag values can be an empty string or up to 128 characters in length. The tag values cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>Each key-value must be unique. You can specify at most 20 tag values in each call.</p>
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
