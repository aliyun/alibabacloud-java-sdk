// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRetcodeAppByPidResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2983BEF7-4A0D-47A2-94A2-8E9C5E63****</p>
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
         * 
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>testValue</p>
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
         * 
         * <strong>example:</strong>
         * <p>2787XXXX</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application that is monitored by Browser Monitoring.</p>
         * 
         * <strong>example:</strong>
         * <p>testRetcodeAppXXXX</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The process identifier (PID) of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>b590lhguqs@9781be0f44dXXXX</p>
         */
        @NameInMap("Pid")
        public String pid;

        /**
         * <p>The ID of the resource group. You can obtain the resource group ID in the <strong>Resource Management</strong> console.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxidtzXXXX</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The type of the application that is monitored by Browser Monitoring. Valid values:</p>
         * <ul>
         * <li><code>web</code>: web application</li>
         * <li><code>weex</code>: Weex mobile app</li>
         * <li><code>mini_dd</code>: DingTalk mini program</li>
         * <li><code>mini_alipay</code>: Alipay mini program</li>
         * <li><code>mini_wx</code>: WeChat mini program</li>
         * <li><code>mini_common</code>: mini program on other platforms</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>web</p>
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
