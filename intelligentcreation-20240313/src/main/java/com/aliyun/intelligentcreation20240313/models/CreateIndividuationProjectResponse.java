// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateIndividuationProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIndividuationProjectResponseBody body;

    public static CreateIndividuationProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIndividuationProjectResponse self = new CreateIndividuationProjectResponse();
        return TeaModel.build(map, self);
    }

    public CreateIndividuationProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIndividuationProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIndividuationProjectResponse setBody(CreateIndividuationProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIndividuationProjectResponseBody getBody() {
        return this.body;
    }

}
