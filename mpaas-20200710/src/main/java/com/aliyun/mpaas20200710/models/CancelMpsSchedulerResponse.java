// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class CancelMpsSchedulerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CancelMpsSchedulerResponseBody body;

    public static CancelMpsSchedulerResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelMpsSchedulerResponse self = new CancelMpsSchedulerResponse();
        return TeaModel.build(map, self);
    }

    public CancelMpsSchedulerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelMpsSchedulerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelMpsSchedulerResponse setBody(CancelMpsSchedulerResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelMpsSchedulerResponseBody getBody() {
        return this.body;
    }

}
