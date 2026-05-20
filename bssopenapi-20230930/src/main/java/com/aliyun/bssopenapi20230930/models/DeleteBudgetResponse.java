// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DeleteBudgetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBudgetResponseBody body;

    public static DeleteBudgetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBudgetResponse self = new DeleteBudgetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBudgetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBudgetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBudgetResponse setBody(DeleteBudgetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBudgetResponseBody getBody() {
        return this.body;
    }

}
