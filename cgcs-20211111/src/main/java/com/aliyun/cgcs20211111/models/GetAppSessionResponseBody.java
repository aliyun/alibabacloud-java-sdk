// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetAppSessionResponseBody extends TeaModel {
    // 应用id
    @NameInMap("AppId")
    public String appId;

    // 应用版本
    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("BizInfo")
    public java.util.List<GetAppSessionResponseBodyBizInfo> bizInfo;

    // 自定义会话id
    @NameInMap("CustomSessionId")
    public String customSessionId;

    // 平台会话id
    @NameInMap("PlatformSessionId")
    public String platformSessionId;

    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    // 状态
    @NameInMap("Status")
    public String status;

    public static GetAppSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppSessionResponseBody self = new GetAppSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppSessionResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetAppSessionResponseBody setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public GetAppSessionResponseBody setBizInfo(java.util.List<GetAppSessionResponseBodyBizInfo> bizInfo) {
        this.bizInfo = bizInfo;
        return this;
    }
    public java.util.List<GetAppSessionResponseBodyBizInfo> getBizInfo() {
        return this.bizInfo;
    }

    public GetAppSessionResponseBody setCustomSessionId(String customSessionId) {
        this.customSessionId = customSessionId;
        return this;
    }
    public String getCustomSessionId() {
        return this.customSessionId;
    }

    public GetAppSessionResponseBody setPlatformSessionId(String platformSessionId) {
        this.platformSessionId = platformSessionId;
        return this;
    }
    public String getPlatformSessionId() {
        return this.platformSessionId;
    }

    public GetAppSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppSessionResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class GetAppSessionResponseBodyBizInfo extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static GetAppSessionResponseBodyBizInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAppSessionResponseBodyBizInfo self = new GetAppSessionResponseBodyBizInfo();
            return TeaModel.build(map, self);
        }

        public GetAppSessionResponseBodyBizInfo setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetAppSessionResponseBodyBizInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
