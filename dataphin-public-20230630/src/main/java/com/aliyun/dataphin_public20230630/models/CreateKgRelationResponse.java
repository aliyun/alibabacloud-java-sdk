// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateKgRelationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateKgRelationResponseBody body;

    public static CreateKgRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKgRelationResponse self = new CreateKgRelationResponse();
        return TeaModel.build(map, self);
    }

    public CreateKgRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateKgRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateKgRelationResponse setBody(CreateKgRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateKgRelationResponseBody getBody() {
        return this.body;
    }

}
