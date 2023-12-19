// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpdatePolicyBindingRequest extends TeaModel {
    /**
     * <p>Advanced options.</p>
     */
    @NameInMap("AdvancedOptions")
    public UpdatePolicyBindingRequestAdvancedOptions advancedOptions;

    /**
     * <p>The ID of the data source.</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <p>Specifies whether to disable the backup policy for the data source.</p>
     * <br>
     * <p>*   true: disables the backup policy for the data source</p>
     * <p>*   false: enables the backup policy for the data source</p>
     */
    @NameInMap("Disabled")
    public Boolean disabled;

    /**
     * <p>The description of the association.</p>
     */
    @NameInMap("PolicyBindingDescription")
    public String policyBindingDescription;

    /**
     * <p>The ID of the backup policy.</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <br>
     * <p>*   **UDM_ECS**: ECS instance backup</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static UpdatePolicyBindingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolicyBindingRequest self = new UpdatePolicyBindingRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePolicyBindingRequest setAdvancedOptions(UpdatePolicyBindingRequestAdvancedOptions advancedOptions) {
        this.advancedOptions = advancedOptions;
        return this;
    }
    public UpdatePolicyBindingRequestAdvancedOptions getAdvancedOptions() {
        return this.advancedOptions;
    }

    public UpdatePolicyBindingRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public UpdatePolicyBindingRequest setDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }
    public Boolean getDisabled() {
        return this.disabled;
    }

    public UpdatePolicyBindingRequest setPolicyBindingDescription(String policyBindingDescription) {
        this.policyBindingDescription = policyBindingDescription;
        return this;
    }
    public String getPolicyBindingDescription() {
        return this.policyBindingDescription;
    }

    public UpdatePolicyBindingRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public UpdatePolicyBindingRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public static class UpdatePolicyBindingRequestAdvancedOptionsOssDetail extends TeaModel {
        @NameInMap("InventoryCleanupPolicy")
        public String inventoryCleanupPolicy;

        @NameInMap("InventoryId")
        public String inventoryId;

        public static UpdatePolicyBindingRequestAdvancedOptionsOssDetail build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolicyBindingRequestAdvancedOptionsOssDetail self = new UpdatePolicyBindingRequestAdvancedOptionsOssDetail();
            return TeaModel.build(map, self);
        }

        public UpdatePolicyBindingRequestAdvancedOptionsOssDetail setInventoryCleanupPolicy(String inventoryCleanupPolicy) {
            this.inventoryCleanupPolicy = inventoryCleanupPolicy;
            return this;
        }
        public String getInventoryCleanupPolicy() {
            return this.inventoryCleanupPolicy;
        }

        public UpdatePolicyBindingRequestAdvancedOptionsOssDetail setInventoryId(String inventoryId) {
            this.inventoryId = inventoryId;
            return this;
        }
        public String getInventoryId() {
            return this.inventoryId;
        }

    }

    public static class UpdatePolicyBindingRequestAdvancedOptionsUdmDetail extends TeaModel {
        /**
         * <p>Specifies whether to enable application consistency. You can enable application consistency only if all disks are ESSDs.</p>
         */
        @NameInMap("AppConsistent")
        public Boolean appConsistent;

        /**
         * <p>The IDs of the disks that need to be protected. If all disks need to be protected, this parameter is empty.</p>
         */
        @NameInMap("DiskIdList")
        public java.util.List<String> diskIdList;

        /**
         * <p>This parameter is required only if the **AppConsistent** parameter is set to **true**. This parameter specifies whether to enable Linux fsfreeze to put file systems into the read-only state before application-consistent snapshots are created. Default value: true.</p>
         */
        @NameInMap("EnableFsFreeze")
        public Boolean enableFsFreeze;

        /**
         * <p>This parameter is required only if the **AppConsistent** parameter is set to **true**. This parameter specifies whether to create application-consistent snapshots. Valid values:</p>
         * <br>
         * <p>*   true: creates application-consistent snapshots.</p>
         * <p>*   false: creates file system-consistent snapshots.</p>
         * <br>
         * <p>Default value: true.</p>
         */
        @NameInMap("EnableWriters")
        public Boolean enableWriters;

        /**
         * <p>The IDs of the disks that do not need to be protected. If the DiskIdList parameter is not empty, this parameter is ignored.</p>
         */
        @NameInMap("ExcludeDiskIdList")
        public java.util.List<String> excludeDiskIdList;

        /**
         * <p>This parameter is required only if the **AppConsistent** parameter is set to **true**. This parameter specifies the path of the post-thaw scripts that are executed after application-consistent snapshots are created.</p>
         */
        @NameInMap("PostScriptPath")
        public String postScriptPath;

        /**
         * <p>This parameter is required only if the **AppConsistent** parameter is set to **true**. This parameter specifies the path of the pre-freeze scripts that are executed before application-consistent snapshots are created.</p>
         */
        @NameInMap("PreScriptPath")
        public String preScriptPath;

        /**
         * <p>This parameter is required only if the **AppConsistent** parameter is set to **true**. This parameter specifies the name of the RAM role that is required to create application-consistent snapshots.</p>
         */
        @NameInMap("RamRoleName")
        public String ramRoleName;

        /**
         * <p>Specifies whether to create a snapshot-consistent group. You can create a snapshot-consistent group only if all disks are ESSDs.</p>
         */
        @NameInMap("SnapshotGroup")
        public Boolean snapshotGroup;

        /**
         * <p>This parameter is required only if the **AppConsistent** parameter is set to **true**. This parameter specifies the I/O freeze timeout period. Default value: 30. Unit: seconds.</p>
         */
        @NameInMap("TimeoutInSeconds")
        public Long timeoutInSeconds;

        public static UpdatePolicyBindingRequestAdvancedOptionsUdmDetail build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolicyBindingRequestAdvancedOptionsUdmDetail self = new UpdatePolicyBindingRequestAdvancedOptionsUdmDetail();
            return TeaModel.build(map, self);
        }

        public UpdatePolicyBindingRequestAdvancedOptionsUdmDetail setAppConsistent(Boolean appConsistent) {
            this.appConsistent = appConsistent;
            return this;
        }
        public Boolean getAppConsistent() {
            return this.appConsistent;
        }

        public UpdatePolicyBindingRequestAdvancedOptionsUdmDetail setDiskIdList(java.util.List<String> diskIdList) {
            this.diskIdList = diskIdList;
            return this;
        }
        public java.util.List<String> getDiskIdList() {
            return this.diskIdList;
        }

        public UpdatePolicyBindingRequestAdvancedOptionsUdmDetail setEnableFsFreeze(Boolean enableFsFreeze) {
            this.enableFsFreeze = enableFsFreeze;
            return this;
        }
        public Boolean getEnableFsFreeze() {
            return this.enableFsFreeze;
        }

        public UpdatePolicyBindingRequestAdvancedOptionsUdmDetail setEnableWriters(Boolean enableWriters) {
            this.enableWriters = enableWriters;
            return this;
        }
        public Boolean getEnableWriters() {
            return this.enableWriters;
        }

        public UpdatePolicyBindingRequestAdvancedOptionsUdmDetail setExcludeDiskIdList(java.util.List<String> excludeDiskIdList) {
            this.excludeDiskIdList = excludeDiskIdList;
            return this;
        }
        public java.util.List<String> getExcludeDiskIdList() {
            return this.excludeDiskIdList;
        }

        public UpdatePolicyBindingRequestAdvancedOptionsUdmDetail setPostScriptPath(String postScriptPath) {
            this.postScriptPath = postScriptPath;
            return this;
        }
        public String getPostScriptPath() {
            return this.postScriptPath;
        }

        public UpdatePolicyBindingRequestAdvancedOptionsUdmDetail setPreScriptPath(String preScriptPath) {
            this.preScriptPath = preScriptPath;
            return this;
        }
        public String getPreScriptPath() {
            return this.preScriptPath;
        }

        public UpdatePolicyBindingRequestAdvancedOptionsUdmDetail setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        public UpdatePolicyBindingRequestAdvancedOptionsUdmDetail setSnapshotGroup(Boolean snapshotGroup) {
            this.snapshotGroup = snapshotGroup;
            return this;
        }
        public Boolean getSnapshotGroup() {
            return this.snapshotGroup;
        }

        public UpdatePolicyBindingRequestAdvancedOptionsUdmDetail setTimeoutInSeconds(Long timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            return this;
        }
        public Long getTimeoutInSeconds() {
            return this.timeoutInSeconds;
        }

    }

    public static class UpdatePolicyBindingRequestAdvancedOptions extends TeaModel {
        @NameInMap("OssDetail")
        public UpdatePolicyBindingRequestAdvancedOptionsOssDetail ossDetail;

        /**
         * <p>The details of ECS instance backup.</p>
         */
        @NameInMap("UdmDetail")
        public UpdatePolicyBindingRequestAdvancedOptionsUdmDetail udmDetail;

        public static UpdatePolicyBindingRequestAdvancedOptions build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolicyBindingRequestAdvancedOptions self = new UpdatePolicyBindingRequestAdvancedOptions();
            return TeaModel.build(map, self);
        }

        public UpdatePolicyBindingRequestAdvancedOptions setOssDetail(UpdatePolicyBindingRequestAdvancedOptionsOssDetail ossDetail) {
            this.ossDetail = ossDetail;
            return this;
        }
        public UpdatePolicyBindingRequestAdvancedOptionsOssDetail getOssDetail() {
            return this.ossDetail;
        }

        public UpdatePolicyBindingRequestAdvancedOptions setUdmDetail(UpdatePolicyBindingRequestAdvancedOptionsUdmDetail udmDetail) {
            this.udmDetail = udmDetail;
            return this;
        }
        public UpdatePolicyBindingRequestAdvancedOptionsUdmDetail getUdmDetail() {
            return this.udmDetail;
        }

    }

}
