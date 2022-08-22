// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layoutadmin20220801.models;

import com.aliyun.tea.*;

public class AddRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddRelationResponseBody body;

    public static AddRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        AddRelationResponse self = new AddRelationResponse();
        return TeaModel.build(map, self);
    }

    public AddRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddRelationResponse setBody(AddRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public AddRelationResponseBody getBody() {
        return this.body;
    }

}
