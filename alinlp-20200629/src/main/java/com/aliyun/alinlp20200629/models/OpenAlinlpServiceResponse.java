// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class OpenAlinlpServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenAlinlpServiceResponseBody body;

    public static OpenAlinlpServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenAlinlpServiceResponse self = new OpenAlinlpServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenAlinlpServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenAlinlpServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenAlinlpServiceResponse setBody(OpenAlinlpServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenAlinlpServiceResponseBody getBody() {
        return this.body;
    }

}
