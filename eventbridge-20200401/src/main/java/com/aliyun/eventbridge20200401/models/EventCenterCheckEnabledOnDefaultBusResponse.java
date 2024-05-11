// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class EventCenterCheckEnabledOnDefaultBusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EventCenterCheckEnabledOnDefaultBusResponseBody body;

    public static EventCenterCheckEnabledOnDefaultBusResponse build(java.util.Map<String, ?> map) throws Exception {
        EventCenterCheckEnabledOnDefaultBusResponse self = new EventCenterCheckEnabledOnDefaultBusResponse();
        return TeaModel.build(map, self);
    }

    public EventCenterCheckEnabledOnDefaultBusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EventCenterCheckEnabledOnDefaultBusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EventCenterCheckEnabledOnDefaultBusResponse setBody(EventCenterCheckEnabledOnDefaultBusResponseBody body) {
        this.body = body;
        return this;
    }
    public EventCenterCheckEnabledOnDefaultBusResponseBody getBody() {
        return this.body;
    }

}
