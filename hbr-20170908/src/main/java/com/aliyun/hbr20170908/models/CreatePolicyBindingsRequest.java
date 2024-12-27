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
     * 
     * <strong>example:</strong>
     * <p>po-000************8ep</p>
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
        /**
         * <p>The size of backup shards (the number of files).</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("FetchSliceSize")
        public Long fetchSliceSize;

        /**
         * <p>Specifies whether the system performs full backup if incremental backup fails. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The system performs full backup if incremental backup fails.</li>
         * <li><strong>false</strong>: The system does not perform full backup if incremental backup fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
        /**
         * <p>The ID of the backup client group. When you perform on-premises NAS backup, Cloud Backup selects clients from the specified backup client group.</p>
         * 
         * <strong>example:</strong>
         * <p>cl-000**************ggu</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The size of backup shards (the number of files).</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("FetchSliceSize")
        public Long fetchSliceSize;

        /**
         * <p>Specifies whether the system performs full backup if incremental backup fails. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The system performs full backup if incremental backup fails.</li>
         * <li><strong>false</strong>: The system does not perform full backup if incremental backup fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
        /**
         * <p>Specifies whether to use an advanced policy. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: uses the advanced policy.</li>
         * <li><strong>false</strong>: does not use the advanced policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AdvPolicy")
        public Boolean advPolicy;

        /**
         * <p>Specifies whether to enable the Volume Shadow Copy Service (VSS) feature. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables the feature.</li>
         * <li><strong>false</strong>: disables the feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
         * <p>Do not prompt for archival type objects in task statistics and failed file lists.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IgnoreArchiveObject")
        public Boolean ignoreArchiveObject;

        /**
         * <p>Specifies whether the system deletes the inventory lists when a backup is completed. This parameter is valid only when OSS inventories are used. Valid values:</p>
         * <ul>
         * <li><strong>NO_CLEANUP</strong>: does not delete inventory lists.</li>
         * <li><strong>DELETE_CURRENT</strong>: deletes the current inventory list.</li>
         * <li><strong>DELETE_CURRENT_AND_PREVIOUS</strong>: deletes all inventory lists.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NO_CLEANUP</p>
         */
        @NameInMap("InventoryCleanupPolicy")
        public String inventoryCleanupPolicy;

        /**
         * <p>The name of the OSS inventory. If this parameter is not empty, the OSS inventory is used for performance optimization.</p>
         * <ul>
         * <li>If you want to back up more than 100 million OSS objects, we recommend that you use inventory lists to accelerate incremental backup. Storage fees for inventory lists are included into your OSS bills.</li>
         * <li>A certain amount of time is required for OSS to generate inventory lists. Before inventory lists are generated, OSS objects may fail to be backed up. In this case, you can back up the OSS objects in the next backup cycle.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss-inventory-default</p>
         */
        @NameInMap("InventoryId")
        public String inventoryId;

        public static CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsOssDetail build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsOssDetail self = new CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsOssDetail();
            return TeaModel.build(map, self);
        }

        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsOssDetail setIgnoreArchiveObject(Boolean ignoreArchiveObject) {
            this.ignoreArchiveObject = ignoreArchiveObject;
            return this;
        }
        public Boolean getIgnoreArchiveObject() {
            return this.ignoreArchiveObject;
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
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AppConsistent")
        public Boolean appConsistent;

        /**
         * <p>The IDs of the disks that need to be protected. If all disks need to be protected, this parameter is empty.</p>
         */
        @NameInMap("DiskIdList")
        public java.util.List<String> diskIdList;

        /**
         * <p>This parameter is required only if you set the <strong>AppConsistent</strong> parameter to <strong>true</strong>. This parameter specifies whether to enable Linux fsfreeze to put file systems into the read-only state before application-consistent snapshots are created. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableFsFreeze")
        public Boolean enableFsFreeze;

        /**
         * <p>This parameter is required only if you set the <strong>AppConsistent</strong> parameter to <strong>true</strong>. This parameter specifies whether to create application-consistent snapshots. Valid values:</p>
         * <ul>
         * <li>true: creates application-consistent snapshots.</li>
         * <li>false: creates file system-consistent snapshots.</li>
         * </ul>
         * <p>Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableWriters")
        public Boolean enableWriters;

        /**
         * <p>The IDs of the disks that do not need to be protected. If the DiskIdList parameter is not empty, this parameter is ignored.</p>
         */
        @NameInMap("ExcludeDiskIdList")
        public java.util.List<String> excludeDiskIdList;

        /**
         * <p>This parameter is required only if you set the <strong>AppConsistent</strong> parameter to <strong>true</strong>. This parameter specifies the path of the post-thaw scripts that are executed after application-consistent snapshots are created.</p>
         * 
         * <strong>example:</strong>
         * <p>/tmp/postscript.sh</p>
         */
        @NameInMap("PostScriptPath")
        public String postScriptPath;

        /**
         * <p>This parameter is required only if you set the <strong>AppConsistent</strong> parameter to <strong>true</strong>. This parameter specifies the path of the pre-freeze scripts that are executed before application-consistent snapshots are created.</p>
         * 
         * <strong>example:</strong>
         * <p>/tmp/prescript.sh</p>
         */
        @NameInMap("PreScriptPath")
        public String preScriptPath;

        /**
         * <p>This parameter is required only if you set the <strong>AppConsistent</strong> parameter to <strong>true</strong>. This parameter specifies the name of the Resource Access Management (RAM) role that is required to create application-consistent snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunECSInstanceForHbrRole</p>
         */
        @NameInMap("RamRoleName")
        public String ramRoleName;

        /**
         * <p>Specifies whether to create a snapshot-consistent group. You can create a snapshot-consistent group only if all disks are Enterprise SSDs (ESSDs).</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SnapshotGroup")
        public Boolean snapshotGroup;

        /**
         * <p>This parameter is required only if you set the <strong>AppConsistent</strong> parameter to <strong>true</strong>. This parameter specifies the I/O freeze timeout period. Default value: 30. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
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
        /**
         * <p>The advanced options for CPFS backup.</p>
         */
        @NameInMap("CommonFileSystemDetail")
        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsCommonFileSystemDetail commonFileSystemDetail;

        /**
         * <p>The advanced options for on-premises NAS backup.</p>
         */
        @NameInMap("CommonNasDetail")
        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsCommonNasDetail commonNasDetail;

        /**
         * <p>The advanced options for file backup.</p>
         */
        @NameInMap("FileDetail")
        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsFileDetail fileDetail;

        /**
         * <p>The advanced options for Object Storage Service (OSS) backup.</p>
         */
        @NameInMap("OssDetail")
        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsOssDetail ossDetail;

        /**
         * <p>The advanced options for ECS instance backup.</p>
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
         * <p>The advanced options.</p>
         */
        @NameInMap("AdvancedOptions")
        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptions advancedOptions;

        /**
         * <p>The name of the RAM role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>hbrcrossrole</p>
         */
        @NameInMap("CrossAccountRoleName")
        public String crossAccountRoleName;

        /**
         * <p>Specifies whether to back up and restore data within the same Alibaba Cloud account or across Alibaba Cloud accounts. Default value: SELF_ACCOUNT. Valid values:</p>
         * <ul>
         * <li><strong>SELF_ACCOUNT</strong>: backs up data within the same Alibaba Cloud account.</li>
         * <li><strong>CROSS_ACCOUNT</strong>: backs up data across Alibaba Cloud accounts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SELF_ACCOUNT</p>
         */
        @NameInMap("CrossAccountType")
        public String crossAccountType;

        /**
         * <p>The ID of the source Alibaba Cloud account that authorizes the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>144**********732</p>
         */
        @NameInMap("CrossAccountUserId")
        public Long crossAccountUserId;

        /**
         * <p>The ID of the data source. The meaning of this parameter depends on the <strong>SourceType</strong> parameter. Valid values:</p>
         * <ul>
         * <li><strong>UDM_ECS</strong>: the ID of the Elastic Compute Service (ECS) instance</li>
         * <li><strong>OSS</strong>: the name of the Object Storage Service (OSS) bucket</li>
         * <li><strong>NAS</strong>: the ID of the File Storage NAS (NAS) file system</li>
         * <li><strong>COMMON_NAS</strong>: the ID of the on-premises NAS file system</li>
         * <li><strong>ECS_FILE</strong>: the ID of the ECS instance</li>
         * <li><strong>File</strong>: the ID of the Cloud Backup client</li>
         * <li><strong>COMMON_FILE_SYSTEM</strong>: the ID of the Cloud Parallel File Storage (CPFS) backup data source</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>i-bp1************dl8</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <p>Specifies whether to disable the backup policy for the data source. Valid values:</p>
         * <ul>
         * <li>true: disables the backup policy for the data source</li>
         * <li>false: enables the backup policy for the data source</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Disabled")
        public String disabled;

        /**
         * <p>This parameter is required only if you set the <strong>SourceType</strong> parameter to <strong>ECS_FILE</strong>, <strong>File</strong>, <strong>NAS</strong>, <strong>COMMON_NAS</strong>, or <strong>COMMON_FILE_SYSTEM</strong>. This parameter specifies the type of files that do not need to be backed up. No files of the specified type are backed up. The value can be up to 255 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;<em>.doc\&quot;,\&quot;</em>.xltm\&quot;]</p>
         */
        @NameInMap("Exclude")
        public String exclude;

        /**
         * <p>This parameter is required only if you set the <strong>SourceType</strong> parameter to <strong>ECS_FILE</strong>, <strong>File</strong>, <strong>NAS</strong>, <strong>COMMON_NAS</strong>, or <strong>COMMON_FILE_SYSTEM</strong>. This parameter specifies the type of files to be backed up. All files of the specified type are backed up. The value can be up to 255 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;<em>.doc\&quot;,\&quot;</em>.xltm\&quot;]</p>
         */
        @NameInMap("Include")
        public String include;

        /**
         * <p>The description of the association.</p>
         * 
         * <strong>example:</strong>
         * <p>Bind data sources to a backup policy</p>
         */
        @NameInMap("PolicyBindingDescription")
        public String policyBindingDescription;

        /**
         * <ul>
         * <li>If the SourceType parameter is set to <strong>OSS</strong>, set the Source parameter to the prefix of the path to the folder that you want to back up. If you do not specify the Source parameter, the entire bucket (root directory) is backed up.</li>
         * <li>If the SourceType parameter is set to <strong>ECS_FILE</strong> or <strong>File</strong>, set the Source parameter to the path to the files that you want to back up. If you do not specify the Source parameter, all paths are backed up.</li>
         * <li>This parameter is required if the SourceType parameter is set to <strong>COMMON_FILE_SYSTEM</strong>. This parameter specifies the path to be backed up. To back up the /src path, enter [&quot;/src&quot;]. To back up the root path, enter [&quot;/&quot;].</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>backup/</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The type of the data source. Valid values:</p>
         * <ul>
         * <li><strong>UDM_ECS</strong>: ECS instance</li>
         * <li><strong>OSS</strong>: OSS bucket</li>
         * <li><strong>NAS</strong>: NAS file system</li>
         * <li><strong>COMMON_NAS</strong>: on-premises NAS file system</li>
         * <li><strong>ECS_FILE</strong>: ECS file</li>
         * <li><strong>File</strong>: on-premises file</li>
         * <li><strong>COMMON_FILE_SYSTEM</strong>: CPFS file system</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UDM_ECS</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>This parameter is required only if you set the <strong>SourceType</strong> parameter to <strong>ECS_FILE</strong> or <strong>File</strong>. This parameter specifies the throttling rules. Format: <code>{start}{end}{bandwidth}</code>. Separate multiple throttling rules with vertical bars (|). The time ranges of the throttling rules cannot overlap.</p>
         * <ul>
         * <li><strong>start</strong>: the start hour.</li>
         * <li><strong>end</strong>: the end hour.</li>
         * <li><strong>bandwidth</strong>: the bandwidth. Unit: KB/s.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0:24:1024</p>
         */
        @NameInMap("SpeedLimit")
        public String speedLimit;

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

        public CreatePolicyBindingsRequestPolicyBindingList setDisabled(String disabled) {
            this.disabled = disabled;
            return this;
        }
        public String getDisabled() {
            return this.disabled;
        }

        public CreatePolicyBindingsRequestPolicyBindingList setExclude(String exclude) {
            this.exclude = exclude;
            return this;
        }
        public String getExclude() {
            return this.exclude;
        }

        public CreatePolicyBindingsRequestPolicyBindingList setInclude(String include) {
            this.include = include;
            return this;
        }
        public String getInclude() {
            return this.include;
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

        public CreatePolicyBindingsRequestPolicyBindingList setSpeedLimit(String speedLimit) {
            this.speedLimit = speedLimit;
            return this;
        }
        public String getSpeedLimit() {
            return this.speedLimit;
        }

    }

}
