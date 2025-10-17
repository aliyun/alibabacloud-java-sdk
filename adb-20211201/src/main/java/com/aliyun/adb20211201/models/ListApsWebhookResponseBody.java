// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListApsWebhookResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>exampleRequestId</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Webhook")
    public java.util.List<ListApsWebhookResponseBodyWebhook> webhook;

    public static ListApsWebhookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApsWebhookResponseBody self = new ListApsWebhookResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApsWebhookResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListApsWebhookResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListApsWebhookResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListApsWebhookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApsWebhookResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListApsWebhookResponseBody setWebhook(java.util.List<ListApsWebhookResponseBodyWebhook> webhook) {
        this.webhook = webhook;
        return this;
    }
    public java.util.List<ListApsWebhookResponseBodyWebhook> getWebhook() {
        return this.webhook;
    }

    public static class ListApsWebhookResponseBodyWebhook extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>your_secret_key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>webhook_name</p>
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
         * <strong>example:</strong>
         * <p><strong>35</strong>*</p>
         */
        @NameInMap("WebhookId")
        public String webhookId;

        /**
         * <strong>example:</strong>
         * <p>dingtalk</p>
         */
        @NameInMap("WebhookType")
        public String webhookType;

        public static ListApsWebhookResponseBodyWebhook build(java.util.Map<String, ?> map) throws Exception {
            ListApsWebhookResponseBodyWebhook self = new ListApsWebhookResponseBodyWebhook();
            return TeaModel.build(map, self);
        }

        public ListApsWebhookResponseBodyWebhook setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListApsWebhookResponseBodyWebhook setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListApsWebhookResponseBodyWebhook setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public ListApsWebhookResponseBodyWebhook setWebhookId(String webhookId) {
            this.webhookId = webhookId;
            return this;
        }
        public String getWebhookId() {
            return this.webhookId;
        }

        public ListApsWebhookResponseBodyWebhook setWebhookType(String webhookType) {
            this.webhookType = webhookType;
            return this;
        }
        public String getWebhookType() {
            return this.webhookType;
        }

    }

}
