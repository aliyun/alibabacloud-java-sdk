// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class AddUserToGroupRequest extends TeaModel {
    @NameInMap("UserPrincipalName")
    @Validation(required = true)
    public String userPrincipalName;

    @NameInMap("GroupName")
    public String groupName;

    public static AddUserToGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserToGroupRequest self = new AddUserToGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddUserToGroupRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

    public AddUserToGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}
