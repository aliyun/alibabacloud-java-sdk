// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RevokeColumnPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeColumnPermissionResponseBody body;

    public static RevokeColumnPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeColumnPermissionResponse self = new RevokeColumnPermissionResponse();
        return TeaModel.build(map, self);
    }

    public RevokeColumnPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeColumnPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeColumnPermissionResponse setBody(RevokeColumnPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeColumnPermissionResponseBody getBody() {
        return this.body;
    }

}
