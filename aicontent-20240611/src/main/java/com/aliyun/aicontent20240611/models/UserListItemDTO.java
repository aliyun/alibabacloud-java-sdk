// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class UserListItemDTO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("departments")
    public java.util.List<UserDepartmentDTO> departments;

    /**
     * <strong>example:</strong>
     * <p>2026-07-01 10:00:00</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>zhangsan</p>
     */
    @NameInMap("loginName")
    public String loginName;

    /**
     * <strong>example:</strong>
     * <p>Zhang San</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>13800000000</p>
     */
    @NameInMap("phone")
    public String phone;

    public static UserListItemDTO build(java.util.Map<String, ?> map) throws Exception {
        UserListItemDTO self = new UserListItemDTO();
        return TeaModel.build(map, self);
    }

    public UserListItemDTO setDepartments(java.util.List<UserDepartmentDTO> departments) {
        this.departments = departments;
        return this;
    }
    public java.util.List<UserDepartmentDTO> getDepartments() {
        return this.departments;
    }

    public UserListItemDTO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public UserListItemDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UserListItemDTO setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public UserListItemDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UserListItemDTO setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

}
