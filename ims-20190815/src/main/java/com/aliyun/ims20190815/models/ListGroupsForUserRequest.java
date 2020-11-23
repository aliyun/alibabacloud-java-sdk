// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListGroupsForUserRequest extends TeaModel {
    @NameInMap("UserPrincipalName")
    @Validation(required = true)
    public String userPrincipalName;

    public static ListGroupsForUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGroupsForUserRequest self = new ListGroupsForUserRequest();
        return TeaModel.build(map, self);
    }

    public ListGroupsForUserRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

}
