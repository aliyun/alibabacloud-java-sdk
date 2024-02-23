// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListHealthCheckTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHealthCheckTemplatesResponseBody body;

    public static ListHealthCheckTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHealthCheckTemplatesResponse self = new ListHealthCheckTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListHealthCheckTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHealthCheckTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHealthCheckTemplatesResponse setBody(ListHealthCheckTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHealthCheckTemplatesResponseBody getBody() {
        return this.body;
    }

}
