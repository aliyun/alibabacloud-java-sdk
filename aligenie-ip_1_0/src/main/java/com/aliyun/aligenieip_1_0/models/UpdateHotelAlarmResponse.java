// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class UpdateHotelAlarmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateHotelAlarmResponseBody body;

    public static UpdateHotelAlarmResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHotelAlarmResponse self = new UpdateHotelAlarmResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHotelAlarmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHotelAlarmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHotelAlarmResponse setBody(UpdateHotelAlarmResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHotelAlarmResponseBody getBody() {
        return this.body;
    }

}
