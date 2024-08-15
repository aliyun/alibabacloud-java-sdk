// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetUserResponseBody extends TeaModel {
    @NameInMap("data")
    public GetUserResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>c26f36de-1ec8-496a-a828-880676c5ef81</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserResponseBody self = new GetUserResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserResponseBody setData(GetUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetUserResponseBodyData getData() {
        return this.data;
    }

    public GetUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetUserResponseBodyDataServiceGroups extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>山口组</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("serviceGroupId")
        public Long serviceGroupId;

        public static GetUserResponseBodyDataServiceGroups build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyDataServiceGroups self = new GetUserResponseBodyDataServiceGroups();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyDataServiceGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetUserResponseBodyDataServiceGroups setServiceGroupId(Long serviceGroupId) {
            this.serviceGroupId = serviceGroupId;
            return this;
        }
        public Long getServiceGroupId() {
            return this.serviceGroupId;
        }

    }

    public static class GetUserResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SUB</p>
         */
        @NameInMap("accountType")
        public String accountType;

        /**
         * <strong>example:</strong>
         * <p>2021-09-09 09:09:09</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>email</p>
         * 
         * <strong>example:</strong>
         * <p>5678***@qq.com</p>
         */
        @NameInMap("email")
        public String email;

        @NameInMap("isActive")
        public Long isActive;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isEditableUser")
        public Boolean isEditableUser;

        /**
         * <strong>example:</strong>
         * <p>RELATE</p>
         */
        @NameInMap("isRelated")
        public String isRelated;

        /**
         * <strong>example:</strong>
         * <p>1390000****</p>
         */
        @NameInMap("phone")
        public String phone;

        /**
         * <p>ramId</p>
         * 
         * <strong>example:</strong>
         * <p>1344383</p>
         */
        @NameInMap("ramId")
        public String ramId;

        @NameInMap("roleIdList")
        public java.util.List<Long> roleIdList;

        @NameInMap("roleNameList")
        public java.util.List<String> roleNameList;

        @NameInMap("serviceGroups")
        public java.util.List<GetUserResponseBodyDataServiceGroups> serviceGroups;

        /**
         * <strong>example:</strong>
         * <p>63</p>
         */
        @NameInMap("userId")
        public Long userId;

        @NameInMap("username")
        public String username;

        public static GetUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyData self = new GetUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyData setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public GetUserResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetUserResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetUserResponseBodyData setIsActive(Long isActive) {
            this.isActive = isActive;
            return this;
        }
        public Long getIsActive() {
            return this.isActive;
        }

        public GetUserResponseBodyData setIsEditableUser(Boolean isEditableUser) {
            this.isEditableUser = isEditableUser;
            return this;
        }
        public Boolean getIsEditableUser() {
            return this.isEditableUser;
        }

        public GetUserResponseBodyData setIsRelated(String isRelated) {
            this.isRelated = isRelated;
            return this;
        }
        public String getIsRelated() {
            return this.isRelated;
        }

        public GetUserResponseBodyData setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public GetUserResponseBodyData setRamId(String ramId) {
            this.ramId = ramId;
            return this;
        }
        public String getRamId() {
            return this.ramId;
        }

        public GetUserResponseBodyData setRoleIdList(java.util.List<Long> roleIdList) {
            this.roleIdList = roleIdList;
            return this;
        }
        public java.util.List<Long> getRoleIdList() {
            return this.roleIdList;
        }

        public GetUserResponseBodyData setRoleNameList(java.util.List<String> roleNameList) {
            this.roleNameList = roleNameList;
            return this;
        }
        public java.util.List<String> getRoleNameList() {
            return this.roleNameList;
        }

        public GetUserResponseBodyData setServiceGroups(java.util.List<GetUserResponseBodyDataServiceGroups> serviceGroups) {
            this.serviceGroups = serviceGroups;
            return this;
        }
        public java.util.List<GetUserResponseBodyDataServiceGroups> getServiceGroups() {
            return this.serviceGroups;
        }

        public GetUserResponseBodyData setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public GetUserResponseBodyData setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
