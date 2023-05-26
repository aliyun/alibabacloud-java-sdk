// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRetcodeAppByPidResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Key")
        public String key;

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
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("Pid")
        public String pid;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("RetcodeAppType")
        public String retcodeAppType;

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
