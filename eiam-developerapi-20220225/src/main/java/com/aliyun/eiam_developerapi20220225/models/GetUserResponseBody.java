// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetUserResponseBody extends TeaModel {
    /**
     * <p>The time when the account expires. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1652085686179</p>
     */
    @NameInMap("accountExpireTime")
    public Long accountExpireTime;

    /**
     * <p>The time when the account was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1652085686179</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <p>The extended fields of the account.</p>
     */
    @NameInMap("customFields")
    public java.util.List<GetUserResponseBodyCustomFields> customFields;

    /**
     * <p>The description of the account.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
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
     * <p>The email address of the user.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:example@example.com">example@example.com</a></p>
     */
    @NameInMap("email")
    public String email;

    /**
     * <p>Indicates whether the email address has been verified. A value of true indicates that the email address has been verified by the user or has been set to the verified status by the administrator. A value of false indicates that the email address has not been verified.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("emailVerified")
    public Boolean emailVerified;

    /**
     * <p>账户所属组列表。</p>
     */
    @NameInMap("groups")
    public java.util.List<GetUserResponseBodyGroups> groups;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The time when the account lock expires. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1652085686179</p>
     */
    @NameInMap("lockExpireTime")
    public Long lockExpireTime;

    /**
     * <p>The organizational units to which the account belongs.</p>
     */
    @NameInMap("organizationalUnits")
    public java.util.List<GetUserResponseBodyOrganizationalUnits> organizationalUnits;

    /**
     * <p>Indicates whether the password is set.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("passwordSet")
    public Boolean passwordSet;

    /**
     * <p>The mobile number of the user who owns the account.</p>
     * 
     * <strong>example:</strong>
     * <p>156xxxxxxx</p>
     */
    @NameInMap("phoneNumber")
    public String phoneNumber;

    /**
     * <p>Indicates whether the mobile number has been verified. A value of true indicates that the mobile number has been verified by the user or has been set to the verified status by the administrator. A value of false indicates that the mobile number has not been verified.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("phoneNumberVerified")
    public Boolean phoneNumberVerified;

    /**
     * <p>The country code of the mobile number. For example, the country code of China is 86 without 00 or +.</p>
     * 
     * <strong>example:</strong>
     * <p>86</p>
     */
    @NameInMap("phoneRegion")
    public String phoneRegion;

    /**
     * <p>The ID of the primary organizational unit of the account.</p>
     * 
     * <strong>example:</strong>
     * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
     */
    @NameInMap("primaryOrganizationalUnitId")
    public String primaryOrganizationalUnitId;

    /**
     * <p>The time when the account was registered. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1652085686179</p>
     */
    @NameInMap("registerTime")
    public Long registerTime;

    /**
     * <p>The status of the account. Valid values: enabled disabled</p>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The time when the account was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1652085686179</p>
     */
    @NameInMap("updateTime")
    public Long updateTime;

    /**
     * <p>The external ID of the account. The external ID can be used to map external data to the data of the account in EIAM of Identity as a Service (IDaaS). By default, the external ID is the account ID.</p>
     * <p>Note: For accounts with the same source type and source ID, each account has a unique external ID.</p>
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
     * <p>If the account was created in IDaaS, its source ID is the ID of the IDaaS instance. If the account was imported, its source ID is the enterprise ID in the source. For example, if the account was imported from DingTalk, its source ID is the corpId value of the enterprise in DingTalk.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("userSourceId")
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
    @NameInMap("userSourceType")
    public String userSourceType;

    /**
     * <p>The username of the account.</p>
     * 
     * <strong>example:</strong>
     * <p>name001</p>
     */
    @NameInMap("username")
    public String username;

    public static GetUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserResponseBody self = new GetUserResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserResponseBody setAccountExpireTime(Long accountExpireTime) {
        this.accountExpireTime = accountExpireTime;
        return this;
    }
    public Long getAccountExpireTime() {
        return this.accountExpireTime;
    }

    public GetUserResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public GetUserResponseBody setCustomFields(java.util.List<GetUserResponseBodyCustomFields> customFields) {
        this.customFields = customFields;
        return this;
    }
    public java.util.List<GetUserResponseBodyCustomFields> getCustomFields() {
        return this.customFields;
    }

    public GetUserResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetUserResponseBody setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public GetUserResponseBody setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public GetUserResponseBody setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
        return this;
    }
    public Boolean getEmailVerified() {
        return this.emailVerified;
    }

    public GetUserResponseBody setGroups(java.util.List<GetUserResponseBodyGroups> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<GetUserResponseBodyGroups> getGroups() {
        return this.groups;
    }

    public GetUserResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetUserResponseBody setLockExpireTime(Long lockExpireTime) {
        this.lockExpireTime = lockExpireTime;
        return this;
    }
    public Long getLockExpireTime() {
        return this.lockExpireTime;
    }

    public GetUserResponseBody setOrganizationalUnits(java.util.List<GetUserResponseBodyOrganizationalUnits> organizationalUnits) {
        this.organizationalUnits = organizationalUnits;
        return this;
    }
    public java.util.List<GetUserResponseBodyOrganizationalUnits> getOrganizationalUnits() {
        return this.organizationalUnits;
    }

    public GetUserResponseBody setPasswordSet(Boolean passwordSet) {
        this.passwordSet = passwordSet;
        return this;
    }
    public Boolean getPasswordSet() {
        return this.passwordSet;
    }

    public GetUserResponseBody setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public GetUserResponseBody setPhoneNumberVerified(Boolean phoneNumberVerified) {
        this.phoneNumberVerified = phoneNumberVerified;
        return this;
    }
    public Boolean getPhoneNumberVerified() {
        return this.phoneNumberVerified;
    }

    public GetUserResponseBody setPhoneRegion(String phoneRegion) {
        this.phoneRegion = phoneRegion;
        return this;
    }
    public String getPhoneRegion() {
        return this.phoneRegion;
    }

    public GetUserResponseBody setPrimaryOrganizationalUnitId(String primaryOrganizationalUnitId) {
        this.primaryOrganizationalUnitId = primaryOrganizationalUnitId;
        return this;
    }
    public String getPrimaryOrganizationalUnitId() {
        return this.primaryOrganizationalUnitId;
    }

    public GetUserResponseBody setRegisterTime(Long registerTime) {
        this.registerTime = registerTime;
        return this;
    }
    public Long getRegisterTime() {
        return this.registerTime;
    }

    public GetUserResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetUserResponseBody setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public GetUserResponseBody setUserExternalId(String userExternalId) {
        this.userExternalId = userExternalId;
        return this;
    }
    public String getUserExternalId() {
        return this.userExternalId;
    }

    public GetUserResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetUserResponseBody setUserSourceId(String userSourceId) {
        this.userSourceId = userSourceId;
        return this;
    }
    public String getUserSourceId() {
        return this.userSourceId;
    }

    public GetUserResponseBody setUserSourceType(String userSourceType) {
        this.userSourceType = userSourceType;
        return this;
    }
    public String getUserSourceType() {
        return this.userSourceType;
    }

    public GetUserResponseBody setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public static class GetUserResponseBodyCustomFields extends TeaModel {
        /**
         * <p>The name of the extended field.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("fieldName")
        public String fieldName;

        /**
         * <p>The value of the extended field. Field values are returned as strings regardless of the data types of the fields. For example, true or false is returned for a Boolean field.</p>
         * 
         * <strong>example:</strong>
         * <p>字段数据值</p>
         */
        @NameInMap("fieldValue")
        public String fieldValue;

        public static GetUserResponseBodyCustomFields build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyCustomFields self = new GetUserResponseBodyCustomFields();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyCustomFields setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public GetUserResponseBodyCustomFields setFieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            return this;
        }
        public String getFieldValue() {
            return this.fieldValue;
        }

    }

    public static class GetUserResponseBodyGroups extends TeaModel {
        /**
         * <p>组描述。</p>
         * 
         * <strong>example:</strong>
         * <p>description_demo</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>组ID。</p>
         * 
         * <strong>example:</strong>
         * <p>group_ufdsasn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("groupId")
        public String groupId;

        /**
         * <p>组名称。</p>
         * 
         * <strong>example:</strong>
         * <p>name_test</p>
         */
        @NameInMap("groupName")
        public String groupName;

        public static GetUserResponseBodyGroups build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyGroups self = new GetUserResponseBodyGroups();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetUserResponseBodyGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetUserResponseBodyGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class GetUserResponseBodyOrganizationalUnits extends TeaModel {
        /**
         * <p>The ID of the organizational unit.</p>
         * 
         * <strong>example:</strong>
         * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
         */
        @NameInMap("organizationalUnitId")
        public String organizationalUnitId;

        /**
         * <p>The name of the organizational unit.</p>
         * 
         * <strong>example:</strong>
         * <p>name001</p>
         */
        @NameInMap("organizationalUnitName")
        public String organizationalUnitName;

        /**
         * <p>Indicates whether the organizational unit is the primary organizational unit.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("primary")
        public Boolean primary;

        public static GetUserResponseBodyOrganizationalUnits build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyOrganizationalUnits self = new GetUserResponseBodyOrganizationalUnits();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyOrganizationalUnits setOrganizationalUnitId(String organizationalUnitId) {
            this.organizationalUnitId = organizationalUnitId;
            return this;
        }
        public String getOrganizationalUnitId() {
            return this.organizationalUnitId;
        }

        public GetUserResponseBodyOrganizationalUnits setOrganizationalUnitName(String organizationalUnitName) {
            this.organizationalUnitName = organizationalUnitName;
            return this;
        }
        public String getOrganizationalUnitName() {
            return this.organizationalUnitName;
        }

        public GetUserResponseBodyOrganizationalUnits setPrimary(Boolean primary) {
            this.primary = primary;
            return this;
        }
        public Boolean getPrimary() {
            return this.primary;
        }

    }

}
