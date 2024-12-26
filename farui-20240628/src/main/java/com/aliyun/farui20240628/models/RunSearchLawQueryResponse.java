// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.farui20240628.models;

import com.aliyun.tea.*;

public class RunSearchLawQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunSearchLawQueryResponseBody body;

    public static RunSearchLawQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        RunSearchLawQueryResponse self = new RunSearchLawQueryResponse();
        return TeaModel.build(map, self);
    }

    public RunSearchLawQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunSearchLawQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunSearchLawQueryResponse setBody(RunSearchLawQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public RunSearchLawQueryResponseBody getBody() {
        return this.body;
    }

}
