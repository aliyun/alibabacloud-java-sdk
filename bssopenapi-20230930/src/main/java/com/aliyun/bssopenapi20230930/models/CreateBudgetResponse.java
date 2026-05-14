// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CreateBudgetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBudgetResponseBody body;

    public static CreateBudgetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBudgetResponse self = new CreateBudgetResponse();
        return TeaModel.build(map, self);
    }

    public CreateBudgetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBudgetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBudgetResponse setBody(CreateBudgetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBudgetResponseBody getBody() {
        return this.body;
    }

}
