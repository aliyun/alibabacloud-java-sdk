// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateCredentialDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCredentialDescriptionResponseBody body;

    public static UpdateCredentialDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCredentialDescriptionResponse self = new UpdateCredentialDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCredentialDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCredentialDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCredentialDescriptionResponse setBody(UpdateCredentialDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCredentialDescriptionResponseBody getBody() {
        return this.body;
    }

}
