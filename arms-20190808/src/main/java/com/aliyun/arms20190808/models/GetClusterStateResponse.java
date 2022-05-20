// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetClusterStateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetClusterStateResponseBody body;

    public static GetClusterStateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterStateResponse self = new GetClusterStateResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClusterStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClusterStateResponse setBody(GetClusterStateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClusterStateResponseBody getBody() {
        return this.body;
    }

}
