// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layoutadmin20220801.models;

import com.aliyun.tea.*;

public class DeleteRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRelationResponseBody body;

    public static DeleteRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRelationResponse self = new DeleteRelationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRelationResponse setBody(DeleteRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRelationResponseBody getBody() {
        return this.body;
    }

}
