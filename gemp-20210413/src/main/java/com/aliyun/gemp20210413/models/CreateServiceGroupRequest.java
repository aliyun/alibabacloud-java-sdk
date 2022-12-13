// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateServiceGroupRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("enableWebhook")
    public String enableWebhook;

    @NameInMap("monitorSourceTemplates")
    public java.util.List<CreateServiceGroupRequestMonitorSourceTemplates> monitorSourceTemplates;

    @NameInMap("serviceGroupDescription")
    public String serviceGroupDescription;

    @NameInMap("serviceGroupName")
    public String serviceGroupName;

    @NameInMap("userIds")
    public java.util.List<Long> userIds;

    // webhooklink
    @NameInMap("webhookLink")
    public String webhookLink;

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
        @NameInMap("monitorSourceId")
        public Long monitorSourceId;

        @NameInMap("monitorSourceName")
        public String monitorSourceName;

        @NameInMap("templateContent")
        public String templateContent;

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
