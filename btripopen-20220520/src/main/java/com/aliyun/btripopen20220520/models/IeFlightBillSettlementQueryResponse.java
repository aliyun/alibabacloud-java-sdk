// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IeFlightBillSettlementQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public IeFlightBillSettlementQueryResponseBody body;

    public static IeFlightBillSettlementQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        IeFlightBillSettlementQueryResponse self = new IeFlightBillSettlementQueryResponse();
        return TeaModel.build(map, self);
    }

    public IeFlightBillSettlementQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IeFlightBillSettlementQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IeFlightBillSettlementQueryResponse setBody(IeFlightBillSettlementQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public IeFlightBillSettlementQueryResponseBody getBody() {
        return this.body;
    }

}
