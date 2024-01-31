// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AirportSearchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AirportSearchResponseBody body;

    public static AirportSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        AirportSearchResponse self = new AirportSearchResponse();
        return TeaModel.build(map, self);
    }

    public AirportSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AirportSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AirportSearchResponse setBody(AirportSearchResponseBody body) {
        this.body = body;
        return this;
    }
    public AirportSearchResponseBody getBody() {
        return this.body;
    }

}
