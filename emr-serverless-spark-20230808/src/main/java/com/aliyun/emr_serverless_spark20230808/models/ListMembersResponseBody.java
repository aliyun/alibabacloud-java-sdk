// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListMembersResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The list of members.</p>
     */
    @NameInMap("members")
    public java.util.List<ListMembersResponseBodyMembers> members;

    /**
     * <p>The token for the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMembersResponseBody self = new ListMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMembersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMembersResponseBody setMembers(java.util.List<ListMembersResponseBodyMembers> members) {
        this.members = members;
        return this;
    }
    public java.util.List<ListMembersResponseBodyMembers> getMembers() {
        return this.members;
    }

    public ListMembersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMembersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListMembersResponseBodyMembersActions extends TeaModel {
        /**
         * <p>The ARN of the action.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:emr::w-1234****abcd:action/add_MEMBER</p>
         */
        @NameInMap("actionArn")
        public String actionArn;

        /**
         * <p>The name of the permission.</p>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("actionName")
        public String actionName;

        /**
         * <p>The list of action dependencies.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;view&quot;]</p>
         */
        @NameInMap("dependencies")
        public java.util.List<String> dependencies;

        /**
         * <p>The description of the action.</p>
         * 
         * <strong>example:</strong>
         * <p>add members</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The display name of the permission.</p>
         * 
         * <strong>example:</strong>
         * <p>add members</p>
         */
        @NameInMap("displayName")
        public String displayName;

        public static ListMembersResponseBodyMembersActions build(java.util.Map<String, ?> map) throws Exception {
            ListMembersResponseBodyMembersActions self = new ListMembersResponseBodyMembersActions();
            return TeaModel.build(map, self);
        }

        public ListMembersResponseBodyMembersActions setActionArn(String actionArn) {
            this.actionArn = actionArn;
            return this;
        }
        public String getActionArn() {
            return this.actionArn;
        }

        public ListMembersResponseBodyMembersActions setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public ListMembersResponseBodyMembersActions setDependencies(java.util.List<String> dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public java.util.List<String> getDependencies() {
            return this.dependencies;
        }

        public ListMembersResponseBodyMembersActions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMembersResponseBodyMembersActions setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

    }

    public static class ListMembersResponseBodyMembersRolesActions extends TeaModel {
        /**
         * <p>The ARN of the action.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:emr::w-1234****abcd:action/add_MEMBER</p>
         */
        @NameInMap("actionArn")
        public String actionArn;

        /**
         * <p>The name of the permission.</p>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("actionName")
        public String actionName;

        /**
         * <p>The list of action dependencies.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;view&quot;]</p>
         */
        @NameInMap("dependencies")
        public java.util.List<String> dependencies;

        /**
         * <p>The description of the action.</p>
         * 
         * <strong>example:</strong>
         * <p>add members</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The display name of the permission.</p>
         * 
         * <strong>example:</strong>
         * <p>add members</p>
         */
        @NameInMap("displayName")
        public String displayName;

        public static ListMembersResponseBodyMembersRolesActions build(java.util.Map<String, ?> map) throws Exception {
            ListMembersResponseBodyMembersRolesActions self = new ListMembersResponseBodyMembersRolesActions();
            return TeaModel.build(map, self);
        }

        public ListMembersResponseBodyMembersRolesActions setActionArn(String actionArn) {
            this.actionArn = actionArn;
            return this;
        }
        public String getActionArn() {
            return this.actionArn;
        }

        public ListMembersResponseBodyMembersRolesActions setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public ListMembersResponseBodyMembersRolesActions setDependencies(java.util.List<String> dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public java.util.List<String> getDependencies() {
            return this.dependencies;
        }

        public ListMembersResponseBodyMembersRolesActions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMembersResponseBodyMembersRolesActions setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

    }

    public static class ListMembersResponseBodyMembersRoles extends TeaModel {
        /**
         * <p>The list of permissions.</p>
         */
        @NameInMap("actions")
        public java.util.List<ListMembersResponseBodyMembersRolesActions> actions;

        /**
         * <p>The time when the role was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1753412502000</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>DataScience</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The ARN of the role.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:emr::w-1234****abcd:role/DataScience</p>
         */
        @NameInMap("roleArn")
        public String roleArn;

        /**
         * <p>The name of the role.</p>
         * 
         * <strong>example:</strong>
         * <p>DataScience</p>
         */
        @NameInMap("roleName")
        public String roleName;

        public static ListMembersResponseBodyMembersRoles build(java.util.Map<String, ?> map) throws Exception {
            ListMembersResponseBodyMembersRoles self = new ListMembersResponseBodyMembersRoles();
            return TeaModel.build(map, self);
        }

        public ListMembersResponseBodyMembersRoles setActions(java.util.List<ListMembersResponseBodyMembersRolesActions> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<ListMembersResponseBodyMembersRolesActions> getActions() {
            return this.actions;
        }

        public ListMembersResponseBodyMembersRoles setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListMembersResponseBodyMembersRoles setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMembersResponseBodyMembersRoles setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public ListMembersResponseBodyMembersRoles setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

    public static class ListMembersResponseBodyMembers extends TeaModel {
        /**
         * <p>The list of operations allowed for this user.</p>
         */
        @NameInMap("actions")
        public java.util.List<ListMembersResponseBodyMembersActions> actions;

        /**
         * <p>The time when the member was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1753412502000</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The display name of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>jia***test</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:emr::w-1234*<em><strong>abcd:member/202265</strong></em>**276</p>
         */
        @NameInMap("memberArn")
        public String memberArn;

        /**
         * <p>The list of roles in the workspace.</p>
         */
        @NameInMap("roles")
        public java.util.List<ListMembersResponseBodyMembersRoles> roles;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>jia<em><strong>test@195</strong></em>**7311.onaliyun.com</p>
         */
        @NameInMap("userName")
        public String userName;

        /**
         * <p>The type of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>MEMBER</p>
         */
        @NameInMap("userType")
        public String userType;

        /**
         * <p>Indicates whether the member is visible.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("visible")
        public Boolean visible;

        public static ListMembersResponseBodyMembers build(java.util.Map<String, ?> map) throws Exception {
            ListMembersResponseBodyMembers self = new ListMembersResponseBodyMembers();
            return TeaModel.build(map, self);
        }

        public ListMembersResponseBodyMembers setActions(java.util.List<ListMembersResponseBodyMembersActions> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<ListMembersResponseBodyMembersActions> getActions() {
            return this.actions;
        }

        public ListMembersResponseBodyMembers setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListMembersResponseBodyMembers setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListMembersResponseBodyMembers setMemberArn(String memberArn) {
            this.memberArn = memberArn;
            return this;
        }
        public String getMemberArn() {
            return this.memberArn;
        }

        public ListMembersResponseBodyMembers setRoles(java.util.List<ListMembersResponseBodyMembersRoles> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<ListMembersResponseBodyMembersRoles> getRoles() {
            return this.roles;
        }

        public ListMembersResponseBodyMembers setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ListMembersResponseBodyMembers setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

        public ListMembersResponseBodyMembers setVisible(Boolean visible) {
            this.visible = visible;
            return this;
        }
        public Boolean getVisible() {
            return this.visible;
        }

    }

}
