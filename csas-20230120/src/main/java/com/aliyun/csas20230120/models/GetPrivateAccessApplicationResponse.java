// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetPrivateAccessApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetPrivateAccessApplicationResponseBody body;

    public static GetPrivateAccessApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPrivateAccessApplicationResponse self = new GetPrivateAccessApplicationResponse();
        return TeaModel.build(map, self);
    }

    public GetPrivateAccessApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPrivateAccessApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPrivateAccessApplicationResponse setBody(GetPrivateAccessApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPrivateAccessApplicationResponseBody getBody() {
        return this.body;
    }

}
