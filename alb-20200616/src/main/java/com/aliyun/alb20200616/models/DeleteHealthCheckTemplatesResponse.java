// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DeleteHealthCheckTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHealthCheckTemplatesResponseBody body;

    public static DeleteHealthCheckTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHealthCheckTemplatesResponse self = new DeleteHealthCheckTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHealthCheckTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHealthCheckTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHealthCheckTemplatesResponse setBody(DeleteHealthCheckTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHealthCheckTemplatesResponseBody getBody() {
        return this.body;
    }

}
