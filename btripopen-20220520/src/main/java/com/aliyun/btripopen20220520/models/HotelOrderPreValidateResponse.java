// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelOrderPreValidateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HotelOrderPreValidateResponseBody body;

    public static HotelOrderPreValidateResponse build(java.util.Map<String, ?> map) throws Exception {
        HotelOrderPreValidateResponse self = new HotelOrderPreValidateResponse();
        return TeaModel.build(map, self);
    }

    public HotelOrderPreValidateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HotelOrderPreValidateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HotelOrderPreValidateResponse setBody(HotelOrderPreValidateResponseBody body) {
        this.body = body;
        return this;
    }
    public HotelOrderPreValidateResponseBody getBody() {
        return this.body;
    }

}
