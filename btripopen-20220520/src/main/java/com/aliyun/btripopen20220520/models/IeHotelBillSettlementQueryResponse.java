// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IeHotelBillSettlementQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IeHotelBillSettlementQueryResponseBody body;

    public static IeHotelBillSettlementQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        IeHotelBillSettlementQueryResponse self = new IeHotelBillSettlementQueryResponse();
        return TeaModel.build(map, self);
    }

    public IeHotelBillSettlementQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IeHotelBillSettlementQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IeHotelBillSettlementQueryResponse setBody(IeHotelBillSettlementQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public IeHotelBillSettlementQueryResponseBody getBody() {
        return this.body;
    }

}
