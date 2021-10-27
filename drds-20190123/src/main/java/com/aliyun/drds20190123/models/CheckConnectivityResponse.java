// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CheckConnectivityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckConnectivityResponseBody body;

    public static CheckConnectivityResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckConnectivityResponse self = new CheckConnectivityResponse();
        return TeaModel.build(map, self);
    }

    public CheckConnectivityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckConnectivityResponse setBody(CheckConnectivityResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckConnectivityResponseBody getBody() {
        return this.body;
    }

}
