// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class DeleteHotelAlarmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHotelAlarmResponseBody body;

    public static DeleteHotelAlarmResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHotelAlarmResponse self = new DeleteHotelAlarmResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHotelAlarmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHotelAlarmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHotelAlarmResponse setBody(DeleteHotelAlarmResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHotelAlarmResponseBody getBody() {
        return this.body;
    }

}
