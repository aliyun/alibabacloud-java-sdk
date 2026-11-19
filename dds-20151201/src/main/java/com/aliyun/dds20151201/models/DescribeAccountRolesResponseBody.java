// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAccountRolesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7FEF1BEF-2842-5758-9126-415A297*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Roles")
    public DescribeAccountRolesResponseBodyRoles roles;

    public static DescribeAccountRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountRolesResponseBody self = new DescribeAccountRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccountRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccountRolesResponseBody setRoles(DescribeAccountRolesResponseBodyRoles roles) {
        this.roles = roles;
        return this;
    }
    public DescribeAccountRolesResponseBodyRoles getRoles() {
        return this.roles;
    }

    public static class DescribeAccountRolesResponseBodyRolesRole extends TeaModel {
        @NameInMap("DBName")
        public String DBName;

        @NameInMap("Role")
        public String role;

        public static DescribeAccountRolesResponseBodyRolesRole build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountRolesResponseBodyRolesRole self = new DescribeAccountRolesResponseBodyRolesRole();
            return TeaModel.build(map, self);
        }

        public DescribeAccountRolesResponseBodyRolesRole setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeAccountRolesResponseBodyRolesRole setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class DescribeAccountRolesResponseBodyRoles extends TeaModel {
        @NameInMap("Role")
        public java.util.List<DescribeAccountRolesResponseBodyRolesRole> role;

        public static DescribeAccountRolesResponseBodyRoles build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountRolesResponseBodyRoles self = new DescribeAccountRolesResponseBodyRoles();
            return TeaModel.build(map, self);
        }

        public DescribeAccountRolesResponseBodyRoles setRole(java.util.List<DescribeAccountRolesResponseBodyRolesRole> role) {
            this.role = role;
            return this;
        }
        public java.util.List<DescribeAccountRolesResponseBodyRolesRole> getRole() {
            return this.role;
        }

    }

}
