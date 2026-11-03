// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateXpackMonitorConfigRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must ensure that it is unique among different requests. The token can contain up to 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to enable X-Pack monitoring. Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>The endpoint of the Elasticsearch instance.</p>
     */
    @NameInMap("endpoints")
    public java.util.List<String> endpoints;

    /**
     * <p>The password of the Elasticsearch instance.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("password")
    public String password;

    /**
     * <p>The username of the Elasticsearch instance.</p>
     * 
     * <strong>example:</strong>
     * <p>elastic</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
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
