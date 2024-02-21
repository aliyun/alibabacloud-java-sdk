// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ResetDtsJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetDtsJobResponseBody body;

    public static ResetDtsJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetDtsJobResponse self = new ResetDtsJobResponse();
        return TeaModel.build(map, self);
    }

    public ResetDtsJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetDtsJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetDtsJobResponse setBody(ResetDtsJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetDtsJobResponseBody getBody() {
        return this.body;
    }

}
