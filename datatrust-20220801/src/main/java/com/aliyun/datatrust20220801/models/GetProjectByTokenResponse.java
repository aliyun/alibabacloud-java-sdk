// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetProjectByTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetProjectByTokenResponseBody body;

    public static GetProjectByTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProjectByTokenResponse self = new GetProjectByTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetProjectByTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProjectByTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProjectByTokenResponse setBody(GetProjectByTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProjectByTokenResponseBody getBody() {
        return this.body;
    }

}
