// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class EnrollAccountRequest extends TeaModel {
    /**
     * <p>The prefix for the account name.</p>
     * <ul>
     * <li><p>If you are creating a new resource account, this parameter is required.</p>
     * </li>
     * <li><p>If you are enrolling an existing account, this parameter is not required.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test-account</p>
     */
    @NameInMap("AccountNamePrefix")
    public String accountNamePrefix;

    /**
     * <p>The ID of the account to enroll.</p>
     * <ul>
     * <li><p>If you are creating a new resource account, this parameter is not required.</p>
     * </li>
     * <li><p>If you are enrolling an existing account, this parameter is required.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>12868156179****</p>
     */
    @NameInMap("AccountUid")
    public Long accountUid;

    /**
     * <p>The ID of the baseline. If you leave this parameter empty, the default baseline is used.</p>
     * 
     * <strong>example:</strong>
     * <p>afb-bp1durvn3lgqe28v****</p>
     */
    @NameInMap("BaselineId")
    public String baselineId;

    /**
     * <p>The baseline items.</p>
     * <p>If you specify this parameter, the baseline item configurations are merged with the configurations of the baseline specified by <code>BaselineId</code>. For duplicate baseline items, the configurations in this parameter take precedence. We recommend that you leave this parameter empty and use <code>BaselineId</code> to apply baseline configurations.</p>
     */
    @NameInMap("BaselineItems")
    public java.util.List<EnrollAccountRequestBaselineItems> baselineItems;

    /**
     * <p>The display name of the account.</p>
     * <ul>
     * <li><p>If you are creating a new resource account, this parameter is required.</p>
     * </li>
     * <li><p>If you are enrolling an existing account, this parameter is not required.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test-account</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The ID of the parent folder.</p>
     * <ul>
     * <li><p>If you are creating a new resource account and do not specify this parameter, the account is created in the Root folder.</p>
     * </li>
     * <li><p>If you are enrolling an existing account, this parameter is not required.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>fd-5ESoku****</p>
     */
    @NameInMap("FolderId")
    public String folderId;

    /**
     * <p>The ID of the billing account.</p>
     * <ul>
     * <li><p>If you are creating a new resource account and do not specify this parameter, the self-pay settlement method is used.</p>
     * </li>
     * <li><p>If you are enrolling an existing account, this parameter is not required.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>19534534552****</p>
     */
    @NameInMap("PayerAccountUid")
    public Long payerAccountUid;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The identity type of the member. Valid values:</p>
     * <ul>
     * <li><p>resell (default): The member is a reseller account. A reseller relationship is automatically established between the member and the reseller. The management account of the resource directory is used as the billing account of the member.</p>
     * </li>
     * <li><p>non_resell: The member is a non-reseller account. The member is not associated with a reseller and can directly purchase Alibaba Cloud resources. The member is used as its own billing account.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is available only for resellers at the international site (alibabacloud.com).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>resell</p>
     */
    @NameInMap("ResellAccountType")
    public String resellAccountType;

    /**
     * <p>The tags. You can specify up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<EnrollAccountRequestTag> tag;

    public static EnrollAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        EnrollAccountRequest self = new EnrollAccountRequest();
        return TeaModel.build(map, self);
    }

    public EnrollAccountRequest setAccountNamePrefix(String accountNamePrefix) {
        this.accountNamePrefix = accountNamePrefix;
        return this;
    }
    public String getAccountNamePrefix() {
        return this.accountNamePrefix;
    }

    public EnrollAccountRequest setAccountUid(Long accountUid) {
        this.accountUid = accountUid;
        return this;
    }
    public Long getAccountUid() {
        return this.accountUid;
    }

    public EnrollAccountRequest setBaselineId(String baselineId) {
        this.baselineId = baselineId;
        return this;
    }
    public String getBaselineId() {
        return this.baselineId;
    }

    public EnrollAccountRequest setBaselineItems(java.util.List<EnrollAccountRequestBaselineItems> baselineItems) {
        this.baselineItems = baselineItems;
        return this;
    }
    public java.util.List<EnrollAccountRequestBaselineItems> getBaselineItems() {
        return this.baselineItems;
    }

    public EnrollAccountRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public EnrollAccountRequest setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public EnrollAccountRequest setPayerAccountUid(Long payerAccountUid) {
        this.payerAccountUid = payerAccountUid;
        return this;
    }
    public Long getPayerAccountUid() {
        return this.payerAccountUid;
    }

    public EnrollAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EnrollAccountRequest setResellAccountType(String resellAccountType) {
        this.resellAccountType = resellAccountType;
        return this;
    }
    public String getResellAccountType() {
        return this.resellAccountType;
    }

    public EnrollAccountRequest setTag(java.util.List<EnrollAccountRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<EnrollAccountRequestTag> getTag() {
        return this.tag;
    }

    public static class EnrollAccountRequestBaselineItems extends TeaModel {
        /**
         * <p>The configurations of the baseline item.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Notifications\&quot;:[{\&quot;GroupKey\&quot;:\&quot;account_msg\&quot;,\&quot;Contacts\&quot;:[{\&quot;Name\&quot;:\&quot;aa\&quot;}],\&quot;PmsgStatus\&quot;:1,\&quot;EmailStatus\&quot;:1,\&quot;SmsStatus\&quot;:1}]}</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The name of the baseline item.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS-BP_ACCOUNT_FACTORY_VPC</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Specifies whether to skip the baseline item. Valid values:</p>
         * <ul>
         * <li><p>false (default): does not skip the baseline item.</p>
         * </li>
         * <li><p>true: skips the baseline item.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Skip")
        public Boolean skip;

        /**
         * <p>The version of the baseline item.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static EnrollAccountRequestBaselineItems build(java.util.Map<String, ?> map) throws Exception {
            EnrollAccountRequestBaselineItems self = new EnrollAccountRequestBaselineItems();
            return TeaModel.build(map, self);
        }

        public EnrollAccountRequestBaselineItems setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public EnrollAccountRequestBaselineItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public EnrollAccountRequestBaselineItems setSkip(Boolean skip) {
            this.skip = skip;
            return this;
        }
        public Boolean getSkip() {
            return this.skip;
        }

        public EnrollAccountRequestBaselineItems setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class EnrollAccountRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>tagKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>tagValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static EnrollAccountRequestTag build(java.util.Map<String, ?> map) throws Exception {
            EnrollAccountRequestTag self = new EnrollAccountRequestTag();
            return TeaModel.build(map, self);
        }

        public EnrollAccountRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public EnrollAccountRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
