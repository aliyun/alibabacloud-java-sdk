// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class IntelligentCompositionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IntelligentCompositionResponseBody body;

    public static IntelligentCompositionResponse build(java.util.Map<String, ?> map) throws Exception {
        IntelligentCompositionResponse self = new IntelligentCompositionResponse();
        return TeaModel.build(map, self);
    }

    public IntelligentCompositionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IntelligentCompositionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IntelligentCompositionResponse setBody(IntelligentCompositionResponseBody body) {
        this.body = body;
        return this;
    }
    public IntelligentCompositionResponseBody getBody() {
        return this.body;
    }

}
