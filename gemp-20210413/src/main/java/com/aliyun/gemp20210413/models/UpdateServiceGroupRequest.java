// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateServiceGroupRequest extends TeaModel {
    // 幂等号
    @NameInMap("clientToken")
    public String clientToken;

    // ENABLE 启用 DISABLE 禁用
    @NameInMap("enableWebhook")
    public String enableWebhook;

    // 监控源模版列表
    @NameInMap("monitorSourceTemplates")
    public java.util.List<UpdateServiceGroupRequestMonitorSourceTemplates> monitorSourceTemplates;

    // 服务描述
    @NameInMap("serviceGroupDescription")
    public String serviceGroupDescription;

    // 服务组ID
    @NameInMap("serviceGroupId")
    public Long serviceGroupId;

    // 服务组名字
    @NameInMap("serviceGroupName")
    public String serviceGroupName;

    // 用户ID列表修改后的
    @NameInMap("userIds")
    public java.util.List<Long> userIds;

    // webhook跳转地址
    @NameInMap("webhookLink")
    public String webhookLink;

    // WEIXIN_GROUP微信DING_GROUP钉钉FEISHU_GROUP飞书
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
        // 监控报警源Id
        @NameInMap("monitorSourceId")
        public Long monitorSourceId;

        // 监控报警源
        @NameInMap("monitorSourceName")
        public String monitorSourceName;

        // 消息模版内容
        @NameInMap("templateContent")
        public String templateContent;

        // 消息模版ID
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
