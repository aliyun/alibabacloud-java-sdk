// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListUserSerivceGroupsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("data")
    public ListUserSerivceGroupsResponseBodyData data;

    public static ListUserSerivceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserSerivceGroupsResponseBody self = new ListUserSerivceGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserSerivceGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserSerivceGroupsResponseBody setData(ListUserSerivceGroupsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListUserSerivceGroupsResponseBodyData getData() {
        return this.data;
    }

    public static class ListUserSerivceGroupsResponseBodyDataServiceGroups extends TeaModel {
        // 服务组id
        @NameInMap("serviceGroupId")
        public Long serviceGroupId;

        // 服务组名称
        @NameInMap("serviceGroupName")
        public String serviceGroupName;

        // 服务组描述
        @NameInMap("serviceGroupDescription")
        public String serviceGroupDescription;

        public static ListUserSerivceGroupsResponseBodyDataServiceGroups build(java.util.Map<String, ?> map) throws Exception {
            ListUserSerivceGroupsResponseBodyDataServiceGroups self = new ListUserSerivceGroupsResponseBodyDataServiceGroups();
            return TeaModel.build(map, self);
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

        public ListUserSerivceGroupsResponseBodyDataServiceGroups setServiceGroupDescription(String serviceGroupDescription) {
            this.serviceGroupDescription = serviceGroupDescription;
            return this;
        }
        public String getServiceGroupDescription() {
            return this.serviceGroupDescription;
        }

    }

    public static class ListUserSerivceGroupsResponseBodyData extends TeaModel {
        // RAM子账号ID
        @NameInMap("ramId")
        public Long ramId;

        // 用户ID
        @NameInMap("userId")
        public Long userId;

        // 用户昵称
        @NameInMap("username")
        public String username;

        // 手机号
        @NameInMap("phone")
        public String phone;

        // 邮箱
        @NameInMap("email")
        public String email;

        // 人员所属服务组
        @NameInMap("serviceGroups")
        public java.util.List<ListUserSerivceGroupsResponseBodyDataServiceGroups> serviceGroups;

        public static ListUserSerivceGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUserSerivceGroupsResponseBodyData self = new ListUserSerivceGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUserSerivceGroupsResponseBodyData setRamId(Long ramId) {
            this.ramId = ramId;
            return this;
        }
        public Long getRamId() {
            return this.ramId;
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

        public ListUserSerivceGroupsResponseBodyData setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public ListUserSerivceGroupsResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListUserSerivceGroupsResponseBodyData setServiceGroups(java.util.List<ListUserSerivceGroupsResponseBodyDataServiceGroups> serviceGroups) {
            this.serviceGroups = serviceGroups;
            return this;
        }
        public java.util.List<ListUserSerivceGroupsResponseBodyDataServiceGroups> getServiceGroups() {
            return this.serviceGroups;
        }

    }

}
