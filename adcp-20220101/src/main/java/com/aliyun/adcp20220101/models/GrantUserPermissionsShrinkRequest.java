// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class GrantUserPermissionsShrinkRequest extends TeaModel {
    /**
     * <p>The list of permissions that you want to grant to the RAM user.</p>
     */
    @NameInMap("Permissions")
    public String permissionsShrink;

    /**
     * <p>The ID of the RAM user.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static GrantUserPermissionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantUserPermissionsShrinkRequest self = new GrantUserPermissionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GrantUserPermissionsShrinkRequest setPermissionsShrink(String permissionsShrink) {
        this.permissionsShrink = permissionsShrink;
        return this;
    }
    public String getPermissionsShrink() {
        return this.permissionsShrink;
    }

    public GrantUserPermissionsShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
