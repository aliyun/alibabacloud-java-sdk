// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMcubeHotpatchTasksResponseBody extends TeaModel {
    @NameInMap("ListHotpatchTasksResult")
    public ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResult listHotpatchTasksResult;

    /**
     * <strong>example:</strong>
     * <p>11E66B29-9E5E-5C10-B64E-B5A0E0F26355</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ResultCode")
    public String resultCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>ALIPUB40DB571101207-default</p>
         */
        @NameInMap("AppCode")
        public String appCode;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>1751594649000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2024-10-29 18:01:32</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>2024-10-29 18:01:32</p>
         */
        @NameInMap("GmtModifiedStr")
        public String gmtModifiedStr;

        @NameInMap("GreyConfigInfo")
        public String greyConfigInfo;

        /**
         * <strong>example:</strong>
         * <p>2020-03-18 20:12:26</p>
         */
        @NameInMap("GreyEndtime")
        public String greyEndtime;

        @NameInMap("GreyEndtimeData")
        public String greyEndtimeData;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("GreyNum")
        public Long greyNum;

        /**
         * <strong>example:</strong>
         * <p>1486</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("Memo")
        public String memo;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <strong>example:</strong>
         * <p>1664552</p>
         */
        @NameInMap("PackageId")
        public Long packageId;

        /**
         * <strong>example:</strong>
         * <p>iOS</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <strong>example:</strong>
         * <p>ALIPUB40DB571101207_ANDROID-default</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("ProductVersion")
        public String productVersion;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PublishMode")
        public Long publishMode;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("PublishType")
        public Long publishType;

        /**
         * <strong>example:</strong>
         * <p>81c90a2cafdc6dfc54201e70845b5708</p>
         */
        @NameInMap("ReleaseVersion")
        public String releaseVersion;

        /**
         * <strong>example:</strong>
         * <p>1786</p>
         */
        @NameInMap("ResIds")
        public String resIds;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskStatus")
        public Long taskStatus;

        /**
         * <strong>example:</strong>
         * <p>825827</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("HotpatchTaskInfo")
        public java.util.List<ListMcubeHotpatchTasksResponseBodyListHotpatchTasksResultHotpatchTaskInfo> hotpatchTaskInfo;

        /**
         * <strong>example:</strong>
         * <p>6BD4C876-47B4-56CF-84C5-57389EE1EDFE</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("ResultMsg")
        public String resultMsg;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
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
