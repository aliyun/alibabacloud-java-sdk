// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateBusinessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBusinessResponseBody body;

    public static CreateBusinessResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBusinessResponse self = new CreateBusinessResponse();
        return TeaModel.build(map, self);
    }

    public CreateBusinessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBusinessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBusinessResponse setBody(CreateBusinessResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBusinessResponseBody getBody() {
        return this.body;
    }

}
