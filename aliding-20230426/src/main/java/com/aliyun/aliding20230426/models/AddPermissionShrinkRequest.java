// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddPermissionShrinkRequest extends TeaModel {
    @NameInMap("DentryUuid")
    public String dentryUuid;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Members")
    public String membersShrink;

    @NameInMap("Option")
    public String optionShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RoleId")
    public String roleId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static AddPermissionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPermissionShrinkRequest self = new AddPermissionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddPermissionShrinkRequest setDentryUuid(String dentryUuid) {
        this.dentryUuid = dentryUuid;
        return this;
    }
    public String getDentryUuid() {
        return this.dentryUuid;
    }

    public AddPermissionShrinkRequest setMembersShrink(String membersShrink) {
        this.membersShrink = membersShrink;
        return this;
    }
    public String getMembersShrink() {
        return this.membersShrink;
    }

    public AddPermissionShrinkRequest setOptionShrink(String optionShrink) {
        this.optionShrink = optionShrink;
        return this;
    }
    public String getOptionShrink() {
        return this.optionShrink;
    }

    public AddPermissionShrinkRequest setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

    public AddPermissionShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
