// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class FilterUsersResponseBody extends TeaModel {
    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. If not all results are returned in a query, a value is returned for the NextToken parameter. In this case, you can use the returned NextToken value to start the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DBD276B5-00FF-5E04-8EF7-5CBA09BF112A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the convenience user.</p>
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
         * <p>The account that is associated with the convenience user.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ExternalName")
        public String externalName;

        /**
         * <p>The account, student ID, or employee ID that is associated with the convenience user.</p>
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

    public static class FilterUsersResponseBodyUsersOrgList extends TeaModel {
        @NameInMap("OrgId")
        public String orgId;

        @NameInMap("OrgName")
        public String orgName;

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

    }

    public static class FilterUsersResponseBodyUsersSupportLoginIdps extends TeaModel {
        @NameInMap("IdpId")
        public String idpId;

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
         * <p>A</p>
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
         * <p>The property ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("PropertyId")
        public Long propertyId;

        /**
         * <p>The property name.</p>
         * 
         * <strong>example:</strong>
         * <p>department</p>
         */
        @NameInMap("PropertyKey")
        public String propertyKey;

        /**
         * <p>The property type.</p>
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
         * <p>The ID of the convenience user that is bound to the property.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("UserId")
        public Long userId;

        /**
         * <p>The username of the convenience user that is bound to the property.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
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
        @NameInMap("AutoLockTime")
        public String autoLockTime;

        /**
         * <p>The number of cloud desktops that are assigned to the convenience user.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DesktopCount")
        public Long desktopCount;

        /**
         * <p>The number of cloud desktop pools that are assigned to the convenience user. This value is returned if you set <code>IncludeDesktopGroupCount</code> to <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DesktopGroupCount")
        public Long desktopGroupCount;

        /**
         * <p>The email address of the convenience user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:testName@example.com">testName@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>Indicates whether the convenience user is a local administrator.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>false</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableAdminAccess")
        public Boolean enableAdminAccess;

        /**
         * <p>The username of the convenience user.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The additional information about the convenience user.</p>
         */
        @NameInMap("ExternalInfo")
        public FilterUsersResponseBodyUsersExternalInfo externalInfo;

        /**
         * <p>The ID of the convenience user.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Indicates whether the convenience user is a tenant administrator.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>false</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsTenantManager")
        public Boolean isTenantManager;

        @NameInMap("OrgList")
        public java.util.List<FilterUsersResponseBodyUsersOrgList> orgList;

        /**
         * <p>The type of the account ownership.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>CreateFromManager: administrator-activated</li>
         * <li>Normal: user-activated</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("OwnerType")
        public String ownerType;

        @NameInMap("PasswordExpireDays")
        public Integer passwordExpireDays;

        @NameInMap("PasswordExpireRestDays")
        public Integer passwordExpireRestDays;

        /**
         * <p>The mobile number of the convenience user.</p>
         * 
         * <strong>example:</strong>
         * <p>1381111****</p>
         */
        @NameInMap("Phone")
        public String phone;

        /**
         * <p>The nickname of the convenience user.</p>
         * 
         * <strong>example:</strong>
         * <p>Oliver</p>
         */
        @NameInMap("RealNickName")
        public String realNickName;

        /**
         * <p>The remarks on the convenience user.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The status of the convenience user.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>0: The convenience user is normal.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>9: The convenience user is locked.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Long status;

        @NameInMap("SupportLoginIdps")
        public java.util.List<FilterUsersResponseBodyUsersSupportLoginIdps> supportLoginIdps;

        /**
         * <p>The information about the properties.</p>
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
