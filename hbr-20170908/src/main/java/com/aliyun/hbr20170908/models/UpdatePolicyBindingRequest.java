// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpdatePolicyBindingRequest extends TeaModel {
    /**
     * <p>The advanced options.</p>
     */
    @NameInMap("AdvancedOptions")
    public UpdatePolicyBindingRequestAdvancedOptions advancedOptions;

    /**
     * <p>The ID of the data source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1************dtv</p>
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
    public Boolean disabled;

    /**
     * <p>This parameter is required only if you set the <strong>SourceType</strong> parameter to <strong>ECS_FILE</strong> or <strong>File</strong>. This parameter specifies the type of files that do not need to be backed up. No files of the specified type are backed up. The value can be up to 255 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;<em>.doc\&quot;,\&quot;</em>.xltm\&quot;]</p>
     */
    @NameInMap("Exclude")
    public String exclude;

    /**
     * <p>This parameter is required only if you set the <strong>SourceType</strong> parameter to <strong>ECS_FILE</strong> or <strong>File</strong>. This parameter specifies the type of files to be backed up. All files of the specified type are backed up. The value can be up to 255 characters in length.</p>
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
     * <p>po-000<strong><strong><strong><strong><strong><strong>5xx-i-2ze</strong></strong></strong></strong></strong></strong>nw4</p>
     */
    @NameInMap("PolicyBindingDescription")
    public String policyBindingDescription;

    /**
     * <p>The ID of the backup policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>po-000************ky9</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <ul>
     * <li>If the SourceType parameter is set to <strong>OSS</strong>, set the Source parameter to the prefix of the path to the folder that you want to back up. If you do not specify the Source parameter, the entire bucket (root directory) is backed up.</li>
     * <li>If the SourceType parameter is set to <strong>ECS_FILE</strong> or <strong>File</strong>, set the Source parameter to the path to the files that you want to back up. If you do not specify the Source parameter, all paths backed up.</li>
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
     * <li><strong>UDM_ECS</strong>: ECS instance backup</li>
     * </ul>
     * <p>This parameter is required.</p>
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
     * <p>0:24:5120</p>
     */
    @NameInMap("SpeedLimit")
    public String speedLimit;

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

    public UpdatePolicyBindingRequest setExclude(String exclude) {
        this.exclude = exclude;
        return this;
    }
    public String getExclude() {
        return this.exclude;
    }

    public UpdatePolicyBindingRequest setInclude(String include) {
        this.include = include;
        return this;
    }
    public String getInclude() {
        return this.include;
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

    public UpdatePolicyBindingRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public UpdatePolicyBindingRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public UpdatePolicyBindingRequest setSpeedLimit(String speedLimit) {
        this.speedLimit = speedLimit;
        return this;
    }
    public String getSpeedLimit() {
        return this.speedLimit;
    }

    public static class UpdatePolicyBindingRequestAdvancedOptionsCommonFileSystemDetail extends TeaModel {
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

        public static UpdatePolicyBindingRequestAdvancedOptionsCommonFileSystemDetail build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolicyBindingRequestAdvancedOptionsCommonFileSystemDetail self = new UpdatePolicyBindingRequestAdvancedOptionsCommonFileSystemDetail();
            return TeaModel.build(map, self);
        }

        public UpdatePolicyBindingRequestAdvancedOptionsCommonFileSystemDetail setFetchSliceSize(Long fetchSliceSize) {
            this.fetchSliceSize = fetchSliceSize;
            return this;
        }
        public Long getFetchSliceSize() {
            return this.fetchSliceSize;
        }

        public UpdatePolicyBindingRequestAdvancedOptionsCommonFileSystemDetail setFullOnIncrementFail(Boolean fullOnIncrementFail) {
            this.fullOnIncrementFail = fullOnIncrementFail;
            return this;
        }
        public Boolean getFullOnIncrementFail() {
            return this.fullOnIncrementFail;
        }

    }

    public static class UpdatePolicyBindingRequestAdvancedOptionsOssDetail extends TeaModel {
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
         * <p>30663060</p>
         */
        @NameInMap("InventoryId")
        public String inventoryId;

        public static UpdatePolicyBindingRequestAdvancedOptionsOssDetail build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolicyBindingRequestAdvancedOptionsOssDetail self = new UpdatePolicyBindingRequestAdvancedOptionsOssDetail();
            return TeaModel.build(map, self);
        }

        public UpdatePolicyBindingRequestAdvancedOptionsOssDetail setIgnoreArchiveObject(Boolean ignoreArchiveObject) {
            this.ignoreArchiveObject = ignoreArchiveObject;
            return this;
        }
        public Boolean getIgnoreArchiveObject() {
            return this.ignoreArchiveObject;
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
         * <li>true: creates application-consistent snapshots</li>
         * <li>false: creates file system-consistent snapshots</li>
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
        /**
         * <p>The details about large-scale file system backup.</p>
         */
        @NameInMap("CommonFileSystemDetail")
        public UpdatePolicyBindingRequestAdvancedOptionsCommonFileSystemDetail commonFileSystemDetail;

        /**
         * <p>The details about Object Storage Service (OSS) backup.</p>
         */
        @NameInMap("OssDetail")
        public UpdatePolicyBindingRequestAdvancedOptionsOssDetail ossDetail;

        /**
         * <p>The details about Elastic Compute Service (ECS) instance backup.</p>
         */
        @NameInMap("UdmDetail")
        public UpdatePolicyBindingRequestAdvancedOptionsUdmDetail udmDetail;

        public static UpdatePolicyBindingRequestAdvancedOptions build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolicyBindingRequestAdvancedOptions self = new UpdatePolicyBindingRequestAdvancedOptions();
            return TeaModel.build(map, self);
        }

        public UpdatePolicyBindingRequestAdvancedOptions setCommonFileSystemDetail(UpdatePolicyBindingRequestAdvancedOptionsCommonFileSystemDetail commonFileSystemDetail) {
            this.commonFileSystemDetail = commonFileSystemDetail;
            return this;
        }
        public UpdatePolicyBindingRequestAdvancedOptionsCommonFileSystemDetail getCommonFileSystemDetail() {
            return this.commonFileSystemDetail;
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
