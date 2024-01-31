// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelOrderDetailInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HotelOrderDetailInfoResponseBody body;

    public static HotelOrderDetailInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        HotelOrderDetailInfoResponse self = new HotelOrderDetailInfoResponse();
        return TeaModel.build(map, self);
    }

    public HotelOrderDetailInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HotelOrderDetailInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HotelOrderDetailInfoResponse setBody(HotelOrderDetailInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public HotelOrderDetailInfoResponseBody getBody() {
        return this.body;
    }

}
