// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class StopAppSessionResponseBody extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("CustomSessionId")
    public String customSessionId;

    @NameInMap("PlatformSessionId")
    public String platformSessionId;

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
