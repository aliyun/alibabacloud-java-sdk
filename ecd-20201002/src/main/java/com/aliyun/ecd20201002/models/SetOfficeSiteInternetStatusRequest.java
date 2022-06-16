// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class SetOfficeSiteInternetStatusRequest extends TeaModel {
    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("LoginToken")
    public String loginToken;

    @NameInMap("NetworkStatus")
    public Integer networkStatus;

    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SessionId")
    public String sessionId;

    public static SetOfficeSiteInternetStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetOfficeSiteInternetStatusRequest self = new SetOfficeSiteInternetStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetOfficeSiteInternetStatusRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public SetOfficeSiteInternetStatusRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public SetOfficeSiteInternetStatusRequest setNetworkStatus(Integer networkStatus) {
        this.networkStatus = networkStatus;
        return this;
    }
    public Integer getNetworkStatus() {
        return this.networkStatus;
    }

    public SetOfficeSiteInternetStatusRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public SetOfficeSiteInternetStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetOfficeSiteInternetStatusRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
