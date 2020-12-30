// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class FindUsersResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Users")
    public FindUsersResponseBodyUsers users;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static FindUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindUsersResponseBody self = new FindUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public FindUsersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FindUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindUsersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public FindUsersResponseBody setUsers(FindUsersResponseBodyUsers users) {
        this.users = users;
        return this;
    }
    public FindUsersResponseBodyUsers getUsers() {
        return this.users;
    }

    public FindUsersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FindUsersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class FindUsersResponseBodyUsersListUserSkillLevelsSkillLevelSkill extends TeaModel {
        @NameInMap("SkillGroupId")
        public String skillGroupId;

        @NameInMap("SkillGroupName")
        public String skillGroupName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("SkillGroupDescription")
        public String skillGroupDescription;

        public static FindUsersResponseBodyUsersListUserSkillLevelsSkillLevelSkill build(java.util.Map<String, ?> map) throws Exception {
            FindUsersResponseBodyUsersListUserSkillLevelsSkillLevelSkill self = new FindUsersResponseBodyUsersListUserSkillLevelsSkillLevelSkill();
            return TeaModel.build(map, self);
        }

        public FindUsersResponseBodyUsersListUserSkillLevelsSkillLevelSkill setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public FindUsersResponseBodyUsersListUserSkillLevelsSkillLevelSkill setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

        public FindUsersResponseBodyUsersListUserSkillLevelsSkillLevelSkill setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public FindUsersResponseBodyUsersListUserSkillLevelsSkillLevelSkill setSkillGroupDescription(String skillGroupDescription) {
            this.skillGroupDescription = skillGroupDescription;
            return this;
        }
        public String getSkillGroupDescription() {
            return this.skillGroupDescription;
        }

    }

    public static class FindUsersResponseBodyUsersListUserSkillLevelsSkillLevel extends TeaModel {
        @NameInMap("Skill")
        public FindUsersResponseBodyUsersListUserSkillLevelsSkillLevelSkill skill;

        @NameInMap("SkillLevelId")
        public String skillLevelId;

        @NameInMap("Level")
        public Integer level;

        public static FindUsersResponseBodyUsersListUserSkillLevelsSkillLevel build(java.util.Map<String, ?> map) throws Exception {
            FindUsersResponseBodyUsersListUserSkillLevelsSkillLevel self = new FindUsersResponseBodyUsersListUserSkillLevelsSkillLevel();
            return TeaModel.build(map, self);
        }

        public FindUsersResponseBodyUsersListUserSkillLevelsSkillLevel setSkill(FindUsersResponseBodyUsersListUserSkillLevelsSkillLevelSkill skill) {
            this.skill = skill;
            return this;
        }
        public FindUsersResponseBodyUsersListUserSkillLevelsSkillLevelSkill getSkill() {
            return this.skill;
        }

        public FindUsersResponseBodyUsersListUserSkillLevelsSkillLevel setSkillLevelId(String skillLevelId) {
            this.skillLevelId = skillLevelId;
            return this;
        }
        public String getSkillLevelId() {
            return this.skillLevelId;
        }

        public FindUsersResponseBodyUsersListUserSkillLevelsSkillLevel setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

    }

    public static class FindUsersResponseBodyUsersListUserSkillLevels extends TeaModel {
        @NameInMap("SkillLevel")
        public java.util.List<FindUsersResponseBodyUsersListUserSkillLevelsSkillLevel> skillLevel;

        public static FindUsersResponseBodyUsersListUserSkillLevels build(java.util.Map<String, ?> map) throws Exception {
            FindUsersResponseBodyUsersListUserSkillLevels self = new FindUsersResponseBodyUsersListUserSkillLevels();
            return TeaModel.build(map, self);
        }

        public FindUsersResponseBodyUsersListUserSkillLevels setSkillLevel(java.util.List<FindUsersResponseBodyUsersListUserSkillLevelsSkillLevel> skillLevel) {
            this.skillLevel = skillLevel;
            return this;
        }
        public java.util.List<FindUsersResponseBodyUsersListUserSkillLevelsSkillLevel> getSkillLevel() {
            return this.skillLevel;
        }

    }

    public static class FindUsersResponseBodyUsersListUserRolesRole extends TeaModel {
        @NameInMap("RoleDescription")
        public String roleDescription;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("RoleId")
        public String roleId;

        public static FindUsersResponseBodyUsersListUserRolesRole build(java.util.Map<String, ?> map) throws Exception {
            FindUsersResponseBodyUsersListUserRolesRole self = new FindUsersResponseBodyUsersListUserRolesRole();
            return TeaModel.build(map, self);
        }

        public FindUsersResponseBodyUsersListUserRolesRole setRoleDescription(String roleDescription) {
            this.roleDescription = roleDescription;
            return this;
        }
        public String getRoleDescription() {
            return this.roleDescription;
        }

        public FindUsersResponseBodyUsersListUserRolesRole setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public FindUsersResponseBodyUsersListUserRolesRole setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public FindUsersResponseBodyUsersListUserRolesRole setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

    }

    public static class FindUsersResponseBodyUsersListUserRoles extends TeaModel {
        @NameInMap("Role")
        public java.util.List<FindUsersResponseBodyUsersListUserRolesRole> role;

        public static FindUsersResponseBodyUsersListUserRoles build(java.util.Map<String, ?> map) throws Exception {
            FindUsersResponseBodyUsersListUserRoles self = new FindUsersResponseBodyUsersListUserRoles();
            return TeaModel.build(map, self);
        }

        public FindUsersResponseBodyUsersListUserRoles setRole(java.util.List<FindUsersResponseBodyUsersListUserRolesRole> role) {
            this.role = role;
            return this;
        }
        public java.util.List<FindUsersResponseBodyUsersListUserRolesRole> getRole() {
            return this.role;
        }

    }

    public static class FindUsersResponseBodyUsersListUserDetail extends TeaModel {
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

        public static FindUsersResponseBodyUsersListUserDetail build(java.util.Map<String, ?> map) throws Exception {
            FindUsersResponseBodyUsersListUserDetail self = new FindUsersResponseBodyUsersListUserDetail();
            return TeaModel.build(map, self);
        }

        public FindUsersResponseBodyUsersListUserDetail setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public FindUsersResponseBodyUsersListUserDetail setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public FindUsersResponseBodyUsersListUserDetail setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public FindUsersResponseBodyUsersListUserDetail setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public FindUsersResponseBodyUsersListUserDetail setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

    public static class FindUsersResponseBodyUsersListUser extends TeaModel {
        @NameInMap("SkillLevels")
        public FindUsersResponseBodyUsersListUserSkillLevels skillLevels;

        @NameInMap("PrivateOutboundNumberId")
        public String privateOutboundNumberId;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Roles")
        public FindUsersResponseBodyUsersListUserRoles roles;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RamId")
        public String ramId;

        @NameInMap("Detail")
        public FindUsersResponseBodyUsersListUserDetail detail;

        public static FindUsersResponseBodyUsersListUser build(java.util.Map<String, ?> map) throws Exception {
            FindUsersResponseBodyUsersListUser self = new FindUsersResponseBodyUsersListUser();
            return TeaModel.build(map, self);
        }

        public FindUsersResponseBodyUsersListUser setSkillLevels(FindUsersResponseBodyUsersListUserSkillLevels skillLevels) {
            this.skillLevels = skillLevels;
            return this;
        }
        public FindUsersResponseBodyUsersListUserSkillLevels getSkillLevels() {
            return this.skillLevels;
        }

        public FindUsersResponseBodyUsersListUser setPrivateOutboundNumberId(String privateOutboundNumberId) {
            this.privateOutboundNumberId = privateOutboundNumberId;
            return this;
        }
        public String getPrivateOutboundNumberId() {
            return this.privateOutboundNumberId;
        }

        public FindUsersResponseBodyUsersListUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public FindUsersResponseBodyUsersListUser setRoles(FindUsersResponseBodyUsersListUserRoles roles) {
            this.roles = roles;
            return this;
        }
        public FindUsersResponseBodyUsersListUserRoles getRoles() {
            return this.roles;
        }

        public FindUsersResponseBodyUsersListUser setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public FindUsersResponseBodyUsersListUser setRamId(String ramId) {
            this.ramId = ramId;
            return this;
        }
        public String getRamId() {
            return this.ramId;
        }

        public FindUsersResponseBodyUsersListUser setDetail(FindUsersResponseBodyUsersListUserDetail detail) {
            this.detail = detail;
            return this;
        }
        public FindUsersResponseBodyUsersListUserDetail getDetail() {
            return this.detail;
        }

    }

    public static class FindUsersResponseBodyUsersList extends TeaModel {
        @NameInMap("User")
        public java.util.List<FindUsersResponseBodyUsersListUser> user;

        public static FindUsersResponseBodyUsersList build(java.util.Map<String, ?> map) throws Exception {
            FindUsersResponseBodyUsersList self = new FindUsersResponseBodyUsersList();
            return TeaModel.build(map, self);
        }

        public FindUsersResponseBodyUsersList setUser(java.util.List<FindUsersResponseBodyUsersListUser> user) {
            this.user = user;
            return this;
        }
        public java.util.List<FindUsersResponseBodyUsersListUser> getUser() {
            return this.user;
        }

    }

    public static class FindUsersResponseBodyUsers extends TeaModel {
        @NameInMap("List")
        public FindUsersResponseBodyUsersList list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static FindUsersResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            FindUsersResponseBodyUsers self = new FindUsersResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public FindUsersResponseBodyUsers setList(FindUsersResponseBodyUsersList list) {
            this.list = list;
            return this;
        }
        public FindUsersResponseBodyUsersList getList() {
            return this.list;
        }

        public FindUsersResponseBodyUsers setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public FindUsersResponseBodyUsers setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public FindUsersResponseBodyUsers setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
