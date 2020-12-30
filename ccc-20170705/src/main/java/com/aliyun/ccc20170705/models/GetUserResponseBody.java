// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetUserResponseBody extends TeaModel {
    @NameInMap("User")
    public GetUserResponseBodyUser user;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserResponseBody self = new GetUserResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserResponseBody setUser(GetUserResponseBodyUser user) {
        this.user = user;
        return this;
    }
    public GetUserResponseBodyUser getUser() {
        return this.user;
    }

    public GetUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetUserResponseBodyUserSkillLevelsSkillLevelSkill extends TeaModel {
        @NameInMap("SkillGroupId")
        public String skillGroupId;

        @NameInMap("SkillGroupName")
        public String skillGroupName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("SkillGroupDescription")
        public String skillGroupDescription;

        public static GetUserResponseBodyUserSkillLevelsSkillLevelSkill build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyUserSkillLevelsSkillLevelSkill self = new GetUserResponseBodyUserSkillLevelsSkillLevelSkill();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyUserSkillLevelsSkillLevelSkill setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public GetUserResponseBodyUserSkillLevelsSkillLevelSkill setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

        public GetUserResponseBodyUserSkillLevelsSkillLevelSkill setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetUserResponseBodyUserSkillLevelsSkillLevelSkill setSkillGroupDescription(String skillGroupDescription) {
            this.skillGroupDescription = skillGroupDescription;
            return this;
        }
        public String getSkillGroupDescription() {
            return this.skillGroupDescription;
        }

    }

    public static class GetUserResponseBodyUserSkillLevelsSkillLevel extends TeaModel {
        @NameInMap("Skill")
        public GetUserResponseBodyUserSkillLevelsSkillLevelSkill skill;

        @NameInMap("SkillLevelId")
        public String skillLevelId;

        @NameInMap("Level")
        public Integer level;

        public static GetUserResponseBodyUserSkillLevelsSkillLevel build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyUserSkillLevelsSkillLevel self = new GetUserResponseBodyUserSkillLevelsSkillLevel();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyUserSkillLevelsSkillLevel setSkill(GetUserResponseBodyUserSkillLevelsSkillLevelSkill skill) {
            this.skill = skill;
            return this;
        }
        public GetUserResponseBodyUserSkillLevelsSkillLevelSkill getSkill() {
            return this.skill;
        }

        public GetUserResponseBodyUserSkillLevelsSkillLevel setSkillLevelId(String skillLevelId) {
            this.skillLevelId = skillLevelId;
            return this;
        }
        public String getSkillLevelId() {
            return this.skillLevelId;
        }

        public GetUserResponseBodyUserSkillLevelsSkillLevel setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

    }

    public static class GetUserResponseBodyUserSkillLevels extends TeaModel {
        @NameInMap("SkillLevel")
        public java.util.List<GetUserResponseBodyUserSkillLevelsSkillLevel> skillLevel;

        public static GetUserResponseBodyUserSkillLevels build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyUserSkillLevels self = new GetUserResponseBodyUserSkillLevels();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyUserSkillLevels setSkillLevel(java.util.List<GetUserResponseBodyUserSkillLevelsSkillLevel> skillLevel) {
            this.skillLevel = skillLevel;
            return this;
        }
        public java.util.List<GetUserResponseBodyUserSkillLevelsSkillLevel> getSkillLevel() {
            return this.skillLevel;
        }

    }

    public static class GetUserResponseBodyUserRolesRole extends TeaModel {
        @NameInMap("RoleDescription")
        public String roleDescription;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("RoleId")
        public String roleId;

        public static GetUserResponseBodyUserRolesRole build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyUserRolesRole self = new GetUserResponseBodyUserRolesRole();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyUserRolesRole setRoleDescription(String roleDescription) {
            this.roleDescription = roleDescription;
            return this;
        }
        public String getRoleDescription() {
            return this.roleDescription;
        }

        public GetUserResponseBodyUserRolesRole setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetUserResponseBodyUserRolesRole setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public GetUserResponseBodyUserRolesRole setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

    }

    public static class GetUserResponseBodyUserRoles extends TeaModel {
        @NameInMap("Role")
        public java.util.List<GetUserResponseBodyUserRolesRole> role;

        public static GetUserResponseBodyUserRoles build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyUserRoles self = new GetUserResponseBodyUserRoles();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyUserRoles setRole(java.util.List<GetUserResponseBodyUserRolesRole> role) {
            this.role = role;
            return this;
        }
        public java.util.List<GetUserResponseBodyUserRolesRole> getRole() {
            return this.role;
        }

    }

    public static class GetUserResponseBodyUserDetail extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Email")
        public String email;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("Department")
        public String department;

        @NameInMap("Phone")
        public String phone;

        public static GetUserResponseBodyUserDetail build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyUserDetail self = new GetUserResponseBodyUserDetail();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyUserDetail setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetUserResponseBodyUserDetail setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetUserResponseBodyUserDetail setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public GetUserResponseBodyUserDetail setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public GetUserResponseBodyUserDetail setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

    public static class GetUserResponseBodyUser extends TeaModel {
        @NameInMap("SkillLevels")
        public GetUserResponseBodyUserSkillLevels skillLevels;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Roles")
        public GetUserResponseBodyUserRoles roles;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RamId")
        public String ramId;

        @NameInMap("Detail")
        public GetUserResponseBodyUserDetail detail;

        public static GetUserResponseBodyUser build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyUser self = new GetUserResponseBodyUser();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyUser setSkillLevels(GetUserResponseBodyUserSkillLevels skillLevels) {
            this.skillLevels = skillLevels;
            return this;
        }
        public GetUserResponseBodyUserSkillLevels getSkillLevels() {
            return this.skillLevels;
        }

        public GetUserResponseBodyUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetUserResponseBodyUser setRoles(GetUserResponseBodyUserRoles roles) {
            this.roles = roles;
            return this;
        }
        public GetUserResponseBodyUserRoles getRoles() {
            return this.roles;
        }

        public GetUserResponseBodyUser setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetUserResponseBodyUser setRamId(String ramId) {
            this.ramId = ramId;
            return this;
        }
        public String getRamId() {
            return this.ramId;
        }

        public GetUserResponseBodyUser setDetail(GetUserResponseBodyUserDetail detail) {
            this.detail = detail;
            return this;
        }
        public GetUserResponseBodyUserDetail getDetail() {
            return this.detail;
        }

    }

}
