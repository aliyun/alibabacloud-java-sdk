// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class CloseIntentionForPartnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloseIntentionForPartnerResponseBody body;

    public static CloseIntentionForPartnerResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseIntentionForPartnerResponse self = new CloseIntentionForPartnerResponse();
        return TeaModel.build(map, self);
    }

    public CloseIntentionForPartnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseIntentionForPartnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloseIntentionForPartnerResponse setBody(CloseIntentionForPartnerResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseIntentionForPartnerResponseBody getBody() {
        return this.body;
    }

}
