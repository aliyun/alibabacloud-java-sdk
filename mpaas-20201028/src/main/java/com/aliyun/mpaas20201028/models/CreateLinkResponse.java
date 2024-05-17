// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLinkResponseBody body;

    public static CreateLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkResponse self = new CreateLinkResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLinkResponse setBody(CreateLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkResponseBody getBody() {
        return this.body;
    }

}
