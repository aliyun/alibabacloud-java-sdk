// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunid_ag20180912.models;

import com.aliyun.tea.*;

public class GetAgRelationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgRelationResponseBody body;

    public static GetAgRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgRelationResponse self = new GetAgRelationResponse();
        return TeaModel.build(map, self);
    }

    public GetAgRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgRelationResponse setBody(GetAgRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgRelationResponseBody getBody() {
        return this.body;
    }

}
