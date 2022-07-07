// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListSettlementStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSettlementStatusResponseBody body;

    public static ListSettlementStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSettlementStatusResponse self = new ListSettlementStatusResponse();
        return TeaModel.build(map, self);
    }

    public ListSettlementStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSettlementStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSettlementStatusResponse setBody(ListSettlementStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSettlementStatusResponseBody getBody() {
        return this.body;
    }

}
