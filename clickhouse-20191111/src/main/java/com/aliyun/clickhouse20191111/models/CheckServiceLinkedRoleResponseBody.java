// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CheckServiceLinkedRoleResponseBody extends TeaModel {
    /**
     * <p>Indicates whether a service-linked role is created for ApsaraDB for ClickHouse.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("HasServiceLinkedRole")
    public Boolean hasServiceLinkedRole;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
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
