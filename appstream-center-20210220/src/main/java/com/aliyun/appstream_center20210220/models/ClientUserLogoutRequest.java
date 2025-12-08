// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210220.models;

import com.aliyun.tea.*;

public class ClientUserLogoutRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>eac19bef-1e45-4190-a03a-4ea74b****</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <strong>example:</strong>
     * <p>v22369636c721ba6b3ddb1683341016775c3f63e4d0e78f120f9a0544ed826b7af7daf747c402f0d0730b52f451b70****</p>
     */
    @NameInMap("LoginToken")
    public String loginToken;

    /**
     * <strong>example:</strong>
     * <p>cn-hongkong+dir-643067****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <strong>example:</strong>
     * <p>cn_hangzhou</p>
     */
    @NameInMap("ProfileRegion")
    public String profileRegion;

    /**
     * <strong>example:</strong>
     * <p>597e869d-ea14-4b83-9490-714f68****</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    public static ClientUserLogoutRequest build(java.util.Map<String, ?> map) throws Exception {
        ClientUserLogoutRequest self = new ClientUserLogoutRequest();
        return TeaModel.build(map, self);
    }

    public ClientUserLogoutRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public ClientUserLogoutRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public ClientUserLogoutRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public ClientUserLogoutRequest setProfileRegion(String profileRegion) {
        this.profileRegion = profileRegion;
        return this;
    }
    public String getProfileRegion() {
        return this.profileRegion;
    }

    public ClientUserLogoutRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
