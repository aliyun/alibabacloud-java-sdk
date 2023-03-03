// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateWebhookRequest extends TeaModel {
    /**
     * <p>The notification template that is sent when an alert is triggered. This parameter is required if the **Method** parameter is set to **Post**. You can use the $content placeholder to specify the notification content. The content cannot exceed 500 characters in length.</p>
     */
    @NameInMap("Body")
    public String body;

    /**
     * <p>The name of the contact.</p>
     */
    @NameInMap("ContactName")
    public String contactName;

    /**
     * <p>The HTTP request header.</p>
     */
    @NameInMap("HttpHeaders")
    public String httpHeaders;

    /**
     * <p>The parameters in the HTTP request.</p>
     */
    @NameInMap("HttpParams")
    public String httpParams;

    /**
     * <p>The HTTP request method.</p>
     * <br>
     * <p>*   `Get`</p>
     * <p>*   `Post`</p>
     */
    @NameInMap("Method")
    public String method;

    /**
     * <p>The notification template that is sent when an alert is resolved. This parameter is required if the **Method** parameter is set to **Post**. You can use the $content placeholder to specify the notification content. The content cannot exceed 500 characters in length.</p>
     */
    @NameInMap("RecoverBody")
    public String recoverBody;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The URL of the request **method**.</p>
     */
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
