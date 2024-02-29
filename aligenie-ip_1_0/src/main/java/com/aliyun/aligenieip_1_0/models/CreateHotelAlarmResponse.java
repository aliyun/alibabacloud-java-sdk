// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class CreateHotelAlarmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHotelAlarmResponseBody body;

    public static CreateHotelAlarmResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHotelAlarmResponse self = new CreateHotelAlarmResponse();
        return TeaModel.build(map, self);
    }

    public CreateHotelAlarmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHotelAlarmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHotelAlarmResponse setBody(CreateHotelAlarmResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHotelAlarmResponseBody getBody() {
        return this.body;
    }

}
