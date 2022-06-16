// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class DescribeOfficeSiteInternetStatusRequest extends TeaModel {
    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("LoginToken")
    public String loginToken;

    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SessionId")
    public String sessionId;

    public static DescribeOfficeSiteInternetStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOfficeSiteInternetStatusRequest self = new DescribeOfficeSiteInternetStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOfficeSiteInternetStatusRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public DescribeOfficeSiteInternetStatusRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public DescribeOfficeSiteInternetStatusRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public DescribeOfficeSiteInternetStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeOfficeSiteInternetStatusRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
