// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class ModifyEndUserAttributeRequest extends TeaModel {
    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("ClientOS")
    public String clientOS;

    @NameInMap("ClientVersion")
    public String clientVersion;

    @NameInMap("DesktopId")
    public String desktopId;

    @NameInMap("LoginToken")
    public String loginToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("UserCustomName")
    public String userCustomName;

    public static ModifyEndUserAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyEndUserAttributeRequest self = new ModifyEndUserAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyEndUserAttributeRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public ModifyEndUserAttributeRequest setClientOS(String clientOS) {
        this.clientOS = clientOS;
        return this;
    }
    public String getClientOS() {
        return this.clientOS;
    }

    public ModifyEndUserAttributeRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public ModifyEndUserAttributeRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public ModifyEndUserAttributeRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public ModifyEndUserAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyEndUserAttributeRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ModifyEndUserAttributeRequest setUserCustomName(String userCustomName) {
        this.userCustomName = userCustomName;
        return this;
    }
    public String getUserCustomName() {
        return this.userCustomName;
    }

}
