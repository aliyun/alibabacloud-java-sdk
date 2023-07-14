// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRetcodeAppByPidResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned application data.</p>
     */
    @NameInMap("RetcodeApp")
    public GetRetcodeAppByPidResponseBodyRetcodeApp retcodeApp;

    public static GetRetcodeAppByPidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRetcodeAppByPidResponseBody self = new GetRetcodeAppByPidResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRetcodeAppByPidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRetcodeAppByPidResponseBody setRetcodeApp(GetRetcodeAppByPidResponseBodyRetcodeApp retcodeApp) {
        this.retcodeApp = retcodeApp;
        return this;
    }
    public GetRetcodeAppByPidResponseBodyRetcodeApp getRetcodeApp() {
        return this.retcodeApp;
    }

    public static class GetRetcodeAppByPidResponseBodyRetcodeAppTags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetRetcodeAppByPidResponseBodyRetcodeAppTags build(java.util.Map<String, ?> map) throws Exception {
            GetRetcodeAppByPidResponseBodyRetcodeAppTags self = new GetRetcodeAppByPidResponseBodyRetcodeAppTags();
            return TeaModel.build(map, self);
        }

        public GetRetcodeAppByPidResponseBodyRetcodeAppTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetRetcodeAppByPidResponseBodyRetcodeAppTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetRetcodeAppByPidResponseBodyRetcodeApp extends TeaModel {
        /**
         * <p>The ID of the application. The parameter is an auto-increment parameter.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application that is monitored by Browser Monitoring.</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The process identifier (PID) of the application.</p>
         */
        @NameInMap("Pid")
        public String pid;

        /**
         * <p>The ID of the resource group. You can obtain the resource group ID in the **Resource Management** console.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The type of the application that is monitored by Browser Monitoring. Valid values:</p>
         * <br>
         * <p>*   `web`: web application</p>
         * <p>*   `weex`: Weex mobile app</p>
         * <p>*   `mini_dd`: DingTalk mini program</p>
         * <p>*   `mini_alipay`: Alipay mini program</p>
         * <p>*   `mini_wx`: WeChat mini program</p>
         * <p>*   `mini_common`: mini program on other platforms</p>
         */
        @NameInMap("RetcodeAppType")
        public String retcodeAppType;

        /**
         * <p>The tags that are attached to the instance.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetRetcodeAppByPidResponseBodyRetcodeAppTags> tags;

        public static GetRetcodeAppByPidResponseBodyRetcodeApp build(java.util.Map<String, ?> map) throws Exception {
            GetRetcodeAppByPidResponseBodyRetcodeApp self = new GetRetcodeAppByPidResponseBodyRetcodeApp();
            return TeaModel.build(map, self);
        }

        public GetRetcodeAppByPidResponseBodyRetcodeApp setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetRetcodeAppByPidResponseBodyRetcodeApp setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetRetcodeAppByPidResponseBodyRetcodeApp setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public GetRetcodeAppByPidResponseBodyRetcodeApp setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetRetcodeAppByPidResponseBodyRetcodeApp setRetcodeAppType(String retcodeAppType) {
            this.retcodeAppType = retcodeAppType;
            return this;
        }
        public String getRetcodeAppType() {
            return this.retcodeAppType;
        }

        public GetRetcodeAppByPidResponseBodyRetcodeApp setTags(java.util.List<GetRetcodeAppByPidResponseBodyRetcodeAppTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetRetcodeAppByPidResponseBodyRetcodeAppTags> getTags() {
            return this.tags;
        }

    }

}
