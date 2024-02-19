// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CooperatorHotelBillSettlementQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CooperatorHotelBillSettlementQueryResponseBody body;

    public static CooperatorHotelBillSettlementQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        CooperatorHotelBillSettlementQueryResponse self = new CooperatorHotelBillSettlementQueryResponse();
        return TeaModel.build(map, self);
    }

    public CooperatorHotelBillSettlementQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CooperatorHotelBillSettlementQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CooperatorHotelBillSettlementQueryResponse setBody(CooperatorHotelBillSettlementQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public CooperatorHotelBillSettlementQueryResponseBody getBody() {
        return this.body;
    }

}
