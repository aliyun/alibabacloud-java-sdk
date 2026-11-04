// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CreateMediaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMediaResponseBody body;

    public static CreateMediaResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMediaResponse self = new CreateMediaResponse();
        return TeaModel.build(map, self);
    }

    public CreateMediaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMediaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMediaResponse setBody(CreateMediaResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMediaResponseBody getBody() {
        return this.body;
    }

}
