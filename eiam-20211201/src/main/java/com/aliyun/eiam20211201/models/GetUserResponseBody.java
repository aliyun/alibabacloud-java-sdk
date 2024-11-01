// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetUserResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The data object of the account.</p>
     */
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
         * <p>The identifier of the custom field.</p>
         * 
         * <strong>example:</strong>
         * <p>age</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <p>The value of the custom field.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>The description of the organizational unit.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a test.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the organizational unit.</p>
         * 
         * <strong>example:</strong>
         * <p>group_d6sbsuumeta4h66ec3il7yxxxx</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the organizational unit.</p>
         * 
         * <strong>example:</strong>
         * <p>group_test_name</p>
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
         * <p>The ID of the organizational unit.</p>
         * 
         * <strong>example:</strong>
         * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
         */
        @NameInMap("OrganizationalUnitId")
        public String organizationalUnitId;

        /**
         * <p>The name of the organizational unit.</p>
         * 
         * <strong>example:</strong>
         * <p>test_ou_name</p>
         */
        @NameInMap("OrganizationalUnitName")
        public String organizationalUnitName;

        /**
         * <p>Indicates whether the organization is the primary organization.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>The time when the account expires. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1652085686179</p>
         */
        @NameInMap("AccountExpireTime")
        public Long accountExpireTime;

        /**
         * <p>The time when the account was created. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1652085686179</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The list of custom fields that describe the account.</p>
         */
        @NameInMap("CustomFields")
        public java.util.List<GetUserResponseBodyUserCustomFields> customFields;

        /**
         * <p>The description of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>Test account</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The display name of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>display_name001</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The email address of the user who owns the account.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:user@example.com">user@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>Indicates whether the email address has been verified. A value of true indicates that the email address has been verified by the user or has been set to the verified status by the administrator. A value of false indicates that the email address has not been verified.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EmailVerified")
        public Boolean emailVerified;

        /**
         * <p>The organizational units to which the account belongs.</p>
         */
        @NameInMap("Groups")
        public java.util.List<GetUserResponseBodyUserGroups> groups;

        /**
         * <p>The ID of the instance</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The time when the account lock expires. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1652085686179</p>
         */
        @NameInMap("LockExpireTime")
        public Long lockExpireTime;

        /**
         * <p>The organizational units to which the account belongs.</p>
         */
        @NameInMap("OrganizationalUnits")
        public java.util.List<GetUserResponseBodyUserOrganizationalUnits> organizationalUnits;

        /**
         * <p>The time when the password of the account expires. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * <ul>
         * <li>If the value -1 is returned, the password does not expire.</li>
         * <li>If no value is returned, the password does not expire.</li>
         * <li>If a UNIX timestamp is returned, the password expires at the indicated point of time.</li>
         * </ul>
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
         * <p>The mobile number of the user who owns the account.</p>
         * 
         * <strong>example:</strong>
         * <p>156xxxxxxx</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>Indicates whether the mobile number has been verified. A value of true indicates that the mobile number has been verified by the user or has been set to the verified status by the administrator. A value of false indicates that the mobile number has not been verified.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PhoneNumberVerified")
        public Boolean phoneNumberVerified;

        /**
         * <p>The country code of the mobile number. For example, the country code of China is 86 without 00 or +.</p>
         * 
         * <strong>example:</strong>
         * <p>86</p>
         */
        @NameInMap("PhoneRegion")
        public String phoneRegion;

        /**
         * <p>Preferred language</p>
         * 
         * <strong>example:</strong>
         * <p>en-US</p>
         */
        @NameInMap("PreferredLanguage")
        public String preferredLanguage;

        /**
         * <p>The ID of the primary organizational unit to which the account belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
         */
        @NameInMap("PrimaryOrganizationalUnitId")
        public String primaryOrganizationalUnitId;

        /**
         * <p>The time when the account was registered. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1652085686179</p>
         */
        @NameInMap("RegisterTime")
        public Long registerTime;

        /**
         * <p>The status of the account. Valid values:</p>
         * <ul>
         * <li>enabled: The account is enabled.</li>
         * <li>disabled: The account is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the account was last updated. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1652085686179</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The external ID of the account. The external ID can be used by external data to map the data of the account in IDaaS EIAM. By default, the external ID is the account ID.</p>
         * <p>For accounts with the same source type and source ID, each account has a unique external ID.</p>
         * 
         * <strong>example:</strong>
         * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
         */
        @NameInMap("UserExternalId")
        public String userExternalId;

        /**
         * <p>The ID of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The source ID of the account.</p>
         * <p>If the account was created in IDaaS, its source ID is the ID of the IDaaS instance. If the account was imported, its source ID is the enterprise ID in the source. For example, if the account was imported from DingTalk, its source ID is the corpId value of the enterprise in DingTalk.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("UserSourceId")
        public String userSourceId;

        /**
         * <p>The source type of the account. Valid values:</p>
         * <ul>
         * <li>build_in: The account was created in IDaaS.</li>
         * <li>ding_talk: The account was imported from DingTalk.</li>
         * <li>ad: The account was imported from Microsoft Active Directory (AD).</li>
         * <li>ldap: The account was imported from a Lightweight Directory Access Protocol (LDAP) service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>build_in</p>
         */
        @NameInMap("UserSourceType")
        public String userSourceType;

        /**
         * <p>The username of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>name001</p>
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

        public GetUserResponseBodyUser setPreferredLanguage(String preferredLanguage) {
            this.preferredLanguage = preferredLanguage;
            return this;
        }
        public String getPreferredLanguage() {
            return this.preferredLanguage;
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
