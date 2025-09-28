// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class EventRebootInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EventRebootInstanceResponseBody body;

    public static EventRebootInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        EventRebootInstanceResponse self = new EventRebootInstanceResponse();
        return TeaModel.build(map, self);
    }

    public EventRebootInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EventRebootInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EventRebootInstanceResponse setBody(EventRebootInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public EventRebootInstanceResponseBody getBody() {
        return this.body;
    }

}
