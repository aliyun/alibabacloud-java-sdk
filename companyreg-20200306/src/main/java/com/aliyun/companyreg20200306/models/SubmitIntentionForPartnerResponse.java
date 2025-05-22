// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class SubmitIntentionForPartnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitIntentionForPartnerResponseBody body;

    public static SubmitIntentionForPartnerResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitIntentionForPartnerResponse self = new SubmitIntentionForPartnerResponse();
        return TeaModel.build(map, self);
    }

    public SubmitIntentionForPartnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitIntentionForPartnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitIntentionForPartnerResponse setBody(SubmitIntentionForPartnerResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitIntentionForPartnerResponseBody getBody() {
        return this.body;
    }

}
