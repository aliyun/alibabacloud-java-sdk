// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AuthorizeSkillShrinkRequest extends TeaModel {
    @NameInMap("PermissionCodes")
    public String permissionCodesShrink;

    public static AuthorizeSkillShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeSkillShrinkRequest self = new AuthorizeSkillShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeSkillShrinkRequest setPermissionCodesShrink(String permissionCodesShrink) {
        this.permissionCodesShrink = permissionCodesShrink;
        return this;
    }
    public String getPermissionCodesShrink() {
        return this.permissionCodesShrink;
    }

}
