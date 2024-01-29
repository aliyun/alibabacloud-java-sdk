// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class SuspendProcessesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SuspendProcessesResponseBody body;

    public static SuspendProcessesResponse build(java.util.Map<String, ?> map) throws Exception {
        SuspendProcessesResponse self = new SuspendProcessesResponse();
        return TeaModel.build(map, self);
    }

    public SuspendProcessesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SuspendProcessesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SuspendProcessesResponse setBody(SuspendProcessesResponseBody body) {
        this.body = body;
        return this;
    }
    public SuspendProcessesResponseBody getBody() {
        return this.body;
    }

}
