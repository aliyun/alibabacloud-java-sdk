// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RunSemanticJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunSemanticJobResponseBody body;

    public static RunSemanticJobResponse build(java.util.Map<String, ?> map) throws Exception {
        RunSemanticJobResponse self = new RunSemanticJobResponse();
        return TeaModel.build(map, self);
    }

    public RunSemanticJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunSemanticJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunSemanticJobResponse setBody(RunSemanticJobResponseBody body) {
        this.body = body;
        return this;
    }
    public RunSemanticJobResponseBody getBody() {
        return this.body;
    }

}
