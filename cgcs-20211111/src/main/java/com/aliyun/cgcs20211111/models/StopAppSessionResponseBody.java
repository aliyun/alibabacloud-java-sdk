// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class StopAppSessionResponseBody extends TeaModel {
    // 应用id
    @NameInMap("AppId")
    public String appId;

    // 应用版本
    @NameInMap("AppVersion")
    public String appVersion;

    // 自定义会话id
    @NameInMap("CustomSessionId")
    public String customSessionId;

    // 平台会话id
    @NameInMap("PlatformSessionId")
    public String platformSessionId;

    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    public static StopAppSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopAppSessionResponseBody self = new StopAppSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public StopAppSessionResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StopAppSessionResponseBody setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public StopAppSessionResponseBody setCustomSessionId(String customSessionId) {
        this.customSessionId = customSessionId;
        return this;
    }
    public String getCustomSessionId() {
        return this.customSessionId;
    }

    public StopAppSessionResponseBody setPlatformSessionId(String platformSessionId) {
        this.platformSessionId = platformSessionId;
        return this;
    }
    public String getPlatformSessionId() {
        return this.platformSessionId;
    }

    public StopAppSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
