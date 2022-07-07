// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class CreateRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRelationResponseBody body;

    public static CreateRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRelationResponse self = new CreateRelationResponse();
        return TeaModel.build(map, self);
    }

    public CreateRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRelationResponse setBody(CreateRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRelationResponseBody getBody() {
        return this.body;
    }

}
