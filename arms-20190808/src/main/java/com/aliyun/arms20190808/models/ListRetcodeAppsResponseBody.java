// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListRetcodeAppsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>99A663CB-8D7B-4B0D-A006-03C8EE38E7BB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of applications monitored by Browser Monitoring.</p>
     */
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
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
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
        /**
         * <p>The ID of the application. The parameter is an auto-increment parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>16064</p>
         */
        @NameInMap("AppId")
        public Long appId;

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>A1</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The alias of the application monitored by Browser Monitoring.</p>
         * 
         * <strong>example:</strong>
         * <p>B1</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <p>The PID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>atc889zkcf@d8deedfa9bf****</p>
         */
        @NameInMap("Pid")
        public String pid;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxyexli2****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The type of the application. Valid values:</p>
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
         * <p>The tags.</p>
         */
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
