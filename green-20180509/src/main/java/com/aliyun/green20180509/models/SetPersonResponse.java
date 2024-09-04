// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class SetPersonResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetPersonResponseBody body;

    public static SetPersonResponse build(java.util.Map<String, ?> map) throws Exception {
        SetPersonResponse self = new SetPersonResponse();
        return TeaModel.build(map, self);
    }

    public SetPersonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetPersonResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetPersonResponse setBody(SetPersonResponseBody body) {
        this.body = body;
        return this;
    }
    public SetPersonResponseBody getBody() {
        return this.body;
    }

}
