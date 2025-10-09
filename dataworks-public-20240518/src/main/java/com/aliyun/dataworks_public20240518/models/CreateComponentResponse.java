// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateComponentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateComponentResponseBody body;

    public static CreateComponentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateComponentResponse self = new CreateComponentResponse();
        return TeaModel.build(map, self);
    }

    public CreateComponentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateComponentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateComponentResponse setBody(CreateComponentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateComponentResponseBody getBody() {
        return this.body;
    }

}
