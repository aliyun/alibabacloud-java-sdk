// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyRequest extends TeaModel {
    @NameInMap("AdvanceDataPolicies")
    public java.util.List<ModifyBackupPolicyRequestAdvanceDataPolicies> advanceDataPolicies;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("PreferredBackupWindowBegin")
    public String preferredBackupWindowBegin;

    @NameInMap("RegionCode")
    public String regionCode;

    public static ModifyBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupPolicyRequest self = new ModifyBackupPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBackupPolicyRequest setAdvanceDataPolicies(java.util.List<ModifyBackupPolicyRequestAdvanceDataPolicies> advanceDataPolicies) {
        this.advanceDataPolicies = advanceDataPolicies;
        return this;
    }
    public java.util.List<ModifyBackupPolicyRequestAdvanceDataPolicies> getAdvanceDataPolicies() {
        return this.advanceDataPolicies;
    }

    public ModifyBackupPolicyRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ModifyBackupPolicyRequest setPreferredBackupWindowBegin(String preferredBackupWindowBegin) {
        this.preferredBackupWindowBegin = preferredBackupWindowBegin;
        return this;
    }
    public String getPreferredBackupWindowBegin() {
        return this.preferredBackupWindowBegin;
    }

    public ModifyBackupPolicyRequest setRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }
    public String getRegionCode() {
        return this.regionCode;
    }

    public static class ModifyBackupPolicyRequestAdvanceDataPolicies extends TeaModel {
        @NameInMap("ActionType")
        public String actionType;

        @NameInMap("DestRegion")
        public String destRegion;

        @NameInMap("DestType")
        public String destType;

        @NameInMap("FilterKey")
        public String filterKey;

        @NameInMap("FilterType")
        public String filterType;

        @NameInMap("FilterType-copy")
        public String filterTypeCopy;

        @NameInMap("FilterValue")
        public String filterValue;

        @NameInMap("PolicyId")
        public String policyId;

        @NameInMap("RetentionType")
        public String retentionType;

        @NameInMap("RetentionValue")
        public String retentionValue;

        @NameInMap("SrcRegion")
        public String srcRegion;

        @NameInMap("SrcType")
        public String srcType;

        public static ModifyBackupPolicyRequestAdvanceDataPolicies build(java.util.Map<String, ?> map) throws Exception {
            ModifyBackupPolicyRequestAdvanceDataPolicies self = new ModifyBackupPolicyRequestAdvanceDataPolicies();
            return TeaModel.build(map, self);
        }

        public ModifyBackupPolicyRequestAdvanceDataPolicies setActionType(String actionType) {
            this.actionType = actionType;
            return this;
        }
        public String getActionType() {
            return this.actionType;
        }

        public ModifyBackupPolicyRequestAdvanceDataPolicies setDestRegion(String destRegion) {
            this.destRegion = destRegion;
            return this;
        }
        public String getDestRegion() {
            return this.destRegion;
        }

        public ModifyBackupPolicyRequestAdvanceDataPolicies setDestType(String destType) {
            this.destType = destType;
            return this;
        }
        public String getDestType() {
            return this.destType;
        }

        public ModifyBackupPolicyRequestAdvanceDataPolicies setFilterKey(String filterKey) {
            this.filterKey = filterKey;
            return this;
        }
        public String getFilterKey() {
            return this.filterKey;
        }

        public ModifyBackupPolicyRequestAdvanceDataPolicies setFilterType(String filterType) {
            this.filterType = filterType;
            return this;
        }
        public String getFilterType() {
            return this.filterType;
        }

        public ModifyBackupPolicyRequestAdvanceDataPolicies setFilterTypeCopy(String filterTypeCopy) {
            this.filterTypeCopy = filterTypeCopy;
            return this;
        }
        public String getFilterTypeCopy() {
            return this.filterTypeCopy;
        }

        public ModifyBackupPolicyRequestAdvanceDataPolicies setFilterValue(String filterValue) {
            this.filterValue = filterValue;
            return this;
        }
        public String getFilterValue() {
            return this.filterValue;
        }

        public ModifyBackupPolicyRequestAdvanceDataPolicies setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ModifyBackupPolicyRequestAdvanceDataPolicies setRetentionType(String retentionType) {
            this.retentionType = retentionType;
            return this;
        }
        public String getRetentionType() {
            return this.retentionType;
        }

        public ModifyBackupPolicyRequestAdvanceDataPolicies setRetentionValue(String retentionValue) {
            this.retentionValue = retentionValue;
            return this;
        }
        public String getRetentionValue() {
            return this.retentionValue;
        }

        public ModifyBackupPolicyRequestAdvanceDataPolicies setSrcRegion(String srcRegion) {
            this.srcRegion = srcRegion;
            return this;
        }
        public String getSrcRegion() {
            return this.srcRegion;
        }

        public ModifyBackupPolicyRequestAdvanceDataPolicies setSrcType(String srcType) {
            this.srcType = srcType;
            return this;
        }
        public String getSrcType() {
            return this.srcType;
        }

    }

}
