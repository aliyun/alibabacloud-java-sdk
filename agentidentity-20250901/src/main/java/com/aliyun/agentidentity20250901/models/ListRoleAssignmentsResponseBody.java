// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListRoleAssignmentsResponseBody extends TeaModel {
    @NameInMap("Assignments")
    public java.util.List<ListRoleAssignmentsResponseBodyAssignments> assignments;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>TGlzdEFzc2lnbm1lbnRzOjoyMA==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>AABD6E03-4B3A-5687-88FF-72232670ED0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListRoleAssignmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRoleAssignmentsResponseBody self = new ListRoleAssignmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRoleAssignmentsResponseBody setAssignments(java.util.List<ListRoleAssignmentsResponseBodyAssignments> assignments) {
        this.assignments = assignments;
        return this;
    }
    public java.util.List<ListRoleAssignmentsResponseBodyAssignments> getAssignments() {
        return this.assignments;
    }

    public ListRoleAssignmentsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRoleAssignmentsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRoleAssignmentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRoleAssignmentsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListRoleAssignmentsResponseBodyAssignments extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-05-07T06:19:17Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>user_xxxxxxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("PrincipalId")
        public String principalId;

        /**
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("PrincipalName")
        public String principalName;

        /**
         * <strong>example:</strong>
         * <p>User</p>
         */
        @NameInMap("PrincipalType")
        public String principalType;

        /**
         * <strong>example:</strong>
         * <p>role_xxxxxxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("RoleId")
        public String roleId;

        /**
         * <strong>example:</strong>
         * <p>Analyst</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        /**
         * <strong>example:</strong>
         * <p>up_xxxxxxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("UserPoolId")
        public String userPoolId;

        public static ListRoleAssignmentsResponseBodyAssignments build(java.util.Map<String, ?> map) throws Exception {
            ListRoleAssignmentsResponseBodyAssignments self = new ListRoleAssignmentsResponseBodyAssignments();
            return TeaModel.build(map, self);
        }

        public ListRoleAssignmentsResponseBodyAssignments setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListRoleAssignmentsResponseBodyAssignments setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public ListRoleAssignmentsResponseBodyAssignments setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public ListRoleAssignmentsResponseBodyAssignments setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

        public ListRoleAssignmentsResponseBodyAssignments setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public ListRoleAssignmentsResponseBodyAssignments setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public ListRoleAssignmentsResponseBodyAssignments setUserPoolId(String userPoolId) {
            this.userPoolId = userPoolId;
            return this;
        }
        public String getUserPoolId() {
            return this.userPoolId;
        }

    }

}
