// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TripCCInfoQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TripCCInfoQueryResponseBody body;

    public static TripCCInfoQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        TripCCInfoQueryResponse self = new TripCCInfoQueryResponse();
        return TeaModel.build(map, self);
    }

    public TripCCInfoQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TripCCInfoQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TripCCInfoQueryResponse setBody(TripCCInfoQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public TripCCInfoQueryResponseBody getBody() {
        return this.body;
    }

}
