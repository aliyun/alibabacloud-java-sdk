// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class EventCenterEnableOnDefaultBusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EventCenterEnableOnDefaultBusResponseBody body;

    public static EventCenterEnableOnDefaultBusResponse build(java.util.Map<String, ?> map) throws Exception {
        EventCenterEnableOnDefaultBusResponse self = new EventCenterEnableOnDefaultBusResponse();
        return TeaModel.build(map, self);
    }

    public EventCenterEnableOnDefaultBusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EventCenterEnableOnDefaultBusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EventCenterEnableOnDefaultBusResponse setBody(EventCenterEnableOnDefaultBusResponseBody body) {
        this.body = body;
        return this;
    }
    public EventCenterEnableOnDefaultBusResponseBody getBody() {
        return this.body;
    }

}
