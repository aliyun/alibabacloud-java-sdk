// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelOrderCancelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public HotelOrderCancelResponseBody body;

    public static HotelOrderCancelResponse build(java.util.Map<String, ?> map) throws Exception {
        HotelOrderCancelResponse self = new HotelOrderCancelResponse();
        return TeaModel.build(map, self);
    }

    public HotelOrderCancelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HotelOrderCancelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HotelOrderCancelResponse setBody(HotelOrderCancelResponseBody body) {
        this.body = body;
        return this;
    }
    public HotelOrderCancelResponseBody getBody() {
        return this.body;
    }

}
