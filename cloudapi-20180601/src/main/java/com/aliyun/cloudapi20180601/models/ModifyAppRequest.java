// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class ModifyAppRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Description")
    public String description;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ModifyAppRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppRequest self = new ModifyAppRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public ModifyAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ModifyAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyAppRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
