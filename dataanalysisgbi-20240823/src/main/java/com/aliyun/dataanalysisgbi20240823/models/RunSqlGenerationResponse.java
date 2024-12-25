// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class RunSqlGenerationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunSqlGenerationResponseBody body;

    public static RunSqlGenerationResponse build(java.util.Map<String, ?> map) throws Exception {
        RunSqlGenerationResponse self = new RunSqlGenerationResponse();
        return TeaModel.build(map, self);
    }

    public RunSqlGenerationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunSqlGenerationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunSqlGenerationResponse setBody(RunSqlGenerationResponseBody body) {
        this.body = body;
        return this;
    }
    public RunSqlGenerationResponseBody getBody() {
        return this.body;
    }

}
