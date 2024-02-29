// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelOrderDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHotelOrderDetailResponseBody body;

    public static GetHotelOrderDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotelOrderDetailResponse self = new GetHotelOrderDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetHotelOrderDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotelOrderDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHotelOrderDetailResponse setBody(GetHotelOrderDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotelOrderDetailResponseBody getBody() {
        return this.body;
    }

}
