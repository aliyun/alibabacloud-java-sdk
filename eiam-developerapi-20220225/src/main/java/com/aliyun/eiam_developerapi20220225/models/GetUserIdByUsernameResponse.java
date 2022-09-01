// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetUserIdByUsernameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserIdByUsernameResponseBody body;

    public static GetUserIdByUsernameResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserIdByUsernameResponse self = new GetUserIdByUsernameResponse();
        return TeaModel.build(map, self);
    }

    public GetUserIdByUsernameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserIdByUsernameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserIdByUsernameResponse setBody(GetUserIdByUsernameResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserIdByUsernameResponseBody getBody() {
        return this.body;
    }

}
