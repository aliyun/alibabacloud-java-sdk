// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMcubeHotpatchTasksResponseBody extends TeaModel {
    @NameInMap("ListHotpatchTasksResult")
    public ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResult listHotpatchTasksResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static ListMcubeHotpatchTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMcubeHotpatchTasksResponseBody self = new ListMcubeHotpatchTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMcubeHotpatchTasksResponseBody setListHotpatchTasksResult(ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResult listHotpatchTasksResult) {
        this.listHotpatchTasksResult = listHotpatchTasksResult;
        return this;
    }
    public ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResult getListHotpatchTasksResult() {
        return this.listHotpatchTasksResult;
    }

    public ListMcubeHotpatchTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMcubeHotpatchTasksResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMcubeHotpatchTasksResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResultHotpatchTaskInfo extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

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

        @NameInMap("GreyNum")
        public Long greyNum;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Memo")
        public String memo;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("PackageId")
        public Long packageId;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("ProductId")
        public String productId;

        @NameInMap("ProductVersion")
        public String productVersion;

        @NameInMap("PublishMode")
        public Long publishMode;

        @NameInMap("PublishType")
        public Long publishType;

        @NameInMap("ReleaseVersion")
        public String releaseVersion;

        @NameInMap("ResIds")
        public String resIds;

        @NameInMap("TaskStatus")
        public Long taskStatus;

        @NameInMap("WhitelistIds")
        public String whitelistIds;

        public static ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResultHotpatchTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResultHotpatchTaskInfo self = new ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResultHotpatchTaskInfo();
            return TeaModel.build(map, self);
        }

        public ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResultHotpatchTaskInfo setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResultHotpatchTaskInfo setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResultHotpatchTaskInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResultHotpatchTaskInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResultHotpatchTaskInfo setGmtModifiedStr(String gmtModifiedStr) {
            this.gmtModifiedStr = gmtModifiedStr;
            return this;
        }
        public String getGmtModifiedStr() {
            return this.gmtModifiedStr;
        }

        public ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResultHotpatchTaskInfo setGreyConfigInfo(String greyConfigInfo) {
            this.greyConfigInfo = greyConfigInfo;
            return this;
        }
        public String getGreyConfigInfo() {
            return this.greyConfigInfo;
        }

        public ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResultHotpatchTaskInfo setGreyEndtime(String greyEndtime) {
            this.greyEndtime = greyEndtime;
            return this;
        }
        public String getGreyEndtime() {
            return this.greyEndtime;
        }

        public ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResultHotpatchTaskInfo setGreyEndtimeData(String greyEndtimeData) {
            this.greyEndtimeData = greyEndtimeData;
            return this;
        }
        public String getGreyEndtimeData() {
            return this.greyEndtimeData;
        }

        public ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResultHotpatchTaskInfo setGreyNum(Long greyNum) {
            this.greyNum = greyNum;
            return this;
        }
        public Long getGreyNum() {
            return this.greyNum;
        }

        public ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResultHotpatchTaskInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResultHotpatchTaskInfo setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResultHotpatchTaskInfo setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResultHotpatchTaskInfo setPackageId(Long packageId) {
            this.packageId = packageId;
            return this;
        }
        public Long getPackageId() {
            return this.packageId;
        }

        public ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResultHotpatchTaskInfo setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResultHotpatchTaskInfo setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResultHotpatchTaskInfo setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResultHotpatchTaskInfo setPublishMode(Long publishMode) {
            this.publishMode = publishMode;
            return this;
        }
        public Long getPublishMode() {
            return this.publishMode;
        }

        public ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResultHotpatchTaskInfo setPublishType(Long publishType) {
            this.publishType = publishType;
            return this;
        }
        public Long getPublishType() {
            return this.publishType;
        }

        public ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResultHotpatchTaskInfo setReleaseVersion(String releaseVersion) {
            this.releaseVersion = releaseVersion;
            return this;
        }
        public String getReleaseVersion() {
            return this.releaseVersion;
        }

        public ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResultHotpatchTaskInfo setResIds(String resIds) {
            this.resIds = resIds;
            return this;
        }
        public String getResIds() {
            return this.resIds;
        }

        public ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResultHotpatchTaskInfo setTaskStatus(Long taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Long getTaskStatus() {
            return this.taskStatus;
        }

        public ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResultHotpatchTaskInfo setWhitelistIds(String whitelistIds) {
            this.whitelistIds = whitelistIds;
            return this;
        }
        public String getWhitelistIds() {
            return this.whitelistIds;
        }

    }

    public static class ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResult extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("HotpatchTaskInfo")
        public java.util.List<ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResultHotpatchTaskInfo> hotpatchTaskInfo;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResult build(java.util.Map<String, ?> map) throws Exception {
            ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResult self = new ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResult();
            return TeaModel.build(map, self);
        }

        public ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResult setHotpatchTaskInfo(java.util.List<ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResultHotpatchTaskInfo> hotpatchTaskInfo) {
            this.hotpatchTaskInfo = hotpatchTaskInfo;
            return this;
        }
        public java.util.List<ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResultHotpatchTaskInfo> getHotpatchTaskInfo() {
            return this.hotpatchTaskInfo;
        }

        public ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
