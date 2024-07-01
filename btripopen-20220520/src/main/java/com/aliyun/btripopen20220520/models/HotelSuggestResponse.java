// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelSuggestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HotelSuggestResponseBody body;

    public static HotelSuggestResponse build(java.util.Map<String, ?> map) throws Exception {
        HotelSuggestResponse self = new HotelSuggestResponse();
        return TeaModel.build(map, self);
    }

    public HotelSuggestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HotelSuggestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HotelSuggestResponse setBody(HotelSuggestResponseBody body) {
        this.body = body;
        return this;
    }
    public HotelSuggestResponseBody getBody() {
        return this.body;
    }

}
