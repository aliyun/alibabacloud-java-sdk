// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class GenerateProductContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateProductContentResponseBody body;

    public static GenerateProductContentResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateProductContentResponse self = new GenerateProductContentResponse();
        return TeaModel.build(map, self);
    }

    public GenerateProductContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateProductContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateProductContentResponse setBody(GenerateProductContentResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateProductContentResponseBody getBody() {
        return this.body;
    }

}
