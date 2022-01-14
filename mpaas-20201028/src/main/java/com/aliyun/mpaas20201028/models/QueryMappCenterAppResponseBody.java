// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMappCenterAppResponseBody extends TeaModel {
    @NameInMap("QueryMappCenterAppResult")
    public QueryMappCenterAppResponseBodyQueryMappCenterAppResult queryMappCenterAppResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static QueryMappCenterAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMappCenterAppResponseBody self = new QueryMappCenterAppResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMappCenterAppResponseBody setQueryMappCenterAppResult(QueryMappCenterAppResponseBodyQueryMappCenterAppResult queryMappCenterAppResult) {
        this.queryMappCenterAppResult = queryMappCenterAppResult;
        return this;
    }
    public QueryMappCenterAppResponseBodyQueryMappCenterAppResult getQueryMappCenterAppResult() {
        return this.queryMappCenterAppResult;
    }

    public QueryMappCenterAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMappCenterAppResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMappCenterAppResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterAppAndroidConfig extends TeaModel {
        @NameInMap("CertRSA")
        public String certRSA;

        @NameInMap("PackageName")
        public String packageName;

        public static QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterAppAndroidConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterAppAndroidConfig self = new QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterAppAndroidConfig();
            return TeaModel.build(map, self);
        }

        public QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterAppAndroidConfig setCertRSA(String certRSA) {
            this.certRSA = certRSA;
            return this;
        }
        public String getCertRSA() {
            return this.certRSA;
        }

        public QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterAppAndroidConfig setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

    }

    public static class QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterAppIosConfig extends TeaModel {
        @NameInMap("BundleId")
        public String bundleId;

        public static QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterAppIosConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterAppIosConfig self = new QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterAppIosConfig();
            return TeaModel.build(map, self);
        }

        public QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterAppIosConfig setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

    }

    public static class QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterApp extends TeaModel {
        @NameInMap("AndroidConfig")
        public QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterAppAndroidConfig androidConfig;

        @NameInMap("AppDesc")
        public String appDesc;

        @NameInMap("AppIcon")
        public String appIcon;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppSecret")
        public String appSecret;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IosConfig")
        public QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterAppIosConfig iosConfig;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("MonitorJson")
        public String monitorJson;

        @NameInMap("Status")
        public Long status;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Type")
        public Long type;

        public static QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterApp build(java.util.Map<String, ?> map) throws Exception {
            QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterApp self = new QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterApp();
            return TeaModel.build(map, self);
        }

        public QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterApp setAndroidConfig(QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterAppAndroidConfig androidConfig) {
            this.androidConfig = androidConfig;
            return this;
        }
        public QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterAppAndroidConfig getAndroidConfig() {
            return this.androidConfig;
        }

        public QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterApp setAppDesc(String appDesc) {
            this.appDesc = appDesc;
            return this;
        }
        public String getAppDesc() {
            return this.appDesc;
        }

        public QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterApp setAppIcon(String appIcon) {
            this.appIcon = appIcon;
            return this;
        }
        public String getAppIcon() {
            return this.appIcon;
        }

        public QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterApp setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterApp setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterApp setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public String getAppSecret() {
            return this.appSecret;
        }

        public QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterApp setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterApp setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterApp setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterApp setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterApp setIosConfig(QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterAppIosConfig iosConfig) {
            this.iosConfig = iosConfig;
            return this;
        }
        public QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterAppIosConfig getIosConfig() {
            return this.iosConfig;
        }

        public QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterApp setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterApp setMonitorJson(String monitorJson) {
            this.monitorJson = monitorJson;
            return this;
        }
        public String getMonitorJson() {
            return this.monitorJson;
        }

        public QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterApp setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterApp setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterApp setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

    public static class QueryMappCenterAppResponseBodyQueryMappCenterAppResult extends TeaModel {
        @NameInMap("MappCenterApp")
        public QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterApp mappCenterApp;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static QueryMappCenterAppResponseBodyQueryMappCenterAppResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMappCenterAppResponseBodyQueryMappCenterAppResult self = new QueryMappCenterAppResponseBodyQueryMappCenterAppResult();
            return TeaModel.build(map, self);
        }

        public QueryMappCenterAppResponseBodyQueryMappCenterAppResult setMappCenterApp(QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterApp mappCenterApp) {
            this.mappCenterApp = mappCenterApp;
            return this;
        }
        public QueryMappCenterAppResponseBodyQueryMappCenterAppResultMappCenterApp getMappCenterApp() {
            return this.mappCenterApp;
        }

        public QueryMappCenterAppResponseBodyQueryMappCenterAppResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public QueryMappCenterAppResponseBodyQueryMappCenterAppResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
