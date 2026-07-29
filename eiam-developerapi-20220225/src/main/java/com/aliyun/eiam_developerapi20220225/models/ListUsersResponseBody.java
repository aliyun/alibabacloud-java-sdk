// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class ListUsersResponseBody extends TeaModel {
    /**
     * <p>The list of returned data objects.</p>
     */
    @NameInMap("data")
    public java.util.List<ListUsersResponseBodyData> data;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
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
        /**
         * <p>The time when the account expires. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1652085686179</p>
         */
        @NameInMap("accountExpireTime")
        public Long accountExpireTime;

        /**
         * <p>The time when the account was created. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1652085686179</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>The description of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>测试账户</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The display name of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>display_name001</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>The email address of the account.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:example@example.com">example@example.com</a></p>
         */
        @NameInMap("email")
        public String email;

        /**
         * <p>Indicates whether the email address is verified. A value of true indicates that the email address is verified by the user or set to verified by the administrator. A value of false indicates that the email address is not verified.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("emailVerified")
        public Boolean emailVerified;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The time when the account lock expires. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1652085686179</p>
         */
        @NameInMap("lockExpireTime")
        public Long lockExpireTime;

        /**
         * <p>Indicates whether a password is set.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("passwordSet")
        public Boolean passwordSet;

        /**
         * <p>The mobile phone number of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>156xxxxxxx</p>
         */
        @NameInMap("phoneNumber")
        public String phoneNumber;

        /**
         * <p>Indicates whether the mobile phone number is verified. A value of true indicates that the mobile phone number is verified by the user or set to verified by the administrator. A value of false indicates that the mobile phone number is not verified.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("phoneNumberVerified")
        public Boolean phoneNumberVerified;

        /**
         * <p>The area code for the mobile phone number. For example, the area code for a mobile phone number in the Chinese mainland is 86. Do not add 00 or a plus sign (+).</p>
         * 
         * <strong>example:</strong>
         * <p>86</p>
         */
        @NameInMap("phoneRegion")
        public String phoneRegion;

        /**
         * <p>The time when the account was registered. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1652085686179</p>
         */
        @NameInMap("registerTime")
        public Long registerTime;

        /**
         * <p>The status of the account. Valid values: enabled: The account is enabled. disabled: The account is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The time when the account was last updated. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1652085686179</p>
         */
        @NameInMap("updateTime")
        public Long updateTime;

        /**
         * <p>The external ID of the account. This ID is used to map external data to the IDaaS account. By default, this parameter is the same as the IDaaS account ID.</p>
         * <p>Note: The external ID must be unique for the same source type and source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
         */
        @NameInMap("userExternalId")
        public String userExternalId;

        /**
         * <p>The account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
         */
        @NameInMap("userId")
        public String userId;

        /**
         * <p>The source ID of the account.</p>
         * <p>For accounts created in IDaaS, the default value is the instance ID. For other types of accounts, the value is the enterprise ID from the source. For example, for an account from DingTalk, the value is the corpId of the DingTalk enterprise.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("userSourceId")
        public String userSourceId;

        /**
         * <p>The source type of the account. Valid values:</p>
         * <ul>
         * <li><p>build_in: The account is created in IDaaS.</p>
         * </li>
         * <li><p>ding_talk: The account is imported from DingTalk.</p>
         * </li>
         * <li><p>ad: The account is imported from Active Directory (AD).</p>
         * </li>
         * <li><p>ldap: The account is imported from LDAP.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>build_in</p>
         */
        @NameInMap("userSourceType")
        public String userSourceType;

        /**
         * <p>The account name.</p>
         * 
         * <strong>example:</strong>
         * <p>name001</p>
         */
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
