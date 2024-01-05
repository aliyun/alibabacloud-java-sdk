// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class ListGraphSchemasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListGraphSchemasResponseBody body;

    public static ListGraphSchemasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGraphSchemasResponse self = new ListGraphSchemasResponse();
        return TeaModel.build(map, self);
    }

    public ListGraphSchemasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGraphSchemasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGraphSchemasResponse setBody(ListGraphSchemasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGraphSchemasResponseBody getBody() {
        return this.body;
    }

}
