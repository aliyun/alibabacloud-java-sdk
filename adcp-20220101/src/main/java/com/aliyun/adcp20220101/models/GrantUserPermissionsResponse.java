// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class GrantUserPermissionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GrantUserPermissionsResponseBody body;

    public static GrantUserPermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantUserPermissionsResponse self = new GrantUserPermissionsResponse();
        return TeaModel.build(map, self);
    }

    public GrantUserPermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantUserPermissionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GrantUserPermissionsResponse setBody(GrantUserPermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantUserPermissionsResponseBody getBody() {
        return this.body;
    }

}
