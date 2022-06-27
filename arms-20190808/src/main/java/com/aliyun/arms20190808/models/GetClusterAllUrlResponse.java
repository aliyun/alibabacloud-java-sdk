// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetClusterAllUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetClusterAllUrlResponseBody body;

    public static GetClusterAllUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterAllUrlResponse self = new GetClusterAllUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterAllUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClusterAllUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClusterAllUrlResponse setBody(GetClusterAllUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClusterAllUrlResponseBody getBody() {
        return this.body;
    }

}
