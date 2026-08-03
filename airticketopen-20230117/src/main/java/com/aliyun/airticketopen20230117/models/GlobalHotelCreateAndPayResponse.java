// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelCreateAndPayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GlobalHotelCreateAndPayResponseBody body;

    public static GlobalHotelCreateAndPayResponse build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelCreateAndPayResponse self = new GlobalHotelCreateAndPayResponse();
        return TeaModel.build(map, self);
    }

    public GlobalHotelCreateAndPayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GlobalHotelCreateAndPayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GlobalHotelCreateAndPayResponse setBody(GlobalHotelCreateAndPayResponseBody body) {
        this.body = body;
        return this;
    }
    public GlobalHotelCreateAndPayResponseBody getBody() {
        return this.body;
    }

}
