// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class RelieveAccountRelationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RelieveAccountRelationResponseBody body;

    public static RelieveAccountRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        RelieveAccountRelationResponse self = new RelieveAccountRelationResponse();
        return TeaModel.build(map, self);
    }

    public RelieveAccountRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RelieveAccountRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RelieveAccountRelationResponse setBody(RelieveAccountRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public RelieveAccountRelationResponseBody getBody() {
        return this.body;
    }

}
