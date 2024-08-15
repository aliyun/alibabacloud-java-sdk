// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListUserSerivceGroupsResponseBody extends TeaModel {
    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public ListUserSerivceGroupsResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2b63cdef-7ac3-4892-a76d-0f3389ef7291</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListUserSerivceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserSerivceGroupsResponseBody self = new ListUserSerivceGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserSerivceGroupsResponseBody setData(ListUserSerivceGroupsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListUserSerivceGroupsResponseBodyData getData() {
        return this.data;
    }

    public ListUserSerivceGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListUserSerivceGroupsResponseBodyDataServiceGroups extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>描述</p>
         */
        @NameInMap("serviceGroupDescription")
        public String serviceGroupDescription;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("serviceGroupId")
        public Long serviceGroupId;

        /**
         * <strong>example:</strong>
         * <p>服务组A</p>
         */
        @NameInMap("serviceGroupName")
        public String serviceGroupName;

        public static ListUserSerivceGroupsResponseBodyDataServiceGroups build(java.util.Map<String, ?> map) throws Exception {
            ListUserSerivceGroupsResponseBodyDataServiceGroups self = new ListUserSerivceGroupsResponseBodyDataServiceGroups();
            return TeaModel.build(map, self);
        }

        public ListUserSerivceGroupsResponseBodyDataServiceGroups setServiceGroupDescription(String serviceGroupDescription) {
            this.serviceGroupDescription = serviceGroupDescription;
            return this;
        }
        public String getServiceGroupDescription() {
            return this.serviceGroupDescription;
        }

        public ListUserSerivceGroupsResponseBodyDataServiceGroups setServiceGroupId(Long serviceGroupId) {
            this.serviceGroupId = serviceGroupId;
            return this;
        }
        public Long getServiceGroupId() {
            return this.serviceGroupId;
        }

        public ListUserSerivceGroupsResponseBodyDataServiceGroups setServiceGroupName(String serviceGroupName) {
            this.serviceGroupName = serviceGroupName;
            return this;
        }
        public String getServiceGroupName() {
            return this.serviceGroupName;
        }

    }

    public static class ListUserSerivceGroupsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12121****@163.com</p>
         */
        @NameInMap("email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>1390000****</p>
         */
        @NameInMap("phone")
        public String phone;

        /**
         * <strong>example:</strong>
         * <p>321</p>
         */
        @NameInMap("ramId")
        public Long ramId;

        @NameInMap("serviceGroups")
        public java.util.List<ListUserSerivceGroupsResponseBodyDataServiceGroups> serviceGroups;

        /**
         * <strong>example:</strong>
         * <p>321</p>
         */
        @NameInMap("userId")
        public Long userId;

        /**
         * <strong>example:</strong>
         * <p>小明</p>
         */
        @NameInMap("username")
        public String username;

        public static ListUserSerivceGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUserSerivceGroupsResponseBodyData self = new ListUserSerivceGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUserSerivceGroupsResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListUserSerivceGroupsResponseBodyData setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public ListUserSerivceGroupsResponseBodyData setRamId(Long ramId) {
            this.ramId = ramId;
            return this;
        }
        public Long getRamId() {
            return this.ramId;
        }

        public ListUserSerivceGroupsResponseBodyData setServiceGroups(java.util.List<ListUserSerivceGroupsResponseBodyDataServiceGroups> serviceGroups) {
            this.serviceGroups = serviceGroups;
            return this;
        }
        public java.util.List<ListUserSerivceGroupsResponseBodyDataServiceGroups> getServiceGroups() {
            return this.serviceGroups;
        }

        public ListUserSerivceGroupsResponseBodyData setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public ListUserSerivceGroupsResponseBodyData setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
