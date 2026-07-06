// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteServiceCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteServiceCredentialResponseBody body;

    public static DeleteServiceCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceCredentialResponse self = new DeleteServiceCredentialResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServiceCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteServiceCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteServiceCredentialResponse setBody(DeleteServiceCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteServiceCredentialResponseBody getBody() {
        return this.body;
    }

}
