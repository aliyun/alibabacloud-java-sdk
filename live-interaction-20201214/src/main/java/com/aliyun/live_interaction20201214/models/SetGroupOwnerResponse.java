// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class SetGroupOwnerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetGroupOwnerResponseBody body;

    public static SetGroupOwnerResponse build(java.util.Map<String, ?> map) throws Exception {
        SetGroupOwnerResponse self = new SetGroupOwnerResponse();
        return TeaModel.build(map, self);
    }

    public SetGroupOwnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetGroupOwnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetGroupOwnerResponse setBody(SetGroupOwnerResponseBody body) {
        this.body = body;
        return this;
    }
    public SetGroupOwnerResponseBody getBody() {
        return this.body;
    }

}
