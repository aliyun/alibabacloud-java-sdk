// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetUserByExtensionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("User")
    public GetUserByExtensionResponseBodyUser user;

    public static GetUserByExtensionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserByExtensionResponseBody self = new GetUserByExtensionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserByExtensionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUserByExtensionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetUserByExtensionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserByExtensionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserByExtensionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetUserByExtensionResponseBody setUser(GetUserByExtensionResponseBodyUser user) {
        this.user = user;
        return this;
    }
    public GetUserByExtensionResponseBodyUser getUser() {
        return this.user;
    }

    public static class GetUserByExtensionResponseBodyUserDetail extends TeaModel {
        @NameInMap("Department")
        public String department;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Email")
        public String email;

        @NameInMap("Extension")
        public String extension;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("Phone")
        public String phone;

        public static GetUserByExtensionResponseBodyUserDetail build(java.util.Map<String, ?> map) throws Exception {
            GetUserByExtensionResponseBodyUserDetail self = new GetUserByExtensionResponseBodyUserDetail();
            return TeaModel.build(map, self);
        }

        public GetUserByExtensionResponseBodyUserDetail setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public GetUserByExtensionResponseBodyUserDetail setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetUserByExtensionResponseBodyUserDetail setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetUserByExtensionResponseBodyUserDetail setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public GetUserByExtensionResponseBodyUserDetail setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public GetUserByExtensionResponseBodyUserDetail setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

    public static class GetUserByExtensionResponseBodyUserRoles extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RoleDescription")
        public String roleDescription;

        @NameInMap("RoleId")
        public String roleId;

        @NameInMap("RoleName")
        public String roleName;

        public static GetUserByExtensionResponseBodyUserRoles build(java.util.Map<String, ?> map) throws Exception {
            GetUserByExtensionResponseBodyUserRoles self = new GetUserByExtensionResponseBodyUserRoles();
            return TeaModel.build(map, self);
        }

        public GetUserByExtensionResponseBodyUserRoles setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetUserByExtensionResponseBodyUserRoles setRoleDescription(String roleDescription) {
            this.roleDescription = roleDescription;
            return this;
        }
        public String getRoleDescription() {
            return this.roleDescription;
        }

        public GetUserByExtensionResponseBodyUserRoles setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public GetUserByExtensionResponseBodyUserRoles setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

    public static class GetUserByExtensionResponseBodyUserSkillLevelsSkill extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("SkillGroupDescription")
        public String skillGroupDescription;

        @NameInMap("SkillGroupId")
        public String skillGroupId;

        @NameInMap("SkillGroupName")
        public String skillGroupName;

        public static GetUserByExtensionResponseBodyUserSkillLevelsSkill build(java.util.Map<String, ?> map) throws Exception {
            GetUserByExtensionResponseBodyUserSkillLevelsSkill self = new GetUserByExtensionResponseBodyUserSkillLevelsSkill();
            return TeaModel.build(map, self);
        }

        public GetUserByExtensionResponseBodyUserSkillLevelsSkill setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetUserByExtensionResponseBodyUserSkillLevelsSkill setSkillGroupDescription(String skillGroupDescription) {
            this.skillGroupDescription = skillGroupDescription;
            return this;
        }
        public String getSkillGroupDescription() {
            return this.skillGroupDescription;
        }

        public GetUserByExtensionResponseBodyUserSkillLevelsSkill setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public GetUserByExtensionResponseBodyUserSkillLevelsSkill setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

    }

    public static class GetUserByExtensionResponseBodyUserSkillLevels extends TeaModel {
        @NameInMap("Level")
        public Integer level;

        @NameInMap("Skill")
        public GetUserByExtensionResponseBodyUserSkillLevelsSkill skill;

        @NameInMap("SkillLevelId")
        public String skillLevelId;

        public static GetUserByExtensionResponseBodyUserSkillLevels build(java.util.Map<String, ?> map) throws Exception {
            GetUserByExtensionResponseBodyUserSkillLevels self = new GetUserByExtensionResponseBodyUserSkillLevels();
            return TeaModel.build(map, self);
        }

        public GetUserByExtensionResponseBodyUserSkillLevels setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public GetUserByExtensionResponseBodyUserSkillLevels setSkill(GetUserByExtensionResponseBodyUserSkillLevelsSkill skill) {
            this.skill = skill;
            return this;
        }
        public GetUserByExtensionResponseBodyUserSkillLevelsSkill getSkill() {
            return this.skill;
        }

        public GetUserByExtensionResponseBodyUserSkillLevels setSkillLevelId(String skillLevelId) {
            this.skillLevelId = skillLevelId;
            return this;
        }
        public String getSkillLevelId() {
            return this.skillLevelId;
        }

    }

    public static class GetUserByExtensionResponseBodyUser extends TeaModel {
        @NameInMap("Detail")
        public GetUserByExtensionResponseBodyUserDetail detail;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RamId")
        public String ramId;

        @NameInMap("Roles")
        public java.util.List<GetUserByExtensionResponseBodyUserRoles> roles;

        @NameInMap("SkillLevels")
        public java.util.List<GetUserByExtensionResponseBodyUserSkillLevels> skillLevels;

        @NameInMap("UserId")
        public String userId;

        public static GetUserByExtensionResponseBodyUser build(java.util.Map<String, ?> map) throws Exception {
            GetUserByExtensionResponseBodyUser self = new GetUserByExtensionResponseBodyUser();
            return TeaModel.build(map, self);
        }

        public GetUserByExtensionResponseBodyUser setDetail(GetUserByExtensionResponseBodyUserDetail detail) {
            this.detail = detail;
            return this;
        }
        public GetUserByExtensionResponseBodyUserDetail getDetail() {
            return this.detail;
        }

        public GetUserByExtensionResponseBodyUser setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetUserByExtensionResponseBodyUser setRamId(String ramId) {
            this.ramId = ramId;
            return this;
        }
        public String getRamId() {
            return this.ramId;
        }

        public GetUserByExtensionResponseBodyUser setRoles(java.util.List<GetUserByExtensionResponseBodyUserRoles> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<GetUserByExtensionResponseBodyUserRoles> getRoles() {
            return this.roles;
        }

        public GetUserByExtensionResponseBodyUser setSkillLevels(java.util.List<GetUserByExtensionResponseBodyUserSkillLevels> skillLevels) {
            this.skillLevels = skillLevels;
            return this;
        }
        public java.util.List<GetUserByExtensionResponseBodyUserSkillLevels> getSkillLevels() {
            return this.skillLevels;
        }

        public GetUserByExtensionResponseBodyUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
