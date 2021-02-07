// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateGroupRequest extends TeaModel {
    @NameInMap("GroupPrincipalName")
    public String groupPrincipalName;

    @NameInMap("NewGroupPrincipalName")
    public String newGroupPrincipalName;

    @NameInMap("NewComments")
    public String newComments;

    @NameInMap("NewDisplayName")
    public String newDisplayName;

    @NameInMap("AkProxySuffix")
    public String akProxySuffix;

    @NameInMap("NewGroupName")
    public String newGroupName;

    @NameInMap("GroupName")
    public String groupName;

    public static UpdateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupRequest self = new UpdateGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGroupRequest setGroupPrincipalName(String groupPrincipalName) {
        this.groupPrincipalName = groupPrincipalName;
        return this;
    }
    public String getGroupPrincipalName() {
        return this.groupPrincipalName;
    }

    public UpdateGroupRequest setNewGroupPrincipalName(String newGroupPrincipalName) {
        this.newGroupPrincipalName = newGroupPrincipalName;
        return this;
    }
    public String getNewGroupPrincipalName() {
        return this.newGroupPrincipalName;
    }

    public UpdateGroupRequest setNewComments(String newComments) {
        this.newComments = newComments;
        return this;
    }
    public String getNewComments() {
        return this.newComments;
    }

    public UpdateGroupRequest setNewDisplayName(String newDisplayName) {
        this.newDisplayName = newDisplayName;
        return this;
    }
    public String getNewDisplayName() {
        return this.newDisplayName;
    }

    public UpdateGroupRequest setAkProxySuffix(String akProxySuffix) {
        this.akProxySuffix = akProxySuffix;
        return this;
    }
    public String getAkProxySuffix() {
        return this.akProxySuffix;
    }

    public UpdateGroupRequest setNewGroupName(String newGroupName) {
        this.newGroupName = newGroupName;
        return this;
    }
    public String getNewGroupName() {
        return this.newGroupName;
    }

    public UpdateGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}
