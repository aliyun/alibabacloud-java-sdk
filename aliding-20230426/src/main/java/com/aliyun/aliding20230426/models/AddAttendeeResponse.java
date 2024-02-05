// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddAttendeeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddAttendeeResponseBody body;

    public static AddAttendeeResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAttendeeResponse self = new AddAttendeeResponse();
        return TeaModel.build(map, self);
    }

    public AddAttendeeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAttendeeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddAttendeeResponse setBody(AddAttendeeResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAttendeeResponseBody getBody() {
        return this.body;
    }

}
