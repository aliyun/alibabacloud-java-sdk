// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelCancelOrRefundResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GlobalHotelCancelOrRefundResponseBody body;

    public static GlobalHotelCancelOrRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelCancelOrRefundResponse self = new GlobalHotelCancelOrRefundResponse();
        return TeaModel.build(map, self);
    }

    public GlobalHotelCancelOrRefundResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GlobalHotelCancelOrRefundResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GlobalHotelCancelOrRefundResponse setBody(GlobalHotelCancelOrRefundResponseBody body) {
        this.body = body;
        return this;
    }
    public GlobalHotelCancelOrRefundResponseBody getBody() {
        return this.body;
    }

}
