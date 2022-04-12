// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppVersionQueryServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AppVersionQueryServiceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static AppVersionQueryServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AppVersionQueryServiceResponseBody self = new AppVersionQueryServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public AppVersionQueryServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AppVersionQueryServiceResponseBody setData(AppVersionQueryServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AppVersionQueryServiceResponseBodyData getData() {
        return this.data;
    }

    public AppVersionQueryServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AppVersionQueryServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AppVersionQueryServiceResponseBodyDataVersions extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppVersionId")
        public String appVersionId;

        @NameInMap("AppVersionName")
        public String appVersionName;

        @NameInMap("TenantId")
        public Long tenantId;

        public static AppVersionQueryServiceResponseBodyDataVersions build(java.util.Map<String, ?> map) throws Exception {
            AppVersionQueryServiceResponseBodyDataVersions self = new AppVersionQueryServiceResponseBodyDataVersions();
            return TeaModel.build(map, self);
        }

        public AppVersionQueryServiceResponseBodyDataVersions setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public AppVersionQueryServiceResponseBodyDataVersions setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public AppVersionQueryServiceResponseBodyDataVersions setAppVersionId(String appVersionId) {
            this.appVersionId = appVersionId;
            return this;
        }
        public String getAppVersionId() {
            return this.appVersionId;
        }

        public AppVersionQueryServiceResponseBodyDataVersions setAppVersionName(String appVersionName) {
            this.appVersionName = appVersionName;
            return this;
        }
        public String getAppVersionName() {
            return this.appVersionName;
        }

        public AppVersionQueryServiceResponseBodyDataVersions setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

    public static class AppVersionQueryServiceResponseBodyData extends TeaModel {
        @NameInMap("Total")
        public Long total;

        @NameInMap("Versions")
        public java.util.List<AppVersionQueryServiceResponseBodyDataVersions> versions;

        public static AppVersionQueryServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AppVersionQueryServiceResponseBodyData self = new AppVersionQueryServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AppVersionQueryServiceResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public AppVersionQueryServiceResponseBodyData setVersions(java.util.List<AppVersionQueryServiceResponseBodyDataVersions> versions) {
            this.versions = versions;
            return this;
        }
        public java.util.List<AppVersionQueryServiceResponseBodyDataVersions> getVersions() {
            return this.versions;
        }

    }

}
