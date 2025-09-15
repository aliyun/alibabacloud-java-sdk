// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class VasBillSettlementQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VasBillSettlementQueryResponseBody body;

    public static VasBillSettlementQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        VasBillSettlementQueryResponse self = new VasBillSettlementQueryResponse();
        return TeaModel.build(map, self);
    }

    public VasBillSettlementQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VasBillSettlementQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VasBillSettlementQueryResponse setBody(VasBillSettlementQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public VasBillSettlementQueryResponseBody getBody() {
        return this.body;
    }

}
