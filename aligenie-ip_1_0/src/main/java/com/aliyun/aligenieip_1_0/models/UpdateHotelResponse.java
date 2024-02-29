// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class UpdateHotelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateHotelResponseBody body;

    public static UpdateHotelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHotelResponse self = new UpdateHotelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHotelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHotelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHotelResponse setBody(UpdateHotelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHotelResponseBody getBody() {
        return this.body;
    }

}
