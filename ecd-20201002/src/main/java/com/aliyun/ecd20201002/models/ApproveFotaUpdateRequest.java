// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class ApproveFotaUpdateRequest extends TeaModel {
    /**
     * <p>The application version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.1-D-20220513.14****</p>
     */
    @NameInMap("AppVersion")
    public String appVersion;

    /**
     * <p>The client ID. The system generates a unique ID for each client.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d4452bd7-88df-4b90-a409-806da674****</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The cloud computer ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-138dsptkrt00u****</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The logon token.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v18390c954ce59e2915ef16663205371721e0db9a46179ac89249a203320459523cb54ad08efe324784dd0eba25950****</p>
     */
    @NameInMap("LoginToken")
    public String loginToken;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4771b873-c757-4893-973c-7f5beejh****</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The state of the cloud computer after the OTA update.</p>
     * <blockquote>
     * <p> This parameter is not publicly available. After the OTA update is complete, the state of the cloud computer changes to <code>RUNNING</code>.</p>
     * </blockquote>
     * <ul>
     * <li>Set the value to running.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("TargetStatus")
    public String targetStatus;

    /**
     * <p>The unique identifier of the client. To view the unique identifier of an Alibaba Cloud Workspace client, go to the client logon page and click on &quot;About.&quot;</p>
     * 
     * <strong>example:</strong>
     * <p>28c80e90-f71e-4c23-93d6-1225329c****</p>
     */
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
