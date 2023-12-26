// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ReleaseInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseInstancesResponseBody body;

    public static ReleaseInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseInstancesResponse self = new ReleaseInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseInstancesResponse setBody(ReleaseInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseInstancesResponseBody getBody() {
        return this.body;
    }

}
