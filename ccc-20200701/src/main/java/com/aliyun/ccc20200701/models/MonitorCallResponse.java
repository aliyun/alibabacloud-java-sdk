// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class MonitorCallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MonitorCallResponseBody body;

    public static MonitorCallResponse build(java.util.Map<String, ?> map) throws Exception {
        MonitorCallResponse self = new MonitorCallResponse();
        return TeaModel.build(map, self);
    }

    public MonitorCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MonitorCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MonitorCallResponse setBody(MonitorCallResponseBody body) {
        this.body = body;
        return this;
    }
    public MonitorCallResponseBody getBody() {
        return this.body;
    }

}
