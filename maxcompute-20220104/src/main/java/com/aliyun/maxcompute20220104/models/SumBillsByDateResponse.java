// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class SumBillsByDateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SumBillsByDateResponseBody body;

    public static SumBillsByDateResponse build(java.util.Map<String, ?> map) throws Exception {
        SumBillsByDateResponse self = new SumBillsByDateResponse();
        return TeaModel.build(map, self);
    }

    public SumBillsByDateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SumBillsByDateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SumBillsByDateResponse setBody(SumBillsByDateResponseBody body) {
        this.body = body;
        return this;
    }
    public SumBillsByDateResponseBody getBody() {
        return this.body;
    }

}
