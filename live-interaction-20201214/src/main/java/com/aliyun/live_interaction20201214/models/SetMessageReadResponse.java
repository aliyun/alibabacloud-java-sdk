// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class SetMessageReadResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetMessageReadResponseBody body;

    public static SetMessageReadResponse build(java.util.Map<String, ?> map) throws Exception {
        SetMessageReadResponse self = new SetMessageReadResponse();
        return TeaModel.build(map, self);
    }

    public SetMessageReadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetMessageReadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetMessageReadResponse setBody(SetMessageReadResponseBody body) {
        this.body = body;
        return this;
    }
    public SetMessageReadResponseBody getBody() {
        return this.body;
    }

}
