// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class ListRetcodeAppsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RetcodeApps")
    public java.util.List<ListRetcodeAppsResponseBodyRetcodeApps> retcodeApps;

    public static ListRetcodeAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRetcodeAppsResponseBody self = new ListRetcodeAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRetcodeAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRetcodeAppsResponseBody setRetcodeApps(java.util.List<ListRetcodeAppsResponseBodyRetcodeApps> retcodeApps) {
        this.retcodeApps = retcodeApps;
        return this;
    }
    public java.util.List<ListRetcodeAppsResponseBodyRetcodeApps> getRetcodeApps() {
        return this.retcodeApps;
    }

    public static class ListRetcodeAppsResponseBodyRetcodeApps extends TeaModel {
        @NameInMap("AppId")
        public Long appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("Pid")
        public String pid;

        public static ListRetcodeAppsResponseBodyRetcodeApps build(java.util.Map<String, ?> map) throws Exception {
            ListRetcodeAppsResponseBodyRetcodeApps self = new ListRetcodeAppsResponseBodyRetcodeApps();
            return TeaModel.build(map, self);
        }

        public ListRetcodeAppsResponseBodyRetcodeApps setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public ListRetcodeAppsResponseBodyRetcodeApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListRetcodeAppsResponseBodyRetcodeApps setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

    }

}
