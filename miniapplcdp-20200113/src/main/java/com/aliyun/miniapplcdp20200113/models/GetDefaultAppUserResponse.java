// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetDefaultAppUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDefaultAppUserResponseBody body;

    public static GetDefaultAppUserResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDefaultAppUserResponse self = new GetDefaultAppUserResponse();
        return TeaModel.build(map, self);
    }

    public GetDefaultAppUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDefaultAppUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDefaultAppUserResponse setBody(GetDefaultAppUserResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDefaultAppUserResponseBody getBody() {
        return this.body;
    }

}
