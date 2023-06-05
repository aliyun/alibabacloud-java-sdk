// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210218.models;

import com.aliyun.tea.*;

public class ExpireLoginTokenRequest extends TeaModel {
    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("LoginToken")
    public String loginToken;

    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    @NameInMap("SessionId")
    public String sessionId;

    public static ExpireLoginTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        ExpireLoginTokenRequest self = new ExpireLoginTokenRequest();
        return TeaModel.build(map, self);
    }

    public ExpireLoginTokenRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public ExpireLoginTokenRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public ExpireLoginTokenRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public ExpireLoginTokenRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
