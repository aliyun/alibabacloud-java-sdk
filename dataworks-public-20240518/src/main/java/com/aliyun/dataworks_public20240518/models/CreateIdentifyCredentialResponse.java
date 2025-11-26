// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateIdentifyCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIdentifyCredentialResponseBody body;

    public static CreateIdentifyCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIdentifyCredentialResponse self = new CreateIdentifyCredentialResponse();
        return TeaModel.build(map, self);
    }

    public CreateIdentifyCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIdentifyCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIdentifyCredentialResponse setBody(CreateIdentifyCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIdentifyCredentialResponseBody getBody() {
        return this.body;
    }

}
