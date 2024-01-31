// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateCheckRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCheckRunResponseBody body;

    public static CreateCheckRunResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCheckRunResponse self = new CreateCheckRunResponse();
        return TeaModel.build(map, self);
    }

    public CreateCheckRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCheckRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCheckRunResponse setBody(CreateCheckRunResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCheckRunResponseBody getBody() {
        return this.body;
    }

}
