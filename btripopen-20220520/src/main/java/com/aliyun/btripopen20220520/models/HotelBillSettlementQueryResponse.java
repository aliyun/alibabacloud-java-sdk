// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelBillSettlementQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HotelBillSettlementQueryResponseBody body;

    public static HotelBillSettlementQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        HotelBillSettlementQueryResponse self = new HotelBillSettlementQueryResponse();
        return TeaModel.build(map, self);
    }

    public HotelBillSettlementQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HotelBillSettlementQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HotelBillSettlementQueryResponse setBody(HotelBillSettlementQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public HotelBillSettlementQueryResponseBody getBody() {
        return this.body;
    }

}
