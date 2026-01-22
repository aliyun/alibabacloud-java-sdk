// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateAlertWebhookRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>JSON</p>
     */
    @NameInMap("contentType")
    public String contentType;

    /**
     * <p>headers</p>
     */
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    /**
     * <strong>example:</strong>
     * <p>zh_CN</p>
     */
    @NameInMap("lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>GET</p>
     */
    @NameInMap("method")
    public String method;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://aliyun.com/test">https://aliyun.com/test</a></p>
     */
    @NameInMap("url")
    public String url;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("webhookId")
    public String webhookId;

    public static CreateAlertWebhookRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertWebhookRequest self = new CreateAlertWebhookRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlertWebhookRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public CreateAlertWebhookRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAlertWebhookRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateAlertWebhookRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public CreateAlertWebhookRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAlertWebhookRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public CreateAlertWebhookRequest setWebhookId(String webhookId) {
        this.webhookId = webhookId;
        return this;
    }
    public String getWebhookId() {
        return this.webhookId;
    }

}
