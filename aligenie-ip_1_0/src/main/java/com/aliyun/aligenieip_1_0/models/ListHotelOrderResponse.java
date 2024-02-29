// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHotelOrderResponseBody body;

    public static ListHotelOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHotelOrderResponse self = new ListHotelOrderResponse();
        return TeaModel.build(map, self);
    }

    public ListHotelOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHotelOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHotelOrderResponse setBody(ListHotelOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHotelOrderResponseBody getBody() {
        return this.body;
    }

}
