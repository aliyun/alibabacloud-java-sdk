// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class RemoveAttendeeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveAttendeeResponseBody body;

    public static RemoveAttendeeResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveAttendeeResponse self = new RemoveAttendeeResponse();
        return TeaModel.build(map, self);
    }

    public RemoveAttendeeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveAttendeeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveAttendeeResponse setBody(RemoveAttendeeResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveAttendeeResponseBody getBody() {
        return this.body;
    }

}
