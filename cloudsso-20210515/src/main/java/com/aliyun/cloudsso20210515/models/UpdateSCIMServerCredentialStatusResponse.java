// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateSCIMServerCredentialStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSCIMServerCredentialStatusResponseBody body;

    public static UpdateSCIMServerCredentialStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSCIMServerCredentialStatusResponse self = new UpdateSCIMServerCredentialStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSCIMServerCredentialStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSCIMServerCredentialStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSCIMServerCredentialStatusResponse setBody(UpdateSCIMServerCredentialStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSCIMServerCredentialStatusResponseBody getBody() {
        return this.body;
    }

}
