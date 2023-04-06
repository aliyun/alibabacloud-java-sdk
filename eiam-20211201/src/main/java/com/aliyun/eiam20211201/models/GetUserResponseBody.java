// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("User")
    public GetUserResponseBodyUser user;

    public static GetUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserResponseBody self = new GetUserResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserResponseBody setUser(GetUserResponseBodyUser user) {
        this.user = user;
        return this;
    }
    public GetUserResponseBodyUser getUser() {
        return this.user;
    }

    public static class GetUserResponseBodyUserCustomFields extends TeaModel {
        /**
         * <p>字段标识</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <p>字段数据值</p>
         */
        @NameInMap("FieldValue")
        public String fieldValue;

        public static GetUserResponseBodyUserCustomFields build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyUserCustomFields self = new GetUserResponseBodyUserCustomFields();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyUserCustomFields setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public GetUserResponseBodyUserCustomFields setFieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            return this;
        }
        public String getFieldValue() {
            return this.fieldValue;
        }

    }

    public static class GetUserResponseBodyUserGroups extends TeaModel {
        /**
         * <p>组描述。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>组ID。</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>组名称。</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        public static GetUserResponseBodyUserGroups build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyUserGroups self = new GetUserResponseBodyUserGroups();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyUserGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetUserResponseBodyUserGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetUserResponseBodyUserGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class GetUserResponseBodyUserOrganizationalUnits extends TeaModel {
        /**
         * <p>机构ID</p>
         */
        @NameInMap("OrganizationalUnitId")
        public String organizationalUnitId;

        /**
         * <p>机构名称</p>
         */
        @NameInMap("OrganizationalUnitName")
        public String organizationalUnitName;

        /**
         * <p>是否主机构</p>
         */
        @NameInMap("Primary")
        public Boolean primary;

        public static GetUserResponseBodyUserOrganizationalUnits build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyUserOrganizationalUnits self = new GetUserResponseBodyUserOrganizationalUnits();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyUserOrganizationalUnits setOrganizationalUnitId(String organizationalUnitId) {
            this.organizationalUnitId = organizationalUnitId;
            return this;
        }
        public String getOrganizationalUnitId() {
            return this.organizationalUnitId;
        }

        public GetUserResponseBodyUserOrganizationalUnits setOrganizationalUnitName(String organizationalUnitName) {
            this.organizationalUnitName = organizationalUnitName;
            return this;
        }
        public String getOrganizationalUnitName() {
            return this.organizationalUnitName;
        }

        public GetUserResponseBodyUserOrganizationalUnits setPrimary(Boolean primary) {
            this.primary = primary;
            return this;
        }
        public Boolean getPrimary() {
            return this.primary;
        }

    }

    public static class GetUserResponseBodyUser extends TeaModel {
        /**
         * <p>账户过期时间</p>
         */
        @NameInMap("AccountExpireTime")
        public Long accountExpireTime;

        /**
         * <p>创建时间</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>账户扩展字段列表</p>
         */
        @NameInMap("CustomFields")
        public java.util.List<GetUserResponseBodyUserCustomFields> customFields;

        /**
         * <p>账号描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>账户显示名</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>邮箱</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>邮箱是否已验证</p>
         */
        @NameInMap("EmailVerified")
        public Boolean emailVerified;

        /**
         * <p>账户所属组列表</p>
         */
        @NameInMap("Groups")
        public java.util.List<GetUserResponseBodyUserGroups> groups;

        /**
         * <p>实例ID</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>锁定过期时间</p>
         */
        @NameInMap("LockExpireTime")
        public Long lockExpireTime;

        /**
         * <p>账户所属组织列表</p>
         */
        @NameInMap("OrganizationalUnits")
        public java.util.List<GetUserResponseBodyUserOrganizationalUnits> organizationalUnits;

        /**
         * <p>密码过期时间</p>
         */
        @NameInMap("PasswordExpireTime")
        public Long passwordExpireTime;

        /**
         * <p>密码是否已设置</p>
         */
        @NameInMap("PasswordSet")
        public Boolean passwordSet;

        /**
         * <p>手机号码</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>手机号是否已验证</p>
         */
        @NameInMap("PhoneNumberVerified")
        public Boolean phoneNumberVerified;

        /**
         * <p>手机地区编号,示例：中国大陆手区号为86，不带 00 或 +</p>
         */
        @NameInMap("PhoneRegion")
        public String phoneRegion;

        /**
         * <p>账户主机构ID</p>
         */
        @NameInMap("PrimaryOrganizationalUnitId")
        public String primaryOrganizationalUnitId;

        /**
         * <p>账户注册时间</p>
         */
        @NameInMap("RegisterTime")
        public Long registerTime;

        /**
         * <p>账户状态, enabled:启用,disabled:禁用</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>最近一次更新时间</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>外部ID</p>
         */
        @NameInMap("UserExternalId")
        public String userExternalId;

        /**
         * <p>账户ID</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>来源ID</p>
         */
        @NameInMap("UserSourceId")
        public String userSourceId;

        /**
         * <p>来源类型，build_in[自建],ding_talk[钉钉导入],ad[AD导入],ldap[LDAP导入]</p>
         */
        @NameInMap("UserSourceType")
        public String userSourceType;

        /**
         * <p>账户名</p>
         */
        @NameInMap("Username")
        public String username;

        public static GetUserResponseBodyUser build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyUser self = new GetUserResponseBodyUser();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyUser setAccountExpireTime(Long accountExpireTime) {
            this.accountExpireTime = accountExpireTime;
            return this;
        }
        public Long getAccountExpireTime() {
            return this.accountExpireTime;
        }

        public GetUserResponseBodyUser setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetUserResponseBodyUser setCustomFields(java.util.List<GetUserResponseBodyUserCustomFields> customFields) {
            this.customFields = customFields;
            return this;
        }
        public java.util.List<GetUserResponseBodyUserCustomFields> getCustomFields() {
            return this.customFields;
        }

        public GetUserResponseBodyUser setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetUserResponseBodyUser setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetUserResponseBodyUser setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetUserResponseBodyUser setEmailVerified(Boolean emailVerified) {
            this.emailVerified = emailVerified;
            return this;
        }
        public Boolean getEmailVerified() {
            return this.emailVerified;
        }

        public GetUserResponseBodyUser setGroups(java.util.List<GetUserResponseBodyUserGroups> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<GetUserResponseBodyUserGroups> getGroups() {
            return this.groups;
        }

        public GetUserResponseBodyUser setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetUserResponseBodyUser setLockExpireTime(Long lockExpireTime) {
            this.lockExpireTime = lockExpireTime;
            return this;
        }
        public Long getLockExpireTime() {
            return this.lockExpireTime;
        }

        public GetUserResponseBodyUser setOrganizationalUnits(java.util.List<GetUserResponseBodyUserOrganizationalUnits> organizationalUnits) {
            this.organizationalUnits = organizationalUnits;
            return this;
        }
        public java.util.List<GetUserResponseBodyUserOrganizationalUnits> getOrganizationalUnits() {
            return this.organizationalUnits;
        }

        public GetUserResponseBodyUser setPasswordExpireTime(Long passwordExpireTime) {
            this.passwordExpireTime = passwordExpireTime;
            return this;
        }
        public Long getPasswordExpireTime() {
            return this.passwordExpireTime;
        }

        public GetUserResponseBodyUser setPasswordSet(Boolean passwordSet) {
            this.passwordSet = passwordSet;
            return this;
        }
        public Boolean getPasswordSet() {
            return this.passwordSet;
        }

        public GetUserResponseBodyUser setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public GetUserResponseBodyUser setPhoneNumberVerified(Boolean phoneNumberVerified) {
            this.phoneNumberVerified = phoneNumberVerified;
            return this;
        }
        public Boolean getPhoneNumberVerified() {
            return this.phoneNumberVerified;
        }

        public GetUserResponseBodyUser setPhoneRegion(String phoneRegion) {
            this.phoneRegion = phoneRegion;
            return this;
        }
        public String getPhoneRegion() {
            return this.phoneRegion;
        }

        public GetUserResponseBodyUser setPrimaryOrganizationalUnitId(String primaryOrganizationalUnitId) {
            this.primaryOrganizationalUnitId = primaryOrganizationalUnitId;
            return this;
        }
        public String getPrimaryOrganizationalUnitId() {
            return this.primaryOrganizationalUnitId;
        }

        public GetUserResponseBodyUser setRegisterTime(Long registerTime) {
            this.registerTime = registerTime;
            return this;
        }
        public Long getRegisterTime() {
            return this.registerTime;
        }

        public GetUserResponseBodyUser setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetUserResponseBodyUser setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public GetUserResponseBodyUser setUserExternalId(String userExternalId) {
            this.userExternalId = userExternalId;
            return this;
        }
        public String getUserExternalId() {
            return this.userExternalId;
        }

        public GetUserResponseBodyUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetUserResponseBodyUser setUserSourceId(String userSourceId) {
            this.userSourceId = userSourceId;
            return this;
        }
        public String getUserSourceId() {
            return this.userSourceId;
        }

        public GetUserResponseBodyUser setUserSourceType(String userSourceType) {
            this.userSourceType = userSourceType;
            return this;
        }
        public String getUserSourceType() {
            return this.userSourceType;
        }

        public GetUserResponseBodyUser setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
