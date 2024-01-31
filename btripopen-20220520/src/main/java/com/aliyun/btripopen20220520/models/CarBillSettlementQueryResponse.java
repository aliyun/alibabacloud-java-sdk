// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CarBillSettlementQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CarBillSettlementQueryResponseBody body;

    public static CarBillSettlementQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        CarBillSettlementQueryResponse self = new CarBillSettlementQueryResponse();
        return TeaModel.build(map, self);
    }

    public CarBillSettlementQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CarBillSettlementQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CarBillSettlementQueryResponse setBody(CarBillSettlementQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public CarBillSettlementQueryResponseBody getBody() {
        return this.body;
    }

}
