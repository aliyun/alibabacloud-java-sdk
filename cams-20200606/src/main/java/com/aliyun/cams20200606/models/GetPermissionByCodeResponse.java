// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetPermissionByCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetPermissionByCodeResponseBody body;

    public static GetPermissionByCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPermissionByCodeResponse self = new GetPermissionByCodeResponse();
        return TeaModel.build(map, self);
    }

    public GetPermissionByCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPermissionByCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPermissionByCodeResponse setBody(GetPermissionByCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPermissionByCodeResponseBody getBody() {
        return this.body;
    }

}
