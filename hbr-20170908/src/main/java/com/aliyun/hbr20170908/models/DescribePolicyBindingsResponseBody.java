// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribePolicyBindingsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Message")
    public String message;

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The association between the backup policy and data sources.</p>
     */
    @NameInMap("PolicyBindings")
    public java.util.List<DescribePolicyBindingsResponseBodyPolicyBindings> policyBindings;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribePolicyBindingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyBindingsResponseBody self = new DescribePolicyBindingsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolicyBindingsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePolicyBindingsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribePolicyBindingsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePolicyBindingsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribePolicyBindingsResponseBody setPolicyBindings(java.util.List<DescribePolicyBindingsResponseBodyPolicyBindings> policyBindings) {
        this.policyBindings = policyBindings;
        return this;
    }
    public java.util.List<DescribePolicyBindingsResponseBodyPolicyBindings> getPolicyBindings() {
        return this.policyBindings;
    }

    public DescribePolicyBindingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePolicyBindingsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribePolicyBindingsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsCommonFileSystemDetail extends TeaModel {
        @NameInMap("FetchSliceSize")
        public Long fetchSliceSize;

        @NameInMap("FullOnIncrementFail")
        public Boolean fullOnIncrementFail;

        public static DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsCommonFileSystemDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsCommonFileSystemDetail self = new DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsCommonFileSystemDetail();
            return TeaModel.build(map, self);
        }

        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsCommonFileSystemDetail setFetchSliceSize(Long fetchSliceSize) {
            this.fetchSliceSize = fetchSliceSize;
            return this;
        }
        public Long getFetchSliceSize() {
            return this.fetchSliceSize;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsCommonFileSystemDetail setFullOnIncrementFail(Boolean fullOnIncrementFail) {
            this.fullOnIncrementFail = fullOnIncrementFail;
            return this;
        }
        public Boolean getFullOnIncrementFail() {
            return this.fullOnIncrementFail;
        }

    }

    public static class DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsCommonNasDetail extends TeaModel {
        /**
         * <p>The ID of the HBR client.</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The size of backup shards (the number of files).</p>
         */
        @NameInMap("FetchSliceSize")
        public Long fetchSliceSize;

        /**
         * <p>Indicates whether the system performs full backup if incremental backup fails. Valid values:</p>
         * <br>
         * <p>*   **true**: The system performs full backup if incremental backup fails.</p>
         * <p>*   **false**: The system does not perform full backup if incremental backup fails.</p>
         */
        @NameInMap("FullOnIncrementFail")
        public Boolean fullOnIncrementFail;

        public static DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsCommonNasDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsCommonNasDetail self = new DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsCommonNasDetail();
            return TeaModel.build(map, self);
        }

        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsCommonNasDetail setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsCommonNasDetail setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsCommonNasDetail setFetchSliceSize(Long fetchSliceSize) {
            this.fetchSliceSize = fetchSliceSize;
            return this;
        }
        public Long getFetchSliceSize() {
            return this.fetchSliceSize;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsCommonNasDetail setFullOnIncrementFail(Boolean fullOnIncrementFail) {
            this.fullOnIncrementFail = fullOnIncrementFail;
            return this;
        }
        public Boolean getFullOnIncrementFail() {
            return this.fullOnIncrementFail;
        }

    }

    public static class DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsFileDetail extends TeaModel {
        /**
         * <p>Indicates whether an advanced policy is used. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("AdvPolicy")
        public Boolean advPolicy;

        /**
         * <p>Indicates whether the Volume Shadow Copy Service (VSS) feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**: The feature is enabled.</p>
         * <p>*   **false**: The feature is disabled.</p>
         */
        @NameInMap("UseVSS")
        public Boolean useVSS;

        public static DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsFileDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsFileDetail self = new DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsFileDetail();
            return TeaModel.build(map, self);
        }

        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsFileDetail setAdvPolicy(Boolean advPolicy) {
            this.advPolicy = advPolicy;
            return this;
        }
        public Boolean getAdvPolicy() {
            return this.advPolicy;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsFileDetail setUseVSS(Boolean useVSS) {
            this.useVSS = useVSS;
            return this;
        }
        public Boolean getUseVSS() {
            return this.useVSS;
        }

    }

    public static class DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsOssDetail extends TeaModel {
        /**
         * <p>Indicates whether the system deletes the inventory lists when a backup is completed. This parameter is valid only when OSS inventories are used. Valid values:</p>
         * <br>
         * <p>*   **NO_CLEANUP**: Inventory lists are not deleted.</p>
         * <p>*   **DELETE_CURRENT**: The current inventory list is deleted.</p>
         * <p>*   **DELETE_CURRENT_AND_PREVIOUS**: All inventory lists are deleted.</p>
         */
        @NameInMap("InventoryCleanupPolicy")
        public String inventoryCleanupPolicy;

        /**
         * <p>The name of the OSS inventory. If this parameter is not empty, the OSS inventory is used for performance optimization.</p>
         * <br>
         * <p>*   If you want to back up more than 100 million OSS objects, we recommend that you use inventory lists to accelerate incremental backup. Storage fees for inventory lists are included into your OSS bills.</p>
         * <p>*   A certain amount of time is required for OSS to generate inventory lists. Before inventory lists are generated, OSS objects may fail to be backed up. In this case, you can back up the OSS objects in the next backup cycle.</p>
         */
        @NameInMap("InventoryId")
        public String inventoryId;

        public static DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsOssDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsOssDetail self = new DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsOssDetail();
            return TeaModel.build(map, self);
        }

        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsOssDetail setInventoryCleanupPolicy(String inventoryCleanupPolicy) {
            this.inventoryCleanupPolicy = inventoryCleanupPolicy;
            return this;
        }
        public String getInventoryCleanupPolicy() {
            return this.inventoryCleanupPolicy;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsOssDetail setInventoryId(String inventoryId) {
            this.inventoryId = inventoryId;
            return this;
        }
        public String getInventoryId() {
            return this.inventoryId;
        }

    }

    public static class DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsUdmDetail extends TeaModel {
        /**
         * <p>Indicates whether application consistency is enabled. You can enable application consistency only if all disks are ESSDs.</p>
         */
        @NameInMap("AppConsistent")
        public Boolean appConsistent;

        @NameInMap("DestinationKmsKeyId")
        public String destinationKmsKeyId;

        /**
         * <p>The IDs of the disks that need to be protected. If all disks need to be protected, this parameter is empty.</p>
         */
        @NameInMap("DiskIdList")
        public java.util.List<String> diskIdList;

        /**
         * <p>This parameter is returned only if **AppConsistent** is set to **true**. This parameter indicates whether Linux fsfreeze is enabled to put file systems into the read-only state before application-consistent snapshots are created. Default value: true.</p>
         */
        @NameInMap("EnableFsFreeze")
        public Boolean enableFsFreeze;

        /**
         * <p>This parameter is returned only if **AppConsistent** is set to **true**. This parameter indicates whether application-consistent snapshots are created. Valid values:</p>
         * <br>
         * <p>*   true: Application-consistent snapshots are created.</p>
         * <p>*   false: File system-consistent snapshots are created.</p>
         * <br>
         * <p>Default value: true.</p>
         */
        @NameInMap("EnableWriters")
        public Boolean enableWriters;

        /**
         * <p>The IDs of the disks that do not need to be protected. If DiskIdList is not empty, this parameter is ignored.</p>
         */
        @NameInMap("ExcludeDiskIdList")
        public java.util.List<String> excludeDiskIdList;

        /**
         * <p>This parameter is returned only if **AppConsistent** is set to **true**. This parameter indicates the path of the post-thaw scripts that are executed after application-consistent snapshots are created.</p>
         */
        @NameInMap("PostScriptPath")
        public String postScriptPath;

        /**
         * <p>This parameter is returned only if **AppConsistent** is set to **true**. This parameter indicates the path of the pre-freeze scripts that are executed before application-consistent snapshots are created.</p>
         */
        @NameInMap("PreScriptPath")
        public String preScriptPath;

        /**
         * <p>This parameter is returned only if **AppConsistent** is set to **true**. This parameter indicates the name of the RAM role that is required to create application-consistent snapshots.</p>
         */
        @NameInMap("RamRoleName")
        public String ramRoleName;

        /**
         * <p>Indicates whether a snapshot-consistent group is created. You can create a snapshot-consistent group only if all disks are enhanced SSDs (ESSDs).</p>
         */
        @NameInMap("SnapshotGroup")
        public Boolean snapshotGroup;

        /**
         * <p>This parameter is returned only if **AppConsistent** is set to **true**. This parameter indicates the I/O freeze timeout period. Default value: 30. Unit: seconds.</p>
         */
        @NameInMap("TimeoutInSeconds")
        public Long timeoutInSeconds;

        public static DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsUdmDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsUdmDetail self = new DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsUdmDetail();
            return TeaModel.build(map, self);
        }

        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsUdmDetail setAppConsistent(Boolean appConsistent) {
            this.appConsistent = appConsistent;
            return this;
        }
        public Boolean getAppConsistent() {
            return this.appConsistent;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsUdmDetail setDestinationKmsKeyId(String destinationKmsKeyId) {
            this.destinationKmsKeyId = destinationKmsKeyId;
            return this;
        }
        public String getDestinationKmsKeyId() {
            return this.destinationKmsKeyId;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsUdmDetail setDiskIdList(java.util.List<String> diskIdList) {
            this.diskIdList = diskIdList;
            return this;
        }
        public java.util.List<String> getDiskIdList() {
            return this.diskIdList;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsUdmDetail setEnableFsFreeze(Boolean enableFsFreeze) {
            this.enableFsFreeze = enableFsFreeze;
            return this;
        }
        public Boolean getEnableFsFreeze() {
            return this.enableFsFreeze;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsUdmDetail setEnableWriters(Boolean enableWriters) {
            this.enableWriters = enableWriters;
            return this;
        }
        public Boolean getEnableWriters() {
            return this.enableWriters;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsUdmDetail setExcludeDiskIdList(java.util.List<String> excludeDiskIdList) {
            this.excludeDiskIdList = excludeDiskIdList;
            return this;
        }
        public java.util.List<String> getExcludeDiskIdList() {
            return this.excludeDiskIdList;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsUdmDetail setPostScriptPath(String postScriptPath) {
            this.postScriptPath = postScriptPath;
            return this;
        }
        public String getPostScriptPath() {
            return this.postScriptPath;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsUdmDetail setPreScriptPath(String preScriptPath) {
            this.preScriptPath = preScriptPath;
            return this;
        }
        public String getPreScriptPath() {
            return this.preScriptPath;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsUdmDetail setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsUdmDetail setSnapshotGroup(Boolean snapshotGroup) {
            this.snapshotGroup = snapshotGroup;
            return this;
        }
        public Boolean getSnapshotGroup() {
            return this.snapshotGroup;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsUdmDetail setTimeoutInSeconds(Long timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            return this;
        }
        public Long getTimeoutInSeconds() {
            return this.timeoutInSeconds;
        }

    }

    public static class DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptions extends TeaModel {
        @NameInMap("CommonFileSystemDetail")
        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsCommonFileSystemDetail commonFileSystemDetail;

        /**
         * <p>The advanced options for on-premises NAS backup.</p>
         */
        @NameInMap("CommonNasDetail")
        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsCommonNasDetail commonNasDetail;

        /**
         * <p>The advanced options for file backup.</p>
         */
        @NameInMap("FileDetail")
        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsFileDetail fileDetail;

        /**
         * <p>The advanced options for OSS backup.</p>
         */
        @NameInMap("OssDetail")
        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsOssDetail ossDetail;

        /**
         * <p>The advanced options for ECS instance backup.</p>
         */
        @NameInMap("UdmDetail")
        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsUdmDetail udmDetail;

        public static DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptions self = new DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptions();
            return TeaModel.build(map, self);
        }

        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptions setCommonFileSystemDetail(DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsCommonFileSystemDetail commonFileSystemDetail) {
            this.commonFileSystemDetail = commonFileSystemDetail;
            return this;
        }
        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsCommonFileSystemDetail getCommonFileSystemDetail() {
            return this.commonFileSystemDetail;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptions setCommonNasDetail(DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsCommonNasDetail commonNasDetail) {
            this.commonNasDetail = commonNasDetail;
            return this;
        }
        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsCommonNasDetail getCommonNasDetail() {
            return this.commonNasDetail;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptions setFileDetail(DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsFileDetail fileDetail) {
            this.fileDetail = fileDetail;
            return this;
        }
        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsFileDetail getFileDetail() {
            return this.fileDetail;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptions setOssDetail(DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsOssDetail ossDetail) {
            this.ossDetail = ossDetail;
            return this;
        }
        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsOssDetail getOssDetail() {
            return this.ossDetail;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptions setUdmDetail(DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsUdmDetail udmDetail) {
            this.udmDetail = udmDetail;
            return this;
        }
        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsUdmDetail getUdmDetail() {
            return this.udmDetail;
        }

    }

    public static class DescribePolicyBindingsResponseBodyPolicyBindings extends TeaModel {
        /**
         * <p>The advanced options.</p>
         */
        @NameInMap("AdvancedOptions")
        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptions advancedOptions;

        /**
         * <p>The time when the backup policy was created. This value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The name of the RAM role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
         */
        @NameInMap("CrossAccountRoleName")
        public String crossAccountRoleName;

        /**
         * <p>Indicates whether data is backed up within the same Alibaba Cloud account or across Alibaba Cloud accounts. Valid values:</p>
         * <br>
         * <p>*   SELF_ACCOUNT: Data is backed up within the same Alibaba Cloud account.</p>
         * <p>*   CROSS_ACCOUNT: Data is backed up across Alibaba Cloud accounts.</p>
         */
        @NameInMap("CrossAccountType")
        public String crossAccountType;

        /**
         * <p>The ID of the source Alibaba Cloud account that authorizes the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
         */
        @NameInMap("CrossAccountUserId")
        public Long crossAccountUserId;

        /**
         * <p>The ID of the data source.</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <p>Indicates whether the backup policy is enabled for the data source. Valid values:</p>
         * <br>
         * <p>*   true: The backup policy is disabled.</p>
         * <p>*   false: The backup policy is enabled.</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>The description of the association.</p>
         */
        @NameInMap("PolicyBindingDescription")
        public String policyBindingDescription;

        /**
         * <p>The ID of the association.</p>
         */
        @NameInMap("PolicyBindingId")
        public String policyBindingId;

        /**
         * <p>The policy ID.</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The type of the data source. Valid values:</p>
         * <br>
         * <p>*   **UDM_ECS**: ECS instances</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The time when the backup policy was updated. The value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        public static DescribePolicyBindingsResponseBodyPolicyBindings build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyBindingsResponseBodyPolicyBindings self = new DescribePolicyBindingsResponseBodyPolicyBindings();
            return TeaModel.build(map, self);
        }

        public DescribePolicyBindingsResponseBodyPolicyBindings setAdvancedOptions(DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptions advancedOptions) {
            this.advancedOptions = advancedOptions;
            return this;
        }
        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptions getAdvancedOptions() {
            return this.advancedOptions;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindings setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindings setCrossAccountRoleName(String crossAccountRoleName) {
            this.crossAccountRoleName = crossAccountRoleName;
            return this;
        }
        public String getCrossAccountRoleName() {
            return this.crossAccountRoleName;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindings setCrossAccountType(String crossAccountType) {
            this.crossAccountType = crossAccountType;
            return this;
        }
        public String getCrossAccountType() {
            return this.crossAccountType;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindings setCrossAccountUserId(Long crossAccountUserId) {
            this.crossAccountUserId = crossAccountUserId;
            return this;
        }
        public Long getCrossAccountUserId() {
            return this.crossAccountUserId;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindings setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindings setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindings setPolicyBindingDescription(String policyBindingDescription) {
            this.policyBindingDescription = policyBindingDescription;
            return this;
        }
        public String getPolicyBindingDescription() {
            return this.policyBindingDescription;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindings setPolicyBindingId(String policyBindingId) {
            this.policyBindingId = policyBindingId;
            return this;
        }
        public String getPolicyBindingId() {
            return this.policyBindingId;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindings setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindings setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindings setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

    }

}
