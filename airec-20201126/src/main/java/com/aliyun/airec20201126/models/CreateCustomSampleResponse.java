// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class CreateCustomSampleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCustomSampleResponseBody body;

    public static CreateCustomSampleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomSampleResponse self = new CreateCustomSampleResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomSampleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomSampleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomSampleResponse setBody(CreateCustomSampleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomSampleResponseBody getBody() {
        return this.body;
    }

}
