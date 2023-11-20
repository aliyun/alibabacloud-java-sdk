// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetClusterCheckResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetClusterCheckResponseBody body;

    public static GetClusterCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterCheckResponse self = new GetClusterCheckResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClusterCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClusterCheckResponse setBody(GetClusterCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClusterCheckResponseBody getBody() {
        return this.body;
    }

}
