// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgUserGroupAddOrUpdateRequest extends TeaModel {
    /**
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
         * <p>This parameter is required.</p>
         */
        @NameInMap("Accounts")
        public java.util.List<String> accounts;

        @NameInMap("Id")
        public Long id;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Owner")
        public String owner;

        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>This parameter is required.</p>
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
