// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetMyRolesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMyRolesResponseBody body;

    public static GetMyRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMyRolesResponse self = new GetMyRolesResponse();
        return TeaModel.build(map, self);
    }

    public GetMyRolesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMyRolesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMyRolesResponse setBody(GetMyRolesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMyRolesResponseBody getBody() {
        return this.body;
    }

}
