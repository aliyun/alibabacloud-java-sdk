// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListRolesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned for the current request.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to query the next page of data. An empty value indicates that no more data is available.</p>
     * 
     * <strong>example:</strong>
     * <p>TGlzdFJvbGVzOjoyMA==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AABD6E03-4B3A-5687-88FF-72232670ED0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of roles.</p>
     */
    @NameInMap("Roles")
    public java.util.List<ListRolesResponseBodyRoles> roles;

    /**
     * <p>The total number of roles that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
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
        /**
         * <p>The creation time in ISO 8601 format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-07T06:19:17Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The role description.</p>
         * 
         * <strong>example:</strong>
         * <p>Data analytics role</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The role ID.</p>
         * 
         * <strong>example:</strong>
         * <p>role_xxxxxxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("RoleId")
        public String roleId;

        /**
         * <p>The role name.</p>
         * 
         * <strong>example:</strong>
         * <p>Analyst</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        /**
         * <p>The role type. Default indicates a default role. Manual indicates a custom role.</p>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The update time in ISO 8601 format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-07T06:19:17Z</p>
         */
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
