// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateServiceGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C4BE3837-1A13-413B-A225-2C88188E8A43</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ENABLE</p>
     */
    @NameInMap("enableWebhook")
    public String enableWebhook;

    @NameInMap("monitorSourceTemplates")
    public java.util.List<UpdateServiceGroupRequestMonitorSourceTemplates> monitorSourceTemplates;

    /**
     * <strong>example:</strong>
     * <p>飞车</p>
     */
    @NameInMap("serviceGroupDescription")
    public String serviceGroupDescription;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("serviceGroupId")
    public Long serviceGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>冲上云霄</p>
     */
    @NameInMap("serviceGroupName")
    public String serviceGroupName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("userIds")
    public java.util.List<Long> userIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>wwwwwww</p>
     */
    @NameInMap("webhookLink")
    public String webhookLink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WEIXINGROUP</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>11111</p>
         */
        @NameInMap("monitorSourceId")
        public Long monitorSourceId;

        /**
         * <strong>example:</strong>
         * <p>zabbix</p>
         */
        @NameInMap("monitorSourceName")
        public String monitorSourceName;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("templateContent")
        public String templateContent;

        /**
         * <strong>example:</strong>
         * <p>1111</p>
         */
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
