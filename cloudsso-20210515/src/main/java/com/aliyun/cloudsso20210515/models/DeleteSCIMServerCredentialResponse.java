// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeleteSCIMServerCredentialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSCIMServerCredentialResponseBody body;

    public static DeleteSCIMServerCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSCIMServerCredentialResponse self = new DeleteSCIMServerCredentialResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSCIMServerCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSCIMServerCredentialResponse setBody(DeleteSCIMServerCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSCIMServerCredentialResponseBody getBody() {
        return this.body;
    }

}
