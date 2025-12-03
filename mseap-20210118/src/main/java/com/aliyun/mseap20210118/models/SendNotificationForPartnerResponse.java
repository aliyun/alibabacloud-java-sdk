// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class SendNotificationForPartnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendNotificationForPartnerResponseBody body;

    public static SendNotificationForPartnerResponse build(java.util.Map<String, ?> map) throws Exception {
        SendNotificationForPartnerResponse self = new SendNotificationForPartnerResponse();
        return TeaModel.build(map, self);
    }

    public SendNotificationForPartnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendNotificationForPartnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendNotificationForPartnerResponse setBody(SendNotificationForPartnerResponseBody body) {
        this.body = body;
        return this;
    }
    public SendNotificationForPartnerResponseBody getBody() {
        return this.body;
    }

}
