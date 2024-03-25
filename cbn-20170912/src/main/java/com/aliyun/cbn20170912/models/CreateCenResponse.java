// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCenResponseBody body;

    public static CreateCenResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCenResponse self = new CreateCenResponse();
        return TeaModel.build(map, self);
    }

    public CreateCenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCenResponse setBody(CreateCenResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCenResponseBody getBody() {
        return this.body;
    }

}
