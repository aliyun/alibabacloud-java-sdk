// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetRolePolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetRolePolicyResponseBody body;

    public static GetRolePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRolePolicyResponse self = new GetRolePolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetRolePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRolePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRolePolicyResponse setBody(GetRolePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRolePolicyResponseBody getBody() {
        return this.body;
    }

}
