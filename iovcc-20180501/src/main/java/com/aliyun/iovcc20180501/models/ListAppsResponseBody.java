// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListAppsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Apps")
    public java.util.List<ListAppsResponseBodyApps> apps;

    public static ListAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppsResponseBody self = new ListAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppsResponseBody setApps(java.util.List<ListAppsResponseBodyApps> apps) {
        this.apps = apps;
        return this;
    }
    public java.util.List<ListAppsResponseBodyApps> getApps() {
        return this.apps;
    }

    public static class ListAppsResponseBodyApps extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppKey")
        public String appKey;

        @NameInMap("OsType")
        public Integer osType;

        @NameInMap("AppPackage")
        public String appPackage;

        public static ListAppsResponseBodyApps build(java.util.Map<String, ?> map) throws Exception {
            ListAppsResponseBodyApps self = new ListAppsResponseBodyApps();
            return TeaModel.build(map, self);
        }

        public ListAppsResponseBodyApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAppsResponseBodyApps setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public ListAppsResponseBodyApps setOsType(Integer osType) {
            this.osType = osType;
            return this;
        }
        public Integer getOsType() {
            return this.osType;
        }

        public ListAppsResponseBodyApps setAppPackage(String appPackage) {
            this.appPackage = appPackage;
            return this;
        }
        public String getAppPackage() {
            return this.appPackage;
        }

    }

}
