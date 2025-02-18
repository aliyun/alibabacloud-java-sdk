// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetDebugAppInstanceResponseBody extends TeaModel {
    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>__DEBUG_APP</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the delivery group.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The ID of the application instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ai-7ybdeiyoeh5e****</p>
     */
    @NameInMap("AppInstanceId")
    public String appInstanceId;

    /**
     * <p>The ID of the application version.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1</p>
     */
    @NameInMap("AppVersion")
    public String appVersion;

    /**
     * <p>The authorization code. This authorization code is valid for 3 minutes and can be used only once, regardless of whether the authentication succeeds. If multiple authentication codes are generated for a user, only the latest authentication code takes effect.</p>
     * 
     * <strong>example:</strong>
     * <p>e4e169bea1cc48e8afac53**********</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong>debug</strong></p>
     */
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
