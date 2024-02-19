// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class ModifyApiGroupRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ModifyApiGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApiGroupRequest self = new ModifyApiGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApiGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyApiGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ModifyApiGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ModifyApiGroupRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
