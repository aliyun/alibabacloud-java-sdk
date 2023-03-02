// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetUserResponseBody extends TeaModel {
    @NameInMap("data")
    public GetUserResponseBodyData data;

    /**
     * <p>Id of the request</p>
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
        @NameInMap("name")
        public String name;

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
        @NameInMap("accountType")
        public String accountType;

        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>email</p>
         */
        @NameInMap("email")
        public String email;

        @NameInMap("isEditableUser")
        public Boolean isEditableUser;

        @NameInMap("isRelated")
        public String isRelated;

        @NameInMap("phone")
        public String phone;

        /**
         * <p>ramId</p>
         */
        @NameInMap("ramId")
        public String ramId;

        @NameInMap("serviceGroups")
        public java.util.List<GetUserResponseBodyDataServiceGroups> serviceGroups;

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
