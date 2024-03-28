// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateSpareIpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSpareIpsResponseBody body;

    public static CreateSpareIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSpareIpsResponse self = new CreateSpareIpsResponse();
        return TeaModel.build(map, self);
    }

    public CreateSpareIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSpareIpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSpareIpsResponse setBody(CreateSpareIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSpareIpsResponseBody getBody() {
        return this.body;
    }

}
