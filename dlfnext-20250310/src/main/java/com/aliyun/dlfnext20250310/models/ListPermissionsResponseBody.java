// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListPermissionsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>token!</p>
     */
    @NameInMap("nextPageToken")
    public String nextPageToken;

    @NameInMap("permissions")
    public java.util.List<Permission> permissions;

    public static ListPermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPermissionsResponseBody self = new ListPermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPermissionsResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListPermissionsResponseBody setPermissions(java.util.List<Permission> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<Permission> getPermissions() {
        return this.permissions;
    }

}
