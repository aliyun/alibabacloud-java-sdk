// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelContactsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHotelContactsResponseBody body;

    public static GetHotelContactsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotelContactsResponse self = new GetHotelContactsResponse();
        return TeaModel.build(map, self);
    }

    public GetHotelContactsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotelContactsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHotelContactsResponse setBody(GetHotelContactsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotelContactsResponseBody getBody() {
        return this.body;
    }

}
