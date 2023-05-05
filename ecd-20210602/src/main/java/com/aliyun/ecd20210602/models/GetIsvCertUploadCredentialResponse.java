// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class GetIsvCertUploadCredentialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetIsvCertUploadCredentialResponseBody body;

    public static GetIsvCertUploadCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIsvCertUploadCredentialResponse self = new GetIsvCertUploadCredentialResponse();
        return TeaModel.build(map, self);
    }

    public GetIsvCertUploadCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIsvCertUploadCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIsvCertUploadCredentialResponse setBody(GetIsvCertUploadCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIsvCertUploadCredentialResponseBody getBody() {
        return this.body;
    }

}
