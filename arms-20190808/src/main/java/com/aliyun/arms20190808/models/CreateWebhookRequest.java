// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateWebhookRequest extends TeaModel {
    // The notification template that is sent when an alert is triggered. This parameter is required if the **Method** parameter is set to **Post**. You can use the $content placeholder to specify the notification content. The content cannot exceed 500 characters in length.
    @NameInMap("Body")
    public String body;

    // The name of the contact.
    @NameInMap("ContactName")
    public String contactName;

    // The HTTP request header.
    @NameInMap("HttpHeaders")
    public String httpHeaders;

    // The parameters in the HTTP request.
    @NameInMap("HttpParams")
    public String httpParams;

    // The HTTP request method.
    // 
    // *   `Get`
    // *   `Post`
    @NameInMap("Method")
    public String method;

    // The notification template that is sent when an alert is resolved. This parameter is required if the **Method** parameter is set to **Post**. You can use the $content placeholder to specify the notification content. The content cannot exceed 500 characters in length.
    @NameInMap("RecoverBody")
    public String recoverBody;

    // The region ID.
    @NameInMap("RegionId")
    public String regionId;

    // The URL of the request **method**.
    @NameInMap("Url")
    public String url;

    public static CreateWebhookRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWebhookRequest self = new CreateWebhookRequest();
        return TeaModel.build(map, self);
    }

    public CreateWebhookRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public CreateWebhookRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public CreateWebhookRequest setHttpHeaders(String httpHeaders) {
        this.httpHeaders = httpHeaders;
        return this;
    }
    public String getHttpHeaders() {
        return this.httpHeaders;
    }

    public CreateWebhookRequest setHttpParams(String httpParams) {
        this.httpParams = httpParams;
        return this;
    }
    public String getHttpParams() {
        return this.httpParams;
    }

    public CreateWebhookRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public CreateWebhookRequest setRecoverBody(String recoverBody) {
        this.recoverBody = recoverBody;
        return this;
    }
    public String getRecoverBody() {
        return this.recoverBody;
    }

    public CreateWebhookRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateWebhookRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
