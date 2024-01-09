// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class CreateSitePairResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSitePairResponseBody body;

    public static CreateSitePairResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSitePairResponse self = new CreateSitePairResponse();
        return TeaModel.build(map, self);
    }

    public CreateSitePairResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSitePairResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSitePairResponse setBody(CreateSitePairResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSitePairResponseBody getBody() {
        return this.body;
    }

}
