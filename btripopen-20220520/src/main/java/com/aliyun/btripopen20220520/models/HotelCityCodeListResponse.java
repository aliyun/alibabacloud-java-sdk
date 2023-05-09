// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelCityCodeListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public HotelCityCodeListResponseBody body;

    public static HotelCityCodeListResponse build(java.util.Map<String, ?> map) throws Exception {
        HotelCityCodeListResponse self = new HotelCityCodeListResponse();
        return TeaModel.build(map, self);
    }

    public HotelCityCodeListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HotelCityCodeListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HotelCityCodeListResponse setBody(HotelCityCodeListResponseBody body) {
        this.body = body;
        return this;
    }
    public HotelCityCodeListResponseBody getBody() {
        return this.body;
    }

}
