// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseTodoDealAccountTodoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterpriseTodoDealAccountTodoResponseBody body;

    public static EnterpriseTodoDealAccountTodoResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseTodoDealAccountTodoResponse self = new EnterpriseTodoDealAccountTodoResponse();
        return TeaModel.build(map, self);
    }

    public EnterpriseTodoDealAccountTodoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterpriseTodoDealAccountTodoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnterpriseTodoDealAccountTodoResponse setBody(EnterpriseTodoDealAccountTodoResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterpriseTodoDealAccountTodoResponseBody getBody() {
        return this.body;
    }

}
