// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class EventCenterQueryEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EventCenterQueryEventsResponseBody body;

    public static EventCenterQueryEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        EventCenterQueryEventsResponse self = new EventCenterQueryEventsResponse();
        return TeaModel.build(map, self);
    }

    public EventCenterQueryEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EventCenterQueryEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EventCenterQueryEventsResponse setBody(EventCenterQueryEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public EventCenterQueryEventsResponseBody getBody() {
        return this.body;
    }

}
