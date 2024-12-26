// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.farui20240628.models;

import com.aliyun.tea.*;

public class RunSearchCaseFullTextResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunSearchCaseFullTextResponseBody body;

    public static RunSearchCaseFullTextResponse build(java.util.Map<String, ?> map) throws Exception {
        RunSearchCaseFullTextResponse self = new RunSearchCaseFullTextResponse();
        return TeaModel.build(map, self);
    }

    public RunSearchCaseFullTextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunSearchCaseFullTextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunSearchCaseFullTextResponse setBody(RunSearchCaseFullTextResponseBody body) {
        this.body = body;
        return this;
    }
    public RunSearchCaseFullTextResponseBody getBody() {
        return this.body;
    }

}
