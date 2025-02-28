// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class RetrieveRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RetrieveRunResponseBody body;

    public static RetrieveRunResponse build(java.util.Map<String, ?> map) throws Exception {
        RetrieveRunResponse self = new RetrieveRunResponse();
        return TeaModel.build(map, self);
    }

    public RetrieveRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetrieveRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetrieveRunResponse setBody(RetrieveRunResponseBody body) {
        this.body = body;
        return this;
    }
    public RetrieveRunResponseBody getBody() {
        return this.body;
    }

}
