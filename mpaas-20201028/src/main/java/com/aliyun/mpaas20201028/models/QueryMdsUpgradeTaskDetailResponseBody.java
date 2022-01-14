// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMdsUpgradeTaskDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public QueryMdsUpgradeTaskDetailResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static QueryMdsUpgradeTaskDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMdsUpgradeTaskDetailResponseBody self = new QueryMdsUpgradeTaskDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMdsUpgradeTaskDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMdsUpgradeTaskDetailResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMdsUpgradeTaskDetailResponseBody setResultContent(QueryMdsUpgradeTaskDetailResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryMdsUpgradeTaskDetailResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public QueryMdsUpgradeTaskDetailResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContentRuleJsonList extends TeaModel {
        @NameInMap("Operation")
        public String operation;

        @NameInMap("RuleElement")
        public String ruleElement;

        @NameInMap("RuleType")
        public String ruleType;

        @NameInMap("Value")
        public String value;

        public static QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContentRuleJsonList build(java.util.Map<String, ?> map) throws Exception {
            QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContentRuleJsonList self = new QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContentRuleJsonList();
            return TeaModel.build(map, self);
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContentRuleJsonList setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContentRuleJsonList setRuleElement(String ruleElement) {
            this.ruleElement = ruleElement;
            return this;
        }
        public String getRuleElement() {
            return this.ruleElement;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContentRuleJsonList setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContentRuleJsonList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContentWhitelist extends TeaModel {
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

        public static QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContentWhitelist build(java.util.Map<String, ?> map) throws Exception {
            QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContentWhitelist self = new QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContentWhitelist();
            return TeaModel.build(map, self);
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContentWhitelist setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContentWhitelist setBusiness(String business) {
            this.business = business;
            return this;
        }
        public String getBusiness() {
            return this.business;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContentWhitelist setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContentWhitelist setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContentWhitelist setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContentWhitelist setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContentWhitelist setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContentWhitelist setWhiteListCount(Long whiteListCount) {
            this.whiteListCount = whiteListCount;
            return this;
        }
        public Long getWhiteListCount() {
            return this.whiteListCount;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContentWhitelist setWhiteListName(String whiteListName) {
            this.whiteListName = whiteListName;
            return this;
        }
        public String getWhiteListName() {
            return this.whiteListName;
        }

    }

    public static class QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("Appstoreurl")
        public String appstoreurl;

        @NameInMap("ChannelContains")
        public String channelContains;

        @NameInMap("ChannelExcludes")
        public String channelExcludes;

        @NameInMap("CityContains")
        public String cityContains;

        @NameInMap("CityExcludes")
        public String cityExcludes;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("DeviceGreyNum")
        public Long deviceGreyNum;

        @NameInMap("DevicePercent")
        public Long devicePercent;

        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("ExecutionOrder")
        public Long executionOrder;

        @NameInMap("GmtCreateStr")
        public String gmtCreateStr;

        @NameInMap("GreyConfigInfo")
        public String greyConfigInfo;

        @NameInMap("GreyEndtimeData")
        public String greyEndtimeData;

        @NameInMap("GreyNotice")
        public Long greyNotice;

        @NameInMap("GreyNum")
        public Long greyNum;

        @NameInMap("GreyUv")
        public Long greyUv;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InnerVersion")
        public String innerVersion;

        @NameInMap("IsEnterprise")
        public Long isEnterprise;

        @NameInMap("IsOfficial")
        public Long isOfficial;

        @NameInMap("IsPush")
        public Long isPush;

        @NameInMap("IsRc")
        public Long isRc;

        @NameInMap("IsRelease")
        public Long isRelease;

        @NameInMap("Memo")
        public String memo;

        @NameInMap("MobileModelContains")
        public String mobileModelContains;

        @NameInMap("MobileModelExcludes")
        public String mobileModelExcludes;

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

        @NameInMap("ProductVersion")
        public String productVersion;

        @NameInMap("PublishMode")
        public Long publishMode;

        @NameInMap("PublishType")
        public Long publishType;

        @NameInMap("PushContent")
        public String pushContent;

        @NameInMap("QrcodeUrl")
        public String qrcodeUrl;

        @NameInMap("ReleaseType")
        public String releaseType;

        @NameInMap("RuleJsonList")
        public java.util.List<QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContentRuleJsonList> ruleJsonList;

        @NameInMap("SilentType")
        public Long silentType;

        @NameInMap("SyncMode")
        public String syncMode;

        @NameInMap("SyncResult")
        public String syncResult;

        @NameInMap("TaskStatus")
        public Long taskStatus;

        @NameInMap("UpgradeContent")
        public String upgradeContent;

        @NameInMap("UpgradeType")
        public Long upgradeType;

        @NameInMap("UpgradeValidTime")
        public Long upgradeValidTime;

        @NameInMap("Whitelist")
        public java.util.List<QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContentWhitelist> whitelist;

        @NameInMap("WhitelistIds")
        public String whitelistIds;

        public static QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent build(java.util.Map<String, ?> map) throws Exception {
            QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent self = new QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent();
            return TeaModel.build(map, self);
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setAppstoreurl(String appstoreurl) {
            this.appstoreurl = appstoreurl;
            return this;
        }
        public String getAppstoreurl() {
            return this.appstoreurl;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setChannelContains(String channelContains) {
            this.channelContains = channelContains;
            return this;
        }
        public String getChannelContains() {
            return this.channelContains;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setChannelExcludes(String channelExcludes) {
            this.channelExcludes = channelExcludes;
            return this;
        }
        public String getChannelExcludes() {
            return this.channelExcludes;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setCityContains(String cityContains) {
            this.cityContains = cityContains;
            return this;
        }
        public String getCityContains() {
            return this.cityContains;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setCityExcludes(String cityExcludes) {
            this.cityExcludes = cityExcludes;
            return this;
        }
        public String getCityExcludes() {
            return this.cityExcludes;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setDeviceGreyNum(Long deviceGreyNum) {
            this.deviceGreyNum = deviceGreyNum;
            return this;
        }
        public Long getDeviceGreyNum() {
            return this.deviceGreyNum;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setDevicePercent(Long devicePercent) {
            this.devicePercent = devicePercent;
            return this;
        }
        public Long getDevicePercent() {
            return this.devicePercent;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setExecutionOrder(Long executionOrder) {
            this.executionOrder = executionOrder;
            return this;
        }
        public Long getExecutionOrder() {
            return this.executionOrder;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setGmtCreateStr(String gmtCreateStr) {
            this.gmtCreateStr = gmtCreateStr;
            return this;
        }
        public String getGmtCreateStr() {
            return this.gmtCreateStr;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setGreyConfigInfo(String greyConfigInfo) {
            this.greyConfigInfo = greyConfigInfo;
            return this;
        }
        public String getGreyConfigInfo() {
            return this.greyConfigInfo;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setGreyEndtimeData(String greyEndtimeData) {
            this.greyEndtimeData = greyEndtimeData;
            return this;
        }
        public String getGreyEndtimeData() {
            return this.greyEndtimeData;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setGreyNotice(Long greyNotice) {
            this.greyNotice = greyNotice;
            return this;
        }
        public Long getGreyNotice() {
            return this.greyNotice;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setGreyNum(Long greyNum) {
            this.greyNum = greyNum;
            return this;
        }
        public Long getGreyNum() {
            return this.greyNum;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setGreyUv(Long greyUv) {
            this.greyUv = greyUv;
            return this;
        }
        public Long getGreyUv() {
            return this.greyUv;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setInnerVersion(String innerVersion) {
            this.innerVersion = innerVersion;
            return this;
        }
        public String getInnerVersion() {
            return this.innerVersion;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setIsEnterprise(Long isEnterprise) {
            this.isEnterprise = isEnterprise;
            return this;
        }
        public Long getIsEnterprise() {
            return this.isEnterprise;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setIsOfficial(Long isOfficial) {
            this.isOfficial = isOfficial;
            return this;
        }
        public Long getIsOfficial() {
            return this.isOfficial;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setIsPush(Long isPush) {
            this.isPush = isPush;
            return this;
        }
        public Long getIsPush() {
            return this.isPush;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setIsRc(Long isRc) {
            this.isRc = isRc;
            return this;
        }
        public Long getIsRc() {
            return this.isRc;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setIsRelease(Long isRelease) {
            this.isRelease = isRelease;
            return this;
        }
        public Long getIsRelease() {
            return this.isRelease;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setMobileModelContains(String mobileModelContains) {
            this.mobileModelContains = mobileModelContains;
            return this;
        }
        public String getMobileModelContains() {
            return this.mobileModelContains;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setMobileModelExcludes(String mobileModelExcludes) {
            this.mobileModelExcludes = mobileModelExcludes;
            return this;
        }
        public String getMobileModelExcludes() {
            return this.mobileModelExcludes;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setOsVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public String getOsVersion() {
            return this.osVersion;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setPackageInfoId(Long packageInfoId) {
            this.packageInfoId = packageInfoId;
            return this;
        }
        public Long getPackageInfoId() {
            return this.packageInfoId;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setPublishMode(Long publishMode) {
            this.publishMode = publishMode;
            return this;
        }
        public Long getPublishMode() {
            return this.publishMode;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setPublishType(Long publishType) {
            this.publishType = publishType;
            return this;
        }
        public Long getPublishType() {
            return this.publishType;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setPushContent(String pushContent) {
            this.pushContent = pushContent;
            return this;
        }
        public String getPushContent() {
            return this.pushContent;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setQrcodeUrl(String qrcodeUrl) {
            this.qrcodeUrl = qrcodeUrl;
            return this;
        }
        public String getQrcodeUrl() {
            return this.qrcodeUrl;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setReleaseType(String releaseType) {
            this.releaseType = releaseType;
            return this;
        }
        public String getReleaseType() {
            return this.releaseType;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setRuleJsonList(java.util.List<QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContentRuleJsonList> ruleJsonList) {
            this.ruleJsonList = ruleJsonList;
            return this;
        }
        public java.util.List<QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContentRuleJsonList> getRuleJsonList() {
            return this.ruleJsonList;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setSilentType(Long silentType) {
            this.silentType = silentType;
            return this;
        }
        public Long getSilentType() {
            return this.silentType;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setSyncMode(String syncMode) {
            this.syncMode = syncMode;
            return this;
        }
        public String getSyncMode() {
            return this.syncMode;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setSyncResult(String syncResult) {
            this.syncResult = syncResult;
            return this;
        }
        public String getSyncResult() {
            return this.syncResult;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setTaskStatus(Long taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Long getTaskStatus() {
            return this.taskStatus;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setUpgradeContent(String upgradeContent) {
            this.upgradeContent = upgradeContent;
            return this;
        }
        public String getUpgradeContent() {
            return this.upgradeContent;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setUpgradeType(Long upgradeType) {
            this.upgradeType = upgradeType;
            return this;
        }
        public Long getUpgradeType() {
            return this.upgradeType;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setUpgradeValidTime(Long upgradeValidTime) {
            this.upgradeValidTime = upgradeValidTime;
            return this;
        }
        public Long getUpgradeValidTime() {
            return this.upgradeValidTime;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setWhitelist(java.util.List<QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContentWhitelist> whitelist) {
            this.whitelist = whitelist;
            return this;
        }
        public java.util.List<QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContentWhitelist> getWhitelist() {
            return this.whitelist;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent setWhitelistIds(String whitelistIds) {
            this.whitelistIds = whitelistIds;
            return this;
        }
        public String getWhitelistIds() {
            return this.whitelistIds;
        }

    }

    public static class QueryMdsUpgradeTaskDetailResponseBodyResultContentData extends TeaModel {
        @NameInMap("Content")
        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent content;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static QueryMdsUpgradeTaskDetailResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryMdsUpgradeTaskDetailResponseBodyResultContentData self = new QueryMdsUpgradeTaskDetailResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentData setContent(QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent content) {
            this.content = content;
            return this;
        }
        public QueryMdsUpgradeTaskDetailResponseBodyResultContentDataContent getContent() {
            return this.content;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentData setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContentData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class QueryMdsUpgradeTaskDetailResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public QueryMdsUpgradeTaskDetailResponseBodyResultContentData data;

        @NameInMap("RequestId")
        public String requestId;

        public static QueryMdsUpgradeTaskDetailResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryMdsUpgradeTaskDetailResponseBodyResultContent self = new QueryMdsUpgradeTaskDetailResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContent setData(QueryMdsUpgradeTaskDetailResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public QueryMdsUpgradeTaskDetailResponseBodyResultContentData getData() {
            return this.data;
        }

        public QueryMdsUpgradeTaskDetailResponseBodyResultContent setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
