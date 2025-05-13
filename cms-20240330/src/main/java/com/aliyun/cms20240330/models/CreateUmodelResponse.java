// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateUmodelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateUmodelResponseBody body;

    public static CreateUmodelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUmodelResponse self = new CreateUmodelResponse();
        return TeaModel.build(map, self);
    }

    public CreateUmodelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUmodelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUmodelResponse setBody(CreateUmodelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUmodelResponseBody getBody() {
        return this.body;
    }

}
