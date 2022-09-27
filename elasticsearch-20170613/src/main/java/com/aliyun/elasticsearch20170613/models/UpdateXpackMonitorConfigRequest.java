// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateXpackMonitorConfigRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("enable")
    public Boolean enable;

    @NameInMap("endpoints")
    public java.util.List<String> endpoints;

    @NameInMap("password")
    public String password;

    @NameInMap("userName")
    public String userName;

    public static UpdateXpackMonitorConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateXpackMonitorConfigRequest self = new UpdateXpackMonitorConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateXpackMonitorConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateXpackMonitorConfigRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdateXpackMonitorConfigRequest setEndpoints(java.util.List<String> endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public java.util.List<String> getEndpoints() {
        return this.endpoints;
    }

    public UpdateXpackMonitorConfigRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public UpdateXpackMonitorConfigRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
