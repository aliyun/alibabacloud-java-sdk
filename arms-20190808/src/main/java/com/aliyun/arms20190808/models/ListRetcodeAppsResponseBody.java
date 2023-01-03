// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListRetcodeAppsResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The information about monitored applications.
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

    public static class ListRetcodeAppsResponseBodyRetcodeAppsTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListRetcodeAppsResponseBodyRetcodeAppsTags build(java.util.Map<String, ?> map) throws Exception {
            ListRetcodeAppsResponseBodyRetcodeAppsTags self = new ListRetcodeAppsResponseBodyRetcodeAppsTags();
            return TeaModel.build(map, self);
        }

        public ListRetcodeAppsResponseBodyRetcodeAppsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListRetcodeAppsResponseBodyRetcodeAppsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListRetcodeAppsResponseBodyRetcodeApps extends TeaModel {
        // The ID of the application. The parameter is an auto-increment parameter.
        @NameInMap("AppId")
        public Long appId;

        // The name of the application.
        @NameInMap("AppName")
        public String appName;

        // The name of the application that is monitored by Browser Monitoring.
        @NameInMap("NickName")
        public String nickName;

        // The PID of the application.
        @NameInMap("Pid")
        public String pid;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        // The type of the application. Valid values:
        // 
        // *   `web`: web application
        // *   `weex`: Weex mobile app
        // *   `mini_dd`: DingTalk mini program
        // *   `mini_alipay`: Alipay mini program
        // *   `mini_wx`: WeChat mini program
        // *   `mini_common`: mini program on other platforms
        @NameInMap("RetcodeAppType")
        public String retcodeAppType;

        @NameInMap("Tags")
        public java.util.List<ListRetcodeAppsResponseBodyRetcodeAppsTags> tags;

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

        public ListRetcodeAppsResponseBodyRetcodeApps setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public ListRetcodeAppsResponseBodyRetcodeApps setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public ListRetcodeAppsResponseBodyRetcodeApps setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListRetcodeAppsResponseBodyRetcodeApps setRetcodeAppType(String retcodeAppType) {
            this.retcodeAppType = retcodeAppType;
            return this;
        }
        public String getRetcodeAppType() {
            return this.retcodeAppType;
        }

        public ListRetcodeAppsResponseBodyRetcodeApps setTags(java.util.List<ListRetcodeAppsResponseBodyRetcodeAppsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListRetcodeAppsResponseBodyRetcodeAppsTags> getTags() {
            return this.tags;
        }

    }

}
