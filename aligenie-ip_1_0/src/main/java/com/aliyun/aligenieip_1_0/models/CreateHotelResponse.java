// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class CreateHotelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHotelResponseBody body;

    public static CreateHotelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHotelResponse self = new CreateHotelResponse();
        return TeaModel.build(map, self);
    }

    public CreateHotelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHotelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHotelResponse setBody(CreateHotelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHotelResponseBody getBody() {
        return this.body;
    }

}
