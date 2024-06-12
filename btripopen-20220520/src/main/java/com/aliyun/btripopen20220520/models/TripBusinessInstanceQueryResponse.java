// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TripBusinessInstanceQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TripBusinessInstanceQueryResponseBody body;

    public static TripBusinessInstanceQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        TripBusinessInstanceQueryResponse self = new TripBusinessInstanceQueryResponse();
        return TeaModel.build(map, self);
    }

    public TripBusinessInstanceQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TripBusinessInstanceQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TripBusinessInstanceQueryResponse setBody(TripBusinessInstanceQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public TripBusinessInstanceQueryResponseBody getBody() {
        return this.body;
    }

}
