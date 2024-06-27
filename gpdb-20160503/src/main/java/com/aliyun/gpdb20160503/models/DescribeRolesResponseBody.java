// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeRolesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The roles.</p>
     */
    @NameInMap("RoleList")
    public DescribeRolesResponseBodyRoleList roleList;

    public static DescribeRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRolesResponseBody self = new DescribeRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRolesResponseBody setRoleList(DescribeRolesResponseBodyRoleList roleList) {
        this.roleList = roleList;
        return this;
    }
    public DescribeRolesResponseBodyRoleList getRoleList() {
        return this.roleList;
    }

    public static class DescribeRolesResponseBodyRoleList extends TeaModel {
        @NameInMap("Role")
        public java.util.List<String> role;

        public static DescribeRolesResponseBodyRoleList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRolesResponseBodyRoleList self = new DescribeRolesResponseBodyRoleList();
            return TeaModel.build(map, self);
        }

        public DescribeRolesResponseBodyRoleList setRole(java.util.List<String> role) {
            this.role = role;
            return this;
        }
        public java.util.List<String> getRole() {
            return this.role;
        }

    }

}
