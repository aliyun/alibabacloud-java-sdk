// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetAccountRelationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAccountRelationResponseBody body;

    public static GetAccountRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccountRelationResponse self = new GetAccountRelationResponse();
        return TeaModel.build(map, self);
    }

    public GetAccountRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccountRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAccountRelationResponse setBody(GetAccountRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccountRelationResponseBody getBody() {
        return this.body;
    }

}
