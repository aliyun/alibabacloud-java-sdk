// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class VpcRegisterAppRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Token")
    public String token;

    public static VpcRegisterAppRequest build(java.util.Map<String, ?> map) throws Exception {
        VpcRegisterAppRequest self = new VpcRegisterAppRequest();
        return TeaModel.build(map, self);
    }

    public VpcRegisterAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public VpcRegisterAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public VpcRegisterAppRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public VpcRegisterAppRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public VpcRegisterAppRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
