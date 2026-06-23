// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMcubeHotpatchTaskDetailResponseBody extends TeaModel {
    @NameInMap("QueryHotpatchTaskDetailResult")
    public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResult queryHotpatchTaskDetailResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static QueryMcubeHotpatchTaskDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMcubeHotpatchTaskDetailResponseBody self = new QueryMcubeHotpatchTaskDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMcubeHotpatchTaskDetailResponseBody setQueryHotpatchTaskDetailResult(QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResult queryHotpatchTaskDetailResult) {
        this.queryHotpatchTaskDetailResult = queryHotpatchTaskDetailResult;
        return this;
    }
    public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResult getQueryHotpatchTaskDetailResult() {
        return this.queryHotpatchTaskDetailResult;
    }

    public QueryMcubeHotpatchTaskDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMcubeHotpatchTaskDetailResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMcubeHotpatchTaskDetailResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetailRuleJsonList extends TeaModel {
        @NameInMap("Operation")
        public String operation;

        @NameInMap("RuleElement")
        public String ruleElement;

        @NameInMap("RuleType")
        public String ruleType;

        @NameInMap("Value")
        public String value;

        public static QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetailRuleJsonList build(java.util.Map<String, ?> map) throws Exception {
            QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetailRuleJsonList self = new QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetailRuleJsonList();
            return TeaModel.build(map, self);
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetailRuleJsonList setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetailRuleJsonList setRuleElement(String ruleElement) {
            this.ruleElement = ruleElement;
            return this;
        }
        public String getRuleElement() {
            return this.ruleElement;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetailRuleJsonList setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetailRuleJsonList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetailWhitelist extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("Business")
        public String business;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IdType")
        public String idType;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("Status")
        public Long status;

        @NameInMap("WhiteListCount")
        public Long whiteListCount;

        @NameInMap("WhiteListName")
        public String whiteListName;

        public static QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetailWhitelist build(java.util.Map<String, ?> map) throws Exception {
            QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetailWhitelist self = new QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetailWhitelist();
            return TeaModel.build(map, self);
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetailWhitelist setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetailWhitelist setBusiness(String business) {
            this.business = business;
            return this;
        }
        public String getBusiness() {
            return this.business;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetailWhitelist setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetailWhitelist setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetailWhitelist setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetailWhitelist setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetailWhitelist setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetailWhitelist setWhiteListCount(Long whiteListCount) {
            this.whiteListCount = whiteListCount;
            return this;
        }
        public Long getWhiteListCount() {
            return this.whiteListCount;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetailWhitelist setWhiteListName(String whiteListName) {
            this.whiteListName = whiteListName;
            return this;
        }
        public String getWhiteListName() {
            return this.whiteListName;
        }

    }

    public static class QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("BaseInfoId")
        public Long baseInfoId;

        @NameInMap("Bundles")
        public java.util.List<String> bundles;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("FileSize")
        public String fileSize;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("GmtModifiedStr")
        public String gmtModifiedStr;

        @NameInMap("GreyConfigInfo")
        public String greyConfigInfo;

        @NameInMap("GreyEndtimeData")
        public String greyEndtimeData;

        @NameInMap("GreyNum")
        public Long greyNum;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Md5")
        public String md5;

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

        @NameInMap("PublishPeriod")
        public Long publishPeriod;

        @NameInMap("PublishType")
        public Long publishType;

        @NameInMap("QuickRollback")
        public Long quickRollback;

        @NameInMap("ReleaseVersion")
        public String releaseVersion;

        @NameInMap("RuleJsonList")
        public java.util.List<QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetailRuleJsonList> ruleJsonList;

        @NameInMap("SourceName")
        public String sourceName;

        @NameInMap("TaskStatus")
        public Long taskStatus;

        @NameInMap("TaskVersion")
        public Long taskVersion;

        @NameInMap("Whitelist")
        public java.util.List<QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetailWhitelist> whitelist;

        @NameInMap("WhitelistIds")
        public String whitelistIds;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail build(java.util.Map<String, ?> map) throws Exception {
            QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail self = new QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail();
            return TeaModel.build(map, self);
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail setBaseInfoId(Long baseInfoId) {
            this.baseInfoId = baseInfoId;
            return this;
        }
        public Long getBaseInfoId() {
            return this.baseInfoId;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail setBundles(java.util.List<String> bundles) {
            this.bundles = bundles;
            return this;
        }
        public java.util.List<String> getBundles() {
            return this.bundles;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail setGmtModifiedStr(String gmtModifiedStr) {
            this.gmtModifiedStr = gmtModifiedStr;
            return this;
        }
        public String getGmtModifiedStr() {
            return this.gmtModifiedStr;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail setGreyConfigInfo(String greyConfigInfo) {
            this.greyConfigInfo = greyConfigInfo;
            return this;
        }
        public String getGreyConfigInfo() {
            return this.greyConfigInfo;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail setGreyEndtimeData(String greyEndtimeData) {
            this.greyEndtimeData = greyEndtimeData;
            return this;
        }
        public String getGreyEndtimeData() {
            return this.greyEndtimeData;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail setGreyNum(Long greyNum) {
            this.greyNum = greyNum;
            return this;
        }
        public Long getGreyNum() {
            return this.greyNum;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail setPackageId(Long packageId) {
            this.packageId = packageId;
            return this;
        }
        public Long getPackageId() {
            return this.packageId;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail setPublishMode(Long publishMode) {
            this.publishMode = publishMode;
            return this;
        }
        public Long getPublishMode() {
            return this.publishMode;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail setPublishPeriod(Long publishPeriod) {
            this.publishPeriod = publishPeriod;
            return this;
        }
        public Long getPublishPeriod() {
            return this.publishPeriod;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail setPublishType(Long publishType) {
            this.publishType = publishType;
            return this;
        }
        public Long getPublishType() {
            return this.publishType;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail setQuickRollback(Long quickRollback) {
            this.quickRollback = quickRollback;
            return this;
        }
        public Long getQuickRollback() {
            return this.quickRollback;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail setReleaseVersion(String releaseVersion) {
            this.releaseVersion = releaseVersion;
            return this;
        }
        public String getReleaseVersion() {
            return this.releaseVersion;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail setRuleJsonList(java.util.List<QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetailRuleJsonList> ruleJsonList) {
            this.ruleJsonList = ruleJsonList;
            return this;
        }
        public java.util.List<QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetailRuleJsonList> getRuleJsonList() {
            return this.ruleJsonList;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail setTaskStatus(Long taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Long getTaskStatus() {
            return this.taskStatus;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail setTaskVersion(Long taskVersion) {
            this.taskVersion = taskVersion;
            return this;
        }
        public Long getTaskVersion() {
            return this.taskVersion;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail setWhitelist(java.util.List<QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetailWhitelist> whitelist) {
            this.whitelist = whitelist;
            return this;
        }
        public java.util.List<QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetailWhitelist> getWhitelist() {
            return this.whitelist;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail setWhitelistIds(String whitelistIds) {
            this.whitelistIds = whitelistIds;
            return this;
        }
        public String getWhitelistIds() {
            return this.whitelistIds;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResult extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("HotpatchTaskDetail")
        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail hotpatchTaskDetail;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResult self = new QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResult();
            return TeaModel.build(map, self);
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResult setHotpatchTaskDetail(QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail hotpatchTaskDetail) {
            this.hotpatchTaskDetail = hotpatchTaskDetail;
            return this;
        }
        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail getHotpatchTaskDetail() {
            return this.hotpatchTaskDetail;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
