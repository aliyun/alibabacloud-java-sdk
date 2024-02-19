// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class VpcAddAppServerRequest extends TeaModel {
    @NameInMap("AddressPoolId")
    public String addressPoolId;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ServerIp")
    public String serverIp;

    @NameInMap("Token")
    public String token;

    public static VpcAddAppServerRequest build(java.util.Map<String, ?> map) throws Exception {
        VpcAddAppServerRequest self = new VpcAddAppServerRequest();
        return TeaModel.build(map, self);
    }

    public VpcAddAppServerRequest setAddressPoolId(String addressPoolId) {
        this.addressPoolId = addressPoolId;
        return this;
    }
    public String getAddressPoolId() {
        return this.addressPoolId;
    }

    public VpcAddAppServerRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public VpcAddAppServerRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public VpcAddAppServerRequest setServerIp(String serverIp) {
        this.serverIp = serverIp;
        return this;
    }
    public String getServerIp() {
        return this.serverIp;
    }

    public VpcAddAppServerRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
