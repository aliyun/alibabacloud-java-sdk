// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CreateUserRequest extends TeaModel {
    @NameInMap("AvatarUrl")
    public String avatarUrl;

    @NameInMap("DisplayId")
    public String displayId;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("Email")
    public String email;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LoginName")
    public String loginName;

    @NameInMap("Mobile")
    public String mobile;

    @NameInMap("Nickname")
    public String nickname;

    @NameInMap("ResetPassword")
    public Boolean resetPassword;

    @NameInMap("RoleId")
    public String roleId;

    @NameInMap("SkillLevelList")
    public String skillLevelList;

    @NameInMap("WorkMode")
    public String workMode;

    public static CreateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserRequest self = new CreateUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserRequest setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public CreateUserRequest setDisplayId(String displayId) {
        this.displayId = displayId;
        return this;
    }
    public String getDisplayId() {
        return this.displayId;
    }

    public CreateUserRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateUserRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public CreateUserRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public CreateUserRequest setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }
    public String getNickname() {
        return this.nickname;
    }

    public CreateUserRequest setResetPassword(Boolean resetPassword) {
        this.resetPassword = resetPassword;
        return this;
    }
    public Boolean getResetPassword() {
        return this.resetPassword;
    }

    public CreateUserRequest setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

    public CreateUserRequest setSkillLevelList(String skillLevelList) {
        this.skillLevelList = skillLevelList;
        return this;
    }
    public String getSkillLevelList() {
        return this.skillLevelList;
    }

    public CreateUserRequest setWorkMode(String workMode) {
        this.workMode = workMode;
        return this;
    }
    public String getWorkMode() {
        return this.workMode;
    }

}
