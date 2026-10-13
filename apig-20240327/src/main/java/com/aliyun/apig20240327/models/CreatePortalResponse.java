// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreatePortalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePortalResponseBody body;

    public static CreatePortalResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePortalResponse self = new CreatePortalResponse();
        return TeaModel.build(map, self);
    }

    public CreatePortalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePortalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePortalResponse setBody(CreatePortalResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePortalResponseBody getBody() {
        return this.body;
    }

}
