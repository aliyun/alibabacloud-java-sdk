// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RevokeTablePermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeTablePermissionResponseBody body;

    public static RevokeTablePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeTablePermissionResponse self = new RevokeTablePermissionResponse();
        return TeaModel.build(map, self);
    }

    public RevokeTablePermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeTablePermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeTablePermissionResponse setBody(RevokeTablePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeTablePermissionResponseBody getBody() {
        return this.body;
    }

}
