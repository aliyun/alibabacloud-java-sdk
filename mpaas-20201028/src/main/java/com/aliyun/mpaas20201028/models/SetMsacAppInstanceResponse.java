// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class SetMsacAppInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetMsacAppInstanceResponseBody body;

    public static SetMsacAppInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        SetMsacAppInstanceResponse self = new SetMsacAppInstanceResponse();
        return TeaModel.build(map, self);
    }

    public SetMsacAppInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetMsacAppInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetMsacAppInstanceResponse setBody(SetMsacAppInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public SetMsacAppInstanceResponseBody getBody() {
        return this.body;
    }

}
