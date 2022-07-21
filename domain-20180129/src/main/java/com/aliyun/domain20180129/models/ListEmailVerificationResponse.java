// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class ListEmailVerificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListEmailVerificationResponseBody body;

    public static ListEmailVerificationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEmailVerificationResponse self = new ListEmailVerificationResponse();
        return TeaModel.build(map, self);
    }

    public ListEmailVerificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEmailVerificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEmailVerificationResponse setBody(ListEmailVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEmailVerificationResponseBody getBody() {
        return this.body;
    }

}
