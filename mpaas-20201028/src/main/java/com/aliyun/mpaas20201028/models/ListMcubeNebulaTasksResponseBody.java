// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMcubeNebulaTasksResponseBody extends TeaModel {
    @NameInMap("ListMcubeNebulaTaskResult")
    public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResult listMcubeNebulaTaskResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static ListMcubeNebulaTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMcubeNebulaTasksResponseBody self = new ListMcubeNebulaTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMcubeNebulaTasksResponseBody setListMcubeNebulaTaskResult(ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResult listMcubeNebulaTaskResult) {
        this.listMcubeNebulaTaskResult = listMcubeNebulaTaskResult;
        return this;
    }
    public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResult getListMcubeNebulaTaskResult() {
        return this.listMcubeNebulaTaskResult;
    }

    public ListMcubeNebulaTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMcubeNebulaTasksResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMcubeNebulaTasksResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("BizType")
        public String bizType;

        @NameInMap("Creator")
        public String creator;

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

        @NameInMap("Memo")
        public String memo;

        @NameInMap("Modifier")
        public String modifier;

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

        @NameInMap("PublishType")
        public Integer publishType;

        @NameInMap("ReleaseVersion")
        public String releaseVersion;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("SyncResult")
        public String syncResult;

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

        public static ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo self = new ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo();
            return TeaModel.build(map, self);
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo setGmtModifiedStr(String gmtModifiedStr) {
            this.gmtModifiedStr = gmtModifiedStr;
            return this;
        }
        public String getGmtModifiedStr() {
            return this.gmtModifiedStr;
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo setGreyConfigInfo(String greyConfigInfo) {
            this.greyConfigInfo = greyConfigInfo;
            return this;
        }
        public String getGreyConfigInfo() {
            return this.greyConfigInfo;
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo setGreyEndtime(String greyEndtime) {
            this.greyEndtime = greyEndtime;
            return this;
        }
        public String getGreyEndtime() {
            return this.greyEndtime;
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo setGreyEndtimeData(String greyEndtimeData) {
            this.greyEndtimeData = greyEndtimeData;
            return this;
        }
        public String getGreyEndtimeData() {
            return this.greyEndtimeData;
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo setGreyEndtimeStr(String greyEndtimeStr) {
            this.greyEndtimeStr = greyEndtimeStr;
            return this;
        }
        public String getGreyEndtimeStr() {
            return this.greyEndtimeStr;
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo setGreyNum(Integer greyNum) {
            this.greyNum = greyNum;
            return this;
        }
        public Integer getGreyNum() {
            return this.greyNum;
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo setGreyUrl(String greyUrl) {
            this.greyUrl = greyUrl;
            return this;
        }
        public String getGreyUrl() {
            return this.greyUrl;
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo setPackageId(Long packageId) {
            this.packageId = packageId;
            return this;
        }
        public Long getPackageId() {
            return this.packageId;
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo setPercent(Integer percent) {
            this.percent = percent;
            return this;
        }
        public Integer getPercent() {
            return this.percent;
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo setPublishMode(Integer publishMode) {
            this.publishMode = publishMode;
            return this;
        }
        public Integer getPublishMode() {
            return this.publishMode;
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo setPublishType(Integer publishType) {
            this.publishType = publishType;
            return this;
        }
        public Integer getPublishType() {
            return this.publishType;
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo setReleaseVersion(String releaseVersion) {
            this.releaseVersion = releaseVersion;
            return this;
        }
        public String getReleaseVersion() {
            return this.releaseVersion;
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo setSyncResult(String syncResult) {
            this.syncResult = syncResult;
            return this;
        }
        public String getSyncResult() {
            return this.syncResult;
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo setTaskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo setTaskType(Integer taskType) {
            this.taskType = taskType;
            return this;
        }
        public Integer getTaskType() {
            return this.taskType;
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo setTaskVersion(Long taskVersion) {
            this.taskVersion = taskVersion;
            return this;
        }
        public Long getTaskVersion() {
            return this.taskVersion;
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo setUpgradeNoticeNum(Long upgradeNoticeNum) {
            this.upgradeNoticeNum = upgradeNoticeNum;
            return this;
        }
        public Long getUpgradeNoticeNum() {
            return this.upgradeNoticeNum;
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo setUpgradeProgress(String upgradeProgress) {
            this.upgradeProgress = upgradeProgress;
            return this;
        }
        public String getUpgradeProgress() {
            return this.upgradeProgress;
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo setWhitelistIds(String whitelistIds) {
            this.whitelistIds = whitelistIds;
            return this;
        }
        public String getWhitelistIds() {
            return this.whitelistIds;
        }

    }

    public static class ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResult extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("NebulaTaskInfo")
        public java.util.List<ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo> nebulaTaskInfo;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResult build(java.util.Map<String, ?> map) throws Exception {
            ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResult self = new ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResult();
            return TeaModel.build(map, self);
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResult setNebulaTaskInfo(java.util.List<ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo> nebulaTaskInfo) {
            this.nebulaTaskInfo = nebulaTaskInfo;
            return this;
        }
        public java.util.List<ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResultNebulaTaskInfo> getNebulaTaskInfo() {
            return this.nebulaTaskInfo;
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public ListMcubeNebulaTasksResponseBodyListMcubeNebulaTaskResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
