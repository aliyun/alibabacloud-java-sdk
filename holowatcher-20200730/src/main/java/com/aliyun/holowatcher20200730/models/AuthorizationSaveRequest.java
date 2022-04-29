// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class AuthorizationSaveRequest extends TeaModel {
    @NameInMap("AuthorizationCode")
    public String authorizationCode;

    @NameInMap("Jwt")
    public String jwt;

    @NameInMap("PhoneModel")
    public String phoneModel;

    @NameInMap("SystemVersion")
    public String systemVersion;

    public static AuthorizationSaveRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizationSaveRequest self = new AuthorizationSaveRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizationSaveRequest setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
        return this;
    }
    public String getAuthorizationCode() {
        return this.authorizationCode;
    }

    public AuthorizationSaveRequest setJwt(String jwt) {
        this.jwt = jwt;
        return this;
    }
    public String getJwt() {
        return this.jwt;
    }

    public AuthorizationSaveRequest setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
        return this;
    }
    public String getPhoneModel() {
        return this.phoneModel;
    }

    public AuthorizationSaveRequest setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
        return this;
    }
    public String getSystemVersion() {
        return this.systemVersion;
    }

}
