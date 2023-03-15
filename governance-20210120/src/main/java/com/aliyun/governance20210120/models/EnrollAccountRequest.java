// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class EnrollAccountRequest extends TeaModel {
    @NameInMap("AccountNamePrefix")
    public String accountNamePrefix;

    @NameInMap("AccountUid")
    public Long accountUid;

    @NameInMap("BaselineId")
    public String baselineId;

    @NameInMap("BaselineItems")
    public java.util.List<EnrollAccountRequestBaselineItems> baselineItems;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("FolderId")
    public String folderId;

    @NameInMap("PayerAccountUid")
    public Long payerAccountUid;

    /**
     * <p>RegionId</p>
     */
    @NameInMap("RegionId")
    public String regionId;

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
        @NameInMap("Config")
        public String config;

        @NameInMap("Name")
        public String name;

        @NameInMap("Skip")
        public Boolean skip;

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
