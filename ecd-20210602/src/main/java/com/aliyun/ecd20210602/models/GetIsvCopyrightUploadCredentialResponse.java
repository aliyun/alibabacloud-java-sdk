// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class GetIsvCopyrightUploadCredentialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetIsvCopyrightUploadCredentialResponseBody body;

    public static GetIsvCopyrightUploadCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIsvCopyrightUploadCredentialResponse self = new GetIsvCopyrightUploadCredentialResponse();
        return TeaModel.build(map, self);
    }

    public GetIsvCopyrightUploadCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIsvCopyrightUploadCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIsvCopyrightUploadCredentialResponse setBody(GetIsvCopyrightUploadCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIsvCopyrightUploadCredentialResponseBody getBody() {
        return this.body;
    }

}
