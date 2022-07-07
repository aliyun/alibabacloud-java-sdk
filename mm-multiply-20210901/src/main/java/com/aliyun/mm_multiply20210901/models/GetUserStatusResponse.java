// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetUserStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserStatusResponseBody body;

    public static GetUserStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserStatusResponse self = new GetUserStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetUserStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserStatusResponse setBody(GetUserStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserStatusResponseBody getBody() {
        return this.body;
    }

}
