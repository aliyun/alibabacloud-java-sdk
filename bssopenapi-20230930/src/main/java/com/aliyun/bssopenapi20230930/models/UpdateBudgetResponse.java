// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class UpdateBudgetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBudgetResponseBody body;

    public static UpdateBudgetResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBudgetResponse self = new UpdateBudgetResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBudgetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBudgetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBudgetResponse setBody(UpdateBudgetResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBudgetResponseBody getBody() {
        return this.body;
    }

}
