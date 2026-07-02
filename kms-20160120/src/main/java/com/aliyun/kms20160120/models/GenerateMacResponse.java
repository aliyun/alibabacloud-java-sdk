// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GenerateMacResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateMacResponseBody body;

    public static GenerateMacResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateMacResponse self = new GenerateMacResponse();
        return TeaModel.build(map, self);
    }

    public GenerateMacResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateMacResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateMacResponse setBody(GenerateMacResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateMacResponseBody getBody() {
        return this.body;
    }

}
