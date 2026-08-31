// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetUserByAccessKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserByAccessKeyResponseBody body;

    public static GetUserByAccessKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserByAccessKeyResponse self = new GetUserByAccessKeyResponse();
        return TeaModel.build(map, self);
    }

    public GetUserByAccessKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserByAccessKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserByAccessKeyResponse setBody(GetUserByAccessKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserByAccessKeyResponseBody getBody() {
        return this.body;
    }

}
