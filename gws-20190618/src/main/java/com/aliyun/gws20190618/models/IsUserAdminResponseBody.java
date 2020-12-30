// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class IsUserAdminResponseBody extends TeaModel {
    @NameInMap("IsAdmin")
    public Boolean isAdmin;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IsAllow")
    public Boolean isAllow;

    public static IsUserAdminResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IsUserAdminResponseBody self = new IsUserAdminResponseBody();
        return TeaModel.build(map, self);
    }

    public IsUserAdminResponseBody setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
        return this;
    }
    public Boolean getIsAdmin() {
        return this.isAdmin;
    }

    public IsUserAdminResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IsUserAdminResponseBody setIsAllow(Boolean isAllow) {
        this.isAllow = isAllow;
        return this;
    }
    public Boolean getIsAllow() {
        return this.isAllow;
    }

}
