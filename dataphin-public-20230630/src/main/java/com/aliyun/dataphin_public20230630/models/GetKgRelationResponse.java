// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetKgRelationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKgRelationResponseBody body;

    public static GetKgRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKgRelationResponse self = new GetKgRelationResponse();
        return TeaModel.build(map, self);
    }

    public GetKgRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKgRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKgRelationResponse setBody(GetKgRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKgRelationResponseBody getBody() {
        return this.body;
    }

}
