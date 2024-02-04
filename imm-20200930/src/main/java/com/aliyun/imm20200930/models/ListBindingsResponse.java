// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ListBindingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBindingsResponseBody body;

    public static ListBindingsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBindingsResponse self = new ListBindingsResponse();
        return TeaModel.build(map, self);
    }

    public ListBindingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBindingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBindingsResponse setBody(ListBindingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBindingsResponseBody getBody() {
        return this.body;
    }

}
