// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TripTaskQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TripTaskQueryResponseBody body;

    public static TripTaskQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        TripTaskQueryResponse self = new TripTaskQueryResponse();
        return TeaModel.build(map, self);
    }

    public TripTaskQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TripTaskQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TripTaskQueryResponse setBody(TripTaskQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public TripTaskQueryResponseBody getBody() {
        return this.body;
    }

}
