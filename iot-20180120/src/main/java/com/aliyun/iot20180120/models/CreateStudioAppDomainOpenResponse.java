// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateStudioAppDomainOpenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateStudioAppDomainOpenResponseBody body;

    public static CreateStudioAppDomainOpenResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStudioAppDomainOpenResponse self = new CreateStudioAppDomainOpenResponse();
        return TeaModel.build(map, self);
    }

    public CreateStudioAppDomainOpenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStudioAppDomainOpenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateStudioAppDomainOpenResponse setBody(CreateStudioAppDomainOpenResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStudioAppDomainOpenResponseBody getBody() {
        return this.body;
    }

}
