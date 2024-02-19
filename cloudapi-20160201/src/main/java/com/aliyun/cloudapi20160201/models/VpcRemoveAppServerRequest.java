// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class VpcRemoveAppServerRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ServerIp")
    public String serverIp;

    @NameInMap("Token")
    public String token;

    public static VpcRemoveAppServerRequest build(java.util.Map<String, ?> map) throws Exception {
        VpcRemoveAppServerRequest self = new VpcRemoveAppServerRequest();
        return TeaModel.build(map, self);
    }

    public VpcRemoveAppServerRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public VpcRemoveAppServerRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public VpcRemoveAppServerRequest setServerIp(String serverIp) {
        this.serverIp = serverIp;
        return this;
    }
    public String getServerIp() {
        return this.serverIp;
    }

    public VpcRemoveAppServerRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
