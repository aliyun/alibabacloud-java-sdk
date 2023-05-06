// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class GetAppStsCredentialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAppStsCredentialResponseBody body;

    public static GetAppStsCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppStsCredentialResponse self = new GetAppStsCredentialResponse();
        return TeaModel.build(map, self);
    }

    public GetAppStsCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppStsCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppStsCredentialResponse setBody(GetAppStsCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppStsCredentialResponseBody getBody() {
        return this.body;
    }

}
