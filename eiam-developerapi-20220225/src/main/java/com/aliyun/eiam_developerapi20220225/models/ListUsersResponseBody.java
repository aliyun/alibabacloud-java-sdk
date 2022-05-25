// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class ListUsersResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListUsersResponseBodyData> data;

    // 记录总数
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersResponseBody self = new ListUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersResponseBody setData(java.util.List<ListUsersResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListUsersResponseBodyData> getData() {
        return this.data;
    }

    public ListUsersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListUsersResponseBodyData extends TeaModel {
        // 账户过期时间, 毫秒时间
        @NameInMap("accountExpireTime")
        public Long accountExpireTime;

        // 创建时间, 毫秒时间
        @NameInMap("createTime")
        public Long createTime;

        // 账号描述
        @NameInMap("description")
        public String description;

        // 显示名
        @NameInMap("displayName")
        public String displayName;

        // 邮箱
        @NameInMap("email")
        public String email;

        // 邮箱是否验证
        @NameInMap("emailVerified")
        public Boolean emailVerified;

        // 实例ID
        @NameInMap("instanceId")
        public String instanceId;

        // 锁定过期时间, 毫秒时间
        @NameInMap("lockExpireTime")
        public Long lockExpireTime;

        // 密码是否已设置
        @NameInMap("passwordSet")
        public Boolean passwordSet;

        // 手机号
        @NameInMap("phoneNumber")
        public String phoneNumber;

        // 手机号是否验证
        @NameInMap("phoneNumberVerified")
        public Boolean phoneNumberVerified;

        // 手机地区编号,示例：中国大陆手区号为86，不带 00 或 +
        @NameInMap("phoneRegion")
        public String phoneRegion;

        @NameInMap("registerTime")
        public Long registerTime;

        // 账户状态, enabled:启用,disabled:禁用
        @NameInMap("status")
        public String status;

        // 最近一次更新时间, 毫秒时间
        @NameInMap("updateTime")
        public Long updateTime;

        // 外部ID
        @NameInMap("userExternalId")
        public String userExternalId;

        // 账户ID
        @NameInMap("userId")
        public String userId;

        // 来源ID
        @NameInMap("userSourceId")
        public String userSourceId;

        // 来源类型，build_in[自建],ding_talk[钉钉导入],ad[AD导入],ldap[LDAP导入]
        @NameInMap("userSourceType")
        public String userSourceType;

        // 账户名
        @NameInMap("username")
        public String username;

        public static ListUsersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyData self = new ListUsersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyData setAccountExpireTime(Long accountExpireTime) {
            this.accountExpireTime = accountExpireTime;
            return this;
        }
        public Long getAccountExpireTime() {
            return this.accountExpireTime;
        }

        public ListUsersResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListUsersResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUsersResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListUsersResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListUsersResponseBodyData setEmailVerified(Boolean emailVerified) {
            this.emailVerified = emailVerified;
            return this;
        }
        public Boolean getEmailVerified() {
            return this.emailVerified;
        }

        public ListUsersResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListUsersResponseBodyData setLockExpireTime(Long lockExpireTime) {
            this.lockExpireTime = lockExpireTime;
            return this;
        }
        public Long getLockExpireTime() {
            return this.lockExpireTime;
        }

        public ListUsersResponseBodyData setPasswordSet(Boolean passwordSet) {
            this.passwordSet = passwordSet;
            return this;
        }
        public Boolean getPasswordSet() {
            return this.passwordSet;
        }

        public ListUsersResponseBodyData setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public ListUsersResponseBodyData setPhoneNumberVerified(Boolean phoneNumberVerified) {
            this.phoneNumberVerified = phoneNumberVerified;
            return this;
        }
        public Boolean getPhoneNumberVerified() {
            return this.phoneNumberVerified;
        }

        public ListUsersResponseBodyData setPhoneRegion(String phoneRegion) {
            this.phoneRegion = phoneRegion;
            return this;
        }
        public String getPhoneRegion() {
            return this.phoneRegion;
        }

        public ListUsersResponseBodyData setRegisterTime(Long registerTime) {
            this.registerTime = registerTime;
            return this;
        }
        public Long getRegisterTime() {
            return this.registerTime;
        }

        public ListUsersResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListUsersResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListUsersResponseBodyData setUserExternalId(String userExternalId) {
            this.userExternalId = userExternalId;
            return this;
        }
        public String getUserExternalId() {
            return this.userExternalId;
        }

        public ListUsersResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListUsersResponseBodyData setUserSourceId(String userSourceId) {
            this.userSourceId = userSourceId;
            return this;
        }
        public String getUserSourceId() {
            return this.userSourceId;
        }

        public ListUsersResponseBodyData setUserSourceType(String userSourceType) {
            this.userSourceType = userSourceType;
            return this;
        }
        public String getUserSourceType() {
            return this.userSourceType;
        }

        public ListUsersResponseBodyData setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
