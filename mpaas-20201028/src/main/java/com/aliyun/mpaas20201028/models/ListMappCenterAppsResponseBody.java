// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMappCenterAppsResponseBody extends TeaModel {
    @NameInMap("ListMappCenterAppResult")
    public ListMappCenterAppsResponseBodyListMappCenterAppResult listMappCenterAppResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static ListMappCenterAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMappCenterAppsResponseBody self = new ListMappCenterAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMappCenterAppsResponseBody setListMappCenterAppResult(ListMappCenterAppsResponseBodyListMappCenterAppResult listMappCenterAppResult) {
        this.listMappCenterAppResult = listMappCenterAppResult;
        return this;
    }
    public ListMappCenterAppsResponseBodyListMappCenterAppResult getListMappCenterAppResult() {
        return this.listMappCenterAppResult;
    }

    public ListMappCenterAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMappCenterAppsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMappCenterAppsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppListAndroidConfig extends TeaModel {
        @NameInMap("CertRSA")
        public String certRSA;

        @NameInMap("PackageName")
        public String packageName;

        public static ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppListAndroidConfig build(java.util.Map<String, ?> map) throws Exception {
            ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppListAndroidConfig self = new ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppListAndroidConfig();
            return TeaModel.build(map, self);
        }

        public ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppListAndroidConfig setCertRSA(String certRSA) {
            this.certRSA = certRSA;
            return this;
        }
        public String getCertRSA() {
            return this.certRSA;
        }

        public ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppListAndroidConfig setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

    }

    public static class ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppListIosConfig extends TeaModel {
        @NameInMap("BundleId")
        public String bundleId;

        public static ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppListIosConfig build(java.util.Map<String, ?> map) throws Exception {
            ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppListIosConfig self = new ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppListIosConfig();
            return TeaModel.build(map, self);
        }

        public ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppListIosConfig setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

    }

    public static class ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppList extends TeaModel {
        @NameInMap("AndroidConfig")
        public ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppListAndroidConfig androidConfig;

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
        public ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppListIosConfig iosConfig;

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

        public static ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppList build(java.util.Map<String, ?> map) throws Exception {
            ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppList self = new ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppList();
            return TeaModel.build(map, self);
        }

        public ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppList setAndroidConfig(ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppListAndroidConfig androidConfig) {
            this.androidConfig = androidConfig;
            return this;
        }
        public ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppListAndroidConfig getAndroidConfig() {
            return this.androidConfig;
        }

        public ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppList setAppDesc(String appDesc) {
            this.appDesc = appDesc;
            return this;
        }
        public String getAppDesc() {
            return this.appDesc;
        }

        public ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppList setAppIcon(String appIcon) {
            this.appIcon = appIcon;
            return this;
        }
        public String getAppIcon() {
            return this.appIcon;
        }

        public ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppList setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public String getAppSecret() {
            return this.appSecret;
        }

        public ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppList setIosConfig(ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppListIosConfig iosConfig) {
            this.iosConfig = iosConfig;
            return this;
        }
        public ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppListIosConfig getIosConfig() {
            return this.iosConfig;
        }

        public ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppList setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppList setMonitorJson(String monitorJson) {
            this.monitorJson = monitorJson;
            return this;
        }
        public String getMonitorJson() {
            return this.monitorJson;
        }

        public ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppList setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

    public static class ListMappCenterAppsResponseBodyListMappCenterAppResult extends TeaModel {
        @NameInMap("MappCenterAppList")
        public java.util.List<ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppList> mappCenterAppList;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static ListMappCenterAppsResponseBodyListMappCenterAppResult build(java.util.Map<String, ?> map) throws Exception {
            ListMappCenterAppsResponseBodyListMappCenterAppResult self = new ListMappCenterAppsResponseBodyListMappCenterAppResult();
            return TeaModel.build(map, self);
        }

        public ListMappCenterAppsResponseBodyListMappCenterAppResult setMappCenterAppList(java.util.List<ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppList> mappCenterAppList) {
            this.mappCenterAppList = mappCenterAppList;
            return this;
        }
        public java.util.List<ListMappCenterAppsResponseBodyListMappCenterAppResultMappCenterAppList> getMappCenterAppList() {
            return this.mappCenterAppList;
        }

        public ListMappCenterAppsResponseBodyListMappCenterAppResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public ListMappCenterAppsResponseBodyListMappCenterAppResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
