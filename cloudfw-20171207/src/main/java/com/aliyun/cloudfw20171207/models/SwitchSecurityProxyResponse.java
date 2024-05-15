// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class SwitchSecurityProxyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SwitchSecurityProxyResponseBody body;

    public static SwitchSecurityProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchSecurityProxyResponse self = new SwitchSecurityProxyResponse();
        return TeaModel.build(map, self);
    }

    public SwitchSecurityProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchSecurityProxyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchSecurityProxyResponse setBody(SwitchSecurityProxyResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchSecurityProxyResponseBody getBody() {
        return this.body;
    }

}
