// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateWebhookContactRequest extends TeaModel {
    // The header of the HTTP request.
    @NameInMap("BizHeaders")
    public String bizHeaders;

    // The parameters in the HTTP request.
    @NameInMap("BizParams")
    public String bizParams;

    // The notification template that is sent when an alert is triggered. This parameter is required when the **Method** is set to **Post**. You can use `$content` placeholders to output the notification content. The notification content cannot exceed 500 characters in length. For more information, see [Notification template variables](~~251834~~).
    @NameInMap("Body")
    public String body;

    // The HTTP request method. Valid values:
    // 
    // *   Post
    // *   Get
    @NameInMap("Method")
    public String method;

    // The notification template that is sent when the alert resumes. This parameter is required when the **Method** is set to **Post**. You can use `$content` placeholders to output the notification content. The notification content cannot exceed 500 characters in length. For more information, see [Notification template variables](~~251834~~).
    @NameInMap("RecoverBody")
    public String recoverBody;

    // The URL of the request method.
    @NameInMap("Url")
    public String url;

    // The ID of the contact for webhook alerts.
    // 
    // *   If you do not specify this parameter, a new webhook alert contact is created.
    // *   Enter information that represents modifying the contact information of the specified Webhook alert.
    @NameInMap("WebhookId")
    public Long webhookId;

    // The name of the webhook alert contact.
    @NameInMap("WebhookName")
    public String webhookName;

    public static CreateOrUpdateWebhookContactRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateWebhookContactRequest self = new CreateOrUpdateWebhookContactRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateWebhookContactRequest setBizHeaders(String bizHeaders) {
        this.bizHeaders = bizHeaders;
        return this;
    }
    public String getBizHeaders() {
        return this.bizHeaders;
    }

    public CreateOrUpdateWebhookContactRequest setBizParams(String bizParams) {
        this.bizParams = bizParams;
        return this;
    }
    public String getBizParams() {
        return this.bizParams;
    }

    public CreateOrUpdateWebhookContactRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public CreateOrUpdateWebhookContactRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public CreateOrUpdateWebhookContactRequest setRecoverBody(String recoverBody) {
        this.recoverBody = recoverBody;
        return this;
    }
    public String getRecoverBody() {
        return this.recoverBody;
    }

    public CreateOrUpdateWebhookContactRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public CreateOrUpdateWebhookContactRequest setWebhookId(Long webhookId) {
        this.webhookId = webhookId;
        return this;
    }
    public Long getWebhookId() {
        return this.webhookId;
    }

    public CreateOrUpdateWebhookContactRequest setWebhookName(String webhookName) {
        this.webhookName = webhookName;
        return this;
    }
    public String getWebhookName() {
        return this.webhookName;
    }

}
