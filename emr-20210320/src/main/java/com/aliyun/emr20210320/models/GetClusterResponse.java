// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetClusterResponseBody body;

    public static GetClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterResponse self = new GetClusterResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClusterResponse setBody(GetClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClusterResponseBody getBody() {
        return this.body;
    }

}
