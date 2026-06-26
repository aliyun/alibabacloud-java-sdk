// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListRolesResponseBody extends TeaModel {
    /**
     * <p>The token used to retrieve the next page of results. If a null value is returned, the current page is the last page.</p>
     * 
     * <strong>example:</strong>
     * <p>E8ABEB1C3DB893D16576269017992F57</p>
     */
    @NameInMap("nextPageToken")
    public String nextPageToken;

    /**
     * <p>The roles.</p>
     */
    @NameInMap("roles")
    public java.util.List<Role> roles;

    public static ListRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRolesResponseBody self = new ListRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRolesResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListRolesResponseBody setRoles(java.util.List<Role> roles) {
        this.roles = roles;
        return this;
    }
    public java.util.List<Role> getRoles() {
        return this.roles;
    }

}
