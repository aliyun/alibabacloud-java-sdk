// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAuditLogFilterResponseBody extends TeaModel {
    @NameInMap("Filter")
    public String filter;

    @NameInMap("RequestId")
    public String requestId;

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
