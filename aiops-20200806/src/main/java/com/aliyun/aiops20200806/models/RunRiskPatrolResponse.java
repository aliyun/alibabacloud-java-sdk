// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class RunRiskPatrolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunRiskPatrolResponseBody body;

    public static RunRiskPatrolResponse build(java.util.Map<String, ?> map) throws Exception {
        RunRiskPatrolResponse self = new RunRiskPatrolResponse();
        return TeaModel.build(map, self);
    }

    public RunRiskPatrolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunRiskPatrolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunRiskPatrolResponse setBody(RunRiskPatrolResponseBody body) {
        this.body = body;
        return this;
    }
    public RunRiskPatrolResponseBody getBody() {
        return this.body;
    }

}
