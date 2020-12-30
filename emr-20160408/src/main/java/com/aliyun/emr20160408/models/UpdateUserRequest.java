// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class UpdateUserRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("AliyunUserId")
    public String aliyunUserId;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("UserType")
    public String userType;

    @NameInMap("Status")
    public String status;

    @NameInMap("Description")
    public String description;

    @NameInMap("RoleIdList")
    public java.util.List<Integer> roleIdList;

    @NameInMap("GroupIdList")
    public java.util.List<Integer> groupIdList;

    @NameInMap("UserAccountParamList")
    public java.util.List<UpdateUserRequestUserAccountParamList> userAccountParamList;

    public static UpdateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserRequest self = new UpdateUserRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateUserRequest setAliyunUserId(String aliyunUserId) {
        this.aliyunUserId = aliyunUserId;
        return this;
    }
    public String getAliyunUserId() {
        return this.aliyunUserId;
    }

    public UpdateUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public UpdateUserRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public UpdateUserRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateUserRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateUserRequest setRoleIdList(java.util.List<Integer> roleIdList) {
        this.roleIdList = roleIdList;
        return this;
    }
    public java.util.List<Integer> getRoleIdList() {
        return this.roleIdList;
    }

    public UpdateUserRequest setGroupIdList(java.util.List<Integer> groupIdList) {
        this.groupIdList = groupIdList;
        return this;
    }
    public java.util.List<Integer> getGroupIdList() {
        return this.groupIdList;
    }

    public UpdateUserRequest setUserAccountParamList(java.util.List<UpdateUserRequestUserAccountParamList> userAccountParamList) {
        this.userAccountParamList = userAccountParamList;
        return this;
    }
    public java.util.List<UpdateUserRequestUserAccountParamList> getUserAccountParamList() {
        return this.userAccountParamList;
    }

    public static class UpdateUserRequestUserAccountParamList extends TeaModel {
        @NameInMap("AuthType")
        public String authType;

        @NameInMap("AccountPassword")
        public String accountPassword;

        @NameInMap("AccountType")
        public String accountType;

        public static UpdateUserRequestUserAccountParamList build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserRequestUserAccountParamList self = new UpdateUserRequestUserAccountParamList();
            return TeaModel.build(map, self);
        }

        public UpdateUserRequestUserAccountParamList setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public UpdateUserRequestUserAccountParamList setAccountPassword(String accountPassword) {
            this.accountPassword = accountPassword;
            return this;
        }
        public String getAccountPassword() {
            return this.accountPassword;
        }

        public UpdateUserRequestUserAccountParamList setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

    }

}
