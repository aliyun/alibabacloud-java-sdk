// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyRequest extends TeaModel {
    /**
     * <p>The details of data backup policies.</p>
     */
    @NameInMap("AdvanceDataPolicies")
    public java.util.List<ModifyBackupPolicyRequestAdvanceDataPolicies> advanceDataPolicies;

    @NameInMap("AdvanceIncPolicies")
    public java.util.List<ModifyBackupPolicyRequestAdvanceIncPolicies> advanceIncPolicies;

    @NameInMap("AdvanceLogPolicies")
    public java.util.List<ModifyBackupPolicyRequestAdvanceLogPolicies> advanceLogPolicies;

    @NameInMap("BackupMethod")
    public String backupMethod;

    @NameInMap("BackupPriority")
    public Integer backupPriority;

    @NameInMap("BackupRetentionPolicyOnClusterDeletion")
    public String backupRetentionPolicyOnClusterDeletion;

    @NameInMap("Category")
    public String category;

    @NameInMap("EnableIncBackup")
    public Boolean enableIncBackup;

    /**
     * <p>The ID of the PolarDB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2ze3nrr64c5****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The start time of a basic backup.</p>
     * 
     * <strong>example:</strong>
     * <p>17:00Z</p>
     */
    @NameInMap("PreferredBackupWindowBegin")
    public String preferredBackupWindowBegin;

    /**
     * <p>The region in which backup sets reside.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
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

    public ModifyBackupPolicyRequest setAdvanceIncPolicies(java.util.List<ModifyBackupPolicyRequestAdvanceIncPolicies> advanceIncPolicies) {
        this.advanceIncPolicies = advanceIncPolicies;
        return this;
    }
    public java.util.List<ModifyBackupPolicyRequestAdvanceIncPolicies> getAdvanceIncPolicies() {
        return this.advanceIncPolicies;
    }

    public ModifyBackupPolicyRequest setAdvanceLogPolicies(java.util.List<ModifyBackupPolicyRequestAdvanceLogPolicies> advanceLogPolicies) {
        this.advanceLogPolicies = advanceLogPolicies;
        return this;
    }
    public java.util.List<ModifyBackupPolicyRequestAdvanceLogPolicies> getAdvanceLogPolicies() {
        return this.advanceLogPolicies;
    }

    public ModifyBackupPolicyRequest setBackupMethod(String backupMethod) {
        this.backupMethod = backupMethod;
        return this;
    }
    public String getBackupMethod() {
        return this.backupMethod;
    }

    public ModifyBackupPolicyRequest setBackupPriority(Integer backupPriority) {
        this.backupPriority = backupPriority;
        return this;
    }
    public Integer getBackupPriority() {
        return this.backupPriority;
    }

    public ModifyBackupPolicyRequest setBackupRetentionPolicyOnClusterDeletion(String backupRetentionPolicyOnClusterDeletion) {
        this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
        return this;
    }
    public String getBackupRetentionPolicyOnClusterDeletion() {
        return this.backupRetentionPolicyOnClusterDeletion;
    }

    public ModifyBackupPolicyRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ModifyBackupPolicyRequest setEnableIncBackup(Boolean enableIncBackup) {
        this.enableIncBackup = enableIncBackup;
        return this;
    }
    public Boolean getEnableIncBackup() {
        return this.enableIncBackup;
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
        /**
         * <p>The type of the operation. Valid values:</p>
         * <ul>
         * <li><strong>CREATE</strong></li>
         * <li><strong>UPDATE</strong></li>
         * <li><strong>DELETE</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UPDATE</p>
         */
        @NameInMap("ActionType")
        public String actionType;

        /**
         * <p>The region in which backup files are stored.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("DestRegion")
        public String destRegion;

        /**
         * <p>The storage method of backup files. Valid values:</p>
         * <ul>
         * <li><strong>db</strong>: database.</li>
         * <li><strong>level1</strong>: level-1 backup.</li>
         * <li><strong>level2</strong>: level-2 backup.</li>
         * <li><strong>level2Cross</strong>: level-2 cross-region backup.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>level1</p>
         */
        @NameInMap("DestType")
        public String destType;

        /**
         * <p>The scheduling cycle. Valid values:</p>
         * <ul>
         * <li><strong>dayOfWeek</strong>: scheduling by week.</li>
         * <li><strong>dayOfMonth</strong>: scheduling by month.</li>
         * <li><strong>dayOfYear</strong>: scheduling by year.</li>
         * <li><strong>backupInterval</strong>: scheduling at a specific interval.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is required only when FilterType is set to <strong>crontab</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>backupInterval</p>
         */
        @NameInMap("FilterKey")
        public String filterKey;

        /**
         * <p>The scheduling mode of the advanced backup policy. Valid values:</p>
         * <ul>
         * <li><strong>crontab</strong>: periodic scheduling.</li>
         * <li><strong>event</strong>: event-based scheduling.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>crontab</p>
         */
        @NameInMap("FilterType")
        public String filterType;

        /**
         * <p>The backup cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("FilterValue")
        public String filterValue;

        @NameInMap("OnlyPreserveOneEachDay")
        public Boolean onlyPreserveOneEachDay;

        /**
         * <p>The ID of the advanced backup policy. You can call the <a href="https://help.aliyun.com/document_detail/2869783.html">DescribeBackupPolicy</a> operation to query the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6s67c7i3y8f8p72808p******</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The retention type of backup sets. Valid values:</p>
         * <ul>
         * <li><strong>never</strong>: Backup sets never expire.</li>
         * <li><strong>delay</strong>: Backup sets are retained for a specific number of days.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>delay</p>
         */
        @NameInMap("RetentionType")
        public String retentionType;

        /**
         * <p>The retention period. Unit: day.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("RetentionValue")
        public String retentionValue;

        /**
         * <p>The region in which the data source of the backup policy resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("SrcRegion")
        public String srcRegion;

        /**
         * <p>The type of the data source of the backup policy. Valid values:</p>
         * <ul>
         * <li><strong>db</strong>: database.</li>
         * <li><strong>level1</strong>: level-1 backup.</li>
         * <li><strong>level2</strong>: level-2 backup.</li>
         * <li><strong>level2Cross</strong>: level-2 cross-region backup.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>db</p>
         */
        @NameInMap("SrcType")
        public String srcType;

        @NameInMap("StorageClass")
        public String storageClass;

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

        public ModifyBackupPolicyRequestAdvanceDataPolicies setFilterValue(String filterValue) {
            this.filterValue = filterValue;
            return this;
        }
        public String getFilterValue() {
            return this.filterValue;
        }

        public ModifyBackupPolicyRequestAdvanceDataPolicies setOnlyPreserveOneEachDay(Boolean onlyPreserveOneEachDay) {
            this.onlyPreserveOneEachDay = onlyPreserveOneEachDay;
            return this;
        }
        public Boolean getOnlyPreserveOneEachDay() {
            return this.onlyPreserveOneEachDay;
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

        public ModifyBackupPolicyRequestAdvanceDataPolicies setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

    }

    public static class ModifyBackupPolicyRequestAdvanceIncPolicies extends TeaModel {
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

        @NameInMap("FilterValue")
        public String filterValue;

        @NameInMap("OnlyPreserveOneEachDay")
        public Boolean onlyPreserveOneEachDay;

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

        public static ModifyBackupPolicyRequestAdvanceIncPolicies build(java.util.Map<String, ?> map) throws Exception {
            ModifyBackupPolicyRequestAdvanceIncPolicies self = new ModifyBackupPolicyRequestAdvanceIncPolicies();
            return TeaModel.build(map, self);
        }

        public ModifyBackupPolicyRequestAdvanceIncPolicies setActionType(String actionType) {
            this.actionType = actionType;
            return this;
        }
        public String getActionType() {
            return this.actionType;
        }

        public ModifyBackupPolicyRequestAdvanceIncPolicies setDestRegion(String destRegion) {
            this.destRegion = destRegion;
            return this;
        }
        public String getDestRegion() {
            return this.destRegion;
        }

        public ModifyBackupPolicyRequestAdvanceIncPolicies setDestType(String destType) {
            this.destType = destType;
            return this;
        }
        public String getDestType() {
            return this.destType;
        }

        public ModifyBackupPolicyRequestAdvanceIncPolicies setFilterKey(String filterKey) {
            this.filterKey = filterKey;
            return this;
        }
        public String getFilterKey() {
            return this.filterKey;
        }

        public ModifyBackupPolicyRequestAdvanceIncPolicies setFilterType(String filterType) {
            this.filterType = filterType;
            return this;
        }
        public String getFilterType() {
            return this.filterType;
        }

        public ModifyBackupPolicyRequestAdvanceIncPolicies setFilterValue(String filterValue) {
            this.filterValue = filterValue;
            return this;
        }
        public String getFilterValue() {
            return this.filterValue;
        }

        public ModifyBackupPolicyRequestAdvanceIncPolicies setOnlyPreserveOneEachDay(Boolean onlyPreserveOneEachDay) {
            this.onlyPreserveOneEachDay = onlyPreserveOneEachDay;
            return this;
        }
        public Boolean getOnlyPreserveOneEachDay() {
            return this.onlyPreserveOneEachDay;
        }

        public ModifyBackupPolicyRequestAdvanceIncPolicies setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ModifyBackupPolicyRequestAdvanceIncPolicies setRetentionType(String retentionType) {
            this.retentionType = retentionType;
            return this;
        }
        public String getRetentionType() {
            return this.retentionType;
        }

        public ModifyBackupPolicyRequestAdvanceIncPolicies setRetentionValue(String retentionValue) {
            this.retentionValue = retentionValue;
            return this;
        }
        public String getRetentionValue() {
            return this.retentionValue;
        }

        public ModifyBackupPolicyRequestAdvanceIncPolicies setSrcRegion(String srcRegion) {
            this.srcRegion = srcRegion;
            return this;
        }
        public String getSrcRegion() {
            return this.srcRegion;
        }

        public ModifyBackupPolicyRequestAdvanceIncPolicies setSrcType(String srcType) {
            this.srcType = srcType;
            return this;
        }
        public String getSrcType() {
            return this.srcType;
        }

    }

    public static class ModifyBackupPolicyRequestAdvanceLogPolicies extends TeaModel {
        @NameInMap("ActionType")
        public String actionType;

        @NameInMap("DestRegion")
        public String destRegion;

        @NameInMap("DestType")
        public String destType;

        @NameInMap("EnableLogBackup")
        public Long enableLogBackup;

        @NameInMap("FilterKey")
        public String filterKey;

        @NameInMap("FilterType")
        public String filterType;

        @NameInMap("FilterValue")
        public String filterValue;

        @NameInMap("LogRetentionType")
        public String logRetentionType;

        @NameInMap("LogRetentionValue")
        public String logRetentionValue;

        @NameInMap("PolicyId")
        public String policyId;

        @NameInMap("SrcRegion")
        public String srcRegion;

        @NameInMap("SrcType")
        public String srcType;

        public static ModifyBackupPolicyRequestAdvanceLogPolicies build(java.util.Map<String, ?> map) throws Exception {
            ModifyBackupPolicyRequestAdvanceLogPolicies self = new ModifyBackupPolicyRequestAdvanceLogPolicies();
            return TeaModel.build(map, self);
        }

        public ModifyBackupPolicyRequestAdvanceLogPolicies setActionType(String actionType) {
            this.actionType = actionType;
            return this;
        }
        public String getActionType() {
            return this.actionType;
        }

        public ModifyBackupPolicyRequestAdvanceLogPolicies setDestRegion(String destRegion) {
            this.destRegion = destRegion;
            return this;
        }
        public String getDestRegion() {
            return this.destRegion;
        }

        public ModifyBackupPolicyRequestAdvanceLogPolicies setDestType(String destType) {
            this.destType = destType;
            return this;
        }
        public String getDestType() {
            return this.destType;
        }

        public ModifyBackupPolicyRequestAdvanceLogPolicies setEnableLogBackup(Long enableLogBackup) {
            this.enableLogBackup = enableLogBackup;
            return this;
        }
        public Long getEnableLogBackup() {
            return this.enableLogBackup;
        }

        public ModifyBackupPolicyRequestAdvanceLogPolicies setFilterKey(String filterKey) {
            this.filterKey = filterKey;
            return this;
        }
        public String getFilterKey() {
            return this.filterKey;
        }

        public ModifyBackupPolicyRequestAdvanceLogPolicies setFilterType(String filterType) {
            this.filterType = filterType;
            return this;
        }
        public String getFilterType() {
            return this.filterType;
        }

        public ModifyBackupPolicyRequestAdvanceLogPolicies setFilterValue(String filterValue) {
            this.filterValue = filterValue;
            return this;
        }
        public String getFilterValue() {
            return this.filterValue;
        }

        public ModifyBackupPolicyRequestAdvanceLogPolicies setLogRetentionType(String logRetentionType) {
            this.logRetentionType = logRetentionType;
            return this;
        }
        public String getLogRetentionType() {
            return this.logRetentionType;
        }

        public ModifyBackupPolicyRequestAdvanceLogPolicies setLogRetentionValue(String logRetentionValue) {
            this.logRetentionValue = logRetentionValue;
            return this;
        }
        public String getLogRetentionValue() {
            return this.logRetentionValue;
        }

        public ModifyBackupPolicyRequestAdvanceLogPolicies setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ModifyBackupPolicyRequestAdvanceLogPolicies setSrcRegion(String srcRegion) {
            this.srcRegion = srcRegion;
            return this;
        }
        public String getSrcRegion() {
            return this.srcRegion;
        }

        public ModifyBackupPolicyRequestAdvanceLogPolicies setSrcType(String srcType) {
            this.srcType = srcType;
            return this;
        }
        public String getSrcType() {
            return this.srcType;
        }

    }

}
