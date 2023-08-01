// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertRoleRequest extends TeaModel {
    /**
     * <p>The set of permissions to be granted to the role. The value is in the format of `Permission group ID 1:Permission serial number 1;...;Permission group ID n:Permission serial number n`. Example: `1:1;1:2;2:1;2:2`. For more information about permission groups and permission serial numbers, see [ListAuthority](~~149409~~).</p>
     */
    @NameInMap("ActionData")
    public String actionData;

    /**
     * <p>The name of the role.</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    public static InsertRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertRoleRequest self = new InsertRoleRequest();
        return TeaModel.build(map, self);
    }

    public InsertRoleRequest setActionData(String actionData) {
        this.actionData = actionData;
        return this;
    }
    public String getActionData() {
        return this.actionData;
    }

    public InsertRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
