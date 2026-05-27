// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class SumBillsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SumBillsResponseBody body;

    public static SumBillsResponse build(java.util.Map<String, ?> map) throws Exception {
        SumBillsResponse self = new SumBillsResponse();
        return TeaModel.build(map, self);
    }

    public SumBillsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SumBillsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SumBillsResponse setBody(SumBillsResponseBody body) {
        this.body = body;
        return this;
    }
    public SumBillsResponseBody getBody() {
        return this.body;
    }

}
