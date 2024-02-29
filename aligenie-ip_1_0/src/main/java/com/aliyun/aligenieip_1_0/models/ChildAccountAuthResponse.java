// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ChildAccountAuthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChildAccountAuthResponseBody body;

    public static ChildAccountAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        ChildAccountAuthResponse self = new ChildAccountAuthResponse();
        return TeaModel.build(map, self);
    }

    public ChildAccountAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChildAccountAuthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChildAccountAuthResponse setBody(ChildAccountAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public ChildAccountAuthResponseBody getBody() {
        return this.body;
    }

}
