// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TravelStandardQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TravelStandardQueryResponseBody body;

    public static TravelStandardQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        TravelStandardQueryResponse self = new TravelStandardQueryResponse();
        return TeaModel.build(map, self);
    }

    public TravelStandardQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TravelStandardQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TravelStandardQueryResponse setBody(TravelStandardQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public TravelStandardQueryResponseBody getBody() {
        return this.body;
    }

}
