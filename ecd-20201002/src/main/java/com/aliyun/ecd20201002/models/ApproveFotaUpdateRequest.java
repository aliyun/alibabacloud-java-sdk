// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class ApproveFotaUpdateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.1-D-20220513.14****</p>
     */
    @NameInMap("AppVersion")
    public String appVersion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d4452bd7-88df-4b90-a409-806da674****</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <strong>example:</strong>
     * <p>ecd-138dsptkrt00u****</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v18390c954ce59e2915ef16663205371721e0db9a46179ac89249a203320459523cb54ad08efe324784dd0eba25950****</p>
     */
    @NameInMap("LoginToken")
    public String loginToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>4771b873-c757-4893-973c-7f5beejh****</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("TargetStatus")
    public String targetStatus;

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

    public ApproveFotaUpdateRequest setTargetStatus(String targetStatus) {
        this.targetStatus = targetStatus;
        return this;
    }
    public String getTargetStatus() {
        return this.targetStatus;
    }

    public ApproveFotaUpdateRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
