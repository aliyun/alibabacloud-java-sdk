// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UpdateSecurityProxyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSecurityProxyResponseBody body;

    public static UpdateSecurityProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecurityProxyResponse self = new UpdateSecurityProxyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSecurityProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSecurityProxyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSecurityProxyResponse setBody(UpdateSecurityProxyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSecurityProxyResponseBody getBody() {
        return this.body;
    }

}
