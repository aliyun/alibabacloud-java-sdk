// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateWebhookRequest extends TeaModel {
    /**
     * <p>The notification template that is sent when an alert is triggered. This parameter is required if the **Method** parameter is set to **Post**. You can use the $content placeholder to specify the notification content. The content cannot exceed 500 characters in length.</p>
     */
    @NameInMap("Body")
    public String body;

    /**
     * <p>The ID of the webhook alert contact. You can call the **SearchAlertContact** operation to obtain the ID.</p>
     */
    @NameInMap("ContactId")
    public Long contactId;

    /**
     * <p>The name of the webhook alert contact.</p>
     */
    @NameInMap("ContactName")
    public String contactName;

    /**
     * <p>The HTTP request headers.</p>
     */
    @NameInMap("HttpHeaders")
    public String httpHeaders;

    /**
     * <p>The parameters in the HTTP request.</p>
     */
    @NameInMap("HttpParams")
    public String httpParams;

    /**
     * <p>The HTTP request method. Valid values:</p>
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
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The URL of the HTTP request method.</p>
     */
    @NameInMap("Url")
    public String url;

    public static UpdateWebhookRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWebhookRequest self = new UpdateWebhookRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWebhookRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public UpdateWebhookRequest setContactId(Long contactId) {
        this.contactId = contactId;
        return this;
    }
    public Long getContactId() {
        return this.contactId;
    }

    public UpdateWebhookRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public UpdateWebhookRequest setHttpHeaders(String httpHeaders) {
        this.httpHeaders = httpHeaders;
        return this;
    }
    public String getHttpHeaders() {
        return this.httpHeaders;
    }

    public UpdateWebhookRequest setHttpParams(String httpParams) {
        this.httpParams = httpParams;
        return this;
    }
    public String getHttpParams() {
        return this.httpParams;
    }

    public UpdateWebhookRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public UpdateWebhookRequest setRecoverBody(String recoverBody) {
        this.recoverBody = recoverBody;
        return this;
    }
    public String getRecoverBody() {
        return this.recoverBody;
    }

    public UpdateWebhookRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateWebhookRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
