// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ConfigureSecurityGroupPermissionsShrinkRequest extends TeaModel {
    @NameInMap("AuthorizePermissions")
    public String authorizePermissionsShrink;

    @NameInMap("RevokePermissions")
    public String revokePermissionsShrink;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    public static ConfigureSecurityGroupPermissionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigureSecurityGroupPermissionsShrinkRequest self = new ConfigureSecurityGroupPermissionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ConfigureSecurityGroupPermissionsShrinkRequest setAuthorizePermissionsShrink(String authorizePermissionsShrink) {
        this.authorizePermissionsShrink = authorizePermissionsShrink;
        return this;
    }
    public String getAuthorizePermissionsShrink() {
        return this.authorizePermissionsShrink;
    }

    public ConfigureSecurityGroupPermissionsShrinkRequest setRevokePermissionsShrink(String revokePermissionsShrink) {
        this.revokePermissionsShrink = revokePermissionsShrink;
        return this;
    }
    public String getRevokePermissionsShrink() {
        return this.revokePermissionsShrink;
    }

    public ConfigureSecurityGroupPermissionsShrinkRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

}
