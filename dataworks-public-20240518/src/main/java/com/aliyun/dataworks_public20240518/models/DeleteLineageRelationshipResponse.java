// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteLineageRelationshipResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLineageRelationshipResponseBody body;

    public static DeleteLineageRelationshipResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLineageRelationshipResponse self = new DeleteLineageRelationshipResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLineageRelationshipResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLineageRelationshipResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLineageRelationshipResponse setBody(DeleteLineageRelationshipResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLineageRelationshipResponseBody getBody() {
        return this.body;
    }

}
