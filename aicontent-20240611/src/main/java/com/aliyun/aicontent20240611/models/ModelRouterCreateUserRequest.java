// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterCreateUserRequest extends TeaModel {
    /**
     * <p>The department roles to assign to the user during creation. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("departmentRoles")
    public java.util.List<DepartmentRoleCmd> departmentRoles;

    /**
     * <p>The logon name. This parameter is required. The logon name can be the same as the phone number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zhangsan</p>
     */
    @NameInMap("loginName")
    public String loginName;

    /**
     * <p>The name. This parameter is required. The value must be 2 to 20 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>John</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The phone number. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>13800000000</p>
     */
    @NameInMap("phone")
    public String phone;

    public static ModelRouterCreateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterCreateUserRequest self = new ModelRouterCreateUserRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterCreateUserRequest setDepartmentRoles(java.util.List<DepartmentRoleCmd> departmentRoles) {
        this.departmentRoles = departmentRoles;
        return this;
    }
    public java.util.List<DepartmentRoleCmd> getDepartmentRoles() {
        return this.departmentRoles;
    }

    public ModelRouterCreateUserRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public ModelRouterCreateUserRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModelRouterCreateUserRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

}
