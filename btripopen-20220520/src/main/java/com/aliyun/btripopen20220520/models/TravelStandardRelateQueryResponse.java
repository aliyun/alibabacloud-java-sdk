// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TravelStandardRelateQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TravelStandardRelateQueryResponseBody body;

    public static TravelStandardRelateQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        TravelStandardRelateQueryResponse self = new TravelStandardRelateQueryResponse();
        return TeaModel.build(map, self);
    }

    public TravelStandardRelateQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TravelStandardRelateQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TravelStandardRelateQueryResponse setBody(TravelStandardRelateQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public TravelStandardRelateQueryResponseBody getBody() {
        return this.body;
    }

}
