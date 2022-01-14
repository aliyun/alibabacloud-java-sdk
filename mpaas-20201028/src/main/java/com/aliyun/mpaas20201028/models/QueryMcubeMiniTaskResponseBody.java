// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMcubeMiniTaskResponseBody extends TeaModel {
    @NameInMap("QueryMiniTaskResult")
    public QueryMcubeMiniTaskResponseBodyQueryMiniTaskResult queryMiniTaskResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static QueryMcubeMiniTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMcubeMiniTaskResponseBody self = new QueryMcubeMiniTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMcubeMiniTaskResponseBody setQueryMiniTaskResult(QueryMcubeMiniTaskResponseBodyQueryMiniTaskResult queryMiniTaskResult) {
        this.queryMiniTaskResult = queryMiniTaskResult;
        return this;
    }
    public QueryMcubeMiniTaskResponseBodyQueryMiniTaskResult getQueryMiniTaskResult() {
        return this.queryMiniTaskResult;
    }

    public QueryMcubeMiniTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMcubeMiniTaskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMcubeMiniTaskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class QueryMcubeMiniTaskResponseBodyQueryMiniTaskResultMiniTaskInfo extends TeaModel {
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

        public static QueryMcubeMiniTaskResponseBodyQueryMiniTaskResultMiniTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryMcubeMiniTaskResponseBodyQueryMiniTaskResultMiniTaskInfo self = new QueryMcubeMiniTaskResponseBodyQueryMiniTaskResultMiniTaskInfo();
            return TeaModel.build(map, self);
        }

        public QueryMcubeMiniTaskResponseBodyQueryMiniTaskResultMiniTaskInfo setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public QueryMcubeMiniTaskResponseBodyQueryMiniTaskResultMiniTaskInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryMcubeMiniTaskResponseBodyQueryMiniTaskResultMiniTaskInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryMcubeMiniTaskResponseBodyQueryMiniTaskResultMiniTaskInfo setGreyConfigInfo(String greyConfigInfo) {
            this.greyConfigInfo = greyConfigInfo;
            return this;
        }
        public String getGreyConfigInfo() {
            return this.greyConfigInfo;
        }

        public QueryMcubeMiniTaskResponseBodyQueryMiniTaskResultMiniTaskInfo setGreyEndtime(String greyEndtime) {
            this.greyEndtime = greyEndtime;
            return this;
        }
        public String getGreyEndtime() {
            return this.greyEndtime;
        }

        public QueryMcubeMiniTaskResponseBodyQueryMiniTaskResultMiniTaskInfo setGreyEndtimeData(String greyEndtimeData) {
            this.greyEndtimeData = greyEndtimeData;
            return this;
        }
        public String getGreyEndtimeData() {
            return this.greyEndtimeData;
        }

        public QueryMcubeMiniTaskResponseBodyQueryMiniTaskResultMiniTaskInfo setGreyNum(Long greyNum) {
            this.greyNum = greyNum;
            return this;
        }
        public Long getGreyNum() {
            return this.greyNum;
        }

        public QueryMcubeMiniTaskResponseBodyQueryMiniTaskResultMiniTaskInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMcubeMiniTaskResponseBodyQueryMiniTaskResultMiniTaskInfo setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public QueryMcubeMiniTaskResponseBodyQueryMiniTaskResultMiniTaskInfo setPackageId(Long packageId) {
            this.packageId = packageId;
            return this;
        }
        public Long getPackageId() {
            return this.packageId;
        }

        public QueryMcubeMiniTaskResponseBodyQueryMiniTaskResultMiniTaskInfo setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public QueryMcubeMiniTaskResponseBodyQueryMiniTaskResultMiniTaskInfo setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public QueryMcubeMiniTaskResponseBodyQueryMiniTaskResultMiniTaskInfo setPublishMode(Long publishMode) {
            this.publishMode = publishMode;
            return this;
        }
        public Long getPublishMode() {
            return this.publishMode;
        }

        public QueryMcubeMiniTaskResponseBodyQueryMiniTaskResultMiniTaskInfo setPublishType(Long publishType) {
            this.publishType = publishType;
            return this;
        }
        public Long getPublishType() {
            return this.publishType;
        }

        public QueryMcubeMiniTaskResponseBodyQueryMiniTaskResultMiniTaskInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryMcubeMiniTaskResponseBodyQueryMiniTaskResultMiniTaskInfo setTaskStatus(Long taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Long getTaskStatus() {
            return this.taskStatus;
        }

        public QueryMcubeMiniTaskResponseBodyQueryMiniTaskResultMiniTaskInfo setWhitelistIds(String whitelistIds) {
            this.whitelistIds = whitelistIds;
            return this;
        }
        public String getWhitelistIds() {
            return this.whitelistIds;
        }

    }

    public static class QueryMcubeMiniTaskResponseBodyQueryMiniTaskResult extends TeaModel {
        @NameInMap("MiniTaskInfo")
        public QueryMcubeMiniTaskResponseBodyQueryMiniTaskResultMiniTaskInfo miniTaskInfo;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static QueryMcubeMiniTaskResponseBodyQueryMiniTaskResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMcubeMiniTaskResponseBodyQueryMiniTaskResult self = new QueryMcubeMiniTaskResponseBodyQueryMiniTaskResult();
            return TeaModel.build(map, self);
        }

        public QueryMcubeMiniTaskResponseBodyQueryMiniTaskResult setMiniTaskInfo(QueryMcubeMiniTaskResponseBodyQueryMiniTaskResultMiniTaskInfo miniTaskInfo) {
            this.miniTaskInfo = miniTaskInfo;
            return this;
        }
        public QueryMcubeMiniTaskResponseBodyQueryMiniTaskResultMiniTaskInfo getMiniTaskInfo() {
            return this.miniTaskInfo;
        }

        public QueryMcubeMiniTaskResponseBodyQueryMiniTaskResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public QueryMcubeMiniTaskResponseBodyQueryMiniTaskResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
