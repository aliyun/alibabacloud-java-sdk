// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateApsWebhookRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The type of the task. Valid value: Task type. SLS or OSS Export Task: ResultExport.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ResultExport</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The ID of the region in which to create the dedicated block storage cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The array of webhooks.</p>
     */
    @NameInMap("Webhook")
    public java.util.List<CreateApsWebhookRequestWebhook> webhook;

    public static CreateApsWebhookRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApsWebhookRequest self = new CreateApsWebhookRequest();
        return TeaModel.build(map, self);
    }

    public CreateApsWebhookRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateApsWebhookRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public CreateApsWebhookRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateApsWebhookRequest setWebhook(java.util.List<CreateApsWebhookRequestWebhook> webhook) {
        this.webhook = webhook;
        return this;
    }
    public java.util.List<CreateApsWebhookRequestWebhook> getWebhook() {
        return this.webhook;
    }

    public static class CreateApsWebhookRequestWebhook extends TeaModel {
        /**
         * <p>Signed key.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The name of the webhook.</p>
         * 
         * <strong>example:</strong>
         * <p>MyWebhookName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The request path.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/webhook">https://example.com/webhook</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The notification method. Valid values: dingtalk. lark.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dingtalk</p>
         */
        @NameInMap("WebhookType")
        public String webhookType;

        public static CreateApsWebhookRequestWebhook build(java.util.Map<String, ?> map) throws Exception {
            CreateApsWebhookRequestWebhook self = new CreateApsWebhookRequestWebhook();
            return TeaModel.build(map, self);
        }

        public CreateApsWebhookRequestWebhook setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateApsWebhookRequestWebhook setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateApsWebhookRequestWebhook setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public CreateApsWebhookRequestWebhook setWebhookType(String webhookType) {
            this.webhookType = webhookType;
            return this;
        }
        public String getWebhookType() {
            return this.webhookType;
        }

    }

}
