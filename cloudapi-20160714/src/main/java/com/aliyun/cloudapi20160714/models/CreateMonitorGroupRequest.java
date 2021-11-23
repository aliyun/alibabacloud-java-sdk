// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateMonitorGroupRequest extends TeaModel {
    @NameInMap("Auth")
    public String auth;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("RawMonitorGroupId")
    public Long rawMonitorGroupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static CreateMonitorGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorGroupRequest self = new CreateMonitorGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateMonitorGroupRequest setAuth(String auth) {
        this.auth = auth;
        return this;
    }
    public String getAuth() {
        return this.auth;
    }

    public CreateMonitorGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateMonitorGroupRequest setRawMonitorGroupId(Long rawMonitorGroupId) {
        this.rawMonitorGroupId = rawMonitorGroupId;
        return this;
    }
    public Long getRawMonitorGroupId() {
        return this.rawMonitorGroupId;
    }

    public CreateMonitorGroupRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
