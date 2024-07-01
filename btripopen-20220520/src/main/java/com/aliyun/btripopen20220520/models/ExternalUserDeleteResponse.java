// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ExternalUserDeleteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExternalUserDeleteResponseBody body;

    public static ExternalUserDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        ExternalUserDeleteResponse self = new ExternalUserDeleteResponse();
        return TeaModel.build(map, self);
    }

    public ExternalUserDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExternalUserDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExternalUserDeleteResponse setBody(ExternalUserDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public ExternalUserDeleteResponseBody getBody() {
        return this.body;
    }

}
