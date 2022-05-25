// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetUserIdByExternalIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserIdByExternalIdResponseBody body;

    public static GetUserIdByExternalIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserIdByExternalIdResponse self = new GetUserIdByExternalIdResponse();
        return TeaModel.build(map, self);
    }

    public GetUserIdByExternalIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserIdByExternalIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserIdByExternalIdResponse setBody(GetUserIdByExternalIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserIdByExternalIdResponseBody getBody() {
        return this.body;
    }

}
