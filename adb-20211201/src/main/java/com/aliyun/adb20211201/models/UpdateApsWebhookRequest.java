// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class UpdateApsWebhookRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleDBClusterId</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleRegionId</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Webhook")
    public java.util.List<UpdateApsWebhookRequestWebhook> webhook;

    public static UpdateApsWebhookRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApsWebhookRequest self = new UpdateApsWebhookRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApsWebhookRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public UpdateApsWebhookRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateApsWebhookRequest setWebhook(java.util.List<UpdateApsWebhookRequestWebhook> webhook) {
        this.webhook = webhook;
        return this;
    }
    public java.util.List<UpdateApsWebhookRequestWebhook> getWebhook() {
        return this.webhook;
    }

    public static class UpdateApsWebhookRequestWebhook extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ABC**</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>exampleWebhookName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p><a href="https://example.com/webhook">https://example.com/webhook</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>Webhook ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><strong>355</strong>**</p>
         */
        @NameInMap("WebhookId")
        public Long webhookId;

        /**
         * <strong>example:</strong>
         * <p>dingtalk</p>
         */
        @NameInMap("WebhookType")
        public String webhookType;

        public static UpdateApsWebhookRequestWebhook build(java.util.Map<String, ?> map) throws Exception {
            UpdateApsWebhookRequestWebhook self = new UpdateApsWebhookRequestWebhook();
            return TeaModel.build(map, self);
        }

        public UpdateApsWebhookRequestWebhook setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateApsWebhookRequestWebhook setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateApsWebhookRequestWebhook setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public UpdateApsWebhookRequestWebhook setWebhookId(Long webhookId) {
            this.webhookId = webhookId;
            return this;
        }
        public Long getWebhookId() {
            return this.webhookId;
        }

        public UpdateApsWebhookRequestWebhook setWebhookType(String webhookType) {
            this.webhookType = webhookType;
            return this;
        }
        public String getWebhookType() {
            return this.webhookType;
        }

    }

}
