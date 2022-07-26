// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightBillSettlementQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public FlightBillSettlementQueryResponseBody body;

    public static FlightBillSettlementQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        FlightBillSettlementQueryResponse self = new FlightBillSettlementQueryResponse();
        return TeaModel.build(map, self);
    }

    public FlightBillSettlementQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlightBillSettlementQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlightBillSettlementQueryResponse setBody(FlightBillSettlementQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public FlightBillSettlementQueryResponseBody getBody() {
        return this.body;
    }

}
