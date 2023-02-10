// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainTicketScanQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TrainTicketScanQueryResponseBody body;

    public static TrainTicketScanQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        TrainTicketScanQueryResponse self = new TrainTicketScanQueryResponse();
        return TeaModel.build(map, self);
    }

    public TrainTicketScanQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TrainTicketScanQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TrainTicketScanQueryResponse setBody(TrainTicketScanQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public TrainTicketScanQueryResponseBody getBody() {
        return this.body;
    }

}
