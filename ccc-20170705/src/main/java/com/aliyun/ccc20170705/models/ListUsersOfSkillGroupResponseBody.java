// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListUsersOfSkillGroupResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Users")
    public ListUsersOfSkillGroupResponseBodyUsers users;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ListUsersOfSkillGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersOfSkillGroupResponseBody self = new ListUsersOfSkillGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersOfSkillGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUsersOfSkillGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsersOfSkillGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListUsersOfSkillGroupResponseBody setUsers(ListUsersOfSkillGroupResponseBodyUsers users) {
        this.users = users;
        return this;
    }
    public ListUsersOfSkillGroupResponseBodyUsers getUsers() {
        return this.users;
    }

    public ListUsersOfSkillGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUsersOfSkillGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListUsersOfSkillGroupResponseBodyUsersListUserSkillLevelsSkillLevelSkill extends TeaModel {
        @NameInMap("SkillGroupId")
        public String skillGroupId;

        @NameInMap("SkillGroupName")
        public String skillGroupName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("SkillGroupDescription")
        public String skillGroupDescription;

        public static ListUsersOfSkillGroupResponseBodyUsersListUserSkillLevelsSkillLevelSkill build(java.util.Map<String, ?> map) throws Exception {
            ListUsersOfSkillGroupResponseBodyUsersListUserSkillLevelsSkillLevelSkill self = new ListUsersOfSkillGroupResponseBodyUsersListUserSkillLevelsSkillLevelSkill();
            return TeaModel.build(map, self);
        }

        public ListUsersOfSkillGroupResponseBodyUsersListUserSkillLevelsSkillLevelSkill setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public ListUsersOfSkillGroupResponseBodyUsersListUserSkillLevelsSkillLevelSkill setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

        public ListUsersOfSkillGroupResponseBodyUsersListUserSkillLevelsSkillLevelSkill setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListUsersOfSkillGroupResponseBodyUsersListUserSkillLevelsSkillLevelSkill setSkillGroupDescription(String skillGroupDescription) {
            this.skillGroupDescription = skillGroupDescription;
            return this;
        }
        public String getSkillGroupDescription() {
            return this.skillGroupDescription;
        }

    }

    public static class ListUsersOfSkillGroupResponseBodyUsersListUserSkillLevelsSkillLevel extends TeaModel {
        @NameInMap("Skill")
        public ListUsersOfSkillGroupResponseBodyUsersListUserSkillLevelsSkillLevelSkill skill;

        @NameInMap("SkillLevelId")
        public String skillLevelId;

        @NameInMap("Level")
        public Integer level;

        public static ListUsersOfSkillGroupResponseBodyUsersListUserSkillLevelsSkillLevel build(java.util.Map<String, ?> map) throws Exception {
            ListUsersOfSkillGroupResponseBodyUsersListUserSkillLevelsSkillLevel self = new ListUsersOfSkillGroupResponseBodyUsersListUserSkillLevelsSkillLevel();
            return TeaModel.build(map, self);
        }

        public ListUsersOfSkillGroupResponseBodyUsersListUserSkillLevelsSkillLevel setSkill(ListUsersOfSkillGroupResponseBodyUsersListUserSkillLevelsSkillLevelSkill skill) {
            this.skill = skill;
            return this;
        }
        public ListUsersOfSkillGroupResponseBodyUsersListUserSkillLevelsSkillLevelSkill getSkill() {
            return this.skill;
        }

        public ListUsersOfSkillGroupResponseBodyUsersListUserSkillLevelsSkillLevel setSkillLevelId(String skillLevelId) {
            this.skillLevelId = skillLevelId;
            return this;
        }
        public String getSkillLevelId() {
            return this.skillLevelId;
        }

        public ListUsersOfSkillGroupResponseBodyUsersListUserSkillLevelsSkillLevel setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

    }

    public static class ListUsersOfSkillGroupResponseBodyUsersListUserSkillLevels extends TeaModel {
        @NameInMap("SkillLevel")
        public java.util.List<ListUsersOfSkillGroupResponseBodyUsersListUserSkillLevelsSkillLevel> skillLevel;

        public static ListUsersOfSkillGroupResponseBodyUsersListUserSkillLevels build(java.util.Map<String, ?> map) throws Exception {
            ListUsersOfSkillGroupResponseBodyUsersListUserSkillLevels self = new ListUsersOfSkillGroupResponseBodyUsersListUserSkillLevels();
            return TeaModel.build(map, self);
        }

        public ListUsersOfSkillGroupResponseBodyUsersListUserSkillLevels setSkillLevel(java.util.List<ListUsersOfSkillGroupResponseBodyUsersListUserSkillLevelsSkillLevel> skillLevel) {
            this.skillLevel = skillLevel;
            return this;
        }
        public java.util.List<ListUsersOfSkillGroupResponseBodyUsersListUserSkillLevelsSkillLevel> getSkillLevel() {
            return this.skillLevel;
        }

    }

    public static class ListUsersOfSkillGroupResponseBodyUsersListUserRolesRolePrivilegesPrivilege extends TeaModel {
        @NameInMap("PrivilegeName")
        public String privilegeName;

        @NameInMap("PrivilegeId")
        public String privilegeId;

        @NameInMap("PrivilegeDescription")
        public String privilegeDescription;

        public static ListUsersOfSkillGroupResponseBodyUsersListUserRolesRolePrivilegesPrivilege build(java.util.Map<String, ?> map) throws Exception {
            ListUsersOfSkillGroupResponseBodyUsersListUserRolesRolePrivilegesPrivilege self = new ListUsersOfSkillGroupResponseBodyUsersListUserRolesRolePrivilegesPrivilege();
            return TeaModel.build(map, self);
        }

        public ListUsersOfSkillGroupResponseBodyUsersListUserRolesRolePrivilegesPrivilege setPrivilegeName(String privilegeName) {
            this.privilegeName = privilegeName;
            return this;
        }
        public String getPrivilegeName() {
            return this.privilegeName;
        }

        public ListUsersOfSkillGroupResponseBodyUsersListUserRolesRolePrivilegesPrivilege setPrivilegeId(String privilegeId) {
            this.privilegeId = privilegeId;
            return this;
        }
        public String getPrivilegeId() {
            return this.privilegeId;
        }

        public ListUsersOfSkillGroupResponseBodyUsersListUserRolesRolePrivilegesPrivilege setPrivilegeDescription(String privilegeDescription) {
            this.privilegeDescription = privilegeDescription;
            return this;
        }
        public String getPrivilegeDescription() {
            return this.privilegeDescription;
        }

    }

    public static class ListUsersOfSkillGroupResponseBodyUsersListUserRolesRolePrivileges extends TeaModel {
        @NameInMap("Privilege")
        public java.util.List<ListUsersOfSkillGroupResponseBodyUsersListUserRolesRolePrivilegesPrivilege> privilege;

        public static ListUsersOfSkillGroupResponseBodyUsersListUserRolesRolePrivileges build(java.util.Map<String, ?> map) throws Exception {
            ListUsersOfSkillGroupResponseBodyUsersListUserRolesRolePrivileges self = new ListUsersOfSkillGroupResponseBodyUsersListUserRolesRolePrivileges();
            return TeaModel.build(map, self);
        }

        public ListUsersOfSkillGroupResponseBodyUsersListUserRolesRolePrivileges setPrivilege(java.util.List<ListUsersOfSkillGroupResponseBodyUsersListUserRolesRolePrivilegesPrivilege> privilege) {
            this.privilege = privilege;
            return this;
        }
        public java.util.List<ListUsersOfSkillGroupResponseBodyUsersListUserRolesRolePrivilegesPrivilege> getPrivilege() {
            return this.privilege;
        }

    }

    public static class ListUsersOfSkillGroupResponseBodyUsersListUserRolesRole extends TeaModel {
        @NameInMap("RoleDescription")
        public String roleDescription;

        @NameInMap("Privileges")
        public ListUsersOfSkillGroupResponseBodyUsersListUserRolesRolePrivileges privileges;

        @NameInMap("UserCount")
        public Integer userCount;

        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RoleId")
        public String roleId;

        public static ListUsersOfSkillGroupResponseBodyUsersListUserRolesRole build(java.util.Map<String, ?> map) throws Exception {
            ListUsersOfSkillGroupResponseBodyUsersListUserRolesRole self = new ListUsersOfSkillGroupResponseBodyUsersListUserRolesRole();
            return TeaModel.build(map, self);
        }

        public ListUsersOfSkillGroupResponseBodyUsersListUserRolesRole setRoleDescription(String roleDescription) {
            this.roleDescription = roleDescription;
            return this;
        }
        public String getRoleDescription() {
            return this.roleDescription;
        }

        public ListUsersOfSkillGroupResponseBodyUsersListUserRolesRole setPrivileges(ListUsersOfSkillGroupResponseBodyUsersListUserRolesRolePrivileges privileges) {
            this.privileges = privileges;
            return this;
        }
        public ListUsersOfSkillGroupResponseBodyUsersListUserRolesRolePrivileges getPrivileges() {
            return this.privileges;
        }

        public ListUsersOfSkillGroupResponseBodyUsersListUserRolesRole setUserCount(Integer userCount) {
            this.userCount = userCount;
            return this;
        }
        public Integer getUserCount() {
            return this.userCount;
        }

        public ListUsersOfSkillGroupResponseBodyUsersListUserRolesRole setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public ListUsersOfSkillGroupResponseBodyUsersListUserRolesRole setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListUsersOfSkillGroupResponseBodyUsersListUserRolesRole setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

    }

    public static class ListUsersOfSkillGroupResponseBodyUsersListUserRoles extends TeaModel {
        @NameInMap("Role")
        public java.util.List<ListUsersOfSkillGroupResponseBodyUsersListUserRolesRole> role;

        public static ListUsersOfSkillGroupResponseBodyUsersListUserRoles build(java.util.Map<String, ?> map) throws Exception {
            ListUsersOfSkillGroupResponseBodyUsersListUserRoles self = new ListUsersOfSkillGroupResponseBodyUsersListUserRoles();
            return TeaModel.build(map, self);
        }

        public ListUsersOfSkillGroupResponseBodyUsersListUserRoles setRole(java.util.List<ListUsersOfSkillGroupResponseBodyUsersListUserRolesRole> role) {
            this.role = role;
            return this;
        }
        public java.util.List<ListUsersOfSkillGroupResponseBodyUsersListUserRolesRole> getRole() {
            return this.role;
        }

    }

    public static class ListUsersOfSkillGroupResponseBodyUsersListUserDetail extends TeaModel {
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

        public static ListUsersOfSkillGroupResponseBodyUsersListUserDetail build(java.util.Map<String, ?> map) throws Exception {
            ListUsersOfSkillGroupResponseBodyUsersListUserDetail self = new ListUsersOfSkillGroupResponseBodyUsersListUserDetail();
            return TeaModel.build(map, self);
        }

        public ListUsersOfSkillGroupResponseBodyUsersListUserDetail setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListUsersOfSkillGroupResponseBodyUsersListUserDetail setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListUsersOfSkillGroupResponseBodyUsersListUserDetail setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public ListUsersOfSkillGroupResponseBodyUsersListUserDetail setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ListUsersOfSkillGroupResponseBodyUsersListUserDetail setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

    public static class ListUsersOfSkillGroupResponseBodyUsersListUser extends TeaModel {
        @NameInMap("SkillLevels")
        public ListUsersOfSkillGroupResponseBodyUsersListUserSkillLevels skillLevels;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Roles")
        public ListUsersOfSkillGroupResponseBodyUsersListUserRoles roles;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RamId")
        public String ramId;

        @NameInMap("Detail")
        public ListUsersOfSkillGroupResponseBodyUsersListUserDetail detail;

        public static ListUsersOfSkillGroupResponseBodyUsersListUser build(java.util.Map<String, ?> map) throws Exception {
            ListUsersOfSkillGroupResponseBodyUsersListUser self = new ListUsersOfSkillGroupResponseBodyUsersListUser();
            return TeaModel.build(map, self);
        }

        public ListUsersOfSkillGroupResponseBodyUsersListUser setSkillLevels(ListUsersOfSkillGroupResponseBodyUsersListUserSkillLevels skillLevels) {
            this.skillLevels = skillLevels;
            return this;
        }
        public ListUsersOfSkillGroupResponseBodyUsersListUserSkillLevels getSkillLevels() {
            return this.skillLevels;
        }

        public ListUsersOfSkillGroupResponseBodyUsersListUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListUsersOfSkillGroupResponseBodyUsersListUser setRoles(ListUsersOfSkillGroupResponseBodyUsersListUserRoles roles) {
            this.roles = roles;
            return this;
        }
        public ListUsersOfSkillGroupResponseBodyUsersListUserRoles getRoles() {
            return this.roles;
        }

        public ListUsersOfSkillGroupResponseBodyUsersListUser setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListUsersOfSkillGroupResponseBodyUsersListUser setRamId(String ramId) {
            this.ramId = ramId;
            return this;
        }
        public String getRamId() {
            return this.ramId;
        }

        public ListUsersOfSkillGroupResponseBodyUsersListUser setDetail(ListUsersOfSkillGroupResponseBodyUsersListUserDetail detail) {
            this.detail = detail;
            return this;
        }
        public ListUsersOfSkillGroupResponseBodyUsersListUserDetail getDetail() {
            return this.detail;
        }

    }

    public static class ListUsersOfSkillGroupResponseBodyUsersList extends TeaModel {
        @NameInMap("User")
        public java.util.List<ListUsersOfSkillGroupResponseBodyUsersListUser> user;

        public static ListUsersOfSkillGroupResponseBodyUsersList build(java.util.Map<String, ?> map) throws Exception {
            ListUsersOfSkillGroupResponseBodyUsersList self = new ListUsersOfSkillGroupResponseBodyUsersList();
            return TeaModel.build(map, self);
        }

        public ListUsersOfSkillGroupResponseBodyUsersList setUser(java.util.List<ListUsersOfSkillGroupResponseBodyUsersListUser> user) {
            this.user = user;
            return this;
        }
        public java.util.List<ListUsersOfSkillGroupResponseBodyUsersListUser> getUser() {
            return this.user;
        }

    }

    public static class ListUsersOfSkillGroupResponseBodyUsers extends TeaModel {
        @NameInMap("List")
        public ListUsersOfSkillGroupResponseBodyUsersList list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListUsersOfSkillGroupResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            ListUsersOfSkillGroupResponseBodyUsers self = new ListUsersOfSkillGroupResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public ListUsersOfSkillGroupResponseBodyUsers setList(ListUsersOfSkillGroupResponseBodyUsersList list) {
            this.list = list;
            return this;
        }
        public ListUsersOfSkillGroupResponseBodyUsersList getList() {
            return this.list;
        }

        public ListUsersOfSkillGroupResponseBodyUsers setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListUsersOfSkillGroupResponseBodyUsers setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListUsersOfSkillGroupResponseBodyUsers setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
