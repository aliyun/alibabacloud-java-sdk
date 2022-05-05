// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateWebhookContactResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

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
        // http请求头
        @NameInMap("BizHeaders")
        public String bizHeaders;

        // http请求参数
        @NameInMap("BizParams")
        public String bizParams;

        // 告警通知模板
        @NameInMap("Body")
        public String body;

        // Http请求方法
        @NameInMap("Method")
        public String method;

        // 告警恢复模板
        @NameInMap("RecoverBody")
        public String recoverBody;

        // url
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
        @NameInMap("Webhook")
        public CreateOrUpdateWebhookContactResponseBodyWebhookContactWebhook webhook;

        // 告警webhook ID
        @NameInMap("WebhookId")
        public Float webhookId;

        // 告警webhook名称
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
