// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainBillSettlementQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TrainBillSettlementQueryResponseBody body;

    public static TrainBillSettlementQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        TrainBillSettlementQueryResponse self = new TrainBillSettlementQueryResponse();
        return TeaModel.build(map, self);
    }

    public TrainBillSettlementQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TrainBillSettlementQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TrainBillSettlementQueryResponse setBody(TrainBillSettlementQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public TrainBillSettlementQueryResponseBody getBody() {
        return this.body;
    }

}
