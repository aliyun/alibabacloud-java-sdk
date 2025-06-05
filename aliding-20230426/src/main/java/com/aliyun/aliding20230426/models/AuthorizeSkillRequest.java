// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AuthorizeSkillRequest extends TeaModel {
    @NameInMap("PermissionCodes")
    public java.util.List<String> permissionCodes;

    public static AuthorizeSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeSkillRequest self = new AuthorizeSkillRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeSkillRequest setPermissionCodes(java.util.List<String> permissionCodes) {
        this.permissionCodes = permissionCodes;
        return this;
    }
    public java.util.List<String> getPermissionCodes() {
        return this.permissionCodes;
    }

}
