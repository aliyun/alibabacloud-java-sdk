// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgUserGroupAddOrUpdateRequest extends TeaModel {
    /**
     * <p>The user groups.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserGroups")
    public java.util.List<DsgUserGroupAddOrUpdateRequestUserGroups> userGroups;

    public static DsgUserGroupAddOrUpdateRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgUserGroupAddOrUpdateRequest self = new DsgUserGroupAddOrUpdateRequest();
        return TeaModel.build(map, self);
    }

    public DsgUserGroupAddOrUpdateRequest setUserGroups(java.util.List<DsgUserGroupAddOrUpdateRequestUserGroups> userGroups) {
        this.userGroups = userGroups;
        return this;
    }
    public java.util.List<DsgUserGroupAddOrUpdateRequestUserGroups> getUserGroups() {
        return this.userGroups;
    }

    public static class DsgUserGroupAddOrUpdateRequestUserGroups extends TeaModel {
        /**
         * <p>The users in the user group.</p>
         * <ul>
         * <li><p>For user groups created based on Alibaba Cloud accounts and Resource Access Management (RAM) roles, call the <a href="https://help.aliyun.com/document_detail/2786445.html">DsgUserGroupQueryUserList</a> API to query the user list.</p>
         * </li>
         * <li><p>For user groups created based on MaxCompute roles, call the <a href="https://help.aliyun.com/document_detail/2785695.html">DsgUserGroupGetOdpsRoleGroups</a> API to query the user list.</p>
         * </li>
         * </ul>
         */
        @NameInMap("Accounts")
        public java.util.List<String> accounts;

        /**
         * <p>The ID of the user group.</p>
         * <ul>
         * <li><p>If you do not specify this parameter, a new user group is created.</p>
         * </li>
         * <li><p>If you specify this parameter, the specified user group is modified. You can call the <a href="https://help.aliyun.com/document_detail/2786441.html">DsgUserGroupQueryList</a> operation to query the ID of the user group.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the user group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yun_group</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The owner of the user group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user1</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The name of the MaxCompute project. Set this parameter when you create a MaxCompute user group.</p>
         * 
         * <strong>example:</strong>
         * <p>dev_project</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The type of the user group. The following values are valid:</p>
         * <ul>
         * <li><p>1: Alibaba Cloud user</p>
         * </li>
         * <li><p>2: RAM Role</p>
         * </li>
         * <li><p>3: MaxCompute Role</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UserGroupType")
        public Integer userGroupType;

        @NameInMap("projects")
        public String projects;

        public static DsgUserGroupAddOrUpdateRequestUserGroups build(java.util.Map<String, ?> map) throws Exception {
            DsgUserGroupAddOrUpdateRequestUserGroups self = new DsgUserGroupAddOrUpdateRequestUserGroups();
            return TeaModel.build(map, self);
        }

        public DsgUserGroupAddOrUpdateRequestUserGroups setAccounts(java.util.List<String> accounts) {
            this.accounts = accounts;
            return this;
        }
        public java.util.List<String> getAccounts() {
            return this.accounts;
        }

        public DsgUserGroupAddOrUpdateRequestUserGroups setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DsgUserGroupAddOrUpdateRequestUserGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DsgUserGroupAddOrUpdateRequestUserGroups setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DsgUserGroupAddOrUpdateRequestUserGroups setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DsgUserGroupAddOrUpdateRequestUserGroups setUserGroupType(Integer userGroupType) {
            this.userGroupType = userGroupType;
            return this;
        }
        public Integer getUserGroupType() {
            return this.userGroupType;
        }

        public DsgUserGroupAddOrUpdateRequestUserGroups setProjects(String projects) {
            this.projects = projects;
            return this;
        }
        public String getProjects() {
            return this.projects;
        }

    }

}
