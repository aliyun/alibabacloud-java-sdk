// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateResourceFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateResourceFileResponseBody body;

    public static CreateResourceFileResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceFileResponse self = new CreateResourceFileResponse();
        return TeaModel.build(map, self);
    }

    public CreateResourceFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateResourceFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateResourceFileResponse setBody(CreateResourceFileResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateResourceFileResponseBody getBody() {
        return this.body;
    }

}
