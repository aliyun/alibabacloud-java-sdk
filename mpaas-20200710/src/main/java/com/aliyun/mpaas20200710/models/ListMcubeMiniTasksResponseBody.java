// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class ListMcubeMiniTasksResponseBody extends TeaModel {
    @NameInMap("ListMiniTaskResult")
    public ListMcubeMiniTasksResponseBodyListMiniTaskResult listMiniTaskResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static ListMcubeMiniTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMcubeMiniTasksResponseBody self = new ListMcubeMiniTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMcubeMiniTasksResponseBody setListMiniTaskResult(ListMcubeMiniTasksResponseBodyListMiniTaskResult listMiniTaskResult) {
        this.listMiniTaskResult = listMiniTaskResult;
        return this;
    }
    public ListMcubeMiniTasksResponseBodyListMiniTaskResult getListMiniTaskResult() {
        return this.listMiniTaskResult;
    }

    public ListMcubeMiniTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMcubeMiniTasksResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMcubeMiniTasksResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class ListMcubeMiniTasksResponseBodyListMiniTaskResultMiniTaskList extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

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

        @NameInMap("PackageId")
        public Long packageId;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("ProductVersion")
        public String productVersion;

        @NameInMap("PublishMode")
        public Long publishMode;

        @NameInMap("PublishType")
        public Long publishType;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskStatus")
        public Long taskStatus;

        @NameInMap("WhitelistIds")
        public String whitelistIds;

        public static ListMcubeMiniTasksResponseBodyListMiniTaskResultMiniTaskList build(java.util.Map<String, ?> map) throws Exception {
            ListMcubeMiniTasksResponseBodyListMiniTaskResultMiniTaskList self = new ListMcubeMiniTasksResponseBodyListMiniTaskResultMiniTaskList();
            return TeaModel.build(map, self);
        }

        public ListMcubeMiniTasksResponseBodyListMiniTaskResultMiniTaskList setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public ListMcubeMiniTasksResponseBodyListMiniTaskResultMiniTaskList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMcubeMiniTasksResponseBodyListMiniTaskResultMiniTaskList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMcubeMiniTasksResponseBodyListMiniTaskResultMiniTaskList setGreyConfigInfo(String greyConfigInfo) {
            this.greyConfigInfo = greyConfigInfo;
            return this;
        }
        public String getGreyConfigInfo() {
            return this.greyConfigInfo;
        }

        public ListMcubeMiniTasksResponseBodyListMiniTaskResultMiniTaskList setGreyEndtime(String greyEndtime) {
            this.greyEndtime = greyEndtime;
            return this;
        }
        public String getGreyEndtime() {
            return this.greyEndtime;
        }

        public ListMcubeMiniTasksResponseBodyListMiniTaskResultMiniTaskList setGreyEndtimeData(String greyEndtimeData) {
            this.greyEndtimeData = greyEndtimeData;
            return this;
        }
        public String getGreyEndtimeData() {
            return this.greyEndtimeData;
        }

        public ListMcubeMiniTasksResponseBodyListMiniTaskResultMiniTaskList setGreyNum(Long greyNum) {
            this.greyNum = greyNum;
            return this;
        }
        public Long getGreyNum() {
            return this.greyNum;
        }

        public ListMcubeMiniTasksResponseBodyListMiniTaskResultMiniTaskList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMcubeMiniTasksResponseBodyListMiniTaskResultMiniTaskList setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public ListMcubeMiniTasksResponseBodyListMiniTaskResultMiniTaskList setPackageId(Long packageId) {
            this.packageId = packageId;
            return this;
        }
        public Long getPackageId() {
            return this.packageId;
        }

        public ListMcubeMiniTasksResponseBodyListMiniTaskResultMiniTaskList setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListMcubeMiniTasksResponseBodyListMiniTaskResultMiniTaskList setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public ListMcubeMiniTasksResponseBodyListMiniTaskResultMiniTaskList setPublishMode(Long publishMode) {
            this.publishMode = publishMode;
            return this;
        }
        public Long getPublishMode() {
            return this.publishMode;
        }

        public ListMcubeMiniTasksResponseBodyListMiniTaskResultMiniTaskList setPublishType(Long publishType) {
            this.publishType = publishType;
            return this;
        }
        public Long getPublishType() {
            return this.publishType;
        }

        public ListMcubeMiniTasksResponseBodyListMiniTaskResultMiniTaskList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMcubeMiniTasksResponseBodyListMiniTaskResultMiniTaskList setTaskStatus(Long taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Long getTaskStatus() {
            return this.taskStatus;
        }

        public ListMcubeMiniTasksResponseBodyListMiniTaskResultMiniTaskList setWhitelistIds(String whitelistIds) {
            this.whitelistIds = whitelistIds;
            return this;
        }
        public String getWhitelistIds() {
            return this.whitelistIds;
        }

    }

    public static class ListMcubeMiniTasksResponseBodyListMiniTaskResult extends TeaModel {
        @NameInMap("MiniTaskList")
        public java.util.List<ListMcubeMiniTasksResponseBodyListMiniTaskResultMiniTaskList> miniTaskList;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static ListMcubeMiniTasksResponseBodyListMiniTaskResult build(java.util.Map<String, ?> map) throws Exception {
            ListMcubeMiniTasksResponseBodyListMiniTaskResult self = new ListMcubeMiniTasksResponseBodyListMiniTaskResult();
            return TeaModel.build(map, self);
        }

        public ListMcubeMiniTasksResponseBodyListMiniTaskResult setMiniTaskList(java.util.List<ListMcubeMiniTasksResponseBodyListMiniTaskResultMiniTaskList> miniTaskList) {
            this.miniTaskList = miniTaskList;
            return this;
        }
        public java.util.List<ListMcubeMiniTasksResponseBodyListMiniTaskResultMiniTaskList> getMiniTaskList() {
            return this.miniTaskList;
        }

        public ListMcubeMiniTasksResponseBodyListMiniTaskResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public ListMcubeMiniTasksResponseBodyListMiniTaskResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
