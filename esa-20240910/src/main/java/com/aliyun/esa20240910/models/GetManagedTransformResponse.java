// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetManagedTransformResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetManagedTransformResponseBody body;

    public static GetManagedTransformResponse build(java.util.Map<String, ?> map) throws Exception {
        GetManagedTransformResponse self = new GetManagedTransformResponse();
        return TeaModel.build(map, self);
    }

    public GetManagedTransformResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetManagedTransformResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetManagedTransformResponse setBody(GetManagedTransformResponseBody body) {
        this.body = body;
        return this;
    }
    public GetManagedTransformResponseBody getBody() {
        return this.body;
    }

}
