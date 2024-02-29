// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelSampleUtterancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHotelSampleUtterancesResponseBody body;

    public static GetHotelSampleUtterancesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotelSampleUtterancesResponse self = new GetHotelSampleUtterancesResponse();
        return TeaModel.build(map, self);
    }

    public GetHotelSampleUtterancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotelSampleUtterancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHotelSampleUtterancesResponse setBody(GetHotelSampleUtterancesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotelSampleUtterancesResponseBody getBody() {
        return this.body;
    }

}
