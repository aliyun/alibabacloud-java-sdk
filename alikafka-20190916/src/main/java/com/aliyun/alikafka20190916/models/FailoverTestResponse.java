// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class FailoverTestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FailoverTestResponseBody body;

    public static FailoverTestResponse build(java.util.Map<String, ?> map) throws Exception {
        FailoverTestResponse self = new FailoverTestResponse();
        return TeaModel.build(map, self);
    }

    public FailoverTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FailoverTestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FailoverTestResponse setBody(FailoverTestResponseBody body) {
        this.body = body;
        return this;
    }
    public FailoverTestResponseBody getBody() {
        return this.body;
    }

}
