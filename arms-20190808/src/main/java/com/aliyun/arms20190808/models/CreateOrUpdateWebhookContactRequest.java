// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateWebhookContactRequest extends TeaModel {
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

    // Url
    @NameInMap("Url")
    public String url;

    // 告警webhook ID
    @NameInMap("WebhookId")
    public Long webhookId;

    // 告警webhook名称
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
