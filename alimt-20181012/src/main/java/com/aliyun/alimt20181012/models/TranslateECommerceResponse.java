// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class TranslateECommerceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TranslateECommerceResponseBody body;

    public static TranslateECommerceResponse build(java.util.Map<String, ?> map) throws Exception {
        TranslateECommerceResponse self = new TranslateECommerceResponse();
        return TeaModel.build(map, self);
    }

    public TranslateECommerceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TranslateECommerceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TranslateECommerceResponse setBody(TranslateECommerceResponseBody body) {
        this.body = body;
        return this;
    }
    public TranslateECommerceResponseBody getBody() {
        return this.body;
    }

}
