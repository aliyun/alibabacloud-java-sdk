// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class ApproveFotaUpdateRequest extends TeaModel {
    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("DesktopId")
    public String desktopId;

    @NameInMap("LoginToken")
    public String loginToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("Uuid")
    public String uuid;

    public static ApproveFotaUpdateRequest build(java.util.Map<String, ?> map) throws Exception {
        ApproveFotaUpdateRequest self = new ApproveFotaUpdateRequest();
        return TeaModel.build(map, self);
    }

    public ApproveFotaUpdateRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public ApproveFotaUpdateRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public ApproveFotaUpdateRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public ApproveFotaUpdateRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public ApproveFotaUpdateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ApproveFotaUpdateRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ApproveFotaUpdateRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
