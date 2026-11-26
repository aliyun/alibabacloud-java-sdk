// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeleteSecurityInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSecurityInfoResponseBody body;

    public static DeleteSecurityInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityInfoResponse self = new DeleteSecurityInfoResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSecurityInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSecurityInfoResponse setBody(DeleteSecurityInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSecurityInfoResponseBody getBody() {
        return this.body;
    }

}
