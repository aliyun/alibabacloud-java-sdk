// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListRolesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Roles")
    public java.util.List<ListRolesResponseBodyRoles> roles;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRolesResponseBody self = new ListRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRolesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRolesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRolesResponseBody setRoles(java.util.List<ListRolesResponseBodyRoles> roles) {
        this.roles = roles;
        return this;
    }
    public java.util.List<ListRolesResponseBodyRoles> getRoles() {
        return this.roles;
    }

    public ListRolesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListRolesResponseBodyRoles extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("RoleId")
        public String roleId;

        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListRolesResponseBodyRoles build(java.util.Map<String, ?> map) throws Exception {
            ListRolesResponseBodyRoles self = new ListRolesResponseBodyRoles();
            return TeaModel.build(map, self);
        }

        public ListRolesResponseBodyRoles setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListRolesResponseBodyRoles setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRolesResponseBodyRoles setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public ListRolesResponseBodyRoles setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public ListRolesResponseBodyRoles setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListRolesResponseBodyRoles setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
