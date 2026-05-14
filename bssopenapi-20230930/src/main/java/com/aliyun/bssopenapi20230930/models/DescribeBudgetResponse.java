// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DescribeBudgetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBudgetResponseBody body;

    public static DescribeBudgetResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBudgetResponse self = new DescribeBudgetResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBudgetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBudgetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBudgetResponse setBody(DescribeBudgetResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBudgetResponseBody getBody() {
        return this.body;
    }

}
