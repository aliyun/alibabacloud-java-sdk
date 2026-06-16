// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListUsersResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The list of users.</p>
     */
    @NameInMap("Users")
    public java.util.List<ListUsersResponseBodyUsers> users;

    public static ListUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersResponseBody self = new ListUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUsersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
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
         * <p>The account expiration time. This is a Unix timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1652085686179</p>
         */
        @NameInMap("AccountExpireTime")
        public Long accountExpireTime;

        /**
         * <p>The creation time. This is a Unix timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1652085686179</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The user description.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>display_name001</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The email address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:user@example.com">user@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>Indicates whether the email address is verified. <code>true</code> means the user has verified the email address or an administrator has marked it as verified. <code>false</code> means the email address is not verified.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EmailVerified")
        public Boolean emailVerified;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The account lock expiration time. This is a Unix timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1652085686179</p>
         */
        @NameInMap("LockExpireTime")
        public Long lockExpireTime;

        /**
         * <p>The password expiration time. This is a Unix timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1652085686179</p>
         */
        @NameInMap("PasswordExpireTime")
        public Long passwordExpireTime;

        /**
         * <p>Indicates whether a password is set.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("PasswordSet")
        public Boolean passwordSet;

        /**
         * <p>The phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>156xxxxxxx</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>Indicates whether the phone number is verified. <code>true</code> means the user has verified the phone number or an administrator has marked it as verified. <code>false</code> means the phone number is not verified.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PhoneNumberVerified")
        public Boolean phoneNumberVerified;

        /**
         * <p>The country calling code. For example, specify <code>86</code> for Chinese mainland. Do not include <code>00</code> or a plus sign (+).</p>
         * 
         * <strong>example:</strong>
         * <p>86</p>
         */
        @NameInMap("PhoneRegion")
        public String phoneRegion;

        /**
         * <p>The registration time. This is a Unix timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1652085686179</p>
         */
        @NameInMap("RegisterTime")
        public Long registerTime;

        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li><p><code>enabled</code>: The user is enabled.</p>
         * </li>
         * <li><p><code>disabled</code>: The user is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The last update time. This is a Unix timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1652085686179</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The external user ID. This ID maps data from an external system to a user in IDaaS. It defaults to the user ID.</p>
         * <p>Note: The external user ID must be unique for the same source type and source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
         */
        @NameInMap("UserExternalId")
        public String userExternalId;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The user source ID.</p>
         * <p>If the user is built-in, this is the instance ID. For users from other sources, this is the enterprise ID from the source, such as the <code>corpId</code> for a DingTalk organization.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("UserSourceId")
        public String userSourceId;

        /**
         * <p>The user source type. Valid values:</p>
         * <ul>
         * <li><p><code>build_in</code>: The user is a built-in user.</p>
         * </li>
         * <li><p><code>ding_talk</code>: The user is imported from DingTalk.</p>
         * </li>
         * <li><p><code>ad</code>: The user is imported from AD.</p>
         * </li>
         * <li><p><code>ldap</code>: The user is imported from LDAP.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>build_in</p>
         */
        @NameInMap("UserSourceType")
        public String userSourceType;

        /**
         * <p>The user name.</p>
         * 
         * <strong>example:</strong>
         * <p>name001</p>
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
