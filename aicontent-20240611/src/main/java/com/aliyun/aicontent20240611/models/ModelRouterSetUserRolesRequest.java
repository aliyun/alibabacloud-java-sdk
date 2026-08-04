// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterSetUserRolesRequest extends TeaModel {
    /**
     * <p>The department role list (required, full overwrite).</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;clientId&quot;:1001,&quot;roleCode&quot;:&quot;member&quot;},{&quot;clientId&quot;:1002,&quot;roleCode&quot;:&quot;member&quot;}]</p>
     */
    @NameInMap("departmentRoles")
    public java.util.List<DepartmentRoleCmd> departmentRoles;

    public static ModelRouterSetUserRolesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterSetUserRolesRequest self = new ModelRouterSetUserRolesRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterSetUserRolesRequest setDepartmentRoles(java.util.List<DepartmentRoleCmd> departmentRoles) {
        this.departmentRoles = departmentRoles;
        return this;
    }
    public java.util.List<DepartmentRoleCmd> getDepartmentRoles() {
        return this.departmentRoles;
    }

}
