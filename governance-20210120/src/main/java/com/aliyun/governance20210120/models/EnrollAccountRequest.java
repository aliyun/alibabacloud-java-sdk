// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class EnrollAccountRequest extends TeaModel {
    /**
     * <p>The prefix for the account name of the member.</p>
     * <br>
     * <p>*   If the account baseline is applied to an account that is newly created, you must configure this parameter.</p>
     * <p>*   If the account baseline is applied to an existing account, you do not need to configure this parameter.</p>
     */
    @NameInMap("AccountNamePrefix")
    public String accountNamePrefix;

    /**
     * <p>The account ID.</p>
     * <br>
     * <p>*   If the account baseline is applied to an account that is newly created, you do not need to configure this parameter.</p>
     * <p>*   If the account baseline is applied to an existing account, you must configure this parameter.</p>
     */
    @NameInMap("AccountUid")
    public Long accountUid;

    /**
     * <p>The baseline ID.</p>
     * <br>
     * <p>If this parameter is left empty, the default baseline is used.</p>
     */
    @NameInMap("BaselineId")
    public String baselineId;

    /**
     * <p>An array that contains baseline items.</p>
     * <br>
     * <p>If this parameter is specified, the configurations of the baseline items are merged with the baseline of the specified account. The configurations of the same baseline items are subject to the configuration of this parameter. We recommend that you leave this parameter empty and configure the `BaselineId` parameter to specify an account baseline and apply the configuration of the account baseline to the account.</p>
     */
    @NameInMap("BaselineItems")
    public java.util.List<EnrollAccountRequestBaselineItems> baselineItems;

    /**
     * <p>The display name of the account.</p>
     * <br>
     * <p>*   If the account baseline is applied to an account that is newly created, you must configure this parameter.</p>
     * <p>*   If the account baseline is applied to an existing account, you do not need to configure this parameter.</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The ID of the parent folder.</p>
     * <br>
     * <p>*   If the account baseline is applied to an account that is newly created, you need to specify a parent folder. If you do not configure this parameter, the account is created in the Root folder.</p>
     * <p>*   If the account baseline is applied to an existing account, you do not need to configure this parameter.</p>
     */
    @NameInMap("FolderId")
    public String folderId;

    /**
     * <p>The ID of the billing account.</p>
     * <br>
     * <p>*   If the account baseline is applied to an account that is newly created, you need to specify a billing account. If you do not configure this parameter, the self-pay settlement method is used for the account.</p>
     * <p>*   If the account baseline is applied to an existing account, you do not need to configure this parameter.</p>
     */
    @NameInMap("PayerAccountUid")
    public Long payerAccountUid;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The identity type of the member. Valid values:</p>
     * <br>
     * <p>*   resell (default): The member is an account for a reseller. A relationship is automatically established between the member and the reseller. The management account of the resource directory must be used as the billing account of the member.</p>
     * <p>*   non_resell: The member is not an account for a reseller. The member is an account that is not associated with a reseller. You can directly use the account to purchase Alibaba Cloud resources. The member is used as its own billing account.</p>
     * <br>
     * <p>> This parameter is available only for resellers at the international site (alibabacloud.com).</p>
     */
    @NameInMap("ResellAccountType")
    public String resellAccountType;

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

    public static class EnrollAccountRequestBaselineItems extends TeaModel {
        /**
         * <p>The configurations of the baseline item.</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The name of the baseline item.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Specifies whether to skip the baseline item. Valid values:</p>
         * <br>
         * <p>*   false: The baseline item is not skipped.</p>
         * <p>*   true: The baseline item is skipped.</p>
         */
        @NameInMap("Skip")
        public Boolean skip;

        /**
         * <p>The version of the baseline item.</p>
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

}
