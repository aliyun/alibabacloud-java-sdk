// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateCredentialProviderDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCredentialProviderDescriptionResponseBody body;

    public static UpdateCredentialProviderDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCredentialProviderDescriptionResponse self = new UpdateCredentialProviderDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCredentialProviderDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCredentialProviderDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCredentialProviderDescriptionResponse setBody(UpdateCredentialProviderDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCredentialProviderDescriptionResponseBody getBody() {
        return this.body;
    }

}
