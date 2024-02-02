// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AcceptInquiredSystemEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AcceptInquiredSystemEventResponseBody body;

    public static AcceptInquiredSystemEventResponse build(java.util.Map<String, ?> map) throws Exception {
        AcceptInquiredSystemEventResponse self = new AcceptInquiredSystemEventResponse();
        return TeaModel.build(map, self);
    }

    public AcceptInquiredSystemEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AcceptInquiredSystemEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AcceptInquiredSystemEventResponse setBody(AcceptInquiredSystemEventResponseBody body) {
        this.body = body;
        return this;
    }
    public AcceptInquiredSystemEventResponseBody getBody() {
        return this.body;
    }

}
