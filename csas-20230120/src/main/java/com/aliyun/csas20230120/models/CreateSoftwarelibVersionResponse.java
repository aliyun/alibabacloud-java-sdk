// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateSoftwarelibVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSoftwarelibVersionResponseBody body;

    public static CreateSoftwarelibVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSoftwarelibVersionResponse self = new CreateSoftwarelibVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreateSoftwarelibVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSoftwarelibVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSoftwarelibVersionResponse setBody(CreateSoftwarelibVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSoftwarelibVersionResponseBody getBody() {
        return this.body;
    }

}
