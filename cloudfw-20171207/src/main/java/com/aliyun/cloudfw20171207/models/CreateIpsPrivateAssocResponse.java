// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateIpsPrivateAssocResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIpsPrivateAssocResponseBody body;

    public static CreateIpsPrivateAssocResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIpsPrivateAssocResponse self = new CreateIpsPrivateAssocResponse();
        return TeaModel.build(map, self);
    }

    public CreateIpsPrivateAssocResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIpsPrivateAssocResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIpsPrivateAssocResponse setBody(CreateIpsPrivateAssocResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIpsPrivateAssocResponseBody getBody() {
        return this.body;
    }

}
