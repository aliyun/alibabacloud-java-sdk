// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelQueryAvailabilityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GlobalHotelQueryAvailabilityResponseBody body;

    public static GlobalHotelQueryAvailabilityResponse build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelQueryAvailabilityResponse self = new GlobalHotelQueryAvailabilityResponse();
        return TeaModel.build(map, self);
    }

    public GlobalHotelQueryAvailabilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GlobalHotelQueryAvailabilityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GlobalHotelQueryAvailabilityResponse setBody(GlobalHotelQueryAvailabilityResponseBody body) {
        this.body = body;
        return this;
    }
    public GlobalHotelQueryAvailabilityResponseBody getBody() {
        return this.body;
    }

}
