// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListUserRolesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>token!</p>
     */
    @NameInMap("nextPageToken")
    public String nextPageToken;

    @NameInMap("roles")
    public java.util.List<Role> roles;

    public static ListUserRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserRolesResponseBody self = new ListUserRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserRolesResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListUserRolesResponseBody setRoles(java.util.List<Role> roles) {
        this.roles = roles;
        return this;
    }
    public java.util.List<Role> getRoles() {
        return this.roles;
    }

}
