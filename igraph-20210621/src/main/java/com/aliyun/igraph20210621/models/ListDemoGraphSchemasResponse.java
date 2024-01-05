// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class ListDemoGraphSchemasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDemoGraphSchemasResponseBody body;

    public static ListDemoGraphSchemasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDemoGraphSchemasResponse self = new ListDemoGraphSchemasResponse();
        return TeaModel.build(map, self);
    }

    public ListDemoGraphSchemasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDemoGraphSchemasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDemoGraphSchemasResponse setBody(ListDemoGraphSchemasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDemoGraphSchemasResponseBody getBody() {
        return this.body;
    }

}
