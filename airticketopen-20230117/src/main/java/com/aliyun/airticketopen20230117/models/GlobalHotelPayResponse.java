// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelPayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GlobalHotelPayResponseBody body;

    public static GlobalHotelPayResponse build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelPayResponse self = new GlobalHotelPayResponse();
        return TeaModel.build(map, self);
    }

    public GlobalHotelPayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GlobalHotelPayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GlobalHotelPayResponse setBody(GlobalHotelPayResponseBody body) {
        this.body = body;
        return this;
    }
    public GlobalHotelPayResponseBody getBody() {
        return this.body;
    }

}
