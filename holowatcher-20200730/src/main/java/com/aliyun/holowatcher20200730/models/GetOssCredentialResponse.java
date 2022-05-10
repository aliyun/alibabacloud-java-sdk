// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetOssCredentialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOssCredentialResponseBody body;

    public static GetOssCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOssCredentialResponse self = new GetOssCredentialResponse();
        return TeaModel.build(map, self);
    }

    public GetOssCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOssCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOssCredentialResponse setBody(GetOssCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOssCredentialResponseBody getBody() {
        return this.body;
    }

}
