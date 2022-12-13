// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateServiceGroupRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("enableWebhook")
    public String enableWebhook;

    @NameInMap("monitorSourceTemplates")
    public java.util.List<UpdateServiceGroupRequestMonitorSourceTemplates> monitorSourceTemplates;

    @NameInMap("serviceGroupDescription")
    public String serviceGroupDescription;

    @NameInMap("serviceGroupId")
    public Long serviceGroupId;

    @NameInMap("serviceGroupName")
    public String serviceGroupName;

    @NameInMap("userIds")
    public java.util.List<Long> userIds;

    @NameInMap("webhookLink")
    public String webhookLink;

    @NameInMap("webhookType")
    public String webhookType;

    public static UpdateServiceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceGroupRequest self = new UpdateServiceGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateServiceGroupRequest setEnableWebhook(String enableWebhook) {
        this.enableWebhook = enableWebhook;
        return this;
    }
    public String getEnableWebhook() {
        return this.enableWebhook;
    }

    public UpdateServiceGroupRequest setMonitorSourceTemplates(java.util.List<UpdateServiceGroupRequestMonitorSourceTemplates> monitorSourceTemplates) {
        this.monitorSourceTemplates = monitorSourceTemplates;
        return this;
    }
    public java.util.List<UpdateServiceGroupRequestMonitorSourceTemplates> getMonitorSourceTemplates() {
        return this.monitorSourceTemplates;
    }

    public UpdateServiceGroupRequest setServiceGroupDescription(String serviceGroupDescription) {
        this.serviceGroupDescription = serviceGroupDescription;
        return this;
    }
    public String getServiceGroupDescription() {
        return this.serviceGroupDescription;
    }

    public UpdateServiceGroupRequest setServiceGroupId(Long serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

    public UpdateServiceGroupRequest setServiceGroupName(String serviceGroupName) {
        this.serviceGroupName = serviceGroupName;
        return this;
    }
    public String getServiceGroupName() {
        return this.serviceGroupName;
    }

    public UpdateServiceGroupRequest setUserIds(java.util.List<Long> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<Long> getUserIds() {
        return this.userIds;
    }

    public UpdateServiceGroupRequest setWebhookLink(String webhookLink) {
        this.webhookLink = webhookLink;
        return this;
    }
    public String getWebhookLink() {
        return this.webhookLink;
    }

    public UpdateServiceGroupRequest setWebhookType(String webhookType) {
        this.webhookType = webhookType;
        return this;
    }
    public String getWebhookType() {
        return this.webhookType;
    }

    public static class UpdateServiceGroupRequestMonitorSourceTemplates extends TeaModel {
        @NameInMap("monitorSourceId")
        public Long monitorSourceId;

        @NameInMap("monitorSourceName")
        public String monitorSourceName;

        @NameInMap("templateContent")
        public String templateContent;

        @NameInMap("templateId")
        public Long templateId;

        public static UpdateServiceGroupRequestMonitorSourceTemplates build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceGroupRequestMonitorSourceTemplates self = new UpdateServiceGroupRequestMonitorSourceTemplates();
            return TeaModel.build(map, self);
        }

        public UpdateServiceGroupRequestMonitorSourceTemplates setMonitorSourceId(Long monitorSourceId) {
            this.monitorSourceId = monitorSourceId;
            return this;
        }
        public Long getMonitorSourceId() {
            return this.monitorSourceId;
        }

        public UpdateServiceGroupRequestMonitorSourceTemplates setMonitorSourceName(String monitorSourceName) {
            this.monitorSourceName = monitorSourceName;
            return this;
        }
        public String getMonitorSourceName() {
            return this.monitorSourceName;
        }

        public UpdateServiceGroupRequestMonitorSourceTemplates setTemplateContent(String templateContent) {
            this.templateContent = templateContent;
            return this;
        }
        public String getTemplateContent() {
            return this.templateContent;
        }

        public UpdateServiceGroupRequestMonitorSourceTemplates setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

}
