// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IeCarBillSettlementQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IeCarBillSettlementQueryResponseBody body;

    public static IeCarBillSettlementQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        IeCarBillSettlementQueryResponse self = new IeCarBillSettlementQueryResponse();
        return TeaModel.build(map, self);
    }

    public IeCarBillSettlementQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IeCarBillSettlementQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IeCarBillSettlementQueryResponse setBody(IeCarBillSettlementQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public IeCarBillSettlementQueryResponseBody getBody() {
        return this.body;
    }

}
