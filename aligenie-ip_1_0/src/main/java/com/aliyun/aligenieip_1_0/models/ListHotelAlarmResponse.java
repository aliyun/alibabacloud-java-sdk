// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelAlarmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHotelAlarmResponseBody body;

    public static ListHotelAlarmResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHotelAlarmResponse self = new ListHotelAlarmResponse();
        return TeaModel.build(map, self);
    }

    public ListHotelAlarmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHotelAlarmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHotelAlarmResponse setBody(ListHotelAlarmResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHotelAlarmResponseBody getBody() {
        return this.body;
    }

}
