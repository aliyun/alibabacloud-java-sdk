// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateRoleRequest extends TeaModel {
    /**
     * <p>The set of permissions to be granted to the role. The value is in the format of `Permission group ID 1:Permission serial number 1;...;Permission group ID n:Permission serial number n`. Example: `1:1;1:2;2:1;2:2`. For more information about permission groups and permission serial numbers, see [ListAuthority](~~149409~~).</p>
     */
    @NameInMap("ActionData")
    public String actionData;

    /**
     * <p>The ID of the role. You can call the ListRole operation to query the role IDs. For more information, see [ListRole](~~149410~~).</p>
     */
    @NameInMap("RoleId")
    public Integer roleId;

    public static UpdateRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRoleRequest self = new UpdateRoleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRoleRequest setActionData(String actionData) {
        this.actionData = actionData;
        return this;
    }
    public String getActionData() {
        return this.actionData;
    }

    public UpdateRoleRequest setRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }
    public Integer getRoleId() {
        return this.roleId;
    }

}
