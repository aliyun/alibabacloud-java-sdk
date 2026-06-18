// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class FilterUsersResponseBody extends TeaModel {
    /**
     * <p>The token for paginated results. If the response is truncated, this parameter is returned. To retrieve the next page of results, include this value in a subsequent request.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of convenience accounts.</p>
     */
    @NameInMap("Users")
    public java.util.List<FilterUsersResponseBodyUsers> users;

    public static FilterUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FilterUsersResponseBody self = new FilterUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public FilterUsersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public FilterUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FilterUsersResponseBody setUsers(java.util.List<FilterUsersResponseBodyUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<FilterUsersResponseBodyUsers> getUsers() {
        return this.users;
    }

    public static class FilterUsersResponseBodyUsersExternalInfo extends TeaModel {
        /**
         * <p>The name of the mapped external account.</p>
         * 
         * <strong>example:</strong>
         * <p>account</p>
         */
        @NameInMap("ExternalName")
        public String externalName;

        /**
         * <p>The ID of the external account, such as a student ID or an employee ID.</p>
         * 
         * <strong>example:</strong>
         * <p>030801</p>
         */
        @NameInMap("JobNumber")
        public String jobNumber;

        public static FilterUsersResponseBodyUsersExternalInfo build(java.util.Map<String, ?> map) throws Exception {
            FilterUsersResponseBodyUsersExternalInfo self = new FilterUsersResponseBodyUsersExternalInfo();
            return TeaModel.build(map, self);
        }

        public FilterUsersResponseBodyUsersExternalInfo setExternalName(String externalName) {
            this.externalName = externalName;
            return this;
        }
        public String getExternalName() {
            return this.externalName;
        }

        public FilterUsersResponseBodyUsersExternalInfo setJobNumber(String jobNumber) {
            this.jobNumber = jobNumber;
            return this;
        }
        public String getJobNumber() {
            return this.jobNumber;
        }

    }

    public static class FilterUsersResponseBodyUsersGroups extends TeaModel {
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        public static FilterUsersResponseBodyUsersGroups build(java.util.Map<String, ?> map) throws Exception {
            FilterUsersResponseBodyUsersGroups self = new FilterUsersResponseBodyUsersGroups();
            return TeaModel.build(map, self);
        }

        public FilterUsersResponseBodyUsersGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public FilterUsersResponseBodyUsersGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class FilterUsersResponseBodyUsersOrgList extends TeaModel {
        /**
         * <p>The organization ID.</p>
         */
        @NameInMap("OrgId")
        public String orgId;

        /**
         * <p>The organization name.</p>
         */
        @NameInMap("OrgName")
        public String orgName;

        /**
         * <p>The organization name path.</p>
         */
        @NameInMap("OrgNamePath")
        public String orgNamePath;

        public static FilterUsersResponseBodyUsersOrgList build(java.util.Map<String, ?> map) throws Exception {
            FilterUsersResponseBodyUsersOrgList self = new FilterUsersResponseBodyUsersOrgList();
            return TeaModel.build(map, self);
        }

        public FilterUsersResponseBodyUsersOrgList setOrgId(String orgId) {
            this.orgId = orgId;
            return this;
        }
        public String getOrgId() {
            return this.orgId;
        }

        public FilterUsersResponseBodyUsersOrgList setOrgName(String orgName) {
            this.orgName = orgName;
            return this;
        }
        public String getOrgName() {
            return this.orgName;
        }

        public FilterUsersResponseBodyUsersOrgList setOrgNamePath(String orgNamePath) {
            this.orgNamePath = orgNamePath;
            return this;
        }
        public String getOrgNamePath() {
            return this.orgNamePath;
        }

    }

    public static class FilterUsersResponseBodyUsersResourcePolicyList extends TeaModel {
        @NameInMap("PolicyId")
        public String policyId;

        @NameInMap("PolicyName")
        public String policyName;

        public static FilterUsersResponseBodyUsersResourcePolicyList build(java.util.Map<String, ?> map) throws Exception {
            FilterUsersResponseBodyUsersResourcePolicyList self = new FilterUsersResponseBodyUsersResourcePolicyList();
            return TeaModel.build(map, self);
        }

        public FilterUsersResponseBodyUsersResourcePolicyList setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public FilterUsersResponseBodyUsersResourcePolicyList setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

    }

    public static class FilterUsersResponseBodyUsersSupportLoginIdps extends TeaModel {
        /**
         * <p>The ID of the identity provider (IdP).</p>
         */
        @NameInMap("IdpId")
        public String idpId;

        /**
         * <p>The name of the identity provider (IdP).</p>
         */
        @NameInMap("IdpName")
        public String idpName;

        public static FilterUsersResponseBodyUsersSupportLoginIdps build(java.util.Map<String, ?> map) throws Exception {
            FilterUsersResponseBodyUsersSupportLoginIdps self = new FilterUsersResponseBodyUsersSupportLoginIdps();
            return TeaModel.build(map, self);
        }

        public FilterUsersResponseBodyUsersSupportLoginIdps setIdpId(String idpId) {
            this.idpId = idpId;
            return this;
        }
        public String getIdpId() {
            return this.idpId;
        }

        public FilterUsersResponseBodyUsersSupportLoginIdps setIdpName(String idpName) {
            this.idpName = idpName;
            return this;
        }
        public String getIdpName() {
            return this.idpName;
        }

    }

    public static class FilterUsersResponseBodyUsersUserSetPropertiesModelsPropertyValues extends TeaModel {
        /**
         * <p>The property value.</p>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("PropertyValue")
        public String propertyValue;

        /**
         * <p>The ID of the property value.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("PropertyValueId")
        public Long propertyValueId;

        public static FilterUsersResponseBodyUsersUserSetPropertiesModelsPropertyValues build(java.util.Map<String, ?> map) throws Exception {
            FilterUsersResponseBodyUsersUserSetPropertiesModelsPropertyValues self = new FilterUsersResponseBodyUsersUserSetPropertiesModelsPropertyValues();
            return TeaModel.build(map, self);
        }

        public FilterUsersResponseBodyUsersUserSetPropertiesModelsPropertyValues setPropertyValue(String propertyValue) {
            this.propertyValue = propertyValue;
            return this;
        }
        public String getPropertyValue() {
            return this.propertyValue;
        }

        public FilterUsersResponseBodyUsersUserSetPropertiesModelsPropertyValues setPropertyValueId(Long propertyValueId) {
            this.propertyValueId = propertyValueId;
            return this;
        }
        public Long getPropertyValueId() {
            return this.propertyValueId;
        }

    }

    public static class FilterUsersResponseBodyUsersUserSetPropertiesModels extends TeaModel {
        /**
         * <p>The ID of the user property.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("PropertyId")
        public Long propertyId;

        /**
         * <p>The name of the user property.</p>
         * 
         * <strong>example:</strong>
         * <p>department</p>
         */
        @NameInMap("PropertyKey")
        public String propertyKey;

        /**
         * <p>The type of the user property.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PropertyType")
        public Integer propertyType;

        /**
         * <p>The property values.</p>
         */
        @NameInMap("PropertyValues")
        public java.util.List<FilterUsersResponseBodyUsersUserSetPropertiesModelsPropertyValues> propertyValues;

        /**
         * <p>The ID of the user associated with the property.</p>
         * 
         * <strong>example:</strong>
         * <p>4205**</p>
         */
        @NameInMap("UserId")
        public Long userId;

        /**
         * <p>The user name associated with the property.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static FilterUsersResponseBodyUsersUserSetPropertiesModels build(java.util.Map<String, ?> map) throws Exception {
            FilterUsersResponseBodyUsersUserSetPropertiesModels self = new FilterUsersResponseBodyUsersUserSetPropertiesModels();
            return TeaModel.build(map, self);
        }

        public FilterUsersResponseBodyUsersUserSetPropertiesModels setPropertyId(Long propertyId) {
            this.propertyId = propertyId;
            return this;
        }
        public Long getPropertyId() {
            return this.propertyId;
        }

        public FilterUsersResponseBodyUsersUserSetPropertiesModels setPropertyKey(String propertyKey) {
            this.propertyKey = propertyKey;
            return this;
        }
        public String getPropertyKey() {
            return this.propertyKey;
        }

        public FilterUsersResponseBodyUsersUserSetPropertiesModels setPropertyType(Integer propertyType) {
            this.propertyType = propertyType;
            return this;
        }
        public Integer getPropertyType() {
            return this.propertyType;
        }

        public FilterUsersResponseBodyUsersUserSetPropertiesModels setPropertyValues(java.util.List<FilterUsersResponseBodyUsersUserSetPropertiesModelsPropertyValues> propertyValues) {
            this.propertyValues = propertyValues;
            return this;
        }
        public java.util.List<FilterUsersResponseBodyUsersUserSetPropertiesModelsPropertyValues> getPropertyValues() {
            return this.propertyValues;
        }

        public FilterUsersResponseBodyUsersUserSetPropertiesModels setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public FilterUsersResponseBodyUsersUserSetPropertiesModels setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class FilterUsersResponseBodyUsers extends TeaModel {
        /**
         * <p>The date the account will be automatically locked.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-03</p>
         */
        @NameInMap("AutoLockTime")
        public String autoLockTime;

        /**
         * <p>The number of cloud desktops assigned to the user.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DesktopCount")
        public Long desktopCount;

        /**
         * <p>The number of desktop groups the user can access. This parameter is returned only when <code>IncludeDesktopGroupCount</code> is set to <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DesktopGroupCount")
        public Long desktopGroupCount;

        /**
         * <p>The email address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>Indicates whether the user has local administrator permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableAdminAccess")
        public Boolean enableAdminAccess;

        /**
         * <p>The user name.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>External user information.</p>
         */
        @NameInMap("ExternalInfo")
        public FilterUsersResponseBodyUsersExternalInfo externalInfo;

        @NameInMap("Groups")
        public java.util.List<FilterUsersResponseBodyUsersGroups> groups;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4205**</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Indicates whether the user is a tenant administrator.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsTenantManager")
        public Boolean isTenantManager;

        /**
         * <p>A list of organizations the user belongs to.</p>
         */
        @NameInMap("OrgList")
        public java.util.List<FilterUsersResponseBodyUsersOrgList> orgList;

        /**
         * <p>The account ownership type.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("OwnerType")
        public String ownerType;

        /**
         * <p>The password validity period in days. By default, passwords do not expire. Set this to a value from 30 to 365 to enforce an expiration policy. When a password expires, the user must change it before logging on again.</p>
         * <blockquote>
         * <p>This feature is in preview and available by invitation only. To use this feature, submit a ticket.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("PasswordExpireDays")
        public Integer passwordExpireDays;

        /**
         * <p>The number of days until the password expires.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PasswordExpireRestDays")
        public Integer passwordExpireRestDays;

        /**
         * <p>The phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>1381111****</p>
         */
        @NameInMap("Phone")
        public String phone;

        /**
         * <p>The user\&quot;s nickname.</p>
         * 
         * <strong>example:</strong>
         * <p>小明</p>
         */
        @NameInMap("RealNickName")
        public String realNickName;

        /**
         * <p>The remark about the user.</p>
         * 
         * <strong>example:</strong>
         * <p>测试专用</p>
         */
        @NameInMap("Remark")
        public String remark;

        @NameInMap("ResourcePolicyList")
        public java.util.List<FilterUsersResponseBodyUsersResourcePolicyList> resourcePolicyList;

        /**
         * <p>The status of the convenience account.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <p>A list of identity providers (IdPs) that the user can use to log on.</p>
         */
        @NameInMap("SupportLoginIdps")
        public java.util.List<FilterUsersResponseBodyUsersSupportLoginIdps> supportLoginIdps;

        /**
         * <p>A list of user properties.</p>
         */
        @NameInMap("UserSetPropertiesModels")
        public java.util.List<FilterUsersResponseBodyUsersUserSetPropertiesModels> userSetPropertiesModels;

        public static FilterUsersResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            FilterUsersResponseBodyUsers self = new FilterUsersResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public FilterUsersResponseBodyUsers setAutoLockTime(String autoLockTime) {
            this.autoLockTime = autoLockTime;
            return this;
        }
        public String getAutoLockTime() {
            return this.autoLockTime;
        }

        public FilterUsersResponseBodyUsers setDesktopCount(Long desktopCount) {
            this.desktopCount = desktopCount;
            return this;
        }
        public Long getDesktopCount() {
            return this.desktopCount;
        }

        public FilterUsersResponseBodyUsers setDesktopGroupCount(Long desktopGroupCount) {
            this.desktopGroupCount = desktopGroupCount;
            return this;
        }
        public Long getDesktopGroupCount() {
            return this.desktopGroupCount;
        }

        public FilterUsersResponseBodyUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public FilterUsersResponseBodyUsers setEnableAdminAccess(Boolean enableAdminAccess) {
            this.enableAdminAccess = enableAdminAccess;
            return this;
        }
        public Boolean getEnableAdminAccess() {
            return this.enableAdminAccess;
        }

        public FilterUsersResponseBodyUsers setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public FilterUsersResponseBodyUsers setExternalInfo(FilterUsersResponseBodyUsersExternalInfo externalInfo) {
            this.externalInfo = externalInfo;
            return this;
        }
        public FilterUsersResponseBodyUsersExternalInfo getExternalInfo() {
            return this.externalInfo;
        }

        public FilterUsersResponseBodyUsers setGroups(java.util.List<FilterUsersResponseBodyUsersGroups> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<FilterUsersResponseBodyUsersGroups> getGroups() {
            return this.groups;
        }

        public FilterUsersResponseBodyUsers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public FilterUsersResponseBodyUsers setIsTenantManager(Boolean isTenantManager) {
            this.isTenantManager = isTenantManager;
            return this;
        }
        public Boolean getIsTenantManager() {
            return this.isTenantManager;
        }

        public FilterUsersResponseBodyUsers setOrgList(java.util.List<FilterUsersResponseBodyUsersOrgList> orgList) {
            this.orgList = orgList;
            return this;
        }
        public java.util.List<FilterUsersResponseBodyUsersOrgList> getOrgList() {
            return this.orgList;
        }

        public FilterUsersResponseBodyUsers setOwnerType(String ownerType) {
            this.ownerType = ownerType;
            return this;
        }
        public String getOwnerType() {
            return this.ownerType;
        }

        public FilterUsersResponseBodyUsers setPasswordExpireDays(Integer passwordExpireDays) {
            this.passwordExpireDays = passwordExpireDays;
            return this;
        }
        public Integer getPasswordExpireDays() {
            return this.passwordExpireDays;
        }

        public FilterUsersResponseBodyUsers setPasswordExpireRestDays(Integer passwordExpireRestDays) {
            this.passwordExpireRestDays = passwordExpireRestDays;
            return this;
        }
        public Integer getPasswordExpireRestDays() {
            return this.passwordExpireRestDays;
        }

        public FilterUsersResponseBodyUsers setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public FilterUsersResponseBodyUsers setRealNickName(String realNickName) {
            this.realNickName = realNickName;
            return this;
        }
        public String getRealNickName() {
            return this.realNickName;
        }

        public FilterUsersResponseBodyUsers setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public FilterUsersResponseBodyUsers setResourcePolicyList(java.util.List<FilterUsersResponseBodyUsersResourcePolicyList> resourcePolicyList) {
            this.resourcePolicyList = resourcePolicyList;
            return this;
        }
        public java.util.List<FilterUsersResponseBodyUsersResourcePolicyList> getResourcePolicyList() {
            return this.resourcePolicyList;
        }

        public FilterUsersResponseBodyUsers setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public FilterUsersResponseBodyUsers setSupportLoginIdps(java.util.List<FilterUsersResponseBodyUsersSupportLoginIdps> supportLoginIdps) {
            this.supportLoginIdps = supportLoginIdps;
            return this;
        }
        public java.util.List<FilterUsersResponseBodyUsersSupportLoginIdps> getSupportLoginIdps() {
            return this.supportLoginIdps;
        }

        public FilterUsersResponseBodyUsers setUserSetPropertiesModels(java.util.List<FilterUsersResponseBodyUsersUserSetPropertiesModels> userSetPropertiesModels) {
            this.userSetPropertiesModels = userSetPropertiesModels;
            return this;
        }
        public java.util.List<FilterUsersResponseBodyUsersUserSetPropertiesModels> getUserSetPropertiesModels() {
            return this.userSetPropertiesModels;
        }

    }

}
