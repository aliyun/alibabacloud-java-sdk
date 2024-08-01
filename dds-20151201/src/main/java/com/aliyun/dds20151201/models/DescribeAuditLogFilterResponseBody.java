// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAuditLogFilterResponseBody extends TeaModel {
    /**
     * <p>The type of the audit log entries. Valid values:</p>
     * <ul>
     * <li><strong>admin</strong>: O\&amp;M and management operations</li>
     * <li><strong>slow</strong>: slow query logs</li>
     * <li><strong>query</strong>: query operations</li>
     * <li><strong>insert</strong>: insert operations</li>
     * <li><strong>update</strong>: update operations</li>
     * <li><strong>delete</strong>: delete operations</li>
     * <li><strong>command</strong>: protocol commands such as the aggregate method</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>admin,slow,insert,query,update,delete,command</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7BAFB0B3-2A54-5B65-B13E-3937CF08FEE6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The role of the node.</p>
     * 
     * <strong>example:</strong>
     * <p>logic</p>
     */
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
