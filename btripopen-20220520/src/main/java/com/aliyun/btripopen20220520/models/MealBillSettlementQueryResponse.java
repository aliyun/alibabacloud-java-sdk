// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MealBillSettlementQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MealBillSettlementQueryResponseBody body;

    public static MealBillSettlementQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        MealBillSettlementQueryResponse self = new MealBillSettlementQueryResponse();
        return TeaModel.build(map, self);
    }

    public MealBillSettlementQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MealBillSettlementQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MealBillSettlementQueryResponse setBody(MealBillSettlementQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public MealBillSettlementQueryResponseBody getBody() {
        return this.body;
    }

}
