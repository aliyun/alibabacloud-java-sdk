// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210220.models;

import com.aliyun.tea.*;

public class RefreshLoginTokenRequest extends TeaModel {
    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("ClientType")
    public String clientType;

    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("LoginIdentifier")
    public String loginIdentifier;

    @NameInMap("LoginToken")
    public String loginToken;

    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    @NameInMap("SessionId")
    public String sessionId;

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
