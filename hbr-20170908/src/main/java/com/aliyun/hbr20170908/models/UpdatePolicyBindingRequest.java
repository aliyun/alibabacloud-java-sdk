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
     * <p>The data source ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1************dtv</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <p>Specifies whether the policy is suspended for the data source.</p>
     * <ul>
     * <li>true: Suspended.</li>
     * <li>false: Not suspended.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Disabled")
    public Boolean disabled;

    /**
     * <p>This parameter is valid only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>, <strong>File</strong>, <strong>NAS</strong>, <strong>COMMON_NAS</strong>, or <strong>COMMON_FILE_SYSTEM</strong>. Specifies the file types to back up. All files of these types are backed up. The value can be up to 255 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;<em>.doc\&quot;,\&quot;</em>.xltm\&quot;]</p>
     */
    @NameInMap("Exclude")
    public String exclude;

    /**
     * <p>This parameter is valid only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>, <strong>File</strong>, <strong>NAS</strong>, <strong>COMMON_NAS</strong>, or <strong>COMMON_FILE_SYSTEM</strong>. Specifies the file types to back up. All files of these types are backed up. The value can be up to 255 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;<em>.doc\&quot;,\&quot;</em>.xltm\&quot;]</p>
     */
    @NameInMap("Include")
    public String include;

    /**
     * <p>The description of the policy binding.</p>
     * 
     * <strong>example:</strong>
     * <p>po-000<strong><strong><strong><strong><strong><strong>5xx-i-2ze</strong></strong></strong></strong></strong></strong>nw4</p>
     */
    @NameInMap("PolicyBindingDescription")
    public String policyBindingDescription;

    /**
     * <p>The policy ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>po-000************ky9</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The meaning varies depending on the SourceType value:</p>
     * <ul>
     * <li><strong>OSS</strong>: The prefix to back up. If not specified, the entire root directory of the bucket is backed up. Only a single prefix is supported. To back up /backup, set this parameter to /backup.</li>
     * <li><strong>ECS_FILE</strong>: The file directories to back up. If not specified, all directories are backed up. Multiple directories are supported. To back up files in /a and /b, set this parameter to [&quot;/a&quot;, &quot;/b&quot;].</li>
     * <li><strong>File</strong>: The file directories to back up. If not specified, all directories are backed up. Multiple directories are supported. To back up files in /a and /b, set this parameter to [&quot;/a&quot;, &quot;/b&quot;].</li>
     * <li><strong>COMMON_FILE_SYSTEM</strong>: Required. The source paths to back up. Multiple paths are supported. To back up /a and /b, set this parameter to [&quot;/a&quot;, &quot;/b&quot;]. To back up the root path, set this parameter to [&quot;/&quot;].</li>
     * <li><strong>COMMON_NAS</strong>: Required. The source path to back up. Only a single path is supported. To back up /a, set this parameter to [&quot;/a&quot;]. To back up the root path, set this parameter to [&quot;/&quot;].</li>
     * <li><strong>OTS</strong>: The list of data tables to back up. If not specified, all data tables are backed up. Multiple data tables are supported. To back up data tables a and b, set this parameter to [&quot;a&quot;, &quot;b&quot;].</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>backup/</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The data source type. Valid values:</p>
     * <ul>
     * <li><strong>UDM_ECS</strong>: ECS instance backup.</li>
     * <li><strong>OSS</strong>: OSS backup.</li>
     * <li><strong>NAS</strong>: Alibaba Cloud NAS backup.</li>
     * <li><strong>COMMON_NAS</strong>: On-premises NAS backup.</li>
     * <li><strong>ECS_FILE</strong>: ECS File Backup Essential Edition.</li>
     * <li><strong>File</strong>: On-premises file backup.</li>
     * <li><strong>COMMON_FILE_SYSTEM</strong>: CPFS backup.</li>
     * <li><strong>OTS</strong>: Tablestore backup.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UDM_ECS</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong> or <strong>File</strong>. Specifies the backup traffic control. The format is <code>{start}{end}{bandwidth}</code>. Multiple traffic control configurations are separated by delimiters, and the time ranges cannot overlap.</p>
     * <ul>
     * <li><strong>start</strong>: The start hour.</li>
     * <li><strong>end</strong>: The end hour.</li>
     * <li><strong>bandwidth</strong>: The rate limit, in KB/s.</li>
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
         * <p>The sub-task slice size (number of files).</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("FetchSliceSize")
        public Long fetchSliceSize;

        /**
         * <p>Specifies whether to switch to a full backup when an incremental backup fails. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Switches to a full backup upon failure.</li>
         * <li><strong>false</strong>: Does not switch to a full backup upon failure.</li>
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
         * <p>Specifies whether to exclude archive objects from job statistics and failed file lists.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IgnoreArchiveObject")
        public Boolean ignoreArchiveObject;

        /**
         * <p>Specifies whether to delete inventory files after backup. This parameter is valid only when OSS inventory is used. Valid values:</p>
         * <ul>
         * <li><strong>NO_CLEANUP</strong>: Do not delete.</li>
         * <li><strong>DELETE_CURRENT</strong>: Delete the current file.</li>
         * <li><strong>DELETE_CURRENT_AND_PREVIOUS</strong>: Delete all files.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NO_CLEANUP</p>
         */
        @NameInMap("InventoryCleanupPolicy")
        public String inventoryCleanupPolicy;

        /**
         * <p>The OSS inventory name. When this value is not empty, the OSS inventory is used for performance optimization.</p>
         * <ul>
         * <li>For more than 100 million OSS objects, use an inventory to improve incremental performance. Storage fees generated by inventory files are charged separately by OSS.</li>
         * <li>OSS inventory files take time to generate. Backup jobs may fail before the inventory files are generated. Wait for the next cycle to execute.</li>
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
         * <p>Specifies whether to create an application-consistent snapshot. Application-consistent snapshots are supported only when all cloud disk types are ESSD.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AppConsistent")
        public Boolean appConsistent;

        /**
         * <p>The list of cloud disk IDs that need to be protected. This value is empty when all cloud disks are protected.</p>
         */
        @NameInMap("DiskIdList")
        public java.util.List<String> diskIdList;

        /**
         * <p>This parameter is required only when <strong>AppConsistent</strong> is set to <strong>true</strong>. Specifies whether to use the Linux FsFreeze mechanism to ensure the file system is in read consistency before creating an application-consistent snapshot. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableFsFreeze")
        public Boolean enableFsFreeze;

        /**
         * <p>This parameter is required only when <strong>AppConsistent</strong> is set to <strong>true</strong>. Specifies whether to create an application-consistent snapshot:</p>
         * <ul>
         * <li>true: Creates an application-consistent snapshot.</li>
         * <li>false: Creates a file system-consistent snapshot.</li>
         * </ul>
         * <p>Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableWriters")
        public Boolean enableWriters;

        /**
         * <p>The list of cloud disk IDs that do not need to be protected. This parameter is ignored when DiskIdList is not empty.</p>
         */
        @NameInMap("ExcludeDiskIdList")
        public java.util.List<String> excludeDiskIdList;

        /**
         * <p>This parameter is required only when <strong>AppConsistent</strong> is set to <strong>true</strong>. The path of the post-thaw script to run after creating an application-consistent snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>/tmp/postscript.sh</p>
         */
        @NameInMap("PostScriptPath")
        public String postScriptPath;

        /**
         * <p>This parameter is required only when <strong>AppConsistent</strong> is set to <strong>true</strong>. The path of the pre-freeze script to run before creating an application-consistent snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>/tmp/prescript.sh</p>
         */
        @NameInMap("PreScriptPath")
        public String preScriptPath;

        /**
         * <p>This parameter is required only when <strong>AppConsistent</strong> is set to <strong>true</strong>. The RAM role name required for creating application-consistent snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunECSInstanceForHbrRole</p>
         */
        @NameInMap("RamRoleName")
        public String ramRoleName;

        /**
         * <p>Specifies whether to create a snapshot-consistent group. Snapshot-consistent groups are supported only when all cloud disk types are ESSD.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SnapshotGroup")
        public Boolean snapshotGroup;

        /**
         * <p>This parameter is required only when <strong>AppConsistent</strong> is set to <strong>true</strong>. The I/O freeze timeout period. Unit: seconds. Default value: 30.</p>
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
         * <p>The large-scale file system backup details.</p>
         */
        @NameInMap("CommonFileSystemDetail")
        public UpdatePolicyBindingRequestAdvancedOptionsCommonFileSystemDetail commonFileSystemDetail;

        /**
         * <p>The OSS backup details.</p>
         */
        @NameInMap("OssDetail")
        public UpdatePolicyBindingRequestAdvancedOptionsOssDetail ossDetail;

        /**
         * <p>The ECS instance backup details.</p>
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
