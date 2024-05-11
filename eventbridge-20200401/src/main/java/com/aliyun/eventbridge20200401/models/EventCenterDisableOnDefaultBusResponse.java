// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class EventCenterDisableOnDefaultBusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EventCenterDisableOnDefaultBusResponseBody body;

    public static EventCenterDisableOnDefaultBusResponse build(java.util.Map<String, ?> map) throws Exception {
        EventCenterDisableOnDefaultBusResponse self = new EventCenterDisableOnDefaultBusResponse();
        return TeaModel.build(map, self);
    }

    public EventCenterDisableOnDefaultBusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EventCenterDisableOnDefaultBusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EventCenterDisableOnDefaultBusResponse setBody(EventCenterDisableOnDefaultBusResponseBody body) {
        this.body = body;
        return this;
    }
    public EventCenterDisableOnDefaultBusResponseBody getBody() {
        return this.body;
    }

}
