// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableApplicationSsoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableApplicationSsoResponseBody body;

    public static EnableApplicationSsoResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableApplicationSsoResponse self = new EnableApplicationSsoResponse();
        return TeaModel.build(map, self);
    }

    public EnableApplicationSsoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableApplicationSsoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableApplicationSsoResponse setBody(EnableApplicationSsoResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableApplicationSsoResponseBody getBody() {
        return this.body;
    }

}
