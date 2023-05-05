// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class GetIsvAppUploadCredentialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetIsvAppUploadCredentialResponseBody body;

    public static GetIsvAppUploadCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIsvAppUploadCredentialResponse self = new GetIsvAppUploadCredentialResponse();
        return TeaModel.build(map, self);
    }

    public GetIsvAppUploadCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIsvAppUploadCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIsvAppUploadCredentialResponse setBody(GetIsvAppUploadCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIsvAppUploadCredentialResponseBody getBody() {
        return this.body;
    }

}
