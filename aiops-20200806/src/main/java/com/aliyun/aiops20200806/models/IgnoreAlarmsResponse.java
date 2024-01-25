// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class IgnoreAlarmsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IgnoreAlarmsResponseBody body;

    public static IgnoreAlarmsResponse build(java.util.Map<String, ?> map) throws Exception {
        IgnoreAlarmsResponse self = new IgnoreAlarmsResponse();
        return TeaModel.build(map, self);
    }

    public IgnoreAlarmsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IgnoreAlarmsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IgnoreAlarmsResponse setBody(IgnoreAlarmsResponseBody body) {
        this.body = body;
        return this;
    }
    public IgnoreAlarmsResponseBody getBody() {
        return this.body;
    }

}
