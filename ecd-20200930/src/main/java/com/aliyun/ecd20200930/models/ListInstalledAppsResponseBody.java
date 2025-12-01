// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListInstalledAppsResponseBody extends TeaModel {
    /**
     * <p>The information about the application.</p>
     */
    @NameInMap("Apps")
    public java.util.List<ListInstalledAppsResponseBodyApps> apps;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>94</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListInstalledAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstalledAppsResponseBody self = new ListInstalledAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstalledAppsResponseBody setApps(java.util.List<ListInstalledAppsResponseBodyApps> apps) {
        this.apps = apps;
        return this;
    }
    public java.util.List<ListInstalledAppsResponseBodyApps> getApps() {
        return this.apps;
    }

    public ListInstalledAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstalledAppsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListInstalledAppsResponseBodyApps extends TeaModel {
        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>test_app</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The application version.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0.1</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        public static ListInstalledAppsResponseBodyApps build(java.util.Map<String, ?> map) throws Exception {
            ListInstalledAppsResponseBodyApps self = new ListInstalledAppsResponseBodyApps();
            return TeaModel.build(map, self);
        }

        public ListInstalledAppsResponseBodyApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListInstalledAppsResponseBodyApps setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

    }

}
