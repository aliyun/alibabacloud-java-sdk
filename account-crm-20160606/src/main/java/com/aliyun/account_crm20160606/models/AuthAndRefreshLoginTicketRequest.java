// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class AuthAndRefreshLoginTicketRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("HavanaId")
    public String havanaId;

    @NameInMap("SessionId")
    public String sessionId;

    public static AuthAndRefreshLoginTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthAndRefreshLoginTicketRequest self = new AuthAndRefreshLoginTicketRequest();
        return TeaModel.build(map, self);
    }

    public AuthAndRefreshLoginTicketRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AuthAndRefreshLoginTicketRequest setHavanaId(String havanaId) {
        this.havanaId = havanaId;
        return this;
    }
    public String getHavanaId() {
        return this.havanaId;
    }

    public AuthAndRefreshLoginTicketRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
