// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeleteSCIMServerCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteSCIMServerCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSCIMServerCredentialResponse setBody(DeleteSCIMServerCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSCIMServerCredentialResponseBody getBody() {
        return this.body;
    }

}
