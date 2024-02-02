// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CancelSimulatedSystemEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelSimulatedSystemEventsResponseBody body;

    public static CancelSimulatedSystemEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelSimulatedSystemEventsResponse self = new CancelSimulatedSystemEventsResponse();
        return TeaModel.build(map, self);
    }

    public CancelSimulatedSystemEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelSimulatedSystemEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelSimulatedSystemEventsResponse setBody(CancelSimulatedSystemEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelSimulatedSystemEventsResponseBody getBody() {
        return this.body;
    }

}
