// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdatePrivateAccessApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePrivateAccessApplicationResponseBody body;

    public static UpdatePrivateAccessApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivateAccessApplicationResponse self = new UpdatePrivateAccessApplicationResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePrivateAccessApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePrivateAccessApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePrivateAccessApplicationResponse setBody(UpdatePrivateAccessApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePrivateAccessApplicationResponseBody getBody() {
        return this.body;
    }

}
