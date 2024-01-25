// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateResourceLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateResourceLogResponseBody body;

    public static CreateResourceLogResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceLogResponse self = new CreateResourceLogResponse();
        return TeaModel.build(map, self);
    }

    public CreateResourceLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateResourceLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateResourceLogResponse setBody(CreateResourceLogResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateResourceLogResponseBody getBody() {
        return this.body;
    }

}
