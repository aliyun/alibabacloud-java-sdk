// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteSecurityProxyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSecurityProxyResponseBody body;

    public static DeleteSecurityProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityProxyResponse self = new DeleteSecurityProxyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSecurityProxyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSecurityProxyResponse setBody(DeleteSecurityProxyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSecurityProxyResponseBody getBody() {
        return this.body;
    }

}
