// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class RemoveChildAccountAuthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveChildAccountAuthResponseBody body;

    public static RemoveChildAccountAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveChildAccountAuthResponse self = new RemoveChildAccountAuthResponse();
        return TeaModel.build(map, self);
    }

    public RemoveChildAccountAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveChildAccountAuthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveChildAccountAuthResponse setBody(RemoveChildAccountAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveChildAccountAuthResponseBody getBody() {
        return this.body;
    }

}
