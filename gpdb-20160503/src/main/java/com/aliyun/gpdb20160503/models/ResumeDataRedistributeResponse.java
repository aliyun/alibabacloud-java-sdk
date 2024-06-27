// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ResumeDataRedistributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResumeDataRedistributeResponseBody body;

    public static ResumeDataRedistributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeDataRedistributeResponse self = new ResumeDataRedistributeResponse();
        return TeaModel.build(map, self);
    }

    public ResumeDataRedistributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeDataRedistributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResumeDataRedistributeResponse setBody(ResumeDataRedistributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeDataRedistributeResponseBody getBody() {
        return this.body;
    }

}
