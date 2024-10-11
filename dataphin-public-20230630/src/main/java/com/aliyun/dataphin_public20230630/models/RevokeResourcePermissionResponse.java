// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class RevokeResourcePermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeResourcePermissionResponseBody body;

    public static RevokeResourcePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeResourcePermissionResponse self = new RevokeResourcePermissionResponse();
        return TeaModel.build(map, self);
    }

    public RevokeResourcePermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeResourcePermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeResourcePermissionResponse setBody(RevokeResourcePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeResourcePermissionResponseBody getBody() {
        return this.body;
    }

}
