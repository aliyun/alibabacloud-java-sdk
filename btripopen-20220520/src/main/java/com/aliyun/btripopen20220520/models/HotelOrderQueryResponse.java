// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelOrderQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HotelOrderQueryResponseBody body;

    public static HotelOrderQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        HotelOrderQueryResponse self = new HotelOrderQueryResponse();
        return TeaModel.build(map, self);
    }

    public HotelOrderQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HotelOrderQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HotelOrderQueryResponse setBody(HotelOrderQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public HotelOrderQueryResponseBody getBody() {
        return this.body;
    }

}
