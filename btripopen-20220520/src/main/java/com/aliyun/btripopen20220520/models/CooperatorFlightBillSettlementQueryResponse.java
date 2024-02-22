// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CooperatorFlightBillSettlementQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CooperatorFlightBillSettlementQueryResponseBody body;

    public static CooperatorFlightBillSettlementQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        CooperatorFlightBillSettlementQueryResponse self = new CooperatorFlightBillSettlementQueryResponse();
        return TeaModel.build(map, self);
    }

    public CooperatorFlightBillSettlementQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CooperatorFlightBillSettlementQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CooperatorFlightBillSettlementQueryResponse setBody(CooperatorFlightBillSettlementQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public CooperatorFlightBillSettlementQueryResponseBody getBody() {
        return this.body;
    }

}
