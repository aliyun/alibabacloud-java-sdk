// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListDingtalkOpenPlatformConfigsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Configs")
    public java.util.List<ListDingtalkOpenPlatformConfigsResponseBodyConfigs> configs;

    public static ListDingtalkOpenPlatformConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDingtalkOpenPlatformConfigsResponseBody self = new ListDingtalkOpenPlatformConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDingtalkOpenPlatformConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDingtalkOpenPlatformConfigsResponseBody setConfigs(java.util.List<ListDingtalkOpenPlatformConfigsResponseBodyConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<ListDingtalkOpenPlatformConfigsResponseBodyConfigs> getConfigs() {
        return this.configs;
    }

    public static class ListDingtalkOpenPlatformConfigsResponseBodyConfigs extends TeaModel {
        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("AppSecret")
        public String appSecret;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("CreateTime")
        public String createTime;

        public static ListDingtalkOpenPlatformConfigsResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListDingtalkOpenPlatformConfigsResponseBodyConfigs self = new ListDingtalkOpenPlatformConfigsResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public ListDingtalkOpenPlatformConfigsResponseBodyConfigs setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListDingtalkOpenPlatformConfigsResponseBodyConfigs setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public String getAppSecret() {
            return this.appSecret;
        }

        public ListDingtalkOpenPlatformConfigsResponseBodyConfigs setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListDingtalkOpenPlatformConfigsResponseBodyConfigs setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

}
