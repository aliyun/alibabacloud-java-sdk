// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class FilterUsersResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ExternalName")
        public String externalName;

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
        @NameInMap("PropertyValue")
        public String propertyValue;

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
        @NameInMap("PropertyId")
        public Long propertyId;

        @NameInMap("PropertyKey")
        public String propertyKey;

        @NameInMap("PropertyType")
        public Integer propertyType;

        @NameInMap("PropertyValues")
        public java.util.List<FilterUsersResponseBodyUsersUserSetPropertiesModelsPropertyValues> propertyValues;

        @NameInMap("UserId")
        public Long userId;

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
        @NameInMap("DesktopCount")
        public Long desktopCount;

        @NameInMap("DesktopGroupCount")
        public Long desktopGroupCount;

        @NameInMap("Email")
        public String email;

        @NameInMap("EndUserId")
        public String endUserId;

        @NameInMap("ExternalInfo")
        public FilterUsersResponseBodyUsersExternalInfo externalInfo;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsTenantManager")
        public Boolean isTenantManager;

        @NameInMap("OwnerType")
        public String ownerType;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Status")
        public Long status;

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
