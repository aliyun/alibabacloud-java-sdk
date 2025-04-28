// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetAccountByRowPermissionIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAccountByRowPermissionIdResponseBody body;

    public static GetAccountByRowPermissionIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccountByRowPermissionIdResponse self = new GetAccountByRowPermissionIdResponse();
        return TeaModel.build(map, self);
    }

    public GetAccountByRowPermissionIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccountByRowPermissionIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAccountByRowPermissionIdResponse setBody(GetAccountByRowPermissionIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccountByRowPermissionIdResponseBody getBody() {
        return this.body;
    }

}
