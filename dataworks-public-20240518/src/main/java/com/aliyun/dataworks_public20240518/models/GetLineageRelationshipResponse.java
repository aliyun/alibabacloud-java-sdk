// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetLineageRelationshipResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLineageRelationshipResponseBody body;

    public static GetLineageRelationshipResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLineageRelationshipResponse self = new GetLineageRelationshipResponse();
        return TeaModel.build(map, self);
    }

    public GetLineageRelationshipResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLineageRelationshipResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLineageRelationshipResponse setBody(GetLineageRelationshipResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLineageRelationshipResponseBody getBody() {
        return this.body;
    }

}
