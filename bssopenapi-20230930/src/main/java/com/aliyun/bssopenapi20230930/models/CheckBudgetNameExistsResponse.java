// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CheckBudgetNameExistsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckBudgetNameExistsResponseBody body;

    public static CheckBudgetNameExistsResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckBudgetNameExistsResponse self = new CheckBudgetNameExistsResponse();
        return TeaModel.build(map, self);
    }

    public CheckBudgetNameExistsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckBudgetNameExistsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckBudgetNameExistsResponse setBody(CheckBudgetNameExistsResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckBudgetNameExistsResponseBody getBody() {
        return this.body;
    }

}
