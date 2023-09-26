// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ettrafficisp20230830.models;

import com.aliyun.tea.*;

public class AkGenerateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AkGenerateResponseBody body;

    public static AkGenerateResponse build(java.util.Map<String, ?> map) throws Exception {
        AkGenerateResponse self = new AkGenerateResponse();
        return TeaModel.build(map, self);
    }

    public AkGenerateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AkGenerateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AkGenerateResponse setBody(AkGenerateResponseBody body) {
        this.body = body;
        return this;
    }
    public AkGenerateResponseBody getBody() {
        return this.body;
    }

}
