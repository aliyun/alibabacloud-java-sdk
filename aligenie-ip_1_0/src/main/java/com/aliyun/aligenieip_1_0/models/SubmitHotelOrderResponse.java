// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class SubmitHotelOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitHotelOrderResponseBody body;

    public static SubmitHotelOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitHotelOrderResponse self = new SubmitHotelOrderResponse();
        return TeaModel.build(map, self);
    }

    public SubmitHotelOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitHotelOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitHotelOrderResponse setBody(SubmitHotelOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitHotelOrderResponseBody getBody() {
        return this.body;
    }

}
