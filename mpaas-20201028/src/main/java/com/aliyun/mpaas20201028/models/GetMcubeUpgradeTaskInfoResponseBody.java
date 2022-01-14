// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetMcubeUpgradeTaskInfoResponseBody extends TeaModel {
    @NameInMap("GetTaskResult")
    public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResult getTaskResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static GetMcubeUpgradeTaskInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMcubeUpgradeTaskInfoResponseBody self = new GetMcubeUpgradeTaskInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMcubeUpgradeTaskInfoResponseBody setGetTaskResult(GetMcubeUpgradeTaskInfoResponseBodyGetTaskResult getTaskResult) {
        this.getTaskResult = getTaskResult;
        return this;
    }
    public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResult getGetTaskResult() {
        return this.getTaskResult;
    }

    public GetMcubeUpgradeTaskInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMcubeUpgradeTaskInfoResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetMcubeUpgradeTaskInfoResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfoRuleJsonList extends TeaModel {
        @NameInMap("Operation")
        public String operation;

        @NameInMap("RuleElement")
        public String ruleElement;

        @NameInMap("RuleType")
        public String ruleType;

        @NameInMap("Value")
        public String value;

        public static GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfoRuleJsonList build(java.util.Map<String, ?> map) throws Exception {
            GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfoRuleJsonList self = new GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfoRuleJsonList();
            return TeaModel.build(map, self);
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfoRuleJsonList setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfoRuleJsonList setRuleElement(String ruleElement) {
            this.ruleElement = ruleElement;
            return this;
        }
        public String getRuleElement() {
            return this.ruleElement;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfoRuleJsonList setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfoRuleJsonList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfoWhitelist extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IdType")
        public String idType;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("UserType")
        public String userType;

        @NameInMap("WhiteListCount")
        public Long whiteListCount;

        @NameInMap("WhiteListName")
        public String whiteListName;

        @NameInMap("WhitelistType")
        public String whitelistType;

        public static GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfoWhitelist build(java.util.Map<String, ?> map) throws Exception {
            GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfoWhitelist self = new GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfoWhitelist();
            return TeaModel.build(map, self);
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfoWhitelist setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfoWhitelist setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfoWhitelist setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfoWhitelist setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfoWhitelist setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfoWhitelist setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfoWhitelist setWhiteListCount(Long whiteListCount) {
            this.whiteListCount = whiteListCount;
            return this;
        }
        public Long getWhiteListCount() {
            return this.whiteListCount;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfoWhitelist setWhiteListName(String whiteListName) {
            this.whiteListName = whiteListName;
            return this;
        }
        public String getWhiteListName() {
            return this.whiteListName;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfoWhitelist setWhitelistType(String whitelistType) {
            this.whitelistType = whitelistType;
            return this;
        }
        public String getWhitelistType() {
            return this.whitelistType;
        }

    }

    public static class GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppstoreUrl")
        public String appstoreUrl;

        @NameInMap("Creater")
        public String creater;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("GreyConfigInfo")
        public String greyConfigInfo;

        @NameInMap("GreyEndtimeData")
        public String greyEndtimeData;

        @NameInMap("GreyNum")
        public Integer greyNum;

        @NameInMap("HistoryForce")
        public Integer historyForce;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsEnterprise")
        public Integer isEnterprise;

        @NameInMap("IsOfficial")
        public Integer isOfficial;

        @NameInMap("IsRc")
        public Integer isRc;

        @NameInMap("IsRelease")
        public Integer isRelease;

        @NameInMap("Memo")
        public String memo;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("NetType")
        public String netType;

        @NameInMap("OsVersion")
        public String osVersion;

        @NameInMap("PackageInfoId")
        public Long packageInfoId;

        @NameInMap("PackageType")
        public String packageType;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("ProductId")
        public String productId;

        @NameInMap("PublishMode")
        public Integer publishMode;

        @NameInMap("PublishType")
        public Integer publishType;

        @NameInMap("PushContent")
        public String pushContent;

        @NameInMap("QrcodeUrl")
        public String qrcodeUrl;

        @NameInMap("RuleJsonList")
        public java.util.List<GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfoRuleJsonList> ruleJsonList;

        @NameInMap("SilentType")
        public Integer silentType;

        @NameInMap("TaskStatus")
        public Integer taskStatus;

        @NameInMap("UpgradeContent")
        public String upgradeContent;

        @NameInMap("UpgradeType")
        public Integer upgradeType;

        @NameInMap("UpgradeValidTime")
        public Integer upgradeValidTime;

        @NameInMap("Whitelist")
        public java.util.List<GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfoWhitelist> whitelist;

        @NameInMap("WhitelistIds")
        public String whitelistIds;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo self = new GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo();
            return TeaModel.build(map, self);
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setAppstoreUrl(String appstoreUrl) {
            this.appstoreUrl = appstoreUrl;
            return this;
        }
        public String getAppstoreUrl() {
            return this.appstoreUrl;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setCreater(String creater) {
            this.creater = creater;
            return this;
        }
        public String getCreater() {
            return this.creater;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setGreyConfigInfo(String greyConfigInfo) {
            this.greyConfigInfo = greyConfigInfo;
            return this;
        }
        public String getGreyConfigInfo() {
            return this.greyConfigInfo;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setGreyEndtimeData(String greyEndtimeData) {
            this.greyEndtimeData = greyEndtimeData;
            return this;
        }
        public String getGreyEndtimeData() {
            return this.greyEndtimeData;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setGreyNum(Integer greyNum) {
            this.greyNum = greyNum;
            return this;
        }
        public Integer getGreyNum() {
            return this.greyNum;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setHistoryForce(Integer historyForce) {
            this.historyForce = historyForce;
            return this;
        }
        public Integer getHistoryForce() {
            return this.historyForce;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setIsEnterprise(Integer isEnterprise) {
            this.isEnterprise = isEnterprise;
            return this;
        }
        public Integer getIsEnterprise() {
            return this.isEnterprise;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setIsOfficial(Integer isOfficial) {
            this.isOfficial = isOfficial;
            return this;
        }
        public Integer getIsOfficial() {
            return this.isOfficial;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setIsRc(Integer isRc) {
            this.isRc = isRc;
            return this;
        }
        public Integer getIsRc() {
            return this.isRc;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setIsRelease(Integer isRelease) {
            this.isRelease = isRelease;
            return this;
        }
        public Integer getIsRelease() {
            return this.isRelease;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setOsVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public String getOsVersion() {
            return this.osVersion;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setPackageInfoId(Long packageInfoId) {
            this.packageInfoId = packageInfoId;
            return this;
        }
        public Long getPackageInfoId() {
            return this.packageInfoId;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setPublishMode(Integer publishMode) {
            this.publishMode = publishMode;
            return this;
        }
        public Integer getPublishMode() {
            return this.publishMode;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setPublishType(Integer publishType) {
            this.publishType = publishType;
            return this;
        }
        public Integer getPublishType() {
            return this.publishType;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setPushContent(String pushContent) {
            this.pushContent = pushContent;
            return this;
        }
        public String getPushContent() {
            return this.pushContent;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setQrcodeUrl(String qrcodeUrl) {
            this.qrcodeUrl = qrcodeUrl;
            return this;
        }
        public String getQrcodeUrl() {
            return this.qrcodeUrl;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setRuleJsonList(java.util.List<GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfoRuleJsonList> ruleJsonList) {
            this.ruleJsonList = ruleJsonList;
            return this;
        }
        public java.util.List<GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfoRuleJsonList> getRuleJsonList() {
            return this.ruleJsonList;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setSilentType(Integer silentType) {
            this.silentType = silentType;
            return this;
        }
        public Integer getSilentType() {
            return this.silentType;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setTaskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setUpgradeContent(String upgradeContent) {
            this.upgradeContent = upgradeContent;
            return this;
        }
        public String getUpgradeContent() {
            return this.upgradeContent;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setUpgradeType(Integer upgradeType) {
            this.upgradeType = upgradeType;
            return this;
        }
        public Integer getUpgradeType() {
            return this.upgradeType;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setUpgradeValidTime(Integer upgradeValidTime) {
            this.upgradeValidTime = upgradeValidTime;
            return this;
        }
        public Integer getUpgradeValidTime() {
            return this.upgradeValidTime;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setWhitelist(java.util.List<GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfoWhitelist> whitelist) {
            this.whitelist = whitelist;
            return this;
        }
        public java.util.List<GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfoWhitelist> getWhitelist() {
            return this.whitelist;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setWhitelistIds(String whitelistIds) {
            this.whitelistIds = whitelistIds;
            return this;
        }
        public String getWhitelistIds() {
            return this.whitelistIds;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class GetMcubeUpgradeTaskInfoResponseBodyGetTaskResult extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TaskInfo")
        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo taskInfo;

        public static GetMcubeUpgradeTaskInfoResponseBodyGetTaskResult build(java.util.Map<String, ?> map) throws Exception {
            GetMcubeUpgradeTaskInfoResponseBodyGetTaskResult self = new GetMcubeUpgradeTaskInfoResponseBodyGetTaskResult();
            return TeaModel.build(map, self);
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResult setTaskInfo(GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo taskInfo) {
            this.taskInfo = taskInfo;
            return this;
        }
        public GetMcubeUpgradeTaskInfoResponseBodyGetTaskResultTaskInfo getTaskInfo() {
            return this.taskInfo;
        }

    }

}
