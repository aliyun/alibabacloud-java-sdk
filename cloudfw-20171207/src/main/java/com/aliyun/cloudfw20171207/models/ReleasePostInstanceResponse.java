// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ReleasePostInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReleasePostInstanceResponseBody body;

    public static ReleasePostInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleasePostInstanceResponse self = new ReleasePostInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ReleasePostInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleasePostInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleasePostInstanceResponse setBody(ReleasePostInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleasePostInstanceResponseBody getBody() {
        return this.body;
    }

}
