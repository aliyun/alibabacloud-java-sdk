// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateBasicProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBasicProjectResponseBody body;

    public static CreateBasicProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBasicProjectResponse self = new CreateBasicProjectResponse();
        return TeaModel.build(map, self);
    }

    public CreateBasicProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBasicProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBasicProjectResponse setBody(CreateBasicProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBasicProjectResponseBody getBody() {
        return this.body;
    }

}
