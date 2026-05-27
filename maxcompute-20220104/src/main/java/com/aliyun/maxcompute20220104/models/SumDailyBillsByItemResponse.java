// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class SumDailyBillsByItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SumDailyBillsByItemResponseBody body;

    public static SumDailyBillsByItemResponse build(java.util.Map<String, ?> map) throws Exception {
        SumDailyBillsByItemResponse self = new SumDailyBillsByItemResponse();
        return TeaModel.build(map, self);
    }

    public SumDailyBillsByItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SumDailyBillsByItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SumDailyBillsByItemResponse setBody(SumDailyBillsByItemResponseBody body) {
        this.body = body;
        return this;
    }
    public SumDailyBillsByItemResponseBody getBody() {
        return this.body;
    }

}
