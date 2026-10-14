// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateSecurityGroupShrinkRequest extends TeaModel {
    /**
     * <p>The description of the security group. The description must be 2 to 256 characters in length. It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The rules of the security group. Valid values of N: 0 to 200.</p>
     */
    @NameInMap("Permissions")
    public String permissionsShrink;

    /**
     * <p>The name of the security group. The name must be 2 to 128 characters in length, and can contain digits, colons (:), underscores (_), and hyphens (-). It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. By default, this parameter is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>Dcdn1:2_3-4</p>
     */
    @NameInMap("SecurityGroupName")
    public String securityGroupName;

    public static CreateSecurityGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityGroupShrinkRequest self = new CreateSecurityGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSecurityGroupShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSecurityGroupShrinkRequest setPermissionsShrink(String permissionsShrink) {
        this.permissionsShrink = permissionsShrink;
        return this;
    }
    public String getPermissionsShrink() {
        return this.permissionsShrink;
    }

    public CreateSecurityGroupShrinkRequest setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
        return this;
    }
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

}
