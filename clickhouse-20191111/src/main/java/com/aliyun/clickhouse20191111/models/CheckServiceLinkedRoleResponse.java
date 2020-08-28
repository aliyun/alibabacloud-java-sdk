// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CheckServiceLinkedRoleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("HasServiceLinkedRole")
    @Validation(required = true)
    public Boolean hasServiceLinkedRole;

    public static CheckServiceLinkedRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceLinkedRoleResponse self = new CheckServiceLinkedRoleResponse();
        return TeaModel.build(map, self);
    }

    public CheckServiceLinkedRoleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckServiceLinkedRoleResponse setHasServiceLinkedRole(Boolean hasServiceLinkedRole) {
        this.hasServiceLinkedRole = hasServiceLinkedRole;
        return this;
    }
    public Boolean getHasServiceLinkedRole() {
        return this.hasServiceLinkedRole;
    }

}
