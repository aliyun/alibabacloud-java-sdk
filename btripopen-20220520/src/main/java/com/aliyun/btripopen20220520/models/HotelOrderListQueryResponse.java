// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelOrderListQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HotelOrderListQueryResponseBody body;

    public static HotelOrderListQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        HotelOrderListQueryResponse self = new HotelOrderListQueryResponse();
        return TeaModel.build(map, self);
    }

    public HotelOrderListQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HotelOrderListQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HotelOrderListQueryResponse setBody(HotelOrderListQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public HotelOrderListQueryResponseBody getBody() {
        return this.body;
    }

}
