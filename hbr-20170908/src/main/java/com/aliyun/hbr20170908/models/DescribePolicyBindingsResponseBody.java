// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribePolicyBindingsResponseBody extends TeaModel {
    /**
     * <p>The response code. 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The number of results for each query.</p>
     * <p>Valid values: 10 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The returned message. &quot;successful&quot; is returned for success. An error message is returned for failure.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The token required to obtain the next page of policy-data source bindings.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of policy bindings.</p>
     */
    @NameInMap("PolicyBindings")
    public java.util.List<DescribePolicyBindingsResponseBodyPolicyBindings> policyBindings;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5225929A-4EBD-55EE-9FE1-4A130E582A76</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * <ul>
     * <li>true: Successful.</li>
     * <li>false: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of records.</p>
     * 
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
         * <p>The backup client ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c-0001eg6mcvjs93f46s2d</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The client group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cl-000gkcofngi04j6k680a</p>
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
         * <li><strong>true</strong>: Switches to a full backup upon failure.</li>
         * <li><strong>false</strong>: Does not switch to a full backup upon failure.</li>
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
         * <p>Specifies whether to use an advanced policy. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Used.</li>
         * <li><strong>false</strong>: Not used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>Specifies whether to exclude archive objects from task statistics and failed file lists.</p>
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
         * <p>DELETE_CURRENT_AND_PREVIOUS</p>
         */
        @NameInMap("InventoryCleanupPolicy")
        public String inventoryCleanupPolicy;

        /**
         * <p>The OSS inventory name. If this value is not empty, the OSS inventory is used for performance tuning.</p>
         * <ul>
         * <li>Using an inventory to improve incremental performance is recommended when backing up more than 100 million OSS objects. Storage fees generated by inventory files are charged separately by OSS.</li>
         * <li>OSS inventory files take time to generate. Backup may fail before the OSS inventory file is generated. Wait for the next cycle to execute.</li>
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
         * <p>Specifies whether to create an application-consistent snapshot. Creating an application-consistent snapshot is supported only when all cloud disk types are ESSD.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AppConsistent")
        public Boolean appConsistent;

        /**
         * <p>The custom KMS key ID in the destination region. If this field is not empty and cross-region replication is enabled, this key is used to encrypt the cross-region replication.</p>
         * 
         * <strong>example:</strong>
         * <p>4ed37b1e-da51-4187-aceb-9db4f9b7148b</p>
         */
        @NameInMap("DestinationKmsKeyId")
        public String destinationKmsKeyId;

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
         * <p>This parameter is required only when <strong>AppConsistent</strong> is set to <strong>true</strong>. The path of the post-thaw script to execute after creating an application-consistent snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>/tmp/postscript.sh</p>
         */
        @NameInMap("PostScriptPath")
        public String postScriptPath;

        /**
         * <p>This parameter is required only when <strong>AppConsistent</strong> is set to <strong>true</strong>. The path of the pre-freeze script to execute before creating an application-consistent snapshot.</p>
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
         * <p>Specifies whether to create a snapshot-consistent group. Creating a snapshot-consistent group is supported only when all cloud disk types are ESSD.</p>
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
         * <p>The advanced options for on-premises NAS.</p>
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
         * <p>The tag matching rule.</p>
         * <ul>
         * <li><strong>EQUAL</strong>: Matches both the tag key and tag value.</li>
         * <li><strong>NOT</strong>: Matches the tag key but does not match the tag value.</li>
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
         * <p>Indicates whether the resource is automatically associated through a backup policy resource tag.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CreatedByTag")
        public Boolean createdByTag;

        /**
         * <p>The creation time. UNIX timestamp, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1661399570</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The RAM role name created in the source account for cross-account backup.</p>
         * 
         * <strong>example:</strong>
         * <p>hbrcrossrole</p>
         */
        @NameInMap("CrossAccountRoleName")
        public String crossAccountRoleName;

        /**
         * <p>The cross-account backup type. Valid values: </p>
         * <ul>
         * <li>SELF_ACCOUNT: backup within the current account.</li>
         * <li>CROSS_ACCOUNT: cross-account backup.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CROSS_ACCOUNT</p>
         */
        @NameInMap("CrossAccountType")
        public String crossAccountType;

        /**
         * <p>The ID of the source account for cross-account backup.</p>
         * 
         * <strong>example:</strong>
         * <p>1480************</p>
         */
        @NameInMap("CrossAccountUserId")
        public Long crossAccountUserId;

        /**
         * <p>The data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-8vb************5ly</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <p>Indicates whether the policy is effective for the data source.</p>
         * <ul>
         * <li>true: paused.</li>
         * <li>false: not paused.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong> or <strong>File</strong>. Specifies the file types to exclude from backup. All files of these types are not backed up. Maximum of 255 characters.</p>
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
         * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong> or <strong>File</strong>. Specifies the file types to back up. All files of these types are backed up. Maximum of 255 characters.</p>
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
         * <p>po-000<strong><strong><strong><strong><strong><strong>eslc-i-uf6</strong></strong></strong></strong></strong></strong>y5g</p>
         */
        @NameInMap("PolicyBindingDescription")
        public String policyBindingDescription;

        /**
         * <p>The policy binding ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pd-000************slc</p>
         */
        @NameInMap("PolicyBindingId")
        public String policyBindingId;

        /**
         * <p>The policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>po-000************56y</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <ul>
         * <li>If SourceType is set to <strong>OSS</strong>, this parameter specifies the prefix to back up. If not specified, the entire Bucket root directory is backed up.</li>
         * <li>If SourceType is set to <strong>ECS_FILE</strong> or <strong>File</strong>, this parameter specifies the file directory to back up. If not specified, all directories are backed up.</li>
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
         * 
         * <strong>example:</strong>
         * <p>UDM_ECS</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>This parameter is required only when <strong>SourceType</strong> is set to <strong>ECS_FILE</strong> or <strong>File</strong>. Specifies the backup traffic control. Format: <code>{start}{end}{bandwidth}</code>. Multiple traffic control configurations are separated by delimiters, and configuration times cannot overlap.</p>
         * <ul>
         * <li><strong>start</strong>: start hour.</li>
         * <li><strong>end</strong>: end hour.</li>
         * <li><strong>bandwidth</strong>: rate limit, in KB/s.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0:24:10240</p>
         */
        @NameInMap("SpeedLimit")
        public String speedLimit;

        /**
         * <p>The update time. UNIX timestamp, in seconds.</p>
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
