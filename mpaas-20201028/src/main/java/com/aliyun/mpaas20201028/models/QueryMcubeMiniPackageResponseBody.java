// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMcubeMiniPackageResponseBody extends TeaModel {
    @NameInMap("QueryMiniPackageResult")
    public QueryMcubeMiniPackageResponseBodyQueryMiniPackageResult queryMiniPackageResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static QueryMcubeMiniPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMcubeMiniPackageResponseBody self = new QueryMcubeMiniPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMcubeMiniPackageResponseBody setQueryMiniPackageResult(QueryMcubeMiniPackageResponseBodyQueryMiniPackageResult queryMiniPackageResult) {
        this.queryMiniPackageResult = queryMiniPackageResult;
        return this;
    }
    public QueryMcubeMiniPackageResponseBodyQueryMiniPackageResult getQueryMiniPackageResult() {
        return this.queryMiniPackageResult;
    }

    public QueryMcubeMiniPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMcubeMiniPackageResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMcubeMiniPackageResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class QueryMcubeMiniPackageResponseBodyQueryMiniPackageResultMiniPackageInfo extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("AutoInstall")
        public Long autoInstall;

        @NameInMap("ClientVersionMax")
        public String clientVersionMax;

        @NameInMap("ClientVersionMin")
        public String clientVersionMin;

        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("ExtendInfo")
        public String extendInfo;

        @NameInMap("ExtraData")
        public String extraData;

        @NameInMap("FallbackBaseUrl")
        public String fallbackBaseUrl;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("H5Id")
        public String h5Id;

        @NameInMap("H5Name")
        public String h5Name;

        @NameInMap("H5Version")
        public String h5Version;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstallType")
        public Long installType;

        @NameInMap("MainUrl")
        public String mainUrl;

        @NameInMap("Memo")
        public String memo;

        @NameInMap("PackageType")
        public Long packageType;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("PublishPeriod")
        public Long publishPeriod;

        @NameInMap("ResourceType")
        public Long resourceType;

        @NameInMap("Status")
        public Long status;

        public static QueryMcubeMiniPackageResponseBodyQueryMiniPackageResultMiniPackageInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryMcubeMiniPackageResponseBodyQueryMiniPackageResultMiniPackageInfo self = new QueryMcubeMiniPackageResponseBodyQueryMiniPackageResultMiniPackageInfo();
            return TeaModel.build(map, self);
        }

        public QueryMcubeMiniPackageResponseBodyQueryMiniPackageResultMiniPackageInfo setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public QueryMcubeMiniPackageResponseBodyQueryMiniPackageResultMiniPackageInfo setAutoInstall(Long autoInstall) {
            this.autoInstall = autoInstall;
            return this;
        }
        public Long getAutoInstall() {
            return this.autoInstall;
        }

        public QueryMcubeMiniPackageResponseBodyQueryMiniPackageResultMiniPackageInfo setClientVersionMax(String clientVersionMax) {
            this.clientVersionMax = clientVersionMax;
            return this;
        }
        public String getClientVersionMax() {
            return this.clientVersionMax;
        }

        public QueryMcubeMiniPackageResponseBodyQueryMiniPackageResultMiniPackageInfo setClientVersionMin(String clientVersionMin) {
            this.clientVersionMin = clientVersionMin;
            return this;
        }
        public String getClientVersionMin() {
            return this.clientVersionMin;
        }

        public QueryMcubeMiniPackageResponseBodyQueryMiniPackageResultMiniPackageInfo setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public QueryMcubeMiniPackageResponseBodyQueryMiniPackageResultMiniPackageInfo setExtendInfo(String extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public String getExtendInfo() {
            return this.extendInfo;
        }

        public QueryMcubeMiniPackageResponseBodyQueryMiniPackageResultMiniPackageInfo setExtraData(String extraData) {
            this.extraData = extraData;
            return this;
        }
        public String getExtraData() {
            return this.extraData;
        }

        public QueryMcubeMiniPackageResponseBodyQueryMiniPackageResultMiniPackageInfo setFallbackBaseUrl(String fallbackBaseUrl) {
            this.fallbackBaseUrl = fallbackBaseUrl;
            return this;
        }
        public String getFallbackBaseUrl() {
            return this.fallbackBaseUrl;
        }

        public QueryMcubeMiniPackageResponseBodyQueryMiniPackageResultMiniPackageInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryMcubeMiniPackageResponseBodyQueryMiniPackageResultMiniPackageInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryMcubeMiniPackageResponseBodyQueryMiniPackageResultMiniPackageInfo setH5Id(String h5Id) {
            this.h5Id = h5Id;
            return this;
        }
        public String getH5Id() {
            return this.h5Id;
        }

        public QueryMcubeMiniPackageResponseBodyQueryMiniPackageResultMiniPackageInfo setH5Name(String h5Name) {
            this.h5Name = h5Name;
            return this;
        }
        public String getH5Name() {
            return this.h5Name;
        }

        public QueryMcubeMiniPackageResponseBodyQueryMiniPackageResultMiniPackageInfo setH5Version(String h5Version) {
            this.h5Version = h5Version;
            return this;
        }
        public String getH5Version() {
            return this.h5Version;
        }

        public QueryMcubeMiniPackageResponseBodyQueryMiniPackageResultMiniPackageInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMcubeMiniPackageResponseBodyQueryMiniPackageResultMiniPackageInfo setInstallType(Long installType) {
            this.installType = installType;
            return this;
        }
        public Long getInstallType() {
            return this.installType;
        }

        public QueryMcubeMiniPackageResponseBodyQueryMiniPackageResultMiniPackageInfo setMainUrl(String mainUrl) {
            this.mainUrl = mainUrl;
            return this;
        }
        public String getMainUrl() {
            return this.mainUrl;
        }

        public QueryMcubeMiniPackageResponseBodyQueryMiniPackageResultMiniPackageInfo setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public QueryMcubeMiniPackageResponseBodyQueryMiniPackageResultMiniPackageInfo setPackageType(Long packageType) {
            this.packageType = packageType;
            return this;
        }
        public Long getPackageType() {
            return this.packageType;
        }

        public QueryMcubeMiniPackageResponseBodyQueryMiniPackageResultMiniPackageInfo setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public QueryMcubeMiniPackageResponseBodyQueryMiniPackageResultMiniPackageInfo setPublishPeriod(Long publishPeriod) {
            this.publishPeriod = publishPeriod;
            return this;
        }
        public Long getPublishPeriod() {
            return this.publishPeriod;
        }

        public QueryMcubeMiniPackageResponseBodyQueryMiniPackageResultMiniPackageInfo setResourceType(Long resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public Long getResourceType() {
            return this.resourceType;
        }

        public QueryMcubeMiniPackageResponseBodyQueryMiniPackageResultMiniPackageInfo setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

    public static class QueryMcubeMiniPackageResponseBodyQueryMiniPackageResult extends TeaModel {
        @NameInMap("MiniPackageInfo")
        public QueryMcubeMiniPackageResponseBodyQueryMiniPackageResultMiniPackageInfo miniPackageInfo;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static QueryMcubeMiniPackageResponseBodyQueryMiniPackageResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMcubeMiniPackageResponseBodyQueryMiniPackageResult self = new QueryMcubeMiniPackageResponseBodyQueryMiniPackageResult();
            return TeaModel.build(map, self);
        }

        public QueryMcubeMiniPackageResponseBodyQueryMiniPackageResult setMiniPackageInfo(QueryMcubeMiniPackageResponseBodyQueryMiniPackageResultMiniPackageInfo miniPackageInfo) {
            this.miniPackageInfo = miniPackageInfo;
            return this;
        }
        public QueryMcubeMiniPackageResponseBodyQueryMiniPackageResultMiniPackageInfo getMiniPackageInfo() {
            return this.miniPackageInfo;
        }

        public QueryMcubeMiniPackageResponseBodyQueryMiniPackageResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public QueryMcubeMiniPackageResponseBodyQueryMiniPackageResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
