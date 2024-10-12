// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class EnrollAccountShrinkRequest extends TeaModel {
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
     * <p>An array that contains baseline items.</p>
     * <p>If this parameter is specified, the configurations of the baseline items are merged with the baseline of the specified account. The configurations of the same baseline items are subject to the configuration of this parameter. We recommend that you leave this parameter empty and configure the <code>BaselineId</code> parameter to specify an account baseline and apply the configuration of the account baseline to the account.</p>
     */
    @NameInMap("BaselineItems")
    public java.util.List<EnrollAccountShrinkRequestBaselineItems> baselineItems;

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

    @NameInMap("Tag")
    public String tagShrink;

    public static EnrollAccountShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        EnrollAccountShrinkRequest self = new EnrollAccountShrinkRequest();
        return TeaModel.build(map, self);
    }

    public EnrollAccountShrinkRequest setAccountNamePrefix(String accountNamePrefix) {
        this.accountNamePrefix = accountNamePrefix;
        return this;
    }
    public String getAccountNamePrefix() {
        return this.accountNamePrefix;
    }

    public EnrollAccountShrinkRequest setAccountUid(Long accountUid) {
        this.accountUid = accountUid;
        return this;
    }
    public Long getAccountUid() {
        return this.accountUid;
    }

    public EnrollAccountShrinkRequest setBaselineId(String baselineId) {
        this.baselineId = baselineId;
        return this;
    }
    public String getBaselineId() {
        return this.baselineId;
    }

    public EnrollAccountShrinkRequest setBaselineItems(java.util.List<EnrollAccountShrinkRequestBaselineItems> baselineItems) {
        this.baselineItems = baselineItems;
        return this;
    }
    public java.util.List<EnrollAccountShrinkRequestBaselineItems> getBaselineItems() {
        return this.baselineItems;
    }

    public EnrollAccountShrinkRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public EnrollAccountShrinkRequest setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public EnrollAccountShrinkRequest setPayerAccountUid(Long payerAccountUid) {
        this.payerAccountUid = payerAccountUid;
        return this;
    }
    public Long getPayerAccountUid() {
        return this.payerAccountUid;
    }

    public EnrollAccountShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EnrollAccountShrinkRequest setResellAccountType(String resellAccountType) {
        this.resellAccountType = resellAccountType;
        return this;
    }
    public String getResellAccountType() {
        return this.resellAccountType;
    }

    public EnrollAccountShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

    public static class EnrollAccountShrinkRequestBaselineItems extends TeaModel {
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

        public static EnrollAccountShrinkRequestBaselineItems build(java.util.Map<String, ?> map) throws Exception {
            EnrollAccountShrinkRequestBaselineItems self = new EnrollAccountShrinkRequestBaselineItems();
            return TeaModel.build(map, self);
        }

        public EnrollAccountShrinkRequestBaselineItems setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public EnrollAccountShrinkRequestBaselineItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public EnrollAccountShrinkRequestBaselineItems setSkip(Boolean skip) {
            this.skip = skip;
            return this;
        }
        public Boolean getSkip() {
            return this.skip;
        }

        public EnrollAccountShrinkRequestBaselineItems setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
