// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMcubeUpgradeTasksResponseBody extends TeaModel {
    @NameInMap("ListTaskResult")
    public ListMcubeUpgradeTasksResponseBodyListTaskResult listTaskResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static ListMcubeUpgradeTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMcubeUpgradeTasksResponseBody self = new ListMcubeUpgradeTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMcubeUpgradeTasksResponseBody setListTaskResult(ListMcubeUpgradeTasksResponseBodyListTaskResult listTaskResult) {
        this.listTaskResult = listTaskResult;
        return this;
    }
    public ListMcubeUpgradeTasksResponseBodyListTaskResult getListTaskResult() {
        return this.listTaskResult;
    }

    public ListMcubeUpgradeTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMcubeUpgradeTasksResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMcubeUpgradeTasksResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("DevicePercent")
        public Integer devicePercent;

        @NameInMap("ExecutionOrder")
        public Integer executionOrder;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtCreateStr")
        public String gmtCreateStr;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("GmtModifiedStr")
        public String gmtModifiedStr;

        @NameInMap("GreyConfigInfo")
        public String greyConfigInfo;

        @NameInMap("GreyEndtime")
        public String greyEndtime;

        @NameInMap("GreyNotice")
        public Integer greyNotice;

        @NameInMap("GreyNum")
        public Integer greyNum;

        @NameInMap("GreyPausePoint")
        public Integer greyPausePoint;

        @NameInMap("GreyPauseType")
        public Integer greyPauseType;

        @NameInMap("GreyUv")
        public Integer greyUv;

        @NameInMap("HistoryForce")
        public Integer historyForce;

        @NameInMap("HuobanNoticeId")
        public String huobanNoticeId;

        @NameInMap("HuobanUrl")
        public String huobanUrl;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InnerVersion")
        public String innerVersion;

        @NameInMap("IsEnterprise")
        public Integer isEnterprise;

        @NameInMap("IsOfficial")
        public Integer isOfficial;

        @NameInMap("IsPush")
        public Integer isPush;

        @NameInMap("IsRelease")
        public Integer isRelease;

        @NameInMap("MaxVersion")
        public String maxVersion;

        @NameInMap("Memo")
        public String memo;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("PackageInfoId")
        public Long packageInfoId;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("ProductId")
        public String productId;

        @NameInMap("ProductVersion")
        public String productVersion;

        @NameInMap("PublishMode")
        public Integer publishMode;

        @NameInMap("PublishType")
        public Integer publishType;

        @NameInMap("PushContent")
        public String pushContent;

        @NameInMap("RealGreyEndtime")
        public String realGreyEndtime;

        @NameInMap("RealGreyEndtimeStr")
        public String realGreyEndtimeStr;

        @NameInMap("RealGreyEndtype")
        public Integer realGreyEndtype;

        @NameInMap("RealGreyNum")
        public Integer realGreyNum;

        @NameInMap("RealGreyUv")
        public Integer realGreyUv;

        @NameInMap("SilentType")
        public Integer silentType;

        @NameInMap("SyncResult")
        public String syncResult;

        @NameInMap("TaskStatus")
        public Integer taskStatus;

        @NameInMap("UpgradeContent")
        public String upgradeContent;

        @NameInMap("UpgradeType")
        public Integer upgradeType;

        @NameInMap("UpgradeValidTime")
        public Integer upgradeValidTime;

        @NameInMap("WhitelistIds")
        public String whitelistIds;

        public static ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo self = new ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo();
            return TeaModel.build(map, self);
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setDevicePercent(Integer devicePercent) {
            this.devicePercent = devicePercent;
            return this;
        }
        public Integer getDevicePercent() {
            return this.devicePercent;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setExecutionOrder(Integer executionOrder) {
            this.executionOrder = executionOrder;
            return this;
        }
        public Integer getExecutionOrder() {
            return this.executionOrder;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setGmtCreateStr(String gmtCreateStr) {
            this.gmtCreateStr = gmtCreateStr;
            return this;
        }
        public String getGmtCreateStr() {
            return this.gmtCreateStr;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setGmtModifiedStr(String gmtModifiedStr) {
            this.gmtModifiedStr = gmtModifiedStr;
            return this;
        }
        public String getGmtModifiedStr() {
            return this.gmtModifiedStr;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setGreyConfigInfo(String greyConfigInfo) {
            this.greyConfigInfo = greyConfigInfo;
            return this;
        }
        public String getGreyConfigInfo() {
            return this.greyConfigInfo;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setGreyEndtime(String greyEndtime) {
            this.greyEndtime = greyEndtime;
            return this;
        }
        public String getGreyEndtime() {
            return this.greyEndtime;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setGreyNotice(Integer greyNotice) {
            this.greyNotice = greyNotice;
            return this;
        }
        public Integer getGreyNotice() {
            return this.greyNotice;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setGreyNum(Integer greyNum) {
            this.greyNum = greyNum;
            return this;
        }
        public Integer getGreyNum() {
            return this.greyNum;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setGreyPausePoint(Integer greyPausePoint) {
            this.greyPausePoint = greyPausePoint;
            return this;
        }
        public Integer getGreyPausePoint() {
            return this.greyPausePoint;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setGreyPauseType(Integer greyPauseType) {
            this.greyPauseType = greyPauseType;
            return this;
        }
        public Integer getGreyPauseType() {
            return this.greyPauseType;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setGreyUv(Integer greyUv) {
            this.greyUv = greyUv;
            return this;
        }
        public Integer getGreyUv() {
            return this.greyUv;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setHistoryForce(Integer historyForce) {
            this.historyForce = historyForce;
            return this;
        }
        public Integer getHistoryForce() {
            return this.historyForce;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setHuobanNoticeId(String huobanNoticeId) {
            this.huobanNoticeId = huobanNoticeId;
            return this;
        }
        public String getHuobanNoticeId() {
            return this.huobanNoticeId;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setHuobanUrl(String huobanUrl) {
            this.huobanUrl = huobanUrl;
            return this;
        }
        public String getHuobanUrl() {
            return this.huobanUrl;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setInnerVersion(String innerVersion) {
            this.innerVersion = innerVersion;
            return this;
        }
        public String getInnerVersion() {
            return this.innerVersion;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setIsEnterprise(Integer isEnterprise) {
            this.isEnterprise = isEnterprise;
            return this;
        }
        public Integer getIsEnterprise() {
            return this.isEnterprise;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setIsOfficial(Integer isOfficial) {
            this.isOfficial = isOfficial;
            return this;
        }
        public Integer getIsOfficial() {
            return this.isOfficial;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setIsPush(Integer isPush) {
            this.isPush = isPush;
            return this;
        }
        public Integer getIsPush() {
            return this.isPush;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setIsRelease(Integer isRelease) {
            this.isRelease = isRelease;
            return this;
        }
        public Integer getIsRelease() {
            return this.isRelease;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setMaxVersion(String maxVersion) {
            this.maxVersion = maxVersion;
            return this;
        }
        public String getMaxVersion() {
            return this.maxVersion;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setPackageInfoId(Long packageInfoId) {
            this.packageInfoId = packageInfoId;
            return this;
        }
        public Long getPackageInfoId() {
            return this.packageInfoId;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setPublishMode(Integer publishMode) {
            this.publishMode = publishMode;
            return this;
        }
        public Integer getPublishMode() {
            return this.publishMode;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setPublishType(Integer publishType) {
            this.publishType = publishType;
            return this;
        }
        public Integer getPublishType() {
            return this.publishType;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setPushContent(String pushContent) {
            this.pushContent = pushContent;
            return this;
        }
        public String getPushContent() {
            return this.pushContent;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setRealGreyEndtime(String realGreyEndtime) {
            this.realGreyEndtime = realGreyEndtime;
            return this;
        }
        public String getRealGreyEndtime() {
            return this.realGreyEndtime;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setRealGreyEndtimeStr(String realGreyEndtimeStr) {
            this.realGreyEndtimeStr = realGreyEndtimeStr;
            return this;
        }
        public String getRealGreyEndtimeStr() {
            return this.realGreyEndtimeStr;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setRealGreyEndtype(Integer realGreyEndtype) {
            this.realGreyEndtype = realGreyEndtype;
            return this;
        }
        public Integer getRealGreyEndtype() {
            return this.realGreyEndtype;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setRealGreyNum(Integer realGreyNum) {
            this.realGreyNum = realGreyNum;
            return this;
        }
        public Integer getRealGreyNum() {
            return this.realGreyNum;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setRealGreyUv(Integer realGreyUv) {
            this.realGreyUv = realGreyUv;
            return this;
        }
        public Integer getRealGreyUv() {
            return this.realGreyUv;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setSilentType(Integer silentType) {
            this.silentType = silentType;
            return this;
        }
        public Integer getSilentType() {
            return this.silentType;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setSyncResult(String syncResult) {
            this.syncResult = syncResult;
            return this;
        }
        public String getSyncResult() {
            return this.syncResult;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setTaskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setUpgradeContent(String upgradeContent) {
            this.upgradeContent = upgradeContent;
            return this;
        }
        public String getUpgradeContent() {
            return this.upgradeContent;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setUpgradeType(Integer upgradeType) {
            this.upgradeType = upgradeType;
            return this;
        }
        public Integer getUpgradeType() {
            return this.upgradeType;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setUpgradeValidTime(Integer upgradeValidTime) {
            this.upgradeValidTime = upgradeValidTime;
            return this;
        }
        public Integer getUpgradeValidTime() {
            return this.upgradeValidTime;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo setWhitelistIds(String whitelistIds) {
            this.whitelistIds = whitelistIds;
            return this;
        }
        public String getWhitelistIds() {
            return this.whitelistIds;
        }

    }

    public static class ListMcubeUpgradeTasksResponseBodyListTaskResult extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TaskInfo")
        public java.util.List<ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo> taskInfo;

        public static ListMcubeUpgradeTasksResponseBodyListTaskResult build(java.util.Map<String, ?> map) throws Exception {
            ListMcubeUpgradeTasksResponseBodyListTaskResult self = new ListMcubeUpgradeTasksResponseBodyListTaskResult();
            return TeaModel.build(map, self);
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ListMcubeUpgradeTasksResponseBodyListTaskResult setTaskInfo(java.util.List<ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo> taskInfo) {
            this.taskInfo = taskInfo;
            return this;
        }
        public java.util.List<ListMcubeUpgradeTasksResponseBodyListTaskResultTaskInfo> getTaskInfo() {
            return this.taskInfo;
        }

    }

}
