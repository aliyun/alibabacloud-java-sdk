// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteLineageRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLineageRelationResponseBody body;

    public static DeleteLineageRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLineageRelationResponse self = new DeleteLineageRelationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLineageRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLineageRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLineageRelationResponse setBody(DeleteLineageRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLineageRelationResponseBody getBody() {
        return this.body;
    }

}
