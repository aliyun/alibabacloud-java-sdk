// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateSignatureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSignatureResponseBody body;

    public static CreateSignatureResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSignatureResponse self = new CreateSignatureResponse();
        return TeaModel.build(map, self);
    }

    public CreateSignatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSignatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSignatureResponse setBody(CreateSignatureResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSignatureResponseBody getBody() {
        return this.body;
    }

}
