// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelSearchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HotelSearchResponseBody body;

    public static HotelSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        HotelSearchResponse self = new HotelSearchResponse();
        return TeaModel.build(map, self);
    }

    public HotelSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HotelSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HotelSearchResponse setBody(HotelSearchResponseBody body) {
        this.body = body;
        return this;
    }
    public HotelSearchResponseBody getBody() {
        return this.body;
    }

}
