// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class CreateWebhookRequest extends TeaModel {
    @NameInMap("ContactName")
    public String contactName;

    @NameInMap("Method")
    public String method;

    @NameInMap("Url")
    public String url;

    @NameInMap("HttpParams")
    public String httpParams;

    @NameInMap("HttpHeaders")
    public String httpHeaders;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Body")
    public String body;

    public static CreateWebhookRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWebhookRequest self = new CreateWebhookRequest();
        return TeaModel.build(map, self);
    }

    public CreateWebhookRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public CreateWebhookRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public CreateWebhookRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public CreateWebhookRequest setHttpParams(String httpParams) {
        this.httpParams = httpParams;
        return this;
    }
    public String getHttpParams() {
        return this.httpParams;
    }

    public CreateWebhookRequest setHttpHeaders(String httpHeaders) {
        this.httpHeaders = httpHeaders;
        return this;
    }
    public String getHttpHeaders() {
        return this.httpHeaders;
    }

    public CreateWebhookRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateWebhookRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
