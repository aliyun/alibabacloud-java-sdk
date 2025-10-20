// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateBrandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBrandResponseBody body;

    public static CreateBrandResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBrandResponse self = new CreateBrandResponse();
        return TeaModel.build(map, self);
    }

    public CreateBrandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBrandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBrandResponse setBody(CreateBrandResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBrandResponseBody getBody() {
        return this.body;
    }

}
