// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetClientUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetClientUserResponseBody body;

    public static GetClientUserResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClientUserResponse self = new GetClientUserResponse();
        return TeaModel.build(map, self);
    }

    public GetClientUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClientUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClientUserResponse setBody(GetClientUserResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClientUserResponseBody getBody() {
        return this.body;
    }

}
