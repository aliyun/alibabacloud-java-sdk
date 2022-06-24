// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class GetMcubeNebulaTaskDetailResponseBody extends TeaModel {
    @NameInMap("GetMcubeNebulaTaskDetailResult")
    public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResult getMcubeNebulaTaskDetailResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static GetMcubeNebulaTaskDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMcubeNebulaTaskDetailResponseBody self = new GetMcubeNebulaTaskDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMcubeNebulaTaskDetailResponseBody setGetMcubeNebulaTaskDetailResult(GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResult getMcubeNebulaTaskDetailResult) {
        this.getMcubeNebulaTaskDetailResult = getMcubeNebulaTaskDetailResult;
        return this;
    }
    public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResult getGetMcubeNebulaTaskDetailResult() {
        return this.getMcubeNebulaTaskDetailResult;
    }

    public GetMcubeNebulaTaskDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMcubeNebulaTaskDetailResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetMcubeNebulaTaskDetailResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetailRuleJsonList extends TeaModel {
        @NameInMap("Operation")
        public String operation;

        @NameInMap("RuleElement")
        public String ruleElement;

        @NameInMap("RuleType")
        public String ruleType;

        @NameInMap("Value")
        public String value;

        public static GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetailRuleJsonList build(java.util.Map<String, ?> map) throws Exception {
            GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetailRuleJsonList self = new GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetailRuleJsonList();
            return TeaModel.build(map, self);
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetailRuleJsonList setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetailRuleJsonList setRuleElement(String ruleElement) {
            this.ruleElement = ruleElement;
            return this;
        }
        public String getRuleElement() {
            return this.ruleElement;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetailRuleJsonList setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetailRuleJsonList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("Atomic")
        public Integer atomic;

        @NameInMap("BaseInfoId")
        public Long baseInfoId;

        @NameInMap("BizType")
        public String bizType;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Cronexpress")
        public Integer cronexpress;

        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("ExtraData")
        public String extraData;

        @NameInMap("FileSize")
        public String fileSize;

        @NameInMap("FullRepair")
        public Integer fullRepair;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("GmtModifiedStr")
        public String gmtModifiedStr;

        @NameInMap("GreyConfigInfo")
        public String greyConfigInfo;

        @NameInMap("GreyEndtime")
        public String greyEndtime;

        @NameInMap("GreyEndtimeData")
        public String greyEndtimeData;

        @NameInMap("GreyEndtimeStr")
        public String greyEndtimeStr;

        @NameInMap("GreyNum")
        public Integer greyNum;

        @NameInMap("GreyUrl")
        public String greyUrl;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IssueDesc")
        public String issueDesc;

        @NameInMap("Memo")
        public String memo;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("OssPath")
        public String ossPath;

        @NameInMap("PackageId")
        public Long packageId;

        @NameInMap("Percent")
        public Integer percent;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("ProductId")
        public String productId;

        @NameInMap("ProductVersion")
        public String productVersion;

        @NameInMap("PublishMode")
        public Integer publishMode;

        @NameInMap("PublishPeriod")
        public Integer publishPeriod;

        @NameInMap("PublishType")
        public Integer publishType;

        @NameInMap("QuickRollback")
        public Integer quickRollback;

        @NameInMap("ReleaseVersion")
        public String releaseVersion;

        @NameInMap("RuleJsonList")
        public java.util.List<GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetailRuleJsonList> ruleJsonList;

        @NameInMap("SourceId")
        public String sourceId;

        @NameInMap("SourceName")
        public String sourceName;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("SyncResult")
        public String syncResult;

        @NameInMap("SyncType")
        public Integer syncType;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TaskStatus")
        public Integer taskStatus;

        @NameInMap("TaskType")
        public Integer taskType;

        @NameInMap("TaskVersion")
        public Long taskVersion;

        @NameInMap("UpgradeNoticeNum")
        public Long upgradeNoticeNum;

        @NameInMap("UpgradeProgress")
        public String upgradeProgress;

        @NameInMap("WhitelistIds")
        public String whitelistIds;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail build(java.util.Map<String, ?> map) throws Exception {
            GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail self = new GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail();
            return TeaModel.build(map, self);
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setAtomic(Integer atomic) {
            this.atomic = atomic;
            return this;
        }
        public Integer getAtomic() {
            return this.atomic;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setBaseInfoId(Long baseInfoId) {
            this.baseInfoId = baseInfoId;
            return this;
        }
        public Long getBaseInfoId() {
            return this.baseInfoId;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setCronexpress(Integer cronexpress) {
            this.cronexpress = cronexpress;
            return this;
        }
        public Integer getCronexpress() {
            return this.cronexpress;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setExtraData(String extraData) {
            this.extraData = extraData;
            return this;
        }
        public String getExtraData() {
            return this.extraData;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setFullRepair(Integer fullRepair) {
            this.fullRepair = fullRepair;
            return this;
        }
        public Integer getFullRepair() {
            return this.fullRepair;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setGmtModifiedStr(String gmtModifiedStr) {
            this.gmtModifiedStr = gmtModifiedStr;
            return this;
        }
        public String getGmtModifiedStr() {
            return this.gmtModifiedStr;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setGreyConfigInfo(String greyConfigInfo) {
            this.greyConfigInfo = greyConfigInfo;
            return this;
        }
        public String getGreyConfigInfo() {
            return this.greyConfigInfo;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setGreyEndtime(String greyEndtime) {
            this.greyEndtime = greyEndtime;
            return this;
        }
        public String getGreyEndtime() {
            return this.greyEndtime;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setGreyEndtimeData(String greyEndtimeData) {
            this.greyEndtimeData = greyEndtimeData;
            return this;
        }
        public String getGreyEndtimeData() {
            return this.greyEndtimeData;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setGreyEndtimeStr(String greyEndtimeStr) {
            this.greyEndtimeStr = greyEndtimeStr;
            return this;
        }
        public String getGreyEndtimeStr() {
            return this.greyEndtimeStr;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setGreyNum(Integer greyNum) {
            this.greyNum = greyNum;
            return this;
        }
        public Integer getGreyNum() {
            return this.greyNum;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setGreyUrl(String greyUrl) {
            this.greyUrl = greyUrl;
            return this;
        }
        public String getGreyUrl() {
            return this.greyUrl;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setIssueDesc(String issueDesc) {
            this.issueDesc = issueDesc;
            return this;
        }
        public String getIssueDesc() {
            return this.issueDesc;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setPackageId(Long packageId) {
            this.packageId = packageId;
            return this;
        }
        public Long getPackageId() {
            return this.packageId;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setPercent(Integer percent) {
            this.percent = percent;
            return this;
        }
        public Integer getPercent() {
            return this.percent;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setPublishMode(Integer publishMode) {
            this.publishMode = publishMode;
            return this;
        }
        public Integer getPublishMode() {
            return this.publishMode;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setPublishPeriod(Integer publishPeriod) {
            this.publishPeriod = publishPeriod;
            return this;
        }
        public Integer getPublishPeriod() {
            return this.publishPeriod;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setPublishType(Integer publishType) {
            this.publishType = publishType;
            return this;
        }
        public Integer getPublishType() {
            return this.publishType;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setQuickRollback(Integer quickRollback) {
            this.quickRollback = quickRollback;
            return this;
        }
        public Integer getQuickRollback() {
            return this.quickRollback;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setReleaseVersion(String releaseVersion) {
            this.releaseVersion = releaseVersion;
            return this;
        }
        public String getReleaseVersion() {
            return this.releaseVersion;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setRuleJsonList(java.util.List<GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetailRuleJsonList> ruleJsonList) {
            this.ruleJsonList = ruleJsonList;
            return this;
        }
        public java.util.List<GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetailRuleJsonList> getRuleJsonList() {
            return this.ruleJsonList;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setSyncResult(String syncResult) {
            this.syncResult = syncResult;
            return this;
        }
        public String getSyncResult() {
            return this.syncResult;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setSyncType(Integer syncType) {
            this.syncType = syncType;
            return this;
        }
        public Integer getSyncType() {
            return this.syncType;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setTaskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setTaskType(Integer taskType) {
            this.taskType = taskType;
            return this;
        }
        public Integer getTaskType() {
            return this.taskType;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setTaskVersion(Long taskVersion) {
            this.taskVersion = taskVersion;
            return this;
        }
        public Long getTaskVersion() {
            return this.taskVersion;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setUpgradeNoticeNum(Long upgradeNoticeNum) {
            this.upgradeNoticeNum = upgradeNoticeNum;
            return this;
        }
        public Long getUpgradeNoticeNum() {
            return this.upgradeNoticeNum;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setUpgradeProgress(String upgradeProgress) {
            this.upgradeProgress = upgradeProgress;
            return this;
        }
        public String getUpgradeProgress() {
            return this.upgradeProgress;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setWhitelistIds(String whitelistIds) {
            this.whitelistIds = whitelistIds;
            return this;
        }
        public String getWhitelistIds() {
            return this.whitelistIds;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResult extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("NebulaTaskDetail")
        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail nebulaTaskDetail;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResult build(java.util.Map<String, ?> map) throws Exception {
            GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResult self = new GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResult();
            return TeaModel.build(map, self);
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResult setNebulaTaskDetail(GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail nebulaTaskDetail) {
            this.nebulaTaskDetail = nebulaTaskDetail;
            return this;
        }
        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResultNebulaTaskDetail getNebulaTaskDetail() {
            return this.nebulaTaskDetail;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public GetMcubeNebulaTaskDetailResponseBodyGetMcubeNebulaTaskDetailResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
