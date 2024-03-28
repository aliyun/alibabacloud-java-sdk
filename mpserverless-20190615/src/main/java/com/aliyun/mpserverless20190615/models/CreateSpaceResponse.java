// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class CreateSpaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSpaceResponseBody body;

    public static CreateSpaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSpaceResponse self = new CreateSpaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateSpaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSpaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSpaceResponse setBody(CreateSpaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSpaceResponseBody getBody() {
        return this.body;
    }

}
