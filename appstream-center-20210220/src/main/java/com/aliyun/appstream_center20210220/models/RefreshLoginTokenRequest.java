// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210220.models;

import com.aliyun.tea.*;

public class RefreshLoginTokenRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f4a0dc8e-1702-4728-9a60-95b27a35****</p>
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
     * <p>alice</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <strong>example:</strong>
     * <p>Alibaba****</p>
     */
    @NameInMap("LoginIdentifier")
    public String loginIdentifier;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v1046341d8d4e2f05c4aa168196009613594aaf451499bfc75e54699efa7230bc968e1debb1fa4063b01e5d327b467****</p>
     */
    @NameInMap("LoginToken")
    public String loginToken;

    /**
     * <strong>example:</strong>
     * <p>cn-shenzhen+dir-436909****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    @NameInMap("ProfileRegion")
    public String profileRegion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6442b2fd-ed3e-423a-8e6e-352d26a4****</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>2943802884B27030B6759F9132B2****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static RefreshLoginTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshLoginTokenRequest self = new RefreshLoginTokenRequest();
        return TeaModel.build(map, self);
    }

    public RefreshLoginTokenRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public RefreshLoginTokenRequest setClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }
    public String getClientType() {
        return this.clientType;
    }

    public RefreshLoginTokenRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public RefreshLoginTokenRequest setLoginIdentifier(String loginIdentifier) {
        this.loginIdentifier = loginIdentifier;
        return this;
    }
    public String getLoginIdentifier() {
        return this.loginIdentifier;
    }

    public RefreshLoginTokenRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public RefreshLoginTokenRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public RefreshLoginTokenRequest setProfileRegion(String profileRegion) {
        this.profileRegion = profileRegion;
        return this;
    }
    public String getProfileRegion() {
        return this.profileRegion;
    }

    public RefreshLoginTokenRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RefreshLoginTokenRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
