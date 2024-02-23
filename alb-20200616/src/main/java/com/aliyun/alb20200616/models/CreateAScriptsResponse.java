// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateAScriptsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAScriptsResponseBody body;

    public static CreateAScriptsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAScriptsResponse self = new CreateAScriptsResponse();
        return TeaModel.build(map, self);
    }

    public CreateAScriptsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAScriptsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAScriptsResponse setBody(CreateAScriptsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAScriptsResponseBody getBody() {
        return this.body;
    }

}
