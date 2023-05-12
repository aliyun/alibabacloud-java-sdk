// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeUsersInGroupResponseBody extends TeaModel {
    @NameInMap("EndUsers")
    public java.util.List<DescribeUsersInGroupResponseBodyEndUsers> endUsers;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OnlineUsersCount")
    public Integer onlineUsersCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UsersCount")
    public Integer usersCount;

    public static DescribeUsersInGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsersInGroupResponseBody self = new DescribeUsersInGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUsersInGroupResponseBody setEndUsers(java.util.List<DescribeUsersInGroupResponseBodyEndUsers> endUsers) {
        this.endUsers = endUsers;
        return this;
    }
    public java.util.List<DescribeUsersInGroupResponseBodyEndUsers> getEndUsers() {
        return this.endUsers;
    }

    public DescribeUsersInGroupResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeUsersInGroupResponseBody setOnlineUsersCount(Integer onlineUsersCount) {
        this.onlineUsersCount = onlineUsersCount;
        return this;
    }
    public Integer getOnlineUsersCount() {
        return this.onlineUsersCount;
    }

    public DescribeUsersInGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUsersInGroupResponseBody setUsersCount(Integer usersCount) {
        this.usersCount = usersCount;
        return this;
    }
    public Integer getUsersCount() {
        return this.usersCount;
    }

    public static class DescribeUsersInGroupResponseBodyEndUsersExternalInfo extends TeaModel {
        @NameInMap("ExternalName")
        public String externalName;

        @NameInMap("JobNumber")
        public String jobNumber;

        public static DescribeUsersInGroupResponseBodyEndUsersExternalInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeUsersInGroupResponseBodyEndUsersExternalInfo self = new DescribeUsersInGroupResponseBodyEndUsersExternalInfo();
            return TeaModel.build(map, self);
        }

        public DescribeUsersInGroupResponseBodyEndUsersExternalInfo setExternalName(String externalName) {
            this.externalName = externalName;
            return this;
        }
        public String getExternalName() {
            return this.externalName;
        }

        public DescribeUsersInGroupResponseBodyEndUsersExternalInfo setJobNumber(String jobNumber) {
            this.jobNumber = jobNumber;
            return this;
        }
        public String getJobNumber() {
            return this.jobNumber;
        }

    }

    public static class DescribeUsersInGroupResponseBodyEndUsersUserSetPropertiesModelsPropertyValues extends TeaModel {
        @NameInMap("PropertyValue")
        public String propertyValue;

        @NameInMap("PropertyValueId")
        public Long propertyValueId;

        public static DescribeUsersInGroupResponseBodyEndUsersUserSetPropertiesModelsPropertyValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeUsersInGroupResponseBodyEndUsersUserSetPropertiesModelsPropertyValues self = new DescribeUsersInGroupResponseBodyEndUsersUserSetPropertiesModelsPropertyValues();
            return TeaModel.build(map, self);
        }

        public DescribeUsersInGroupResponseBodyEndUsersUserSetPropertiesModelsPropertyValues setPropertyValue(String propertyValue) {
            this.propertyValue = propertyValue;
            return this;
        }
        public String getPropertyValue() {
            return this.propertyValue;
        }

        public DescribeUsersInGroupResponseBodyEndUsersUserSetPropertiesModelsPropertyValues setPropertyValueId(Long propertyValueId) {
            this.propertyValueId = propertyValueId;
            return this;
        }
        public Long getPropertyValueId() {
            return this.propertyValueId;
        }

    }

    public static class DescribeUsersInGroupResponseBodyEndUsersUserSetPropertiesModels extends TeaModel {
        @NameInMap("PropertyId")
        public Long propertyId;

        @NameInMap("PropertyKey")
        public String propertyKey;

        @NameInMap("PropertyType")
        public Integer propertyType;

        @NameInMap("PropertyValues")
        public java.util.List<DescribeUsersInGroupResponseBodyEndUsersUserSetPropertiesModelsPropertyValues> propertyValues;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("UserName")
        public String userName;

        public static DescribeUsersInGroupResponseBodyEndUsersUserSetPropertiesModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeUsersInGroupResponseBodyEndUsersUserSetPropertiesModels self = new DescribeUsersInGroupResponseBodyEndUsersUserSetPropertiesModels();
            return TeaModel.build(map, self);
        }

        public DescribeUsersInGroupResponseBodyEndUsersUserSetPropertiesModels setPropertyId(Long propertyId) {
            this.propertyId = propertyId;
            return this;
        }
        public Long getPropertyId() {
            return this.propertyId;
        }

        public DescribeUsersInGroupResponseBodyEndUsersUserSetPropertiesModels setPropertyKey(String propertyKey) {
            this.propertyKey = propertyKey;
            return this;
        }
        public String getPropertyKey() {
            return this.propertyKey;
        }

        public DescribeUsersInGroupResponseBodyEndUsersUserSetPropertiesModels setPropertyType(Integer propertyType) {
            this.propertyType = propertyType;
            return this;
        }
        public Integer getPropertyType() {
            return this.propertyType;
        }

        public DescribeUsersInGroupResponseBodyEndUsersUserSetPropertiesModels setPropertyValues(java.util.List<DescribeUsersInGroupResponseBodyEndUsersUserSetPropertiesModelsPropertyValues> propertyValues) {
            this.propertyValues = propertyValues;
            return this;
        }
        public java.util.List<DescribeUsersInGroupResponseBodyEndUsersUserSetPropertiesModelsPropertyValues> getPropertyValues() {
            return this.propertyValues;
        }

        public DescribeUsersInGroupResponseBodyEndUsersUserSetPropertiesModels setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public DescribeUsersInGroupResponseBodyEndUsersUserSetPropertiesModels setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeUsersInGroupResponseBodyEndUsers extends TeaModel {
        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        @NameInMap("DesktopId")
        public String desktopId;

        @NameInMap("DesktopName")
        public String desktopName;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("EndUserEmail")
        public String endUserEmail;

        @NameInMap("EndUserId")
        public String endUserId;

        @NameInMap("EndUserName")
        public String endUserName;

        @NameInMap("EndUserPhone")
        public String endUserPhone;

        @NameInMap("EndUserRemark")
        public String endUserRemark;

        @NameInMap("EndUserType")
        public String endUserType;

        @NameInMap("ExternalInfo")
        public DescribeUsersInGroupResponseBodyEndUsersExternalInfo externalInfo;

        @NameInMap("UserDesktopId")
        public String userDesktopId;

        @NameInMap("UserSetPropertiesModels")
        public java.util.List<DescribeUsersInGroupResponseBodyEndUsersUserSetPropertiesModels> userSetPropertiesModels;

        public static DescribeUsersInGroupResponseBodyEndUsers build(java.util.Map<String, ?> map) throws Exception {
            DescribeUsersInGroupResponseBodyEndUsers self = new DescribeUsersInGroupResponseBodyEndUsers();
            return TeaModel.build(map, self);
        }

        public DescribeUsersInGroupResponseBodyEndUsers setConnectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        public DescribeUsersInGroupResponseBodyEndUsers setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeUsersInGroupResponseBodyEndUsers setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public DescribeUsersInGroupResponseBodyEndUsers setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeUsersInGroupResponseBodyEndUsers setEndUserEmail(String endUserEmail) {
            this.endUserEmail = endUserEmail;
            return this;
        }
        public String getEndUserEmail() {
            return this.endUserEmail;
        }

        public DescribeUsersInGroupResponseBodyEndUsers setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public DescribeUsersInGroupResponseBodyEndUsers setEndUserName(String endUserName) {
            this.endUserName = endUserName;
            return this;
        }
        public String getEndUserName() {
            return this.endUserName;
        }

        public DescribeUsersInGroupResponseBodyEndUsers setEndUserPhone(String endUserPhone) {
            this.endUserPhone = endUserPhone;
            return this;
        }
        public String getEndUserPhone() {
            return this.endUserPhone;
        }

        public DescribeUsersInGroupResponseBodyEndUsers setEndUserRemark(String endUserRemark) {
            this.endUserRemark = endUserRemark;
            return this;
        }
        public String getEndUserRemark() {
            return this.endUserRemark;
        }

        public DescribeUsersInGroupResponseBodyEndUsers setEndUserType(String endUserType) {
            this.endUserType = endUserType;
            return this;
        }
        public String getEndUserType() {
            return this.endUserType;
        }

        public DescribeUsersInGroupResponseBodyEndUsers setExternalInfo(DescribeUsersInGroupResponseBodyEndUsersExternalInfo externalInfo) {
            this.externalInfo = externalInfo;
            return this;
        }
        public DescribeUsersInGroupResponseBodyEndUsersExternalInfo getExternalInfo() {
            return this.externalInfo;
        }

        public DescribeUsersInGroupResponseBodyEndUsers setUserDesktopId(String userDesktopId) {
            this.userDesktopId = userDesktopId;
            return this;
        }
        public String getUserDesktopId() {
            return this.userDesktopId;
        }

        public DescribeUsersInGroupResponseBodyEndUsers setUserSetPropertiesModels(java.util.List<DescribeUsersInGroupResponseBodyEndUsersUserSetPropertiesModels> userSetPropertiesModels) {
            this.userSetPropertiesModels = userSetPropertiesModels;
            return this;
        }
        public java.util.List<DescribeUsersInGroupResponseBodyEndUsersUserSetPropertiesModels> getUserSetPropertiesModels() {
            return this.userSetPropertiesModels;
        }

    }

}
