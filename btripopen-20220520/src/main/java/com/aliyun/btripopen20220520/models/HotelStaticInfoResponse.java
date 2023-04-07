// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelStaticInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public HotelStaticInfoResponseBody body;

    public static HotelStaticInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        HotelStaticInfoResponse self = new HotelStaticInfoResponse();
        return TeaModel.build(map, self);
    }

    public HotelStaticInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HotelStaticInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HotelStaticInfoResponse setBody(HotelStaticInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public HotelStaticInfoResponseBody getBody() {
        return this.body;
    }

}
