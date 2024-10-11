// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class GenerateSampleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateSampleResponseBody body;

    public static GenerateSampleResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateSampleResponse self = new GenerateSampleResponse();
        return TeaModel.build(map, self);
    }

    public GenerateSampleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateSampleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateSampleResponse setBody(GenerateSampleResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateSampleResponseBody getBody() {
        return this.body;
    }

}
