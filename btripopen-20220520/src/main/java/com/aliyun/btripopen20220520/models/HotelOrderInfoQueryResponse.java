// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelOrderInfoQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HotelOrderInfoQueryResponseBody body;

    public static HotelOrderInfoQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        HotelOrderInfoQueryResponse self = new HotelOrderInfoQueryResponse();
        return TeaModel.build(map, self);
    }

    public HotelOrderInfoQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HotelOrderInfoQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HotelOrderInfoQueryResponse setBody(HotelOrderInfoQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public HotelOrderInfoQueryResponseBody getBody() {
        return this.body;
    }

}
