// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DescribeBudgetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBudgetsResponseBody body;

    public static DescribeBudgetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBudgetsResponse self = new DescribeBudgetsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBudgetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBudgetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBudgetsResponse setBody(DescribeBudgetsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBudgetsResponseBody getBody() {
        return this.body;
    }

}
