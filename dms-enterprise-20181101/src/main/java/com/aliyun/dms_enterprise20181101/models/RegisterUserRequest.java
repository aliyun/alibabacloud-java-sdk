// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RegisterUserRequest extends TeaModel {
    /**
     * <p>The mobile number of the user.</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>The role that you want to assign to the user. Valid values:</p>
     * <br>
     * <p>*   **USER**: a regular user role</p>
     * <p>*   **DBA**: a database administrator (DBA) role</p>
     * <p>*   **ADMIN**: a DMS administrator role</p>
     * <p>*   **SECURITY_ADMIN**: a security administrator role</p>
     * <br>
     * <p>>  If you do not specify this parameter, the regular user role is assigned to the user by default. You can assign one or more roles to the user. Separate multiple roles with commas (,).</p>
     */
    @NameInMap("RoleNames")
    public String roleNames;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>>  To query ID of the tenant, move the pointer over the profile picture in the upper-right corner of the DMS console. For more information, see the "View information about the current tenant" section of the [Manage DMS tenants](~~181330~~) topic.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The UID of the Alibaba Cloud account of the user that you want to register.</p>
     */
    @NameInMap("Uid")
    public String uid;

    /**
     * <p>The nickname of the user.</p>
     */
    @NameInMap("UserNick")
    public String userNick;

    public static RegisterUserRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterUserRequest self = new RegisterUserRequest();
        return TeaModel.build(map, self);
    }

    public RegisterUserRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public RegisterUserRequest setRoleNames(String roleNames) {
        this.roleNames = roleNames;
        return this;
    }
    public String getRoleNames() {
        return this.roleNames;
    }

    public RegisterUserRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public RegisterUserRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public RegisterUserRequest setUserNick(String userNick) {
        this.userNick = userNick;
        return this;
    }
    public String getUserNick() {
        return this.userNick;
    }

}
