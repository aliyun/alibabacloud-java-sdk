// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateAlertWebhookRequest extends TeaModel {
    /**
     * <p>The content type of the data. Valid values:</p>
     * <ul>
     * <li>JSON (default)</li>
     * <li>FORM</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>JSON</p>
     */
    @NameInMap("contentType")
    public String contentType;

    /**
     * <p>The collection of HTTP request headers.</p>
     */
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    /**
     * <p>The language. Valid values:</p>
     * <ul>
     * <li>zh_CN</li>
     * <li>en_US</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_CN</p>
     */
    @NameInMap("lang")
    public String lang;

    /**
     * <p>The request method. Valid values:</p>
     * <ul>
     * <li>GET</li>
     * <li>POST</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GET</p>
     */
    @NameInMap("method")
    public String method;

    /**
     * <p>The webhook name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The alert callback URL.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://aliyun.com/test">https://aliyun.com/test</a></p>
     */
    @NameInMap("url")
    public String url;

    /**
     * <p>The unique identifier of the webhook.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("webhookId")
    public String webhookId;

    /**
     * <p>The workspace identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>my-workspace</p>
     */
    @NameInMap("workspace")
    public String workspace;

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

    public CreateAlertWebhookRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
