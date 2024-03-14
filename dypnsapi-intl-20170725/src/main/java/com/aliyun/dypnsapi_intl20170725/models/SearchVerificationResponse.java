// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi_intl20170725.models;

import com.aliyun.tea.*;

public class SearchVerificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchVerificationResponseBody body;

    public static SearchVerificationResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchVerificationResponse self = new SearchVerificationResponse();
        return TeaModel.build(map, self);
    }

    public SearchVerificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchVerificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchVerificationResponse setBody(SearchVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchVerificationResponseBody getBody() {
        return this.body;
    }

}
