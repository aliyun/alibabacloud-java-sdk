// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class CreateEaiEcsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEaiEcsResponseBody body;

    public static CreateEaiEcsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEaiEcsResponse self = new CreateEaiEcsResponse();
        return TeaModel.build(map, self);
    }

    public CreateEaiEcsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEaiEcsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEaiEcsResponse setBody(CreateEaiEcsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEaiEcsResponseBody getBody() {
        return this.body;
    }

}
