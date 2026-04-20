// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SearchWorkspaceRolesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<SearchWorkspaceRolesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>NesLoKLEdIZrKhDT7I2gS****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0C1CB646-1DE4-4AD0-B4A4-7D47DD52E931</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static SearchWorkspaceRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchWorkspaceRolesResponseBody self = new SearchWorkspaceRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchWorkspaceRolesResponseBody setData(java.util.List<SearchWorkspaceRolesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SearchWorkspaceRolesResponseBodyData> getData() {
        return this.data;
    }

    public SearchWorkspaceRolesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public SearchWorkspaceRolesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SearchWorkspaceRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchWorkspaceRolesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SearchWorkspaceRolesResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class SearchWorkspaceRolesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>MANAGER</p>
         */
        @NameInMap("RoleId")
        public Long roleId;

        /**
         * <strong>example:</strong>
         * <p>SLBLogDefaultRole</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        /**
         * <strong>example:</strong>
         * <p>INNER</p>
         */
        @NameInMap("RoleSource")
        public String roleSource;

        /**
         * <strong>example:</strong>
         * <p>inner</p>
         */
        @NameInMap("RoleSourceName")
        public String roleSourceName;

        public static SearchWorkspaceRolesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchWorkspaceRolesResponseBodyData self = new SearchWorkspaceRolesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchWorkspaceRolesResponseBodyData setRoleId(Long roleId) {
            this.roleId = roleId;
            return this;
        }
        public Long getRoleId() {
            return this.roleId;
        }

        public SearchWorkspaceRolesResponseBodyData setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public SearchWorkspaceRolesResponseBodyData setRoleSource(String roleSource) {
            this.roleSource = roleSource;
            return this;
        }
        public String getRoleSource() {
            return this.roleSource;
        }

        public SearchWorkspaceRolesResponseBodyData setRoleSourceName(String roleSourceName) {
            this.roleSourceName = roleSourceName;
            return this;
        }
        public String getRoleSourceName() {
            return this.roleSourceName;
        }

    }

}
