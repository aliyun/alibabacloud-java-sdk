// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutLogMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutLogMonitorResponseBody body;

    public static PutLogMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        PutLogMonitorResponse self = new PutLogMonitorResponse();
        return TeaModel.build(map, self);
    }

    public PutLogMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutLogMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutLogMonitorResponse setBody(PutLogMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public PutLogMonitorResponseBody getBody() {
        return this.body;
    }

}
