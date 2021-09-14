// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class CheckUserIfAuthoriseMyBaseSystemRoleResponseBody extends TeaModel {
    @NameInMap("AliUid")
    public String aliUid;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RoleName")
    public String roleName;

    public static CheckUserIfAuthoriseMyBaseSystemRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckUserIfAuthoriseMyBaseSystemRoleResponseBody self = new CheckUserIfAuthoriseMyBaseSystemRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckUserIfAuthoriseMyBaseSystemRoleResponseBody setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public CheckUserIfAuthoriseMyBaseSystemRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckUserIfAuthoriseMyBaseSystemRoleResponseBody setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
