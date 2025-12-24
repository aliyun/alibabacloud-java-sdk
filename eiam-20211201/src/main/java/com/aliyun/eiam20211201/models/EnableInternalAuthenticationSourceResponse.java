// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableInternalAuthenticationSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableInternalAuthenticationSourceResponseBody body;

    public static EnableInternalAuthenticationSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableInternalAuthenticationSourceResponse self = new EnableInternalAuthenticationSourceResponse();
        return TeaModel.build(map, self);
    }

    public EnableInternalAuthenticationSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableInternalAuthenticationSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableInternalAuthenticationSourceResponse setBody(EnableInternalAuthenticationSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableInternalAuthenticationSourceResponseBody getBody() {
        return this.body;
    }

}
