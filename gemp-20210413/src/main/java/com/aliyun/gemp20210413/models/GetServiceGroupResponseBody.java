// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetServiceGroupResponseBody extends TeaModel {
    @NameInMap("data")
    public GetServiceGroupResponseBodyData data;

    // 请求ID
    @NameInMap("requestId")
    public String requestId;

    public static GetServiceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceGroupResponseBody self = new GetServiceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceGroupResponseBody setData(GetServiceGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetServiceGroupResponseBodyData getData() {
        return this.data;
    }

    public GetServiceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetServiceGroupResponseBodyDataUsers extends TeaModel {
        // 手机号
        @NameInMap("phone")
        public String phone;

        // 服务组ID
        @NameInMap("serviceGroupId")
        public Long serviceGroupId;

        // 用户ID
        @NameInMap("userId")
        public Long userId;

        // 用户名字
        @NameInMap("userName")
        public String userName;

        public static GetServiceGroupResponseBodyDataUsers build(java.util.Map<String, ?> map) throws Exception {
            GetServiceGroupResponseBodyDataUsers self = new GetServiceGroupResponseBodyDataUsers();
            return TeaModel.build(map, self);
        }

        public GetServiceGroupResponseBodyDataUsers setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public GetServiceGroupResponseBodyDataUsers setServiceGroupId(Long serviceGroupId) {
            this.serviceGroupId = serviceGroupId;
            return this;
        }
        public Long getServiceGroupId() {
            return this.serviceGroupId;
        }

        public GetServiceGroupResponseBodyDataUsers setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public GetServiceGroupResponseBodyDataUsers setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class GetServiceGroupResponseBodyData extends TeaModel {
        // 创建时间
        @NameInMap("createTime")
        public String createTime;

        // ENABLE 启用 DISABLE 禁用
        @NameInMap("enableWebhook")
        public String enableWebhook;

        // 服务组描述
        @NameInMap("serviceGroupDescription")
        public String serviceGroupDescription;

        // 服务组ID
        @NameInMap("serviceGroupId")
        public Long serviceGroupId;

        // 服务组名称
        @NameInMap("serviceGroupName")
        public String serviceGroupName;

        // 修改时间
        @NameInMap("updateTime")
        public String updateTime;

        // 用户ID
        @NameInMap("users")
        public java.util.List<GetServiceGroupResponseBodyDataUsers> users;

        // webhook 跳转地址
        @NameInMap("webhookLink")
        public String webhookLink;

        // WEIXIN_GROUP 微信 DING_GROUP 钉钉 FEISHU_GROUP飞书
        @NameInMap("webhookType")
        public String webhookType;

        public static GetServiceGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceGroupResponseBodyData self = new GetServiceGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetServiceGroupResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetServiceGroupResponseBodyData setEnableWebhook(String enableWebhook) {
            this.enableWebhook = enableWebhook;
            return this;
        }
        public String getEnableWebhook() {
            return this.enableWebhook;
        }

        public GetServiceGroupResponseBodyData setServiceGroupDescription(String serviceGroupDescription) {
            this.serviceGroupDescription = serviceGroupDescription;
            return this;
        }
        public String getServiceGroupDescription() {
            return this.serviceGroupDescription;
        }

        public GetServiceGroupResponseBodyData setServiceGroupId(Long serviceGroupId) {
            this.serviceGroupId = serviceGroupId;
            return this;
        }
        public Long getServiceGroupId() {
            return this.serviceGroupId;
        }

        public GetServiceGroupResponseBodyData setServiceGroupName(String serviceGroupName) {
            this.serviceGroupName = serviceGroupName;
            return this;
        }
        public String getServiceGroupName() {
            return this.serviceGroupName;
        }

        public GetServiceGroupResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetServiceGroupResponseBodyData setUsers(java.util.List<GetServiceGroupResponseBodyDataUsers> users) {
            this.users = users;
            return this;
        }
        public java.util.List<GetServiceGroupResponseBodyDataUsers> getUsers() {
            return this.users;
        }

        public GetServiceGroupResponseBodyData setWebhookLink(String webhookLink) {
            this.webhookLink = webhookLink;
            return this;
        }
        public String getWebhookLink() {
            return this.webhookLink;
        }

        public GetServiceGroupResponseBodyData setWebhookType(String webhookType) {
            this.webhookType = webhookType;
            return this;
        }
        public String getWebhookType() {
            return this.webhookType;
        }

    }

}
