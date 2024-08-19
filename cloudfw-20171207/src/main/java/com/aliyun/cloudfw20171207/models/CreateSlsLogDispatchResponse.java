// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateSlsLogDispatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSlsLogDispatchResponseBody body;

    public static CreateSlsLogDispatchResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSlsLogDispatchResponse self = new CreateSlsLogDispatchResponse();
        return TeaModel.build(map, self);
    }

    public CreateSlsLogDispatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSlsLogDispatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSlsLogDispatchResponse setBody(CreateSlsLogDispatchResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSlsLogDispatchResponseBody getBody() {
        return this.body;
    }

}
