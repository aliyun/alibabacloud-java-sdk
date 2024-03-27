// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateProxyAccessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateProxyAccessResponseBody body;

    public static CreateProxyAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProxyAccessResponse self = new CreateProxyAccessResponse();
        return TeaModel.build(map, self);
    }

    public CreateProxyAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProxyAccessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProxyAccessResponse setBody(CreateProxyAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProxyAccessResponseBody getBody() {
        return this.body;
    }

}
