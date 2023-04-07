// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelOrderPayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public HotelOrderPayResponseBody body;

    public static HotelOrderPayResponse build(java.util.Map<String, ?> map) throws Exception {
        HotelOrderPayResponse self = new HotelOrderPayResponse();
        return TeaModel.build(map, self);
    }

    public HotelOrderPayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HotelOrderPayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HotelOrderPayResponse setBody(HotelOrderPayResponseBody body) {
        this.body = body;
        return this;
    }
    public HotelOrderPayResponseBody getBody() {
        return this.body;
    }

}
