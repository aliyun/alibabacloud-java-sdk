// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateServiceGroupRequest extends TeaModel {
    // 服务组ID
    @NameInMap("serviceGroupId")
    public Long serviceGroupId;

    // ENABLE 启用 DISABLE 禁用
    @NameInMap("enableWebhook")
    public String enableWebhook;

    // WEIXIN_GROUP 微信 DING_GROUP 钉钉 
    @NameInMap("webhookType")
    public String webhookType;

    // webhook跳转地址
    @NameInMap("webhookLink")
    public String webhookLink;

    // 服务组名字
    @NameInMap("serviceGroupName")
    public String serviceGroupName;

    // 服务描述
    @NameInMap("serviceGroupDescription")
    public String serviceGroupDescription;

    // 用户ID列表修改后的
    @NameInMap("userIds")
    public java.util.List<Long> userIds;

    // 幂等号
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateServiceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceGroupRequest self = new UpdateServiceGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceGroupRequest setServiceGroupId(Long serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

    public UpdateServiceGroupRequest setEnableWebhook(String enableWebhook) {
        this.enableWebhook = enableWebhook;
        return this;
    }
    public String getEnableWebhook() {
        return this.enableWebhook;
    }

    public UpdateServiceGroupRequest setWebhookType(String webhookType) {
        this.webhookType = webhookType;
        return this;
    }
    public String getWebhookType() {
        return this.webhookType;
    }

    public UpdateServiceGroupRequest setWebhookLink(String webhookLink) {
        this.webhookLink = webhookLink;
        return this;
    }
    public String getWebhookLink() {
        return this.webhookLink;
    }

    public UpdateServiceGroupRequest setServiceGroupName(String serviceGroupName) {
        this.serviceGroupName = serviceGroupName;
        return this;
    }
    public String getServiceGroupName() {
        return this.serviceGroupName;
    }

    public UpdateServiceGroupRequest setServiceGroupDescription(String serviceGroupDescription) {
        this.serviceGroupDescription = serviceGroupDescription;
        return this;
    }
    public String getServiceGroupDescription() {
        return this.serviceGroupDescription;
    }

    public UpdateServiceGroupRequest setUserIds(java.util.List<Long> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<Long> getUserIds() {
        return this.userIds;
    }

    public UpdateServiceGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
