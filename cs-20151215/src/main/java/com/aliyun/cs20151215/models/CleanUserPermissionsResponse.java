// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CleanUserPermissionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CleanUserPermissionsResponseBody body;

    public static CleanUserPermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        CleanUserPermissionsResponse self = new CleanUserPermissionsResponse();
        return TeaModel.build(map, self);
    }

    public CleanUserPermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CleanUserPermissionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CleanUserPermissionsResponse setBody(CleanUserPermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public CleanUserPermissionsResponseBody getBody() {
        return this.body;
    }

}
