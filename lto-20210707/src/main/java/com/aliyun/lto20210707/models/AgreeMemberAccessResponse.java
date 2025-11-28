// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class AgreeMemberAccessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AgreeMemberAccessResponseBody body;

    public static AgreeMemberAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        AgreeMemberAccessResponse self = new AgreeMemberAccessResponse();
        return TeaModel.build(map, self);
    }

    public AgreeMemberAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AgreeMemberAccessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AgreeMemberAccessResponse setBody(AgreeMemberAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public AgreeMemberAccessResponseBody getBody() {
        return this.body;
    }

}
