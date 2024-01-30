// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class ListEmailVerificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
