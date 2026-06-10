// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class UsageQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UsageQueryResponseBody body;

    public static UsageQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        UsageQueryResponse self = new UsageQueryResponse();
        return TeaModel.build(map, self);
    }

    public UsageQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UsageQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UsageQueryResponse setBody(UsageQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public UsageQueryResponseBody getBody() {
        return this.body;
    }

}
