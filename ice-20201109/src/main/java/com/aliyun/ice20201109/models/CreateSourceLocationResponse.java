// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateSourceLocationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSourceLocationResponseBody body;

    public static CreateSourceLocationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSourceLocationResponse self = new CreateSourceLocationResponse();
        return TeaModel.build(map, self);
    }

    public CreateSourceLocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSourceLocationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSourceLocationResponse setBody(CreateSourceLocationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSourceLocationResponseBody getBody() {
        return this.body;
    }

}
