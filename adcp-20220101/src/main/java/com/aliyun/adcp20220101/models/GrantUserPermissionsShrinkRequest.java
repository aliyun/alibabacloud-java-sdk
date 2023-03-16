// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class GrantUserPermissionsShrinkRequest extends TeaModel {
    @NameInMap("Permissions")
    public String permissionsShrink;

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
