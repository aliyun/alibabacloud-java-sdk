// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class RemoveHotelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveHotelResponseBody body;

    public static RemoveHotelResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveHotelResponse self = new RemoveHotelResponse();
        return TeaModel.build(map, self);
    }

    public RemoveHotelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveHotelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveHotelResponse setBody(RemoveHotelResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveHotelResponseBody getBody() {
        return this.body;
    }

}
