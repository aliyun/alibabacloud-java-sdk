// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SetYikeUserRoleRequest extends TeaModel {
    /**
     * <p>The user role. Valid values:</p>
     * <ul>
     * <li><p>SuperAdmin: Super Admin.</p>
     * </li>
     * <li><p>Admin: Admin.</p>
     * </li>
     * <li><p>RegularUser: Regular User.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Admin</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    /**
     * <p>The sub-account user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>id</p>
     */
    @NameInMap("YikeUserId")
    public String yikeUserId;

    public static SetYikeUserRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        SetYikeUserRoleRequest self = new SetYikeUserRoleRequest();
        return TeaModel.build(map, self);
    }

    public SetYikeUserRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public SetYikeUserRoleRequest setYikeUserId(String yikeUserId) {
        this.yikeUserId = yikeUserId;
        return this;
    }
    public String getYikeUserId() {
        return this.yikeUserId;
    }

}
