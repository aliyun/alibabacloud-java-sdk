// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ActivateAICenterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ActivateAICenterResponseBody body;

    public static ActivateAICenterResponse build(java.util.Map<String, ?> map) throws Exception {
        ActivateAICenterResponse self = new ActivateAICenterResponse();
        return TeaModel.build(map, self);
    }

    public ActivateAICenterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActivateAICenterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ActivateAICenterResponse setBody(ActivateAICenterResponseBody body) {
        this.body = body;
        return this;
    }
    public ActivateAICenterResponseBody getBody() {
        return this.body;
    }

}
