// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateSecurityGroupPermissionsShrinkRequest extends TeaModel {
    /**
     * <p>The security group rules.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Permissions")
    public String permissionsShrink;

    /**
     * <p>The IDs of the security groups.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp67acfmxazb4p****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    public static CreateSecurityGroupPermissionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityGroupPermissionsShrinkRequest self = new CreateSecurityGroupPermissionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSecurityGroupPermissionsShrinkRequest setPermissionsShrink(String permissionsShrink) {
        this.permissionsShrink = permissionsShrink;
        return this;
    }
    public String getPermissionsShrink() {
        return this.permissionsShrink;
    }

    public CreateSecurityGroupPermissionsShrinkRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

}
