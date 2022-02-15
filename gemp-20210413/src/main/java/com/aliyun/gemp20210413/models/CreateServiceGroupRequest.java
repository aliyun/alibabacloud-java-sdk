// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateServiceGroupRequest extends TeaModel {
    // 幂等号
    @NameInMap("clientToken")
    public String clientToken;

    // ENABLE 启用 DISABLE 禁用
    @NameInMap("enableWebhook")
    public String enableWebhook;

    // 监控源消息模版
    @NameInMap("monitorSourceTemplates")
    public java.util.List<CreateServiceGroupRequestMonitorSourceTemplates> monitorSourceTemplates;

    // 服务描述
    @NameInMap("serviceGroupDescription")
    public String serviceGroupDescription;

    // 服务小组名称
    @NameInMap("serviceGroupName")
    public String serviceGroupName;

    // 小组人员用户ID
    @NameInMap("userIds")
    public java.util.List<Long> userIds;

    // webhookLink
    @NameInMap("webhookLink")
    public String webhookLink;

    // WEIXIN_GROUP微信 DING_GROUP钉钉 FEISHU_GROUP飞书
    @NameInMap("webhookType")
    public String webhookType;

    public static CreateServiceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceGroupRequest self = new CreateServiceGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateServiceGroupRequest setEnableWebhook(String enableWebhook) {
        this.enableWebhook = enableWebhook;
        return this;
    }
    public String getEnableWebhook() {
        return this.enableWebhook;
    }

    public CreateServiceGroupRequest setMonitorSourceTemplates(java.util.List<CreateServiceGroupRequestMonitorSourceTemplates> monitorSourceTemplates) {
        this.monitorSourceTemplates = monitorSourceTemplates;
        return this;
    }
    public java.util.List<CreateServiceGroupRequestMonitorSourceTemplates> getMonitorSourceTemplates() {
        return this.monitorSourceTemplates;
    }

    public CreateServiceGroupRequest setServiceGroupDescription(String serviceGroupDescription) {
        this.serviceGroupDescription = serviceGroupDescription;
        return this;
    }
    public String getServiceGroupDescription() {
        return this.serviceGroupDescription;
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

    public CreateServiceGroupRequest setWebhookLink(String webhookLink) {
        this.webhookLink = webhookLink;
        return this;
    }
    public String getWebhookLink() {
        return this.webhookLink;
    }

    public CreateServiceGroupRequest setWebhookType(String webhookType) {
        this.webhookType = webhookType;
        return this;
    }
    public String getWebhookType() {
        return this.webhookType;
    }

    public static class CreateServiceGroupRequestMonitorSourceTemplates extends TeaModel {
        // 监控源ID
        @NameInMap("monitorSourceId")
        public Long monitorSourceId;

        // 监控源名字
        @NameInMap("monitorSourceName")
        public String monitorSourceName;

        // 模板内容
        @NameInMap("templateContent")
        public String templateContent;

        // 消息模版ID
        @NameInMap("templateId")
        public Long templateId;

        public static CreateServiceGroupRequestMonitorSourceTemplates build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceGroupRequestMonitorSourceTemplates self = new CreateServiceGroupRequestMonitorSourceTemplates();
            return TeaModel.build(map, self);
        }

        public CreateServiceGroupRequestMonitorSourceTemplates setMonitorSourceId(Long monitorSourceId) {
            this.monitorSourceId = monitorSourceId;
            return this;
        }
        public Long getMonitorSourceId() {
            return this.monitorSourceId;
        }

        public CreateServiceGroupRequestMonitorSourceTemplates setMonitorSourceName(String monitorSourceName) {
            this.monitorSourceName = monitorSourceName;
            return this;
        }
        public String getMonitorSourceName() {
            return this.monitorSourceName;
        }

        public CreateServiceGroupRequestMonitorSourceTemplates setTemplateContent(String templateContent) {
            this.templateContent = templateContent;
            return this;
        }
        public String getTemplateContent() {
            return this.templateContent;
        }

        public CreateServiceGroupRequestMonitorSourceTemplates setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

}
