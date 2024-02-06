// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class CreateWehookResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWehookResponseBody body;

    public static CreateWehookResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWehookResponse self = new CreateWehookResponse();
        return TeaModel.build(map, self);
    }

    public CreateWehookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWehookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWehookResponse setBody(CreateWehookResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWehookResponseBody getBody() {
        return this.body;
    }

}
