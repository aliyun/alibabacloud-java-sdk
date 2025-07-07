// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseTodoQueryAccountTodoListByApplicantResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterpriseTodoQueryAccountTodoListByApplicantResponseBody body;

    public static EnterpriseTodoQueryAccountTodoListByApplicantResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseTodoQueryAccountTodoListByApplicantResponse self = new EnterpriseTodoQueryAccountTodoListByApplicantResponse();
        return TeaModel.build(map, self);
    }

    public EnterpriseTodoQueryAccountTodoListByApplicantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterpriseTodoQueryAccountTodoListByApplicantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnterpriseTodoQueryAccountTodoListByApplicantResponse setBody(EnterpriseTodoQueryAccountTodoListByApplicantResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterpriseTodoQueryAccountTodoListByApplicantResponseBody getBody() {
        return this.body;
    }

}
