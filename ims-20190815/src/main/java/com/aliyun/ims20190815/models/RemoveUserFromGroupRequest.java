// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class RemoveUserFromGroupRequest extends TeaModel {
    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    @NameInMap("GroupPrincipalName")
    public String groupPrincipalName;

    @NameInMap("AkProxySuffix")
    public String akProxySuffix;

    @NameInMap("GroupName")
    public String groupName;

    public static RemoveUserFromGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserFromGroupRequest self = new RemoveUserFromGroupRequest();
        return TeaModel.build(map, self);
    }

    public RemoveUserFromGroupRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

    public RemoveUserFromGroupRequest setGroupPrincipalName(String groupPrincipalName) {
        this.groupPrincipalName = groupPrincipalName;
        return this;
    }
    public String getGroupPrincipalName() {
        return this.groupPrincipalName;
    }

    public RemoveUserFromGroupRequest setAkProxySuffix(String akProxySuffix) {
        this.akProxySuffix = akProxySuffix;
        return this;
    }
    public String getAkProxySuffix() {
        return this.akProxySuffix;
    }

    public RemoveUserFromGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}
