// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribePolicyBindingsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The association between the backup policy and data sources.</p>
     */
    @NameInMap("PolicyBindings")
    public java.util.List<DescribePolicyBindingsResponseBodyPolicyBindings> policyBindings;

    /**
     * <strong>example:</strong>
     * <p>5225929A-4EBD-55EE-9FE1-4A130E582A76</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>38</p>
     */
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
         * <p>The ID of the Cloud Backup client.</p>
         * 
         * <strong>example:</strong>
         * <p>c-0001eg6mcvjs93f46s2d</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The ID of the client group.</p>
         * 
         * <strong>example:</strong>
         * <p>cl-000gkcofngi04j6k680a</p>
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
         * <p>Indicates whether the system performs full backup if incremental backup fails. Valid values:</p>
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
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AdvPolicy")
        public Boolean advPolicy;

        /**
         * <p>Indicates whether the Volume Shadow Copy Service (VSS) feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The feature is enabled.</li>
         * <li><strong>false</strong>: The feature is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>不在任务统计和失败文件列表中提示归档型对象</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IgnoreArchiveObject")
        public Boolean ignoreArchiveObject;

        /**
         * <p>Indicates whether the system deletes the inventory lists when a backup is completed. This parameter is valid only when OSS inventories are used. Valid values:</p>
         * <ul>
         * <li><strong>NO_CLEANUP</strong>: Inventory lists are not deleted.</li>
         * <li><strong>DELETE_CURRENT</strong>: The current inventory list is deleted.</li>
         * <li><strong>DELETE_CURRENT_AND_PREVIOUS</strong>: All inventory lists are deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DELETE_CURRENT_AND_PREVIOUS</p>
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
         * <p>inventory_test</p>
         */
        @NameInMap("InventoryId")
        public String inventoryId;

        public static DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsOssDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsOssDetail self = new DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsOssDetail();
            return TeaModel.build(map, self);
        }

        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsOssDetail setIgnoreArchiveObject(Boolean ignoreArchiveObject) {
            this.ignoreArchiveObject = ignoreArchiveObject;
            return this;
        }
        public Boolean getIgnoreArchiveObject() {
            return this.ignoreArchiveObject;
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
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AppConsistent")
        public Boolean appConsistent;

        /**
         * <p>The ID of the custom KMS key in the destination region. If this parameter is not empty and geo-replication is enabled, the key is used for encrypted geo-replication.</p>
         * 
         * <strong>example:</strong>
         * <p>4ed37b1e-da51-4187-aceb-9db4f9b7148b</p>
         */
        @NameInMap("DestinationKmsKeyId")
        public String destinationKmsKeyId;

        /**
         * <p>The IDs of the disks that need to be protected. If all disks need to be protected, this parameter is empty.</p>
         */
        @NameInMap("DiskIdList")
        public java.util.List<String> diskIdList;

        /**
         * <p>This parameter is required only if you set the <strong>AppConsistent</strong> parameter to <strong>true</strong>. This parameter indicates whether to enable Linux fsfreeze to put file systems into the read-only state before application-consistent snapshots are created. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableFsFreeze")
        public Boolean enableFsFreeze;

        /**
         * <p>This parameter is required only if you set the <strong>AppConsistent</strong> parameter to <strong>true</strong>. This parameter indicates whether application-consistent snapshots are created. Valid values:</p>
         * <ul>
         * <li>true: Application-consistent snapshots are created.</li>
         * <li>false: File system-consistent snapshots are created.</li>
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
         * <p>This parameter is required only if you set the <strong>AppConsistent</strong> parameter to <strong>true</strong>. This parameter indicates the path of the post-thaw scripts that are executed after application-consistent snapshots are created.</p>
         * 
         * <strong>example:</strong>
         * <p>/tmp/postscript.sh</p>
         */
        @NameInMap("PostScriptPath")
        public String postScriptPath;

        /**
         * <p>This parameter is required only if you set the <strong>AppConsistent</strong> parameter to <strong>true</strong>. This parameter indicates the path of the pre-freeze scripts that are executed before application-consistent snapshots are created.</p>
         * 
         * <strong>example:</strong>
         * <p>/tmp/prescript.sh</p>
         */
        @NameInMap("PreScriptPath")
        public String preScriptPath;

        /**
         * <p>This parameter is required only if you set the <strong>AppConsistent</strong> parameter to <strong>true</strong>. This parameter indicates the name of the RAM role that is required to create application-consistent snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunECSInstanceForHbrRole</p>
         */
        @NameInMap("RamRoleName")
        public String ramRoleName;

        /**
         * <p>Indicates whether a snapshot-consistent group is created. You can create a snapshot-consistent group only if all disks are enhanced SSDs (ESSDs).</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SnapshotGroup")
        public Boolean snapshotGroup;

        /**
         * <p>This parameter is required only if you set the <strong>AppConsistent</strong> parameter to <strong>true</strong>. This parameter indicates the I/O freeze timeout period. Default value: 30. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
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
        /**
         * <p>The advanced options for large-scale file system backup.</p>
         */
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

    public static class DescribePolicyBindingsResponseBodyPolicyBindingsHitTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag-based matching rule.</p>
         * <ul>
         * <li><strong>EQUAL</strong>: Both the tag key and tag value are matched.</li>
         * <li><strong>NOT</strong>: The tag key is matched and the tag value is not matched.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EQUAL</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>prod</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribePolicyBindingsResponseBodyPolicyBindingsHitTags build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyBindingsResponseBodyPolicyBindingsHitTags self = new DescribePolicyBindingsResponseBodyPolicyBindingsHitTags();
            return TeaModel.build(map, self);
        }

        public DescribePolicyBindingsResponseBodyPolicyBindingsHitTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindingsHitTags setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindingsHitTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribePolicyBindingsResponseBodyPolicyBindings extends TeaModel {
        /**
         * <p>The advanced options.</p>
         */
        @NameInMap("AdvancedOptions")
        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptions advancedOptions;

        /**
         * <p>Indicates whether the resource is automatically associated with the related resource tag in the backup policy.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CreatedByTag")
        public Boolean createdByTag;

        /**
         * <p>The time when the backup policy was created. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1661399570</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The name of the RAM role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>hbrcrossrole</p>
         */
        @NameInMap("CrossAccountRoleName")
        public String crossAccountRoleName;

        /**
         * <p>Indicates whether data is backed up within the same Alibaba Cloud account or across Alibaba Cloud accounts. Valid values:</p>
         * <ul>
         * <li>SELF_ACCOUNT: Data is backed up within the same Alibaba Cloud account.</li>
         * <li>CROSS_ACCOUNT: Data is backed up across Alibaba Cloud accounts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CROSS_ACCOUNT</p>
         */
        @NameInMap("CrossAccountType")
        public String crossAccountType;

        /**
         * <p>The ID of the source Alibaba Cloud account that authorizes the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>1480************</p>
         */
        @NameInMap("CrossAccountUserId")
        public Long crossAccountUserId;

        /**
         * <p>The ID of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>i-8vb************5ly</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <p>Indicates whether the backup policy is enabled for the data source. Valid values:</p>
         * <ul>
         * <li>true: The backup policy is disabled.</li>
         * <li>false: The backup policy is enabled.</li>
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
         * <p>The matched tag rules.</p>
         */
        @NameInMap("HitTags")
        public java.util.List<DescribePolicyBindingsResponseBodyPolicyBindingsHitTags> hitTags;

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
         * <p>po-000<strong><strong><strong><strong><strong><strong>eslc-i-uf6</strong></strong></strong></strong></strong></strong>y5g</p>
         */
        @NameInMap("PolicyBindingDescription")
        public String policyBindingDescription;

        /**
         * <p>The ID of the association.</p>
         * 
         * <strong>example:</strong>
         * <p>pd-000************slc</p>
         */
        @NameInMap("PolicyBindingId")
        public String policyBindingId;

        /**
         * <p>The ID of the backup policy.</p>
         * 
         * <strong>example:</strong>
         * <p>po-000************56y</p>
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
         * <li><strong>UDM_ECS</strong>: ECS instances</li>
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
         * <p>0:24:10240</p>
         */
        @NameInMap("SpeedLimit")
        public String speedLimit;

        /**
         * <p>The time when the backup policy was updated. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1653611573</p>
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

        public DescribePolicyBindingsResponseBodyPolicyBindings setCreatedByTag(Boolean createdByTag) {
            this.createdByTag = createdByTag;
            return this;
        }
        public Boolean getCreatedByTag() {
            return this.createdByTag;
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

        public DescribePolicyBindingsResponseBodyPolicyBindings setExclude(String exclude) {
            this.exclude = exclude;
            return this;
        }
        public String getExclude() {
            return this.exclude;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindings setHitTags(java.util.List<DescribePolicyBindingsResponseBodyPolicyBindingsHitTags> hitTags) {
            this.hitTags = hitTags;
            return this;
        }
        public java.util.List<DescribePolicyBindingsResponseBodyPolicyBindingsHitTags> getHitTags() {
            return this.hitTags;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindings setInclude(String include) {
            this.include = include;
            return this;
        }
        public String getInclude() {
            return this.include;
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

        public DescribePolicyBindingsResponseBodyPolicyBindings setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindings setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribePolicyBindingsResponseBodyPolicyBindings setSpeedLimit(String speedLimit) {
            this.speedLimit = speedLimit;
            return this;
        }
        public String getSpeedLimit() {
            return this.speedLimit;
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
