// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class GetAgRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
