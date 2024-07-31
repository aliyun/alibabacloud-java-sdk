// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgUserGroupAddOrUpdateRequest extends TeaModel {
    /**
     * <p>The information about the user group.</p>
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
         * <p>The users in the group.</p>
         * <ul>
         * <li>If a user group is created by using an Alibaba Cloud account and a RAM role, you can call the <a href="https://help.aliyun.com/document_detail/2786445.html">DsgUserGroupQueryUserList</a> operation to query the users in the group.</li>
         * <li>If a user group is created by using a MaxCompute role, you can call the <a href="https://help.aliyun.com/document_detail/2785695.html">DsgUserGroupQueryUserList</a> operation to query the users in the group.</li>
         * </ul>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Accounts")
        public java.util.List<String> accounts;

        /**
         * <p>The user group ID.</p>
         * <ul>
         * <li>If you do not configure this parameter, the current operation is to add a user group.</li>
         * <li>If you configure this parameter, the current operation is to modify a user group. You can call the <a href="https://help.aliyun.com/document_detail/2786441.html">DsgUserGroupQueryList</a> operation to query the user group ID.</li>
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
         * <p>The name of the MaxCompute project. You must configure this parameter when you create a MaxCompute user group.</p>
         * 
         * <strong>example:</strong>
         * <p>dev_project</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The type of the user group. Valid values:</p>
         * <ul>
         * <li>1: Alibaba Cloud account</li>
         * <li>2: RAM role</li>
         * <li>3: MaxCompute role</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UserGroupType")
        public Integer userGroupType;

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

    }

}
