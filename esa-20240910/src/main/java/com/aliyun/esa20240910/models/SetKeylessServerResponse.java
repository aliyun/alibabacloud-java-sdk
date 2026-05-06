// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetKeylessServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetKeylessServerResponseBody body;

    public static SetKeylessServerResponse build(java.util.Map<String, ?> map) throws Exception {
        SetKeylessServerResponse self = new SetKeylessServerResponse();
        return TeaModel.build(map, self);
    }

    public SetKeylessServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetKeylessServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetKeylessServerResponse setBody(SetKeylessServerResponseBody body) {
        this.body = body;
        return this;
    }
    public SetKeylessServerResponseBody getBody() {
        return this.body;
    }

}
