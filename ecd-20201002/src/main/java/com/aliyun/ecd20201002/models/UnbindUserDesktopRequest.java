// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class UnbindUserDesktopRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>58f96f67-7944-4f97-9342-****</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <strong>example:</strong>
     * <p>windows</p>
     */
    @NameInMap("ClientType")
    public String clientType;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v12307f5e0****</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3b053331-dc98-43d8-b247-****</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ud-sdfs****</p>
     */
    @NameInMap("UserDesktopId")
    public String userDesktopId;

    public static UnbindUserDesktopRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindUserDesktopRequest self = new UnbindUserDesktopRequest();
        return TeaModel.build(map, self);
    }

    public UnbindUserDesktopRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public UnbindUserDesktopRequest setClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }
    public String getClientType() {
        return this.clientType;
    }

    public UnbindUserDesktopRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public UnbindUserDesktopRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public UnbindUserDesktopRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UnbindUserDesktopRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public UnbindUserDesktopRequest setUserDesktopId(String userDesktopId) {
        this.userDesktopId = userDesktopId;
        return this;
    }
    public String getUserDesktopId() {
        return this.userDesktopId;
    }

}
