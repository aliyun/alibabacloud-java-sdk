// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetDebugAppInstanceResponseBody extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    @NameInMap("AppInstanceId")
    public String appInstanceId;

    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("AuthCode")
    public String authCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserId")
    public String userId;

    public static GetDebugAppInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDebugAppInstanceResponseBody self = new GetDebugAppInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDebugAppInstanceResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetDebugAppInstanceResponseBody setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public GetDebugAppInstanceResponseBody setAppInstanceId(String appInstanceId) {
        this.appInstanceId = appInstanceId;
        return this;
    }
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    public GetDebugAppInstanceResponseBody setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public GetDebugAppInstanceResponseBody setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public GetDebugAppInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDebugAppInstanceResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
