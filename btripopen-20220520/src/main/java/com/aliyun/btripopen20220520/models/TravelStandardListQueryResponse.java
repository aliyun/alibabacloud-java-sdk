// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TravelStandardListQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TravelStandardListQueryResponseBody body;

    public static TravelStandardListQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        TravelStandardListQueryResponse self = new TravelStandardListQueryResponse();
        return TeaModel.build(map, self);
    }

    public TravelStandardListQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TravelStandardListQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TravelStandardListQueryResponse setBody(TravelStandardListQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public TravelStandardListQueryResponseBody getBody() {
        return this.body;
    }

}
