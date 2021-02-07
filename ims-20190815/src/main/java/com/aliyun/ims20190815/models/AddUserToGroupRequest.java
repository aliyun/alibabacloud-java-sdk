// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class AddUserToGroupRequest extends TeaModel {
    @NameInMap("GroupPrincipalName")
    public String groupPrincipalName;

    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    @NameInMap("AkProxySuffix")
    public String akProxySuffix;

    @NameInMap("GroupName")
    public String groupName;

    public static AddUserToGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserToGroupRequest self = new AddUserToGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddUserToGroupRequest setGroupPrincipalName(String groupPrincipalName) {
        this.groupPrincipalName = groupPrincipalName;
        return this;
    }
    public String getGroupPrincipalName() {
        return this.groupPrincipalName;
    }

    public AddUserToGroupRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

    public AddUserToGroupRequest setAkProxySuffix(String akProxySuffix) {
        this.akProxySuffix = akProxySuffix;
        return this;
    }
    public String getAkProxySuffix() {
        return this.akProxySuffix;
    }

    public AddUserToGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}
