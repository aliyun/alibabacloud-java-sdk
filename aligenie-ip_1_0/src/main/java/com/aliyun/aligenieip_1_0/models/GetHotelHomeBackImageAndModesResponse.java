// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelHomeBackImageAndModesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetHotelHomeBackImageAndModesResponseBody body;

    public static GetHotelHomeBackImageAndModesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotelHomeBackImageAndModesResponse self = new GetHotelHomeBackImageAndModesResponse();
        return TeaModel.build(map, self);
    }

    public GetHotelHomeBackImageAndModesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotelHomeBackImageAndModesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHotelHomeBackImageAndModesResponse setBody(GetHotelHomeBackImageAndModesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotelHomeBackImageAndModesResponseBody getBody() {
        return this.body;
    }

}
