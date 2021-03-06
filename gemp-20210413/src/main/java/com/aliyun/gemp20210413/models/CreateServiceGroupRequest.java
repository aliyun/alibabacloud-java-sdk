// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateServiceGroupRequest extends TeaModel {
    // 服务小组名称
    @NameInMap("serviceGroupName")
    public String serviceGroupName;

    // 小组人员用户ID
    @NameInMap("userIds")
    public java.util.List<Long> userIds;

    // ENABLE 启用 DISABLE 禁用
    @NameInMap("enableWebhook")
    public String enableWebhook;

    // WEIXIN_GROUP 微信 DING_GROUP 钉钉 
    @NameInMap("webhookType")
    public String webhookType;

    // 服务描述
    @NameInMap("serviceGroupDescription")
    public String serviceGroupDescription;

    // webhookLink
    @NameInMap("webhookLink")
    public String webhookLink;

    // 幂等号
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateServiceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceGroupRequest self = new CreateServiceGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceGroupRequest setServiceGroupName(String serviceGroupName) {
        this.serviceGroupName = serviceGroupName;
        return this;
    }
    public String getServiceGroupName() {
        return this.serviceGroupName;
    }

    public CreateServiceGroupRequest setUserIds(java.util.List<Long> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<Long> getUserIds() {
        return this.userIds;
    }

    public CreateServiceGroupRequest setEnableWebhook(String enableWebhook) {
        this.enableWebhook = enableWebhook;
        return this;
    }
    public String getEnableWebhook() {
        return this.enableWebhook;
    }

    public CreateServiceGroupRequest setWebhookType(String webhookType) {
        this.webhookType = webhookType;
        return this;
    }
    public String getWebhookType() {
        return this.webhookType;
    }

    public CreateServiceGroupRequest setServiceGroupDescription(String serviceGroupDescription) {
        this.serviceGroupDescription = serviceGroupDescription;
        return this;
    }
    public String getServiceGroupDescription() {
        return this.serviceGroupDescription;
    }

    public CreateServiceGroupRequest setWebhookLink(String webhookLink) {
        this.webhookLink = webhookLink;
        return this;
    }
    public String getWebhookLink() {
        return this.webhookLink;
    }

    public CreateServiceGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
