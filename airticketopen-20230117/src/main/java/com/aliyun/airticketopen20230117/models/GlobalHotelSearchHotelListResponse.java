// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelSearchHotelListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GlobalHotelSearchHotelListResponseBody body;

    public static GlobalHotelSearchHotelListResponse build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelSearchHotelListResponse self = new GlobalHotelSearchHotelListResponse();
        return TeaModel.build(map, self);
    }

    public GlobalHotelSearchHotelListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GlobalHotelSearchHotelListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GlobalHotelSearchHotelListResponse setBody(GlobalHotelSearchHotelListResponseBody body) {
        this.body = body;
        return this;
    }
    public GlobalHotelSearchHotelListResponseBody getBody() {
        return this.body;
    }

}
