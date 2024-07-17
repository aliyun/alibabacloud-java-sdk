// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GrantPermissionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GrantPermissionsResponseBody body;

    public static GrantPermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantPermissionsResponse self = new GrantPermissionsResponse();
        return TeaModel.build(map, self);
    }

    public GrantPermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantPermissionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GrantPermissionsResponse setBody(GrantPermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantPermissionsResponseBody getBody() {
        return this.body;
    }

}
