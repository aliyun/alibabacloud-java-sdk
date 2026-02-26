// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCredentialResponseBody body;

    public static UpdateCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCredentialResponse self = new UpdateCredentialResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCredentialResponse setBody(UpdateCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCredentialResponseBody getBody() {
        return this.body;
    }

}
