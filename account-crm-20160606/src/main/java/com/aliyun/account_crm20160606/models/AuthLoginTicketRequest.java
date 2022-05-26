// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class AuthLoginTicketRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AuthCode")
    public String authCode;

    @NameInMap("MinorAuthCode")
    public String minorAuthCode;

    @NameInMap("Scene")
    public String scene;

    public static AuthLoginTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthLoginTicketRequest self = new AuthLoginTicketRequest();
        return TeaModel.build(map, self);
    }

    public AuthLoginTicketRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AuthLoginTicketRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public AuthLoginTicketRequest setMinorAuthCode(String minorAuthCode) {
        this.minorAuthCode = minorAuthCode;
        return this;
    }
    public String getMinorAuthCode() {
        return this.minorAuthCode;
    }

    public AuthLoginTicketRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
