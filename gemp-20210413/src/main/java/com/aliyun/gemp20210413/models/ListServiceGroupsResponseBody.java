// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListServiceGroupsResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListServiceGroupsResponseBodyData> data;

    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalCount")
    public Long totalCount;

    public static ListServiceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceGroupsResponseBody self = new ListServiceGroupsResponseBody();
        return TeaModel.build(map, self);
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

    public ListServiceGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceGroupsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListServiceGroupsResponseBodyDataUsers extends TeaModel {
        @NameInMap("email")
        public String email;

        @NameInMap("isRelated")
        public Integer isRelated;

        @NameInMap("phone")
        public String phone;

        @NameInMap("serviceGroupId")
        public Long serviceGroupId;

        @NameInMap("userId")
        public Long userId;

        @NameInMap("userName")
        public String userName;

        public static ListServiceGroupsResponseBodyDataUsers build(java.util.Map<String, ?> map) throws Exception {
            ListServiceGroupsResponseBodyDataUsers self = new ListServiceGroupsResponseBodyDataUsers();
            return TeaModel.build(map, self);
        }

        public ListServiceGroupsResponseBodyDataUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListServiceGroupsResponseBodyDataUsers setIsRelated(Integer isRelated) {
            this.isRelated = isRelated;
            return this;
        }
        public Integer getIsRelated() {
            return this.isRelated;
        }

        public ListServiceGroupsResponseBodyDataUsers setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public ListServiceGroupsResponseBodyDataUsers setServiceGroupId(Long serviceGroupId) {
            this.serviceGroupId = serviceGroupId;
            return this;
        }
        public Long getServiceGroupId() {
            return this.serviceGroupId;
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

    }

    public static class ListServiceGroupsResponseBodyData extends TeaModel {
        @NameInMap("enableWebhook")
        public String enableWebhook;

        @NameInMap("isScheduled")
        public Boolean isScheduled;

        @NameInMap("serviceGroupDescription")
        public String serviceGroupDescription;

        @NameInMap("serviceGroupId")
        public Long serviceGroupId;

        @NameInMap("serviceGroupName")
        public String serviceGroupName;

        @NameInMap("updateTime")
        public String updateTime;

        @NameInMap("users")
        public java.util.List<ListServiceGroupsResponseBodyDataUsers> users;

        @NameInMap("webhookLink")
        public String webhookLink;

        @NameInMap("webhookType")
        public String webhookType;

        public static ListServiceGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListServiceGroupsResponseBodyData self = new ListServiceGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListServiceGroupsResponseBodyData setEnableWebhook(String enableWebhook) {
            this.enableWebhook = enableWebhook;
            return this;
        }
        public String getEnableWebhook() {
            return this.enableWebhook;
        }

        public ListServiceGroupsResponseBodyData setIsScheduled(Boolean isScheduled) {
            this.isScheduled = isScheduled;
            return this;
        }
        public Boolean getIsScheduled() {
            return this.isScheduled;
        }

        public ListServiceGroupsResponseBodyData setServiceGroupDescription(String serviceGroupDescription) {
            this.serviceGroupDescription = serviceGroupDescription;
            return this;
        }
        public String getServiceGroupDescription() {
            return this.serviceGroupDescription;
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

        public ListServiceGroupsResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListServiceGroupsResponseBodyData setUsers(java.util.List<ListServiceGroupsResponseBodyDataUsers> users) {
            this.users = users;
            return this;
        }
        public java.util.List<ListServiceGroupsResponseBodyDataUsers> getUsers() {
            return this.users;
        }

        public ListServiceGroupsResponseBodyData setWebhookLink(String webhookLink) {
            this.webhookLink = webhookLink;
            return this;
        }
        public String getWebhookLink() {
            return this.webhookLink;
        }

        public ListServiceGroupsResponseBodyData setWebhookType(String webhookType) {
            this.webhookType = webhookType;
            return this;
        }
        public String getWebhookType() {
            return this.webhookType;
        }

    }

}
