// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class AuthAndActiveWithHidRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("HavanaId")
    public String havanaId;

    @NameInMap("SessionId")
    public String sessionId;

    public static AuthAndActiveWithHidRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthAndActiveWithHidRequest self = new AuthAndActiveWithHidRequest();
        return TeaModel.build(map, self);
    }

    public AuthAndActiveWithHidRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AuthAndActiveWithHidRequest setHavanaId(String havanaId) {
        this.havanaId = havanaId;
        return this;
    }
    public String getHavanaId() {
        return this.havanaId;
    }

    public AuthAndActiveWithHidRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
