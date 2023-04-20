// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class FilterUsersResponseBody extends TeaModel {
    /**
     * <p>The token that is used to query the next page. If not all results are returned in a query, a value is returned for the NextToken parameter. In this case, you can use the returned NextToken value to perform the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details of the convenience users.</p>
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
         * <p>The name of the external system account to which the user is connected.</p>
         */
        @NameInMap("ExternalName")
        public String externalName;

        /**
         * <p>The student ID or employee ID of the external system account that is connected to the user.</p>
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

    public static class FilterUsersResponseBodyUsersUserSetPropertiesModelsPropertyValues extends TeaModel {
        /**
         * <p>The property value.</p>
         */
        @NameInMap("PropertyValue")
        public String propertyValue;

        /**
         * <p>The ID of the property value.</p>
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
         * <p>The ID of the property.</p>
         */
        @NameInMap("PropertyId")
        public Long propertyId;

        /**
         * <p>The name of the property.</p>
         */
        @NameInMap("PropertyKey")
        public String propertyKey;

        /**
         * <p>The ID of property.</p>
         */
        @NameInMap("PropertyType")
        public Integer propertyType;

        /**
         * <p>Details of the property value.</p>
         */
        @NameInMap("PropertyValues")
        public java.util.List<FilterUsersResponseBodyUsersUserSetPropertiesModelsPropertyValues> propertyValues;

        /**
         * <p>The ID of the user that is bound to the property.</p>
         */
        @NameInMap("UserId")
        public Long userId;

        /**
         * <p>The name of the user that is bound to the property.</p>
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
         * <p>The number of cloud desktops that are assigned to the user.</p>
         */
        @NameInMap("DesktopCount")
        public Long desktopCount;

        /**
         * <p>The number of authorized desktop groups that are owned by the user. This value is returned if you set `IncludeDesktopGroupCount` to `true`.</p>
         */
        @NameInMap("DesktopGroupCount")
        public Long desktopGroupCount;

        /**
         * <p>The email address of the user.</p>
         */
        @NameInMap("Email")
        public String email;

        @NameInMap("EnableAdminAccess")
        public Boolean enableAdminAccess;

        /**
         * <p>The name of the user.</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The additional information about the user.</p>
         */
        @NameInMap("ExternalInfo")
        public FilterUsersResponseBodyUsersExternalInfo externalInfo;

        /**
         * <p>The ID of the user.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Specifies whether the user is a tenant administrator.</p>
         */
        @NameInMap("IsTenantManager")
        public Boolean isTenantManager;

        /**
         * <p>The type of the account ownership.</p>
         */
        @NameInMap("OwnerType")
        public String ownerType;

        /**
         * <p>The mobile number of the user.</p>
         */
        @NameInMap("Phone")
        public String phone;

        /**
         * <p>The remarks of the user.</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The status of the user.</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <p>Details of the user properties.</p>
         */
        @NameInMap("UserSetPropertiesModels")
        public java.util.List<FilterUsersResponseBodyUsersUserSetPropertiesModels> userSetPropertiesModels;

        public static FilterUsersResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            FilterUsersResponseBodyUsers self = new FilterUsersResponseBodyUsers();
            return TeaModel.build(map, self);
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

        public FilterUsersResponseBodyUsers setOwnerType(String ownerType) {
            this.ownerType = ownerType;
            return this;
        }
        public String getOwnerType() {
            return this.ownerType;
        }

        public FilterUsersResponseBodyUsers setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
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

        public FilterUsersResponseBodyUsers setUserSetPropertiesModels(java.util.List<FilterUsersResponseBodyUsersUserSetPropertiesModels> userSetPropertiesModels) {
            this.userSetPropertiesModels = userSetPropertiesModels;
            return this;
        }
        public java.util.List<FilterUsersResponseBodyUsersUserSetPropertiesModels> getUserSetPropertiesModels() {
            return this.userSetPropertiesModels;
        }

    }

}
