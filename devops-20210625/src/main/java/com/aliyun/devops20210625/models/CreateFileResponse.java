// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFileResponseBody body;

    public static CreateFileResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFileResponse self = new CreateFileResponse();
        return TeaModel.build(map, self);
    }

    public CreateFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFileResponse setBody(CreateFileResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFileResponseBody getBody() {
        return this.body;
    }

}
