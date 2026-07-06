// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateServiceCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateServiceCredentialResponseBody body;

    public static UpdateServiceCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceCredentialResponse self = new UpdateServiceCredentialResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServiceCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServiceCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateServiceCredentialResponse setBody(UpdateServiceCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServiceCredentialResponseBody getBody() {
        return this.body;
    }

}
