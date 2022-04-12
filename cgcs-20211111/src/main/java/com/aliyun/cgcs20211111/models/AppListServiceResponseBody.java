// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppListServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AppListServiceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static AppListServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AppListServiceResponseBody self = new AppListServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public AppListServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AppListServiceResponseBody setData(AppListServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AppListServiceResponseBodyData getData() {
        return this.data;
    }

    public AppListServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AppListServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AppListServiceResponseBodyDataApps extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppType")
        public String appType;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("VersionAdaptNum")
        public Long versionAdaptNum;

        @NameInMap("VersionTotalNum")
        public Long versionTotalNum;

        public static AppListServiceResponseBodyDataApps build(java.util.Map<String, ?> map) throws Exception {
            AppListServiceResponseBodyDataApps self = new AppListServiceResponseBodyDataApps();
            return TeaModel.build(map, self);
        }

        public AppListServiceResponseBodyDataApps setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public AppListServiceResponseBodyDataApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public AppListServiceResponseBodyDataApps setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public AppListServiceResponseBodyDataApps setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public AppListServiceResponseBodyDataApps setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public AppListServiceResponseBodyDataApps setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public AppListServiceResponseBodyDataApps setVersionAdaptNum(Long versionAdaptNum) {
            this.versionAdaptNum = versionAdaptNum;
            return this;
        }
        public Long getVersionAdaptNum() {
            return this.versionAdaptNum;
        }

        public AppListServiceResponseBodyDataApps setVersionTotalNum(Long versionTotalNum) {
            this.versionTotalNum = versionTotalNum;
            return this;
        }
        public Long getVersionTotalNum() {
            return this.versionTotalNum;
        }

    }

    public static class AppListServiceResponseBodyData extends TeaModel {
        @NameInMap("Apps")
        public java.util.List<AppListServiceResponseBodyDataApps> apps;

        @NameInMap("Total")
        public Long total;

        public static AppListServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AppListServiceResponseBodyData self = new AppListServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AppListServiceResponseBodyData setApps(java.util.List<AppListServiceResponseBodyDataApps> apps) {
            this.apps = apps;
            return this;
        }
        public java.util.List<AppListServiceResponseBodyDataApps> getApps() {
            return this.apps;
        }

        public AppListServiceResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
