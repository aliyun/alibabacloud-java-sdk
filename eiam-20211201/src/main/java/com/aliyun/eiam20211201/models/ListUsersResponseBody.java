// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListUsersResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries in the list.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The list of data objects of accounts.</p>
     */
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
         * <p>The time when the account expires. This value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("AccountExpireTime")
        public Long accountExpireTime;

        /**
         * <p>The time when the account was created. This value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the account.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The display name of the account.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The email address of the user who owns the account.</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>Indicates whether the email address has been verified. A value of true indicates that the email address has been verified by the user or has been set to the verified status by the administrator. A value of false indicates that the email address has not been verified.</p>
         */
        @NameInMap("EmailVerified")
        public Boolean emailVerified;

        /**
         * <p>The ID of the instance</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The time when the account lock expires. This value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("LockExpireTime")
        public Long lockExpireTime;

        /**
         * <p>Time When Password Expires</p>
         */
        @NameInMap("PasswordExpireTime")
        public Long passwordExpireTime;

        /**
         * <p>Indicates whether a password is set.</p>
         */
        @NameInMap("PasswordSet")
        public Boolean passwordSet;

        /**
         * <p>The mobile number of the user who owns the account.</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>Indicates whether the mobile number has been verified. A value of true indicates that the mobile number has been verified by the user or has been set to the verified status by the administrator. A value of false indicates that the mobile number has not been verified.</p>
         */
        @NameInMap("PhoneNumberVerified")
        public Boolean phoneNumberVerified;

        /**
         * <p>The country code of the mobile number. For example, the country code of China is 86 without 00 or +.</p>
         */
        @NameInMap("PhoneRegion")
        public String phoneRegion;

        /**
         * <p>The time when the account was registered. This value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("RegisterTime")
        public Long registerTime;

        /**
         * <p>The status of the account. Valid values:</p>
         * <br>
         * <p>*   enabled: The account is enabled.</p>
         * <p>*   disabled: The account is disabled.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the account was last updated. The value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The external ID of the account. The external ID can be used by external data to map the data of the account in IDaaS EIAM. By default, the external ID is the account ID.</p>
         * <br>
         * <p>For accounts with the same source type and source ID, each account has a unique external ID.</p>
         */
        @NameInMap("UserExternalId")
        public String userExternalId;

        /**
         * <p>The ID of the account.</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The source ID of the account.</p>
         * <br>
         * <p>If the account was created in IDaaS, its source ID is the ID of the IDaaS instance. If the account was imported, its source ID is the enterprise ID in the source. For example, if the account was imported from DingTalk, its source ID is the corpId value of the enterprise in DingTalk.</p>
         */
        @NameInMap("UserSourceId")
        public String userSourceId;

        /**
         * <p>The source type of the account. Valid values:</p>
         * <br>
         * <p>*   build_in: The account was created in IDaaS.</p>
         * <p>*   ding_talk: The account was imported from DingTalk.</p>
         * <p>*   ad: The account was imported from Microsoft Active Directory (AD).</p>
         * <p>*   ldap: The account was imported from a Lightweight Directory Access Protocol (LDAP) service.</p>
         */
        @NameInMap("UserSourceType")
        public String userSourceType;

        /**
         * <p>The username of the account.</p>
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
