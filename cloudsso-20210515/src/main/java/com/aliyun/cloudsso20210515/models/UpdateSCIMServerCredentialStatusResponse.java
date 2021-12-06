// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateSCIMServerCredentialStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateSCIMServerCredentialStatusResponse setBody(UpdateSCIMServerCredentialStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSCIMServerCredentialStatusResponseBody getBody() {
        return this.body;
    }

}
