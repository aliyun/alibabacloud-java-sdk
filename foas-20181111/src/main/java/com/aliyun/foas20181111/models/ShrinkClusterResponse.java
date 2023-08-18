// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ShrinkClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ShrinkClusterResponseBody body;

    public static ShrinkClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ShrinkClusterResponse self = new ShrinkClusterResponse();
        return TeaModel.build(map, self);
    }

    public ShrinkClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ShrinkClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ShrinkClusterResponse setBody(ShrinkClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ShrinkClusterResponseBody getBody() {
        return this.body;
    }

}
