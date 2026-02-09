// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMcubeHotpatchTaskDetailResponseBody extends TeaModel {
    @NameInMap("QueryHotpatchTaskDetailResult")
    public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResult queryHotpatchTaskDetailResult;

    /**
     * <strong>example:</strong>
     * <p>11E66B29-9E5E-5C10-B64E-B5A0E0F26355</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("ResultCode")
    public String resultCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>and</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <strong>example:</strong>
         * <p>city</p>
         */
        @NameInMap("RuleElement")
        public String ruleElement;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <strong>example:</strong>
         * <p>smtp.qiye.aliyun.com</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>ONEXPRE40DB571151920-default</p>
         */
        @NameInMap("AppCode")
        public String appCode;

        /**
         * <strong>example:</strong>
         * <p>business</p>
         */
        @NameInMap("Business")
        public String business;

        /**
         * <strong>example:</strong>
         * <p>1760754049000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>9952804</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>userId</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <strong>example:</strong>
         * <p>iOS</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("WhiteListCount")
        public Long whiteListCount;

        /**
         * <strong>example:</strong>
         * <p>whitelistName</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>ONEXPRE22BA951112038-default</p>
         */
        @NameInMap("AppCode")
        public String appCode;

        /**
         * <strong>example:</strong>
         * <p>ALIPUB9A63274111812</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BaseInfoId")
        public Long baseInfoId;

        @NameInMap("Bundles")
        public java.util.List<String> bundles;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p><a href="https://xxxxx">https://xxxxx</a></p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <strong>example:</strong>
         * <p>117</p>
         */
        @NameInMap("FileSize")
        public String fileSize;

        /**
         * <strong>example:</strong>
         * <p>1766111313000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2026-01-09 10:14:46</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>2026-01-09 10:14:46</p>
         */
        @NameInMap("GmtModifiedStr")
        public String gmtModifiedStr;

        @NameInMap("GreyConfigInfo")
        public String greyConfigInfo;

        /**
         * <strong>example:</strong>
         * <p>2024-01-01 12:00:00</p>
         */
        @NameInMap("GreyEndtimeData")
        public String greyEndtimeData;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("GreyNum")
        public Long greyNum;

        /**
         * <strong>example:</strong>
         * <p>14332</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>15cf3772223630be907c7aaefe8d51c6</p>
         */
        @NameInMap("Md5")
        public String md5;

        @NameInMap("Memo")
        public String memo;

        /**
         * <strong>example:</strong>
         * <hr>
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
         * <p>ONEXPRE22BA951112038_ANDROID-default</p>
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
         * <p>2</p>
         */
        @NameInMap("PublishPeriod")
        public Long publishPeriod;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("PublishType")
        public Long publishType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("QuickRollback")
        public Long quickRollback;

        /**
         * <strong>example:</strong>
         * <p>81c90a2cafdc6dfc54201e70845b5708</p>
         */
        @NameInMap("ReleaseVersion")
        public String releaseVersion;

        @NameInMap("RuleJsonList")
        public java.util.List<QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetailRuleJsonList> ruleJsonList;

        /**
         * <strong>example:</strong>
         * <p>mpaas.jar</p>
         */
        @NameInMap("SourceName")
        public String sourceName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskStatus")
        public Long taskStatus;

        /**
         * <strong>example:</strong>
         * <p>1770442895017</p>
         */
        @NameInMap("TaskVersion")
        public Long taskVersion;

        @NameInMap("Whitelist")
        public java.util.List<QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetailWhitelist> whitelist;

        /**
         * <strong>example:</strong>
         * <p>825827</p>
         */
        @NameInMap("WhitelistIds")
        public String whitelistIds;

        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("HotpatchTaskDetail")
        public QueryMcubeHotpatchTaskDetailResponseBodyQueryHotpatchTaskDetailResultHotpatchTaskDetail hotpatchTaskDetail;

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>61B9F63C-4E6F-5D8E-A694-899450987B48</p>
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
