// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class IsUserAdminResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("IsAdmin")
    @Validation(required = true)
    public Boolean isAdmin;

    @NameInMap("IsAllow")
    @Validation(required = true)
    public Boolean isAllow;

    public static IsUserAdminResponse build(java.util.Map<String, ?> map) throws Exception {
        IsUserAdminResponse self = new IsUserAdminResponse();
        return TeaModel.build(map, self);
    }

    public IsUserAdminResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IsUserAdminResponse setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
        return this;
    }
    public Boolean getIsAdmin() {
        return this.isAdmin;
    }

    public IsUserAdminResponse setIsAllow(Boolean isAllow) {
        this.isAllow = isAllow;
        return this;
    }
    public Boolean getIsAllow() {
        return this.isAllow;
    }

}
