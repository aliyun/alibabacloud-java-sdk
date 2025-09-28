// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class EventMigrateInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EventMigrateInstanceResponseBody body;

    public static EventMigrateInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        EventMigrateInstanceResponse self = new EventMigrateInstanceResponse();
        return TeaModel.build(map, self);
    }

    public EventMigrateInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EventMigrateInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EventMigrateInstanceResponse setBody(EventMigrateInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public EventMigrateInstanceResponseBody getBody() {
        return this.body;
    }

}
