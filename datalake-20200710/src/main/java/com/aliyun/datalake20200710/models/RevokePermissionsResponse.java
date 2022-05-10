// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class RevokePermissionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RevokePermissionsResponseBody body;

    public static RevokePermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokePermissionsResponse self = new RevokePermissionsResponse();
        return TeaModel.build(map, self);
    }

    public RevokePermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokePermissionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokePermissionsResponse setBody(RevokePermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokePermissionsResponseBody getBody() {
        return this.body;
    }

}
