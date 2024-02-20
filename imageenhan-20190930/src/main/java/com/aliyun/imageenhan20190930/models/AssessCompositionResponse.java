// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class AssessCompositionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssessCompositionResponseBody body;

    public static AssessCompositionResponse build(java.util.Map<String, ?> map) throws Exception {
        AssessCompositionResponse self = new AssessCompositionResponse();
        return TeaModel.build(map, self);
    }

    public AssessCompositionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssessCompositionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssessCompositionResponse setBody(AssessCompositionResponseBody body) {
        this.body = body;
        return this;
    }
    public AssessCompositionResponseBody getBody() {
        return this.body;
    }

}
