// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelGoodsQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public HotelGoodsQueryResponseBody body;

    public static HotelGoodsQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        HotelGoodsQueryResponse self = new HotelGoodsQueryResponse();
        return TeaModel.build(map, self);
    }

    public HotelGoodsQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HotelGoodsQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HotelGoodsQueryResponse setBody(HotelGoodsQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public HotelGoodsQueryResponseBody getBody() {
        return this.body;
    }

}
