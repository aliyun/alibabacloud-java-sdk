// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateCollectorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCollectorResponseBody body;

    public static CreateCollectorResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCollectorResponse self = new CreateCollectorResponse();
        return TeaModel.build(map, self);
    }

    public CreateCollectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCollectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCollectorResponse setBody(CreateCollectorResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCollectorResponseBody getBody() {
        return this.body;
    }

}
