// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateDirResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDirResponseBody body;

    public static CreateDirResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDirResponse self = new CreateDirResponse();
        return TeaModel.build(map, self);
    }

    public CreateDirResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDirResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDirResponse setBody(CreateDirResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDirResponseBody getBody() {
        return this.body;
    }

}
