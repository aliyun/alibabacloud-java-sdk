// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListHotelInfoResponseBody body;

    public static ListHotelInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHotelInfoResponse self = new ListHotelInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListHotelInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHotelInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHotelInfoResponse setBody(ListHotelInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHotelInfoResponseBody getBody() {
        return this.body;
    }

}
