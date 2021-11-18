// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListUsersResponseBody extends TeaModel {
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

    @NameInMap("Users")
    public ListUsersResponseBodyUsers users;

    public static ListUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersResponseBody self = new ListUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUsersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListUsersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListUsersResponseBody setUsers(ListUsersResponseBodyUsers users) {
        this.users = users;
        return this;
    }
    public ListUsersResponseBodyUsers getUsers() {
        return this.users;
    }

    public static class ListUsersResponseBodyUsersListUserDetail extends TeaModel {
        @NameInMap("Department")
        public String department;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Email")
        public String email;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("Phone")
        public String phone;

        public static ListUsersResponseBodyUsersListUserDetail build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyUsersListUserDetail self = new ListUsersResponseBodyUsersListUserDetail();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyUsersListUserDetail setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ListUsersResponseBodyUsersListUserDetail setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListUsersResponseBodyUsersListUserDetail setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListUsersResponseBodyUsersListUserDetail setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public ListUsersResponseBodyUsersListUserDetail setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

    public static class ListUsersResponseBodyUsersListUserRolesRole extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RoleDescription")
        public String roleDescription;

        @NameInMap("RoleId")
        public String roleId;

        @NameInMap("RoleName")
        public String roleName;

        public static ListUsersResponseBodyUsersListUserRolesRole build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyUsersListUserRolesRole self = new ListUsersResponseBodyUsersListUserRolesRole();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyUsersListUserRolesRole setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListUsersResponseBodyUsersListUserRolesRole setRoleDescription(String roleDescription) {
            this.roleDescription = roleDescription;
            return this;
        }
        public String getRoleDescription() {
            return this.roleDescription;
        }

        public ListUsersResponseBodyUsersListUserRolesRole setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public ListUsersResponseBodyUsersListUserRolesRole setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

    public static class ListUsersResponseBodyUsersListUserRoles extends TeaModel {
        @NameInMap("Role")
        public java.util.List<ListUsersResponseBodyUsersListUserRolesRole> role;

        public static ListUsersResponseBodyUsersListUserRoles build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyUsersListUserRoles self = new ListUsersResponseBodyUsersListUserRoles();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyUsersListUserRoles setRole(java.util.List<ListUsersResponseBodyUsersListUserRolesRole> role) {
            this.role = role;
            return this;
        }
        public java.util.List<ListUsersResponseBodyUsersListUserRolesRole> getRole() {
            return this.role;
        }

    }

    public static class ListUsersResponseBodyUsersListUserSkillLevelsSkillLevelSkill extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("SkillGroupDescription")
        public String skillGroupDescription;

        @NameInMap("SkillGroupId")
        public String skillGroupId;

        @NameInMap("SkillGroupName")
        public String skillGroupName;

        public static ListUsersResponseBodyUsersListUserSkillLevelsSkillLevelSkill build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyUsersListUserSkillLevelsSkillLevelSkill self = new ListUsersResponseBodyUsersListUserSkillLevelsSkillLevelSkill();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyUsersListUserSkillLevelsSkillLevelSkill setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListUsersResponseBodyUsersListUserSkillLevelsSkillLevelSkill setSkillGroupDescription(String skillGroupDescription) {
            this.skillGroupDescription = skillGroupDescription;
            return this;
        }
        public String getSkillGroupDescription() {
            return this.skillGroupDescription;
        }

        public ListUsersResponseBodyUsersListUserSkillLevelsSkillLevelSkill setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public ListUsersResponseBodyUsersListUserSkillLevelsSkillLevelSkill setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

    }

    public static class ListUsersResponseBodyUsersListUserSkillLevelsSkillLevel extends TeaModel {
        @NameInMap("Level")
        public Integer level;

        @NameInMap("Skill")
        public ListUsersResponseBodyUsersListUserSkillLevelsSkillLevelSkill skill;

        @NameInMap("SkillLevelId")
        public String skillLevelId;

        public static ListUsersResponseBodyUsersListUserSkillLevelsSkillLevel build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyUsersListUserSkillLevelsSkillLevel self = new ListUsersResponseBodyUsersListUserSkillLevelsSkillLevel();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyUsersListUserSkillLevelsSkillLevel setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public ListUsersResponseBodyUsersListUserSkillLevelsSkillLevel setSkill(ListUsersResponseBodyUsersListUserSkillLevelsSkillLevelSkill skill) {
            this.skill = skill;
            return this;
        }
        public ListUsersResponseBodyUsersListUserSkillLevelsSkillLevelSkill getSkill() {
            return this.skill;
        }

        public ListUsersResponseBodyUsersListUserSkillLevelsSkillLevel setSkillLevelId(String skillLevelId) {
            this.skillLevelId = skillLevelId;
            return this;
        }
        public String getSkillLevelId() {
            return this.skillLevelId;
        }

    }

    public static class ListUsersResponseBodyUsersListUserSkillLevels extends TeaModel {
        @NameInMap("SkillLevel")
        public java.util.List<ListUsersResponseBodyUsersListUserSkillLevelsSkillLevel> skillLevel;

        public static ListUsersResponseBodyUsersListUserSkillLevels build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyUsersListUserSkillLevels self = new ListUsersResponseBodyUsersListUserSkillLevels();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyUsersListUserSkillLevels setSkillLevel(java.util.List<ListUsersResponseBodyUsersListUserSkillLevelsSkillLevel> skillLevel) {
            this.skillLevel = skillLevel;
            return this;
        }
        public java.util.List<ListUsersResponseBodyUsersListUserSkillLevelsSkillLevel> getSkillLevel() {
            return this.skillLevel;
        }

    }

    public static class ListUsersResponseBodyUsersListUser extends TeaModel {
        @NameInMap("Detail")
        public ListUsersResponseBodyUsersListUserDetail detail;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Primary")
        public Boolean primary;

        @NameInMap("PrivateOutboundNumberId")
        public String privateOutboundNumberId;

        @NameInMap("RamId")
        public String ramId;

        @NameInMap("Roles")
        public ListUsersResponseBodyUsersListUserRoles roles;

        @NameInMap("SkillLevels")
        public ListUsersResponseBodyUsersListUserSkillLevels skillLevels;

        @NameInMap("UserId")
        public String userId;

        public static ListUsersResponseBodyUsersListUser build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyUsersListUser self = new ListUsersResponseBodyUsersListUser();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyUsersListUser setDetail(ListUsersResponseBodyUsersListUserDetail detail) {
            this.detail = detail;
            return this;
        }
        public ListUsersResponseBodyUsersListUserDetail getDetail() {
            return this.detail;
        }

        public ListUsersResponseBodyUsersListUser setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListUsersResponseBodyUsersListUser setPrimary(Boolean primary) {
            this.primary = primary;
            return this;
        }
        public Boolean getPrimary() {
            return this.primary;
        }

        public ListUsersResponseBodyUsersListUser setPrivateOutboundNumberId(String privateOutboundNumberId) {
            this.privateOutboundNumberId = privateOutboundNumberId;
            return this;
        }
        public String getPrivateOutboundNumberId() {
            return this.privateOutboundNumberId;
        }

        public ListUsersResponseBodyUsersListUser setRamId(String ramId) {
            this.ramId = ramId;
            return this;
        }
        public String getRamId() {
            return this.ramId;
        }

        public ListUsersResponseBodyUsersListUser setRoles(ListUsersResponseBodyUsersListUserRoles roles) {
            this.roles = roles;
            return this;
        }
        public ListUsersResponseBodyUsersListUserRoles getRoles() {
            return this.roles;
        }

        public ListUsersResponseBodyUsersListUser setSkillLevels(ListUsersResponseBodyUsersListUserSkillLevels skillLevels) {
            this.skillLevels = skillLevels;
            return this;
        }
        public ListUsersResponseBodyUsersListUserSkillLevels getSkillLevels() {
            return this.skillLevels;
        }

        public ListUsersResponseBodyUsersListUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListUsersResponseBodyUsersList extends TeaModel {
        @NameInMap("User")
        public java.util.List<ListUsersResponseBodyUsersListUser> user;

        public static ListUsersResponseBodyUsersList build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyUsersList self = new ListUsersResponseBodyUsersList();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyUsersList setUser(java.util.List<ListUsersResponseBodyUsersListUser> user) {
            this.user = user;
            return this;
        }
        public java.util.List<ListUsersResponseBodyUsersListUser> getUser() {
            return this.user;
        }

    }

    public static class ListUsersResponseBodyUsers extends TeaModel {
        @NameInMap("List")
        public ListUsersResponseBodyUsersList list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListUsersResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyUsers self = new ListUsersResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyUsers setList(ListUsersResponseBodyUsersList list) {
            this.list = list;
            return this;
        }
        public ListUsersResponseBodyUsersList getList() {
            return this.list;
        }

        public ListUsersResponseBodyUsers setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListUsersResponseBodyUsers setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListUsersResponseBodyUsers setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
