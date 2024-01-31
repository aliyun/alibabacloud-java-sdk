// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelOrderCreateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HotelOrderCreateResponseBody body;

    public static HotelOrderCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        HotelOrderCreateResponse self = new HotelOrderCreateResponse();
        return TeaModel.build(map, self);
    }

    public HotelOrderCreateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HotelOrderCreateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HotelOrderCreateResponse setBody(HotelOrderCreateResponseBody body) {
        this.body = body;
        return this;
    }
    public HotelOrderCreateResponseBody getBody() {
        return this.body;
    }

}
