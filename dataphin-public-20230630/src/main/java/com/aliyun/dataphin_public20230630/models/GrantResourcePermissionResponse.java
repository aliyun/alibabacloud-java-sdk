// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GrantResourcePermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GrantResourcePermissionResponseBody body;

    public static GrantResourcePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantResourcePermissionResponse self = new GrantResourcePermissionResponse();
        return TeaModel.build(map, self);
    }

    public GrantResourcePermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantResourcePermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GrantResourcePermissionResponse setBody(GrantResourcePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantResourcePermissionResponseBody getBody() {
        return this.body;
    }

}
