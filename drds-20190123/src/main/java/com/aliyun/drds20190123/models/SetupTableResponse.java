// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SetupTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetupTableResponseBody body;

    public static SetupTableResponse build(java.util.Map<String, ?> map) throws Exception {
        SetupTableResponse self = new SetupTableResponse();
        return TeaModel.build(map, self);
    }

    public SetupTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetupTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetupTableResponse setBody(SetupTableResponseBody body) {
        this.body = body;
        return this;
    }
    public SetupTableResponseBody getBody() {
        return this.body;
    }

}
