// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GrantUserPointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GrantUserPointResponseBody body;

    public static GrantUserPointResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantUserPointResponse self = new GrantUserPointResponse();
        return TeaModel.build(map, self);
    }

    public GrantUserPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantUserPointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GrantUserPointResponse setBody(GrantUserPointResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantUserPointResponseBody getBody() {
        return this.body;
    }

}
