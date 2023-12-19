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

    public static class DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsCommonNasDetail extends TeaModel {
        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("FetchSliceSize")
        public Long fetchSliceSize;

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
        @NameInMap("AdvPolicy")
        public Boolean advPolicy;

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
        @NameInMap("InventoryCleanupPolicy")
        public String inventoryCleanupPolicy;

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
        @NameInMap("AppConsistent")
        public Boolean appConsistent;

        @NameInMap("DestinationKmsKeyId")
        public String destinationKmsKeyId;

        @NameInMap("DiskIdList")
        public java.util.List<String> diskIdList;

        @NameInMap("EnableFsFreeze")
        public Boolean enableFsFreeze;

        @NameInMap("EnableWriters")
        public Boolean enableWriters;

        @NameInMap("ExcludeDiskIdList")
        public java.util.List<String> excludeDiskIdList;

        @NameInMap("PostScriptPath")
        public String postScriptPath;

        @NameInMap("PreScriptPath")
        public String preScriptPath;

        @NameInMap("RamRoleName")
        public String ramRoleName;

        @NameInMap("SnapshotGroup")
        public Boolean snapshotGroup;

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
        @NameInMap("CommonNasDetail")
        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsCommonNasDetail commonNasDetail;

        @NameInMap("FileDetail")
        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsFileDetail fileDetail;

        @NameInMap("OssDetail")
        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsOssDetail ossDetail;

        @NameInMap("UdmDetail")
        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptionsUdmDetail udmDetail;

        public static DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptions self = new DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptions();
            return TeaModel.build(map, self);
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
        @NameInMap("AdvancedOptions")
        public DescribePolicyBindingsResponseBodyPolicyBindingsAdvancedOptions advancedOptions;

        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("CrossAccountRoleName")
        public String crossAccountRoleName;

        @NameInMap("CrossAccountType")
        public String crossAccountType;

        @NameInMap("CrossAccountUserId")
        public Long crossAccountUserId;

        @NameInMap("DataSourceId")
        public String dataSourceId;

        @NameInMap("Disabled")
        public Boolean disabled;

        @NameInMap("PolicyBindingDescription")
        public String policyBindingDescription;

        @NameInMap("PolicyBindingId")
        public String policyBindingId;

        @NameInMap("PolicyId")
        public String policyId;

        @NameInMap("SourceType")
        public String sourceType;

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
