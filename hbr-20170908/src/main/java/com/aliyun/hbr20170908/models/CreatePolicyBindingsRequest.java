// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreatePolicyBindingsRequest extends TeaModel {
    /**
     * <p>The data sources that you want to bind to the backup policy.</p>
     */
    @NameInMap("PolicyBindingList")
    public java.util.List<CreatePolicyBindingsRequestPolicyBindingList> policyBindingList;

    /**
     * <p>The ID of the backup policy.</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    public static CreatePolicyBindingsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyBindingsRequest self = new CreatePolicyBindingsRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolicyBindingsRequest setPolicyBindingList(java.util.List<CreatePolicyBindingsRequestPolicyBindingList> policyBindingList) {
        this.policyBindingList = policyBindingList;
        return this;
    }
    public java.util.List<CreatePolicyBindingsRequestPolicyBindingList> getPolicyBindingList() {
        return this.policyBindingList;
    }

    public CreatePolicyBindingsRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public static class CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsCommonFileSystemDetail extends TeaModel {
        @NameInMap("FetchSliceSize")
        public Long fetchSliceSize;

        @NameInMap("FullOnIncrementFail")
        public Boolean fullOnIncrementFail;

        public static CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsCommonFileSystemDetail build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsCommonFileSystemDetail self = new CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsCommonFileSystemDetail();
            return TeaModel.build(map, self);
        }

        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsCommonFileSystemDetail setFetchSliceSize(Long fetchSliceSize) {
            this.fetchSliceSize = fetchSliceSize;
            return this;
        }
        public Long getFetchSliceSize() {
            return this.fetchSliceSize;
        }

        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsCommonFileSystemDetail setFullOnIncrementFail(Boolean fullOnIncrementFail) {
            this.fullOnIncrementFail = fullOnIncrementFail;
            return this;
        }
        public Boolean getFullOnIncrementFail() {
            return this.fullOnIncrementFail;
        }

    }

    public static class CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsCommonNasDetail extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("FetchSliceSize")
        public Long fetchSliceSize;

        @NameInMap("FullOnIncrementFail")
        public Boolean fullOnIncrementFail;

        public static CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsCommonNasDetail build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsCommonNasDetail self = new CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsCommonNasDetail();
            return TeaModel.build(map, self);
        }

        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsCommonNasDetail setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsCommonNasDetail setFetchSliceSize(Long fetchSliceSize) {
            this.fetchSliceSize = fetchSliceSize;
            return this;
        }
        public Long getFetchSliceSize() {
            return this.fetchSliceSize;
        }

        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsCommonNasDetail setFullOnIncrementFail(Boolean fullOnIncrementFail) {
            this.fullOnIncrementFail = fullOnIncrementFail;
            return this;
        }
        public Boolean getFullOnIncrementFail() {
            return this.fullOnIncrementFail;
        }

    }

    public static class CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsFileDetail extends TeaModel {
        @NameInMap("AdvPolicy")
        public Boolean advPolicy;

        @NameInMap("UseVSS")
        public Boolean useVSS;

        public static CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsFileDetail build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsFileDetail self = new CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsFileDetail();
            return TeaModel.build(map, self);
        }

        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsFileDetail setAdvPolicy(Boolean advPolicy) {
            this.advPolicy = advPolicy;
            return this;
        }
        public Boolean getAdvPolicy() {
            return this.advPolicy;
        }

        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsFileDetail setUseVSS(Boolean useVSS) {
            this.useVSS = useVSS;
            return this;
        }
        public Boolean getUseVSS() {
            return this.useVSS;
        }

    }

    public static class CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsOssDetail extends TeaModel {
        /**
         * <p>Whether delete inventory file after backup.</p>
         * <p>- **NO_CLEANUP**: Do not delete.</p>
         * <p>- **DELETE_CURRENT**: Delete current.</p>
         * <p>- **DELETE_CURRENT_AND_PREVIOUS**: Delete all.</p>
         */
        @NameInMap("InventoryCleanupPolicy")
        public String inventoryCleanupPolicy;

        /**
         * <p>OSS inventory name.</p>
         * <p>- If you want to back up more than 100 million OSS objects, we recommend that you use inventories to accelerate incremental backup. Storage fees for inventory lists are included into your OSS bills.</p>
         * <p>- OSS inventory file generation takes time. The backup may fail before the OSS inventory file is generated. You can wait for the next cycle to execute.</p>
         */
        @NameInMap("InventoryId")
        public String inventoryId;

        public static CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsOssDetail build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsOssDetail self = new CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsOssDetail();
            return TeaModel.build(map, self);
        }

        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsOssDetail setInventoryCleanupPolicy(String inventoryCleanupPolicy) {
            this.inventoryCleanupPolicy = inventoryCleanupPolicy;
            return this;
        }
        public String getInventoryCleanupPolicy() {
            return this.inventoryCleanupPolicy;
        }

        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsOssDetail setInventoryId(String inventoryId) {
            this.inventoryId = inventoryId;
            return this;
        }
        public String getInventoryId() {
            return this.inventoryId;
        }

    }

    public static class CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsUdmDetail extends TeaModel {
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
         * <p>Specifies whether to create a snapshot-consistent group. You can create a snapshot-consistent group only if all disks are enhanced SSDs (ESSDs).</p>
         */
        @NameInMap("SnapshotGroup")
        public Boolean snapshotGroup;

        /**
         * <p>This parameter is required only if the **AppConsistent** parameter is set to **true**. This parameter specifies the I/O freeze timeout period. Default value: 30. Unit: seconds.</p>
         */
        @NameInMap("TimeoutInSeconds")
        public Long timeoutInSeconds;

        public static CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsUdmDetail build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsUdmDetail self = new CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsUdmDetail();
            return TeaModel.build(map, self);
        }

        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsUdmDetail setAppConsistent(Boolean appConsistent) {
            this.appConsistent = appConsistent;
            return this;
        }
        public Boolean getAppConsistent() {
            return this.appConsistent;
        }

        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsUdmDetail setDiskIdList(java.util.List<String> diskIdList) {
            this.diskIdList = diskIdList;
            return this;
        }
        public java.util.List<String> getDiskIdList() {
            return this.diskIdList;
        }

        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsUdmDetail setEnableFsFreeze(Boolean enableFsFreeze) {
            this.enableFsFreeze = enableFsFreeze;
            return this;
        }
        public Boolean getEnableFsFreeze() {
            return this.enableFsFreeze;
        }

        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsUdmDetail setEnableWriters(Boolean enableWriters) {
            this.enableWriters = enableWriters;
            return this;
        }
        public Boolean getEnableWriters() {
            return this.enableWriters;
        }

        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsUdmDetail setExcludeDiskIdList(java.util.List<String> excludeDiskIdList) {
            this.excludeDiskIdList = excludeDiskIdList;
            return this;
        }
        public java.util.List<String> getExcludeDiskIdList() {
            return this.excludeDiskIdList;
        }

        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsUdmDetail setPostScriptPath(String postScriptPath) {
            this.postScriptPath = postScriptPath;
            return this;
        }
        public String getPostScriptPath() {
            return this.postScriptPath;
        }

        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsUdmDetail setPreScriptPath(String preScriptPath) {
            this.preScriptPath = preScriptPath;
            return this;
        }
        public String getPreScriptPath() {
            return this.preScriptPath;
        }

        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsUdmDetail setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsUdmDetail setSnapshotGroup(Boolean snapshotGroup) {
            this.snapshotGroup = snapshotGroup;
            return this;
        }
        public Boolean getSnapshotGroup() {
            return this.snapshotGroup;
        }

        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsUdmDetail setTimeoutInSeconds(Long timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            return this;
        }
        public Long getTimeoutInSeconds() {
            return this.timeoutInSeconds;
        }

    }

    public static class CreatePolicyBindingsRequestPolicyBindingListAdvancedOptions extends TeaModel {
        @NameInMap("CommonFileSystemDetail")
        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsCommonFileSystemDetail commonFileSystemDetail;

        @NameInMap("CommonNasDetail")
        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsCommonNasDetail commonNasDetail;

        @NameInMap("FileDetail")
        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsFileDetail fileDetail;

        /**
         * <p>The advanced options for OSS backup.</p>
         */
        @NameInMap("OssDetail")
        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsOssDetail ossDetail;

        /**
         * <p>The details of ECS instance backup.</p>
         */
        @NameInMap("UdmDetail")
        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsUdmDetail udmDetail;

        public static CreatePolicyBindingsRequestPolicyBindingListAdvancedOptions build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyBindingsRequestPolicyBindingListAdvancedOptions self = new CreatePolicyBindingsRequestPolicyBindingListAdvancedOptions();
            return TeaModel.build(map, self);
        }

        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptions setCommonFileSystemDetail(CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsCommonFileSystemDetail commonFileSystemDetail) {
            this.commonFileSystemDetail = commonFileSystemDetail;
            return this;
        }
        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsCommonFileSystemDetail getCommonFileSystemDetail() {
            return this.commonFileSystemDetail;
        }

        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptions setCommonNasDetail(CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsCommonNasDetail commonNasDetail) {
            this.commonNasDetail = commonNasDetail;
            return this;
        }
        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsCommonNasDetail getCommonNasDetail() {
            return this.commonNasDetail;
        }

        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptions setFileDetail(CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsFileDetail fileDetail) {
            this.fileDetail = fileDetail;
            return this;
        }
        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsFileDetail getFileDetail() {
            return this.fileDetail;
        }

        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptions setOssDetail(CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsOssDetail ossDetail) {
            this.ossDetail = ossDetail;
            return this;
        }
        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsOssDetail getOssDetail() {
            return this.ossDetail;
        }

        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptions setUdmDetail(CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsUdmDetail udmDetail) {
            this.udmDetail = udmDetail;
            return this;
        }
        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsUdmDetail getUdmDetail() {
            return this.udmDetail;
        }

    }

    public static class CreatePolicyBindingsRequestPolicyBindingList extends TeaModel {
        /**
         * <p>Advanced options.</p>
         */
        @NameInMap("AdvancedOptions")
        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptions advancedOptions;

        /**
         * <p>The name of the RAM role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
         */
        @NameInMap("CrossAccountRoleName")
        public String crossAccountRoleName;

        /**
         * <p>Specifies whether data is backed up and restored within the same Alibaba Cloud account or across Alibaba Cloud accounts. Valid values:</p>
         * <br>
         * <p>*   SELF_ACCOUNT: Data is backed up and restored within the same Alibaba Cloud account.</p>
         * <p>*   CROSS_ACCOUNT: Data is backed up and restored across Alibaba Cloud accounts.</p>
         */
        @NameInMap("CrossAccountType")
        public String crossAccountType;

        /**
         * <p>The source Alibaba Cloud account ID when backup across Alibaba Cloud accounts.</p>
         */
        @NameInMap("CrossAccountUserId")
        public Long crossAccountUserId;

        /**
         * <p>The ID of the data source.</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <p>The description of the association.</p>
         */
        @NameInMap("PolicyBindingDescription")
        public String policyBindingDescription;

        /**
         * <p>The prefix of the path to the folder that you want to back up. By default, the entire OSS bucket is backed up.</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The type of the data source. Valid values:</p>
         * <br>
         * <p>*   **UDM_ECS**: ECS instance backup</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        public static CreatePolicyBindingsRequestPolicyBindingList build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyBindingsRequestPolicyBindingList self = new CreatePolicyBindingsRequestPolicyBindingList();
            return TeaModel.build(map, self);
        }

        public CreatePolicyBindingsRequestPolicyBindingList setAdvancedOptions(CreatePolicyBindingsRequestPolicyBindingListAdvancedOptions advancedOptions) {
            this.advancedOptions = advancedOptions;
            return this;
        }
        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptions getAdvancedOptions() {
            return this.advancedOptions;
        }

        public CreatePolicyBindingsRequestPolicyBindingList setCrossAccountRoleName(String crossAccountRoleName) {
            this.crossAccountRoleName = crossAccountRoleName;
            return this;
        }
        public String getCrossAccountRoleName() {
            return this.crossAccountRoleName;
        }

        public CreatePolicyBindingsRequestPolicyBindingList setCrossAccountType(String crossAccountType) {
            this.crossAccountType = crossAccountType;
            return this;
        }
        public String getCrossAccountType() {
            return this.crossAccountType;
        }

        public CreatePolicyBindingsRequestPolicyBindingList setCrossAccountUserId(Long crossAccountUserId) {
            this.crossAccountUserId = crossAccountUserId;
            return this;
        }
        public Long getCrossAccountUserId() {
            return this.crossAccountUserId;
        }

        public CreatePolicyBindingsRequestPolicyBindingList setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public CreatePolicyBindingsRequestPolicyBindingList setPolicyBindingDescription(String policyBindingDescription) {
            this.policyBindingDescription = policyBindingDescription;
            return this;
        }
        public String getPolicyBindingDescription() {
            return this.policyBindingDescription;
        }

        public CreatePolicyBindingsRequestPolicyBindingList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public CreatePolicyBindingsRequestPolicyBindingList setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

}
