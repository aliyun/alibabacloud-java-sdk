// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdatePermissionShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>kDnRL6jAJMLgNkw7tBnw5aY4VyMoPYe1</p>
     */
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
     * <strong>example:</strong>
     * <p>READER</p>
     */
    @NameInMap("RoleId")
    public String roleId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static UpdatePermissionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePermissionShrinkRequest self = new UpdatePermissionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePermissionShrinkRequest setDentryUuid(String dentryUuid) {
        this.dentryUuid = dentryUuid;
        return this;
    }
    public String getDentryUuid() {
        return this.dentryUuid;
    }

    public UpdatePermissionShrinkRequest setMembersShrink(String membersShrink) {
        this.membersShrink = membersShrink;
        return this;
    }
    public String getMembersShrink() {
        return this.membersShrink;
    }

    public UpdatePermissionShrinkRequest setOptionShrink(String optionShrink) {
        this.optionShrink = optionShrink;
        return this;
    }
    public String getOptionShrink() {
        return this.optionShrink;
    }

    public UpdatePermissionShrinkRequest setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

    public UpdatePermissionShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
