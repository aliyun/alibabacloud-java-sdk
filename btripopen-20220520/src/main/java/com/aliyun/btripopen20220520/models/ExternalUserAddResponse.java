// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ExternalUserAddResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExternalUserAddResponseBody body;

    public static ExternalUserAddResponse build(java.util.Map<String, ?> map) throws Exception {
        ExternalUserAddResponse self = new ExternalUserAddResponse();
        return TeaModel.build(map, self);
    }

    public ExternalUserAddResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExternalUserAddResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExternalUserAddResponse setBody(ExternalUserAddResponseBody body) {
        this.body = body;
        return this;
    }
    public ExternalUserAddResponseBody getBody() {
        return this.body;
    }

}
