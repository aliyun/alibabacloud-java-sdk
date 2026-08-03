// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelQueryCalendarAvailabilityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GlobalHotelQueryCalendarAvailabilityResponseBody body;

    public static GlobalHotelQueryCalendarAvailabilityResponse build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelQueryCalendarAvailabilityResponse self = new GlobalHotelQueryCalendarAvailabilityResponse();
        return TeaModel.build(map, self);
    }

    public GlobalHotelQueryCalendarAvailabilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GlobalHotelQueryCalendarAvailabilityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GlobalHotelQueryCalendarAvailabilityResponse setBody(GlobalHotelQueryCalendarAvailabilityResponseBody body) {
        this.body = body;
        return this;
    }
    public GlobalHotelQueryCalendarAvailabilityResponseBody getBody() {
        return this.body;
    }

}
