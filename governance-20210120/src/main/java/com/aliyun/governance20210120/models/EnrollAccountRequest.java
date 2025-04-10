// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class EnrollAccountRequest extends TeaModel {
    /**
     * <p>The prefix for the account name of the member.</p>
     * <ul>
     * <li>If the account baseline is applied to an account that is newly created, you must configure this parameter.</li>
     * <li>If the account baseline is applied to an existing account, you do not need to configure this parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test-account</p>
     */
    @NameInMap("AccountNamePrefix")
    public String accountNamePrefix;

    /**
     * <p>The account ID.</p>
     * <ul>
     * <li>If the account baseline is applied to an account that is newly created, you do not need to configure this parameter.</li>
     * <li>If the account baseline is applied to an existing account, you must configure this parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>12868156179****</p>
     */
    @NameInMap("AccountUid")
    public Long accountUid;

    /**
     * <p>The baseline ID.</p>
     * <p>If this parameter is left empty, the default baseline is used.</p>
     * 
     * <strong>example:</strong>
     * <p>afb-bp1durvn3lgqe28v****</p>
     */
    @NameInMap("BaselineId")
    public String baselineId;

    /**
     * <p>The array that contains baseline items.</p>
     * <p>If this parameter is specified, the configurations of the baseline items are merged with the baseline applied to the specified account. The configurations of the same baseline items are subject to the configurations of this parameter. We recommend that you leave this parameter empty and configure the <code>BaselineId</code> parameter to specify an account baseline and apply the configurations of the account baseline to the account.</p>
     */
    @NameInMap("BaselineItems")
    public java.util.List<EnrollAccountRequestBaselineItems> baselineItems;

    /**
     * <p>The display name of the account.</p>
     * <ul>
     * <li>If the account baseline is applied to an account that is newly created, you must configure this parameter.</li>
     * <li>If the account baseline is applied to an existing account, you do not need to configure this parameter.</li>
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
     * <li>If the account baseline is applied to an account that is newly created, you need to specify a parent folder. If you do not configure this parameter, the account is created in the Root folder.</li>
     * <li>If the account baseline is applied to an existing account, you do not need to configure this parameter.</li>
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
     * <li>If the account baseline is applied to an account that is newly created, you need to specify a billing account. If you do not configure this parameter, the self-pay settlement method is used for the account.</li>
     * <li>If the account baseline is applied to an existing account, you do not need to configure this parameter.</li>
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
     * <li>resell (default): The member is an account for a reseller. A relationship is automatically established between the member and the reseller. The management account of the resource directory must be used as the billing account of the member.</li>
     * <li>non_resell: The member is not an account for a reseller. The member is an account that is not associated with a reseller. You can directly use the account to purchase Alibaba Cloud resources. The member is used as its own billing account.</li>
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
         * <p>Whether to skip the baseline item. Valid values:</p>
         * <ul>
         * <li>false: The baseline item is not skipped.</li>
         * <li>true: The baseline item is skipped.</li>
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
