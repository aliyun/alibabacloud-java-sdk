// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetUserIdByUserExternalIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserIdByUserExternalIdResponseBody body;

    public static GetUserIdByUserExternalIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserIdByUserExternalIdResponse self = new GetUserIdByUserExternalIdResponse();
        return TeaModel.build(map, self);
    }

    public GetUserIdByUserExternalIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserIdByUserExternalIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserIdByUserExternalIdResponse setBody(GetUserIdByUserExternalIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserIdByUserExternalIdResponseBody getBody() {
        return this.body;
    }

}
