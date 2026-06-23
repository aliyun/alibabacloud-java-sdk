// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CheckServiceLinkedRoleResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the service-linked role exists.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasServiceLinkedRole")
    public Boolean hasServiceLinkedRole;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>66428721-xxxx-xxxx-xxxx-3BD1B67837E0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckServiceLinkedRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceLinkedRoleResponseBody self = new CheckServiceLinkedRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckServiceLinkedRoleResponseBody setHasServiceLinkedRole(Boolean hasServiceLinkedRole) {
        this.hasServiceLinkedRole = hasServiceLinkedRole;
        return this;
    }
    public Boolean getHasServiceLinkedRole() {
        return this.hasServiceLinkedRole;
    }

    public CheckServiceLinkedRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
