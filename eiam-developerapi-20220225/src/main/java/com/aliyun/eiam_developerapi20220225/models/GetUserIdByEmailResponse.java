// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetUserIdByEmailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserIdByEmailResponseBody body;

    public static GetUserIdByEmailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserIdByEmailResponse self = new GetUserIdByEmailResponse();
        return TeaModel.build(map, self);
    }

    public GetUserIdByEmailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserIdByEmailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserIdByEmailResponse setBody(GetUserIdByEmailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserIdByEmailResponseBody getBody() {
        return this.body;
    }

}
