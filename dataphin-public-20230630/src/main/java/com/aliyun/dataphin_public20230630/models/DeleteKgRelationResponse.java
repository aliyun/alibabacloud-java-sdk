// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteKgRelationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteKgRelationResponseBody body;

    public static DeleteKgRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteKgRelationResponse self = new DeleteKgRelationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteKgRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteKgRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteKgRelationResponse setBody(DeleteKgRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteKgRelationResponseBody getBody() {
        return this.body;
    }

}
