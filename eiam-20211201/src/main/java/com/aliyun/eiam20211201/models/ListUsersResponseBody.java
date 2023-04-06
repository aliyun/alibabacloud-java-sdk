// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListUsersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("Users")
    public java.util.List<ListUsersResponseBodyUsers> users;

    public static ListUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersResponseBody self = new ListUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListUsersResponseBody setUsers(java.util.List<ListUsersResponseBodyUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<ListUsersResponseBodyUsers> getUsers() {
        return this.users;
    }

    public static class ListUsersResponseBodyUsers extends TeaModel {
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

        public static ListUsersResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyUsers self = new ListUsersResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyUsers setAccountExpireTime(Long accountExpireTime) {
            this.accountExpireTime = accountExpireTime;
            return this;
        }
        public Long getAccountExpireTime() {
            return this.accountExpireTime;
        }

        public ListUsersResponseBodyUsers setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListUsersResponseBodyUsers setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUsersResponseBodyUsers setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListUsersResponseBodyUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListUsersResponseBodyUsers setEmailVerified(Boolean emailVerified) {
            this.emailVerified = emailVerified;
            return this;
        }
        public Boolean getEmailVerified() {
            return this.emailVerified;
        }

        public ListUsersResponseBodyUsers setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListUsersResponseBodyUsers setLockExpireTime(Long lockExpireTime) {
            this.lockExpireTime = lockExpireTime;
            return this;
        }
        public Long getLockExpireTime() {
            return this.lockExpireTime;
        }

        public ListUsersResponseBodyUsers setPasswordExpireTime(Long passwordExpireTime) {
            this.passwordExpireTime = passwordExpireTime;
            return this;
        }
        public Long getPasswordExpireTime() {
            return this.passwordExpireTime;
        }

        public ListUsersResponseBodyUsers setPasswordSet(Boolean passwordSet) {
            this.passwordSet = passwordSet;
            return this;
        }
        public Boolean getPasswordSet() {
            return this.passwordSet;
        }

        public ListUsersResponseBodyUsers setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public ListUsersResponseBodyUsers setPhoneNumberVerified(Boolean phoneNumberVerified) {
            this.phoneNumberVerified = phoneNumberVerified;
            return this;
        }
        public Boolean getPhoneNumberVerified() {
            return this.phoneNumberVerified;
        }

        public ListUsersResponseBodyUsers setPhoneRegion(String phoneRegion) {
            this.phoneRegion = phoneRegion;
            return this;
        }
        public String getPhoneRegion() {
            return this.phoneRegion;
        }

        public ListUsersResponseBodyUsers setRegisterTime(Long registerTime) {
            this.registerTime = registerTime;
            return this;
        }
        public Long getRegisterTime() {
            return this.registerTime;
        }

        public ListUsersResponseBodyUsers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListUsersResponseBodyUsers setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListUsersResponseBodyUsers setUserExternalId(String userExternalId) {
            this.userExternalId = userExternalId;
            return this;
        }
        public String getUserExternalId() {
            return this.userExternalId;
        }

        public ListUsersResponseBodyUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListUsersResponseBodyUsers setUserSourceId(String userSourceId) {
            this.userSourceId = userSourceId;
            return this;
        }
        public String getUserSourceId() {
            return this.userSourceId;
        }

        public ListUsersResponseBodyUsers setUserSourceType(String userSourceType) {
            this.userSourceType = userSourceType;
            return this;
        }
        public String getUserSourceType() {
            return this.userSourceType;
        }

        public ListUsersResponseBodyUsers setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
