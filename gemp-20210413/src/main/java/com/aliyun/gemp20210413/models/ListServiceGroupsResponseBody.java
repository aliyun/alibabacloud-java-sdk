// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListServiceGroupsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("data")
    public java.util.List<ListServiceGroupsResponseBodyData> data;

    // 当前页
    @NameInMap("pageNumber")
    public Long pageNumber;

    // 分页大小
    @NameInMap("pageSize")
    public Long pageSize;

    // 总条数
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListServiceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceGroupsResponseBody self = new ListServiceGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceGroupsResponseBody setData(java.util.List<ListServiceGroupsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListServiceGroupsResponseBodyData> getData() {
        return this.data;
    }

    public ListServiceGroupsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListServiceGroupsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListServiceGroupsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListServiceGroupsResponseBodyDataUsers extends TeaModel {
        // 用户ID
        @NameInMap("userId")
        public Long userId;

        // 用户名字
        @NameInMap("userName")
        public String userName;

        // 服务组ID
        @NameInMap("serviceGroupId")
        public Long serviceGroupId;

        // 手机号
        @NameInMap("phone")
        public String phone;

        // 邮箱
        @NameInMap("email")
        public String email;

        public static ListServiceGroupsResponseBodyDataUsers build(java.util.Map<String, ?> map) throws Exception {
            ListServiceGroupsResponseBodyDataUsers self = new ListServiceGroupsResponseBodyDataUsers();
            return TeaModel.build(map, self);
        }

        public ListServiceGroupsResponseBodyDataUsers setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public ListServiceGroupsResponseBodyDataUsers setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ListServiceGroupsResponseBodyDataUsers setServiceGroupId(Long serviceGroupId) {
            this.serviceGroupId = serviceGroupId;
            return this;
        }
        public Long getServiceGroupId() {
            return this.serviceGroupId;
        }

        public ListServiceGroupsResponseBodyDataUsers setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public ListServiceGroupsResponseBodyDataUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

    }

    public static class ListServiceGroupsResponseBodyData extends TeaModel {
        // 服务组ID
        @NameInMap("serviceGroupId")
        public Long serviceGroupId;

        // 服务组名字
        @NameInMap("serviceGroupName")
        public String serviceGroupName;

        // 服务组描述
        @NameInMap("serviceGroupDescription")
        public String serviceGroupDescription;

        // 修改时间
        @NameInMap("updateTime")
        public String updateTime;

        // ENABLE 启用 DISABLE 禁用
        @NameInMap("enableWebhook")
        public String enableWebhook;

        // WEIXIN_GROUP 微信 DING_GROUP 钉钉 
        @NameInMap("webhookType")
        public String webhookType;

        // webhook 跳转地址
        @NameInMap("webhookLink")
        public String webhookLink;

        // 服务组用户列表
        @NameInMap("users")
        public java.util.List<ListServiceGroupsResponseBodyDataUsers> users;

        public static ListServiceGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListServiceGroupsResponseBodyData self = new ListServiceGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListServiceGroupsResponseBodyData setServiceGroupId(Long serviceGroupId) {
            this.serviceGroupId = serviceGroupId;
            return this;
        }
        public Long getServiceGroupId() {
            return this.serviceGroupId;
        }

        public ListServiceGroupsResponseBodyData setServiceGroupName(String serviceGroupName) {
            this.serviceGroupName = serviceGroupName;
            return this;
        }
        public String getServiceGroupName() {
            return this.serviceGroupName;
        }

        public ListServiceGroupsResponseBodyData setServiceGroupDescription(String serviceGroupDescription) {
            this.serviceGroupDescription = serviceGroupDescription;
            return this;
        }
        public String getServiceGroupDescription() {
            return this.serviceGroupDescription;
        }

        public ListServiceGroupsResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListServiceGroupsResponseBodyData setEnableWebhook(String enableWebhook) {
            this.enableWebhook = enableWebhook;
            return this;
        }
        public String getEnableWebhook() {
            return this.enableWebhook;
        }

        public ListServiceGroupsResponseBodyData setWebhookType(String webhookType) {
            this.webhookType = webhookType;
            return this;
        }
        public String getWebhookType() {
            return this.webhookType;
        }

        public ListServiceGroupsResponseBodyData setWebhookLink(String webhookLink) {
            this.webhookLink = webhookLink;
            return this;
        }
        public String getWebhookLink() {
            return this.webhookLink;
        }

        public ListServiceGroupsResponseBodyData setUsers(java.util.List<ListServiceGroupsResponseBodyDataUsers> users) {
            this.users = users;
            return this;
        }
        public java.util.List<ListServiceGroupsResponseBodyDataUsers> getUsers() {
            return this.users;
        }

    }

}
