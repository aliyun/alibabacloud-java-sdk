// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreatePolicyBindingsRequest extends TeaModel {
    /**
     * <p>The list of policy bindings.</p>
     */
    @NameInMap("PolicyBindingList")
    public java.util.List<CreatePolicyBindingsRequestPolicyBindingList> policyBindingList;

    /**
     * <p>The policy ID.</p>
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
         * <li><strong>true</strong>: Switch to a full backup on failure.</li>
         * <li><strong>false</strong>: Do not switch to a full backup on failure.</li>
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
         * <p>The backup client group ID. On-premises NAS backup selects a client from the backup client group to perform the backup.</p>
         * 
         * <strong>example:</strong>
         * <p>cl-000**************ggu</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

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
         * <li><strong>true</strong>: Switch to a full backup on failure.</li>
         * <li><strong>false</strong>: Do not switch to a full backup on failure.</li>
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
         * <li><strong>true</strong>: Use.</li>
         * <li><strong>false</strong>: Do not use.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AdvPolicy")
        public Boolean advPolicy;

        /**
         * <p>Specifies whether to enable the Volume Shadow Copy Service (VSS) feature (Windows). Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled.</li>
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
         * <p>Specifies whether to exclude archive objects from job statistics and failed file lists.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IgnoreArchiveObject")
        public Boolean ignoreArchiveObject;

        /**
         * <p>Specifies whether to delete inventory files after backup. This parameter takes effect only when OSS inventory is used. Valid values:</p>
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
         * <li>Using an inventory is recommended for backing up more than 100 million OSS objects to improve incremental performance. Storage fees generated by inventory files are charged separately by OSS.</li>
         * <li>OSS inventory files take time to generate. Backup jobs may fail before the inventory files are generated. Wait for the next backup cycle.</li>
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
         * <p>Specifies whether to create an application-consistent snapshot. Application-consistent snapshots are supported only when all cloud disk types are ESSD.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AppConsistent")
        public Boolean appConsistent;

        /**
         * <p>The list of cloud disk IDs that need to be protected. Leave this value empty to protect all cloud disks.</p>
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
         * <p>This parameter is required only when <strong>AppConsistent</strong> is set to <strong>true</strong>. The I/O freeze timeout period, in seconds. Default value: 30.</p>
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
         * <p>The advanced options for OSS backup.</p>
         */
        @NameInMap("OssDetail")
        public CreatePolicyBindingsRequestPolicyBindingListAdvancedOptionsOssDetail ossDetail;

        /**
         * <p>The advanced options for ECS full server backup.</p>
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
         * <p>The RAM role name created in the source account for cross-account backup.</p>
         * 
         * <strong>example:</strong>
         * <p>hbrcrossrole</p>
         */
        @NameInMap("CrossAccountRoleName")
        public String crossAccountRoleName;

        /**
         * <p>The cross-account backup type. Default value: SELF_ACCOUNT. Valid values: </p>
         * <ul>
         * <li><strong>SELF_ACCOUNT</strong>: Backup within the same account.</li>
         * <li><strong>CROSS_ACCOUNT</strong>: Cross-account backup.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SELF_ACCOUNT</p>
         */
        @NameInMap("CrossAccountType")
        public String crossAccountType;

        /**
         * <p>The Alibaba Cloud UID of the source account for cross-account backup.</p>
         * 
         * <strong>example:</strong>
         * <p>144**********732</p>
         */
        @NameInMap("CrossAccountUserId")
        public Long crossAccountUserId;

        /**
         * <p>The data source ID. The value has different meanings depending on the <strong>SourceType</strong> field:</p>
         * <ul>
         * <li><strong>UDM_ECS</strong>: The ECS instance ID.</li>
         * <li><strong>OSS</strong>: The OSS bucket name.</li>
         * <li><strong>NAS</strong>: The Alibaba Cloud NAS file system ID.</li>
         * <li><strong>COMMON_NAS</strong>: The on-premises NAS instance ID.</li>
         * <li><strong>ECS_FILE</strong>: The ECS instance ID.</li>
         * <li><strong>File</strong>: The Cloud Backup client ID.</li>
         * <li><strong>COMMON_FILE_SYSTEM</strong>: The CPFS backup data source ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>i-bp1************dl8</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <p>Specifies whether the policy is suspended for this data source.</p>
         * <ul>
         * <li>true: Suspended.</li>
         * <li>false: Not suspended.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Disabled")
        public String disabled;

        /**
         * <p>This parameter can be configured when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>, <strong>File</strong>, <strong>NAS</strong>, <strong>COMMON_NAS</strong>, or <strong>COMMON_FILE_SYSTEM</strong>. Specifies the file types to exclude from the backup. All files of these types are not backed up. The value can be up to 255 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;<em>.doc\&quot;,\&quot;</em>.xltm\&quot;]</p>
         */
        @NameInMap("Exclude")
        public String exclude;

        /**
         * <p>This parameter can be configured when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong>, <strong>File</strong>, <strong>NAS</strong>, <strong>COMMON_NAS</strong>, or <strong>COMMON_FILE_SYSTEM</strong>. Specifies the file types to include in the backup. All files of these types are backed up. The value can be up to 255 characters in length.</p>
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
         * <p>This is a description of the policy binding</p>
         */
        @NameInMap("PolicyBindingDescription")
        public String policyBindingDescription;

        /**
         * <p>The value has different meanings depending on the SourceType value:</p>
         * <ul>
         * <li><strong>OSS</strong>: The prefix to back up. If not specified, the entire bucket root directory is backed up. Only a single prefix is supported. To back up /backup, specify /backup.</li>
         * <li><strong>ECS_FILE</strong>: The file directories to back up. If not specified, all directories are backed up. Multiple directories are supported. To back up files under /a and /b, specify [&quot;/a&quot;, &quot;/b&quot;].</li>
         * <li><strong>File</strong>: The file directories to back up. If not specified, all directories are backed up. Multiple directories are supported. To back up files under /a and /b, specify [&quot;/a&quot;, &quot;/b&quot;].</li>
         * <li><strong>COMMON_FILE_SYSTEM</strong>: Required. The source paths to back up. Multiple paths are supported. To back up /a and /b, specify [&quot;/a&quot;, &quot;/b&quot;]. To back up the root path, specify [&quot;/&quot;].</li>
         * <li><strong>COMMON_NAS</strong>: Required. The source path to back up. Only a single path is supported. To back up /a, specify [&quot;/a&quot;]. To back up the root path, specify [&quot;/&quot;].</li>
         * <li><strong>OTS</strong>: The list of data tables to back up. If not specified, all data tables are backed up. Multiple data tables are supported. To back up tables a and b, specify [&quot;a&quot;, &quot;b&quot;].</li>
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
         * <li><strong>UDM_ECS</strong>: ECS full server backup.</li>
         * <li><strong>OSS</strong>: OSS backup.</li>
         * <li><strong>NAS</strong>: Alibaba Cloud NAS backup.</li>
         * <li><strong>COMMON_NAS</strong>: On-premises NAS backup.</li>
         * <li><strong>ECS_FILE</strong>: ECS File Backup Essential Edition.</li>
         * <li><strong>File</strong>: On-premises file backup.</li>
         * <li><strong>COMMON_FILE_SYSTEM</strong>: CPFS backup.</li>
         * <li><strong>OTS</strong>: Tablestore backup.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UDM_ECS</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong> or <strong>File</strong>. Specifies the backup traffic control. The format is <code>{start}{end}{bandwidth}</code>. Multiple traffic control configurations are separated by delimiters, and the time ranges must not overlap.</p>
         * <ul>
         * <li><strong>start</strong>: The start hour.</li>
         * <li><strong>end</strong>: The end hour.</li>
         * <li><strong>bandwidth</strong>: The rate limit, in KB/s.</li>
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
