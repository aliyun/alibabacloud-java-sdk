// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateAlertWebhookRequest extends TeaModel {
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
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p><a href="http://aliyun.com/test">http://aliyun.com/test</a></p>
     */
    @NameInMap("url")
    public String url;

    public static UpdateAlertWebhookRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertWebhookRequest self = new UpdateAlertWebhookRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAlertWebhookRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public UpdateAlertWebhookRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAlertWebhookRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateAlertWebhookRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public UpdateAlertWebhookRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAlertWebhookRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
