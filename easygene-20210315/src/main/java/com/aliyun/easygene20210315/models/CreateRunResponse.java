// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class CreateRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRunResponseBody body;

    public static CreateRunResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRunResponse self = new CreateRunResponse();
        return TeaModel.build(map, self);
    }

    public CreateRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRunResponse setBody(CreateRunResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRunResponseBody getBody() {
        return this.body;
    }

}
