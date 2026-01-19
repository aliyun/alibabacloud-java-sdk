// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class RevokeResourceServerFromClientResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeResourceServerFromClientResponseBody body;

    public static RevokeResourceServerFromClientResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeResourceServerFromClientResponse self = new RevokeResourceServerFromClientResponse();
        return TeaModel.build(map, self);
    }

    public RevokeResourceServerFromClientResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeResourceServerFromClientResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeResourceServerFromClientResponse setBody(RevokeResourceServerFromClientResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeResourceServerFromClientResponseBody getBody() {
        return this.body;
    }

}
