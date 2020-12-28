// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class PrincipalPrivilegeSet extends TeaModel {
    @NameInMap("GroupPrivileges")
    public java.util.Map<String, java.util.List<PrivilegeGrantInfo>> groupPrivileges;

    @NameInMap("RolePrivileges")
    public java.util.Map<String, java.util.List<PrivilegeGrantInfo>> rolePrivileges;

    @NameInMap("UserPrivileges")
    public java.util.Map<String, java.util.List<PrivilegeGrantInfo>> userPrivileges;

    public static PrincipalPrivilegeSet build(java.util.Map<String, ?> map) throws Exception {
        PrincipalPrivilegeSet self = new PrincipalPrivilegeSet();
        return TeaModel.build(map, self);
    }

    public PrincipalPrivilegeSet setGroupPrivileges(java.util.Map<String, java.util.List<PrivilegeGrantInfo>> groupPrivileges) {
        this.groupPrivileges = groupPrivileges;
        return this;
    }
    public java.util.Map<String, java.util.List<PrivilegeGrantInfo>> getGroupPrivileges() {
        return this.groupPrivileges;
    }

    public PrincipalPrivilegeSet setRolePrivileges(java.util.Map<String, java.util.List<PrivilegeGrantInfo>> rolePrivileges) {
        this.rolePrivileges = rolePrivileges;
        return this;
    }
    public java.util.Map<String, java.util.List<PrivilegeGrantInfo>> getRolePrivileges() {
        return this.rolePrivileges;
    }

    public PrincipalPrivilegeSet setUserPrivileges(java.util.Map<String, java.util.List<PrivilegeGrantInfo>> userPrivileges) {
        this.userPrivileges = userPrivileges;
        return this;
    }
    public java.util.Map<String, java.util.List<PrivilegeGrantInfo>> getUserPrivileges() {
        return this.userPrivileges;
    }

}
