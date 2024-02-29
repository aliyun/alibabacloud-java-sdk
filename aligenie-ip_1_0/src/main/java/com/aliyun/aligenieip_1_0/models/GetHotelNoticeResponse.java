// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelNoticeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHotelNoticeResponseBody body;

    public static GetHotelNoticeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotelNoticeResponse self = new GetHotelNoticeResponse();
        return TeaModel.build(map, self);
    }

    public GetHotelNoticeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotelNoticeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHotelNoticeResponse setBody(GetHotelNoticeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotelNoticeResponseBody getBody() {
        return this.body;
    }

}
