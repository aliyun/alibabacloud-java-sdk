// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateAclCheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAclCheckResponseBody body;

    public static CreateAclCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAclCheckResponse self = new CreateAclCheckResponse();
        return TeaModel.build(map, self);
    }

    public CreateAclCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAclCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAclCheckResponse setBody(CreateAclCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAclCheckResponseBody getBody() {
        return this.body;
    }

}
