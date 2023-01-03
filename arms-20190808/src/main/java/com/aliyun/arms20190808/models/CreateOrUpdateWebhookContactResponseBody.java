// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateWebhookContactResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The returned WebhookContact object.
    @NameInMap("WebhookContact")
    public CreateOrUpdateWebhookContactResponseBodyWebhookContact webhookContact;

    public static CreateOrUpdateWebhookContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateWebhookContactResponseBody self = new CreateOrUpdateWebhookContactResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateWebhookContactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOrUpdateWebhookContactResponseBody setWebhookContact(CreateOrUpdateWebhookContactResponseBodyWebhookContact webhookContact) {
        this.webhookContact = webhookContact;
        return this;
    }
    public CreateOrUpdateWebhookContactResponseBodyWebhookContact getWebhookContact() {
        return this.webhookContact;
    }

    public static class CreateOrUpdateWebhookContactResponseBodyWebhookContactWebhook extends TeaModel {
        // The header of the HTTP request.
        @NameInMap("BizHeaders")
        public String bizHeaders;

        // The parameters in the HTTP request.
        @NameInMap("BizParams")
        public String bizParams;

        // The alert notification template.
        @NameInMap("Body")
        public String body;

        // The HTTP request method. Valid values:
        // 
        // *   Post
        // *   Get
        @NameInMap("Method")
        public String method;

        // The alert recovery template.
        @NameInMap("RecoverBody")
        public String recoverBody;

        // The URL of the request method.
        @NameInMap("Url")
        public String url;

        public static CreateOrUpdateWebhookContactResponseBodyWebhookContactWebhook build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateWebhookContactResponseBodyWebhookContactWebhook self = new CreateOrUpdateWebhookContactResponseBodyWebhookContactWebhook();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateWebhookContactResponseBodyWebhookContactWebhook setBizHeaders(String bizHeaders) {
            this.bizHeaders = bizHeaders;
            return this;
        }
        public String getBizHeaders() {
            return this.bizHeaders;
        }

        public CreateOrUpdateWebhookContactResponseBodyWebhookContactWebhook setBizParams(String bizParams) {
            this.bizParams = bizParams;
            return this;
        }
        public String getBizParams() {
            return this.bizParams;
        }

        public CreateOrUpdateWebhookContactResponseBodyWebhookContactWebhook setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public CreateOrUpdateWebhookContactResponseBodyWebhookContactWebhook setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public CreateOrUpdateWebhookContactResponseBodyWebhookContactWebhook setRecoverBody(String recoverBody) {
            this.recoverBody = recoverBody;
            return this;
        }
        public String getRecoverBody() {
            return this.recoverBody;
        }

        public CreateOrUpdateWebhookContactResponseBodyWebhookContactWebhook setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class CreateOrUpdateWebhookContactResponseBodyWebhookContact extends TeaModel {
        // The returned Webhook object.
        @NameInMap("Webhook")
        public CreateOrUpdateWebhookContactResponseBodyWebhookContactWebhook webhook;

        // The ID of the contact for webhook alerts.
        @NameInMap("WebhookId")
        public Float webhookId;

        // The name of the webhook alert contact.
        @NameInMap("WebhookName")
        public String webhookName;

        public static CreateOrUpdateWebhookContactResponseBodyWebhookContact build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateWebhookContactResponseBodyWebhookContact self = new CreateOrUpdateWebhookContactResponseBodyWebhookContact();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateWebhookContactResponseBodyWebhookContact setWebhook(CreateOrUpdateWebhookContactResponseBodyWebhookContactWebhook webhook) {
            this.webhook = webhook;
            return this;
        }
        public CreateOrUpdateWebhookContactResponseBodyWebhookContactWebhook getWebhook() {
            return this.webhook;
        }

        public CreateOrUpdateWebhookContactResponseBodyWebhookContact setWebhookId(Float webhookId) {
            this.webhookId = webhookId;
            return this;
        }
        public Float getWebhookId() {
            return this.webhookId;
        }

        public CreateOrUpdateWebhookContactResponseBodyWebhookContact setWebhookName(String webhookName) {
            this.webhookName = webhookName;
            return this;
        }
        public String getWebhookName() {
            return this.webhookName;
        }

    }

}
