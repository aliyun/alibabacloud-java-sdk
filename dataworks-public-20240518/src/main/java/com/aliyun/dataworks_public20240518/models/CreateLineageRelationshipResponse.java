// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateLineageRelationshipResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLineageRelationshipResponseBody body;

    public static CreateLineageRelationshipResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLineageRelationshipResponse self = new CreateLineageRelationshipResponse();
        return TeaModel.build(map, self);
    }

    public CreateLineageRelationshipResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLineageRelationshipResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLineageRelationshipResponse setBody(CreateLineageRelationshipResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLineageRelationshipResponseBody getBody() {
        return this.body;
    }

}
