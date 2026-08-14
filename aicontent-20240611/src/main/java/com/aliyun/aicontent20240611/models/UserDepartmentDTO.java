// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class UserDepartmentDTO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("clientId")
    public Long clientId;

    /**
     * <strong>example:</strong>
     * <p>R&amp;D Department</p>
     */
    @NameInMap("clientName")
    public String clientName;

    /**
     * <strong>example:</strong>
     * <p>member</p>
     */
    @NameInMap("roleCode")
    public String roleCode;

    /**
     * <strong>example:</strong>
     * <p>Member</p>
     */
    @NameInMap("roleName")
    public String roleName;

    public static UserDepartmentDTO build(java.util.Map<String, ?> map) throws Exception {
        UserDepartmentDTO self = new UserDepartmentDTO();
        return TeaModel.build(map, self);
    }

    public UserDepartmentDTO setClientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }
    public Long getClientId() {
        return this.clientId;
    }

    public UserDepartmentDTO setClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }
    public String getClientName() {
        return this.clientName;
    }

    public UserDepartmentDTO setRoleCode(String roleCode) {
        this.roleCode = roleCode;
        return this;
    }
    public String getRoleCode() {
        return this.roleCode;
    }

    public UserDepartmentDTO setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
