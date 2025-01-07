// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FuPointBillSettlementQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FuPointBillSettlementQueryResponseBody body;

    public static FuPointBillSettlementQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        FuPointBillSettlementQueryResponse self = new FuPointBillSettlementQueryResponse();
        return TeaModel.build(map, self);
    }

    public FuPointBillSettlementQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FuPointBillSettlementQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FuPointBillSettlementQueryResponse setBody(FuPointBillSettlementQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public FuPointBillSettlementQueryResponseBody getBody() {
        return this.body;
    }

}
