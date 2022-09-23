// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class GetUserResourceTagStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserResourceTagStatusResponseBody body;

    public static GetUserResourceTagStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserResourceTagStatusResponse self = new GetUserResourceTagStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetUserResourceTagStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserResourceTagStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserResourceTagStatusResponse setBody(GetUserResourceTagStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserResourceTagStatusResponseBody getBody() {
        return this.body;
    }

}
