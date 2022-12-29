// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAuditLogFilterResponseBody extends TeaModel {
    // The type of the audit log entries. Valid values:
    // 
    // *   **admin**: O\&M and management operations
    // *   **slow**: slow query logs
    // *   **query**: query operations
    // *   **insert**: insert operations
    // *   **update**: update operations
    // *   **delete**: delete operations
    // *   **command**: protocol commands such as the aggregate method
    @NameInMap("Filter")
    public String filter;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The role of the node.
    @NameInMap("RoleType")
    public String roleType;

    public static DescribeAuditLogFilterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditLogFilterResponseBody self = new DescribeAuditLogFilterResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAuditLogFilterResponseBody setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public DescribeAuditLogFilterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAuditLogFilterResponseBody setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

}
