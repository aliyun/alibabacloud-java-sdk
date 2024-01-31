// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelIndexInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HotelIndexInfoResponseBody body;

    public static HotelIndexInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        HotelIndexInfoResponse self = new HotelIndexInfoResponse();
        return TeaModel.build(map, self);
    }

    public HotelIndexInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HotelIndexInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HotelIndexInfoResponse setBody(HotelIndexInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public HotelIndexInfoResponseBody getBody() {
        return this.body;
    }

}
